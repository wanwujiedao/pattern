# 享元模式

***

###### 享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。

###### 享元模式尝试重用现有的同类对象，如果未找到匹配的对象，则创建新对象。我们将通过创建 5 个对象来画出 20 个分布于不同位置的圆来演示这种模式。由于只有 5 种可用的颜色，所以 color 属性被用来检查现有的 Circle 对象。

***

## 介绍

- **意图**：运用共享技术有效地支持大量细粒度的对象。

- **主要解决**：在有大量对象时，有可能会造成内存溢出，我们把其中共同的部分抽象出来，如果有相同的业务请求，直接返回在内存中已有的对象，避免重新创建。

-何时使用：

> 1、系统中有大量对象。
 
> 2、这些对象消耗大量内存。 

> 3、这些对象的状态大部分可以外部化。 

> 4、这些对象可以按照内蕴状态分为很多组，当把外蕴对象从对象中剔除出来时，每一组对象都可以用一个对象来代替。 

> 5、系统不依赖于这些对象身份，这些对象是不可分辨的。

- **如何解决**：用唯一标识码判断，如果在内存中有，则返回这个唯一标识码所标识的对象。

- **关键代码**：用 HashMap 存储这些对象。

- **应用实例**：

> 1、JAVA 中的 String，如果有则返回，如果没有则创建一个字符串保存在字符串缓存池里面。 

> 2、数据库的数据池。

- **优点**：大大减少对象的创建，降低系统的内存，使效率提高。

- **缺点**：提高了系统的复杂度，需要分离出外部状态和内部状态，而且外部状态具有固有化的性质，不应该随着内部状态的变化而变化，否则会造成系统的混乱。

- **使用场景**：
 
> 1、系统有大量相似对象。 

> 2、需要缓冲池的场景。

- **注意事项**：
 
> 1、注意划分外部状态和内部状态，否则可能会引起线程安全问题。 

> 2、这些类必须有一个工厂对象加以控制。

***

## 实现

###### 我们将创建一个 Animals 接口和实现了 Animals 接口的实体类 Human。下一步是定义工厂类 ShapeFactory。

###### AnimalsFactory 有一个 Animals 的 HashMap，其中键名为 Animals 实现类 Human 对象的性别。无论何时接收到请求，都会创建一个特定性别的人。AnimalsFactory 检查它的 HashMap 中的 Animals 对象，如果找到 Animals 对象，则返回该对象，否则将创建一个存储在 hashmap 中以备后续使用的新对象，并把该对象返回到客户端。

###### Main，我们的演示类使用 AnimalsFactory 来获取 Animals 对象。它将向 AnimalsFactory 传递信息（男 / 女 / 未知的性别），以便获取它所需对象的颜色。

![享元模式的 UML 图](https://github.com/wanwujiedao/pattern/blob/master/img/flyweight_pattern_uml_diagram.jpg)

> 步骤 1：创建一个接口。

**Animals.java**

```markdown
 
    package com.dao.pattern.flyweight.interfaces;
    
    /**
     * 动物
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.flyweight.interfaces.Animals.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-26 13:51:00
     */
    public interface Animals {
    
        /**
         * 自述
         *
         * @author 阿导
         * @time 2018/3/26
         * @CopyRight 万物皆导
         * @param
         * @return void
         */
        void say();
    }

```

> 步骤 2：创建实现接口的实体类。

**Human.java**

```markdown
        
    package com.dao.pattern.flyweight.impl;
    
    import com.dao.pattern.flyweight.interfaces.Animals;
    
    /**
     * 人类
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.flyweight.impl.Human.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-26 13:55:00
     */
    public class Human implements Animals{
    
        /**
         * 性别
         */
        private String sex;
        /**
         * 姓名
         */
        private String name;
        /**
         * 构造方法
         *
         * @author 阿导
         * @time 2018/3/26
         * @CopyRight 万物皆导
         * @param sex
         * @return
         */
        public Human(String sex) {
            this.sex = sex;
            System.out.println("我是上帝，正在创建性别为"+sex+"的人类...");
        }
    
        /**
         * 姓名填充
         *
         * @author 阿导
         * @time 2018/3/26
         * @CopyRight 万物皆导
         * @param name
         * @return void
         */
        public void setName(String name) {
            this.name = name;
        }
    
        /**
         * 自述
         *
         * @return void
         * @author 阿导
         * @time 2018/3/26
         * @CopyRight 万物皆导
         */
        @Override
        public void say() {
            System.out.println("我叫"+name+",性别"+sex+"。");
        }
    }

```

> 步骤 3：创建一个工厂，生成基于给定信息的实体类的对象。

**AnimalsFactory.java**

```markdown
    
    package com.dao.pattern.flyweight.core;
    
    import com.dao.pattern.flyweight.impl.Human;
    import com.dao.pattern.flyweight.interfaces.Animals;
    
    import java.util.HashMap;
    
    /**
     * 动物工厂类
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.flyweight.core.AnimalsFactory.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-26 14:00:00
     */
    public class AnimalsFactory {
        /**
         * 存储动物的 map
         */
        private static HashMap<String,Animals> animalsMap=new HashMap<>();
    
        public static Animals getAnimals(String sex){
            //先尝试从 map 中获取人
            Animals animal = animalsMap.getOrDefault(sex, null);
            //若没有，重新创建
            if(animal==null){
                animal=new Human(sex);
                animalsMap.put(sex,animal);
            }
            //返回结果
            return animal;
        }
    }

```

> 步骤 4：使用该工厂，通过传递颜色信息来获取实体类的对象。

**Main.java**

```markdown
        
    package com.dao.pattern.flyweight.main;
    
    import com.dao.pattern.flyweight.core.AnimalsFactory;
    import com.dao.pattern.flyweight.impl.Human;
    import com.dao.pattern.flyweight.interfaces.Animals;
    
    import java.util.Random;
    
    /**
     * 主程序入口
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.flyweight.main.Main.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-26 14:14:00
     */
    public class Main {
        /**
         * 性别
         */
        private static final String sexs[] ={"男","女","未知的性别"};
    
        private static final String names="abcdefghijklmnopqrstuvwxyz";
        /**
         * 主方法入口
         *
         * @author 阿导
         * @time 2018/3/26
         * @CopyRight 万物皆导
         * @param args
         * @return void
         */
        public static void main(String[] args){
            for(int pox=0;pox<10;pox++){
                Human animal = (Human) AnimalsFactory.getAnimals(getRandomSex());
                animal.setName(getName());
                animal.say();
            }
        }
    
        /**
         * 随机获取性别
         *
         * @author 阿导
         * @time 2018/3/26
         * @CopyRight 万物皆导
         * @param
         * @return java.lang.String
         */
        private static String getRandomSex() {
            return sexs[(int)(Math.random()*sexs.length)];
        }
    
    
        /**
         * 随机获取名字
         *
         * @author 阿导
         * @time 2018/3/26
         * @CopyRight 万物皆导
         * @param
         * @return java.lang.String
         */
        private static String getName(){
            StringBuffer sb=new StringBuffer();
            for(int pox=0;pox<6;pox++){
                sb.append( names.charAt(new Random().nextInt(names.toCharArray().length)));
            }
            return sb.toString();
        }
    }

```

> 步骤 5：验证输出。

```markdown
    
    我是上帝，正在创建性别为女的人类...
    我叫zunerv,性别女。
    我是上帝，正在创建性别为男的人类...
    我叫qaaqrr,性别男。
    我叫ayaibu,性别女。
    我叫uodxxj,性别男。
    我是上帝，正在创建性别为未知的性别的人类...
    我叫tnhqch,性别未知的性别。
    我叫zkamwz,性别未知的性别。
    我叫tprhjk,性别女。
    我叫ibwnsx,性别女。
    我叫laplcr,性别女。
    我叫xfgnzm,性别女。
    
```
