# 桥接模式

***

###### 桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。

###### 这种模式涉及到一个作为桥接的接口，使得实体类的功能独立于接口实现类。这两种类型的类可被结构化改变而互不影响。

###### 我们通过下面的实例来演示桥接模式（Bridge Pattern）的用法。其中，可以使用相同的抽象类方法但是不同的桥接实现类，来区分不同的人。

***

## 介绍
- **意图**：将抽象部分与实现部分分离，使它们都可以独立的变化。
- **主要解决**：在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。
- **何时使用**：实现系统可能有多个角度分类，每一种角度都可能变化。
- **如何解决**：把这种多角度分类分离出来，让它们独立变化，减少它们之间耦合。
- **关键代码**：抽象类依赖实现类。
- **应用实例**：
> 1、猪八戒从天蓬元帅转世投胎到猪，转世投胎的机制将尘世划分为两个等级，即：灵魂和肉体，前者相当于抽象化，后者相当于实现化。生灵通过功能的委派，调用肉体对象的功能，使得生灵可以动态地选择。 

> 2、墙上的开关，可以看到的开关是抽象的，不用管里面具体怎么实现的。

- **优点**：
 > 1、抽象和实现的分离。 
 > 2、优秀的扩展能力。 
 > 3、实现细节对客户透明。

- **缺点**：桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程。

- **使用场景**： 
> 1、如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，通过桥接模式可以使它们在抽象层建立一个关联关系。 
> 2、对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用。 
> 3、一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。
注意事项：对于两个独立变化的维度，使用桥接模式再适合不过了。

***

## 实现
我们有一个作为桥接实现的 Voice 接口和实现了 Voice 接口的实体类 VoiceManImpl、VoiceManImpl。Animals 是一个抽象类，将使用 Voice 的对象。Main，我们的演示类使用 Animals 类来让人发出不同的声音。

![桥接模式的 UML 图](https://github.com/wanwujiedao/pattern/blob/master/img/bridge_pattern_uml_diagram.jpg)

> 步骤 1：创建桥接实现接口。
```markdown

    **Voice.java**

   package com.dao.pattern.bridge.interfaces;
   
   /**
    * 声音
    *
    * @author 阿导
    * @version 1.0
    * @fileName com.dao.pattern.bridge.interfaces.Voice.java
    * @CopyRright (c) 2018-万物皆导
    * @created 2018-03-21 17:33:00
    */
   public interface Voice {
   
       /**
        * 这个人想说什么呢？
        *
        * @author 阿导
        * @time 2018/3/21
        * @CopyRight 万物皆导
        * @param contry 国家
        * @param skin 肤色
        * @return void
        */
       void say(String contry,String skin);
   }


```

> 步骤 2：创建实现了 Voice 接口的实体桥接实现类。

```markdown

    **VoiceManImpl.java**
    
    package com.dao.pattern.bridge.impl;
    
    import com.dao.pattern.bridge.interfaces.Voice;
    
    /**
     * 男人的声音
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.bridge.PeopleImpl.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-21 17:35:00
     */
    public class VoiceManImpl implements Voice {
        /**
         * 这个男人想说什么呢？
         *
         * @author 阿导
         * @time 2018/3/21
         * @CopyRight 万物皆导
         * @param contry 国家
         * @param skin 肤色
         * @return void
         */
        public void say(String contry, String skin) {
            //输出男人想说的话
            System.out.println("我是男人，来自".concat(contry).concat("，皮肤的颜色是").concat(skin));
        }
    }


    
    **VoiceWomanImpl.java**

   package com.dao.pattern.bridge.impl;
   
   import com.dao.pattern.bridge.interfaces.Voice;
   
   /**
    * 女人的声音
    *
    * @author 阿导
    * @version 1.0
    * @fileName com.dao.pattern.bridge.impl.VoiceWomanImpl.java
    * @CopyRright (c) 2018-万物皆导
    * @created 2018-03-21 17:37:00
    */
   public class VoiceWomanImpl implements Voice {
       /**
        * 这个女人想说什么呢？
        *
        * @author 阿导
        * @time 2018/3/21
        * @CopyRight 万物皆导
        * @param contry 国家
        * @param skin 肤色
        * @return void
        */
       public void say(String contry, String skin) {
           //输出女人想说的话
           System.out.println("我是女人，来自".concat(contry).concat("，皮肤的颜色是").concat(skin));
       }
   }


```

> 步骤 3：使用 Voice 接口创建抽象类 Animals。

```markdown

    **Animals.java**

   package com.dao.pattern.bridge.core;
   
   import com.dao.pattern.bridge.interfaces.Voice;
   
   /**
    * 动物
    *
    * @author 阿导
    * @version 1.0
    * @fileName com.dao.pattern.bridge.core.Animals.java
    * @CopyRright (c) 2018-万物皆导
    * @created 2018-03-21 17:42:00
    */
   public abstract class Animals {
       protected Voice voice;
       /**
        * 构造方法
        *
        * @author 阿导
        * @time 2018/3/21
        * @CopyRight 万物皆导
        * @param voice
        * @return
        */
       protected  Animals(Voice voice) {
           this.voice = voice;
       }
   
       /**
        * 动物想发声
        *
        * @author 阿导
        * @time 2018/3/21
        * @CopyRight 万物皆导
        * @param
        * @return void
        */
       public abstract void voice();
   }


```

> 步骤 4：创建实现了 Animals 接口的实体类。

```markdown

    **Human.java**
    
   package com.dao.pattern.bridge.core;
   
   import com.dao.pattern.bridge.interfaces.Voice;
   
   /**
    * 人类
    *
    * @author 阿导
    * @version 1.0
    * @fileName com.dao.pattern.bridge.core.Human.java
    * @CopyRright (c) 2018-万物皆导
    * @created 2018-03-21 17:46:00
    */
   public class Human extends Animals {
   
       /**
        * 国家
        */
       private String country;
       /**
        * 肤色
        */
       private String skin;
   
       /**
        * 构造方法
        *
        * @author 阿导
        * @time 2018/3/21
        * @CopyRight 万物皆导
        * @param country
        * @param skin
        * @param voice
        * @return
        */
       public Human(String country,String skin,Voice voice){
           super(voice);
           this.country=country;
           this.skin=skin;
       }
   
       /**
        * 人有话说
        *
        * @return void
        * @author 阿导
        * @time 2018/3/21
        * @CopyRight 万物皆导
        */
       @Override
       public void voice() {
           //人妖说话了
           voice.say(this.country,this.skin);
       }
   }


```

> 步骤 5：使用 Animals 和 Voice 人发出声音。

```markdown

    **Main.java**

    package com.dao.pattern.bridge.main;
    
    import com.dao.pattern.bridge.core.Animals;
    import com.dao.pattern.bridge.core.Human;
    import com.dao.pattern.bridge.impl.VoiceManImpl;
    import com.dao.pattern.bridge.impl.VoiceWomanImpl;
    
    /**
     * 主程序入口
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.bridge.main.Main.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-21 17:51:00
     */
    public class Main {
        /**
         * 主方法入口
         *
         * @author 阿导
         * @time 2018/3/21
         * @CopyRight 万物皆导
         * @param args
         * @return void
         */
        public static void main(String[] args){
            //中国男人
            Animals chinaMan=new Human("中国","黄色",new VoiceManImpl());
            //日本女人
            Animals japanWoman=new Human("日本","黄偏白",new VoiceWomanImpl());
    
            //这两个人都有话说
            chinaMan.voice();
            japanWoman.voice();
        }
    }

```
> 步骤 6：验证输出。

```markdown

    我是男人，来自中国，皮肤的颜色是黄色
    我是女人，来自日本，皮肤的颜色是黄偏白

```
