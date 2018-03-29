# 抽象工厂模式

***

###### 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

###### 在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。
***

## 介绍

- **意图**：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。

- **主要解决**：主要解决接口选择的问题。

- **何时使用**：系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。

- **如何解决**：在一个产品族里面，定义多个产品。

- **关键代码**：在一个工厂里聚合多个同类产品。

- **应用实例**：工作了，为了参加一些聚会，肯定有两套或多套衣服吧，比如说有商务装（成套，一系列具体产品）、时尚装（成套，一系列具体产品），甚至对于一个家庭来说，可能有商务女装、商务男装、时尚女装、时尚男装，这些也都是成套的，即一系列具体产品。假设一种情况（现实中是不存在的，要不然，没法进入共产主义了，但有利于说明抽象工厂模式），在您的家中，某一个衣柜（具体工厂）只能存放某一种这样的衣服（成套，一系列具体产品），每次拿这种成套的衣服时也自然要从这个衣柜中取出了。用 OO 的思想去理解，所有的衣柜（具体工厂）都是衣柜类的（抽象工厂）某一个，而每一件成套的衣服又包括具体的上衣（某一具体产品），裤子（某一具体产品），这些具体的上衣其实也都是上衣（抽象产品），具体的裤子也都是裤子（另一个抽象产品）。

- **优点**：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。

- **缺点**：产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。

- **使用场景**：

> 1、QQ 换皮肤，一整套一起换。

> 2、生成不同操作系统的程序。

- **注意事项**：产品族难扩展，产品等级易扩展。

***

## 实现

###### 我们将创建 Iliquid 和 IUse 接口和实现这些接口的实体类。下一步是创建抽象工厂类 AbstractFactory。接着定义工厂类 LiquidFactory 和 UseFactory，这两个工厂类都是扩展了 AbstractFactory。然后创建一个工厂创造器/生成器类 FactoryProducer。
###### Main是我的启动类，演示类使用 FactoryProducer 来获取 AbstractFactory 对象。它将向 AbstractFactory 传递液体信息 Iliquid（Gasoline / Perfume），以便获取它所需对象的类型。同时它还向 AbstractFactory 传递用处信息 IUse（GasolineUse / PerfumeUse），以便获取它所需对象的类型。

![抽象工厂模式的 UML 图](https://github.com/wanwujiedao/pattern/blob/master/img/abstractfactory_pattern_uml_diagram.jpg)


> 步骤 1：为用处创建一个接口。

**IUse.java**

```markdown

    package com.dao.pattern.abstractfactory.interfaces;
    
    /**
     * 用处
     *
     * @author 阿导
     * @version BUILD1001
     * @fileName com.dao.pattern.abstractfactory.interfaces.IUse.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-01-30 15:41:00
     */
    public interface IUse {
        /**
         * 用处
         *
         * @author 阿导
         * @time 2018/1/30
         * @CopyRight 万物皆导
         * @return void
         */
        void use();
    }

```

> 步骤 2：创建实现用处接口的实体类。

**GasolineUse.java**

```markdown
    
    package com.dao.pattern.abstractfactory.iml;
    
    import com.dao.pattern.abstractfactory.interfaces.IUse;
    
    /**
     * 汽油的用处
     *
     * @author 阿导
     * @version BUILD1001
     * @fileName com.dao.pattern.abstractfactory.iml.GasolineUse.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-01-30 15:48:00
     * @modifier 阿导
     * @updated 2018-01-30 15:48:00
     */
    public class GasolineUse implements IUse {
        /**
         * 汽油的使用
         *
         * @author 阿导
         * @time 2018/1/30
         * @CopyRight 万物皆导
         * @return void
         */
        @Override
        public void use() {
            System.out.println("汽油可以做燃料额！");
        }
    }

```


**PerfumeUse.java**

```markdown

    
    package com.dao.pattern.abstractfactory.iml;
    
    import com.dao.pattern.abstractfactory.interfaces.IUse;
    
    /**
     * 香水的用处
     *
     * @author 阿导
     * @version BUILD1001
     * @fileName com.dao.pattern.abstractfactory.iml.PerfumeUse.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-01-30 15:50:00
     * @modifier 阿导
     * @updated 2018-01-30 15:50:00
     */
    public class PerfumeUse implements IUse{
        /**
         * 香水的用处
         *
         * @author 阿导
         * @time 2018/1/30
         * @CopyRight 万物皆导
         * @return void
         */
        @Override
        public void use() {
            System.out.println("装扮于身更加迷人");
        }
    }

```

> 步骤 3：为液体创建一个接口【使用工厂模式里面的 Iliquid.java】。

> 步骤4：创建实现液体接口的实体类【使用工厂模式里面的 Gasoline.java，Perfume.java】。

> 步骤 5：为 液体 和 用处 对象创建抽象类来获取工厂。

**AbstractFactory.java**

```markdown    
    
    package com.dao.pattern.abstractfactory.core;
    
    import com.dao.pattern.abstractfactory.interfaces.IUse;
    import com.dao.pattern.factory.interfaces.Iliquid;
    
    /**
     * 抽象工厂类
     *
     * @author 阿导
     * @version BUILD1001
     * @fileName com.dao.pattern.abstractfactory.core.AbstractFactory.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-01-30 15:54:00
     */
    public abstract class AbstractFactory {
        /**
         * 液体工厂类
         *
         * @author 阿导
         * @time 2018/1/30
         * @CopyRight 万物皆导
         * @param clazz
         * @return com.dao.pattern.factory.interfaces.Iliquid
         */
        public abstract <T> Iliquid getLiquid(Class<? extends T> clazz);
    
        /**
         * 用处工厂
         *
         * @author 阿导
         * @time 2018/1/30
         * @CopyRight 万物皆导
         * @param clazz
         * @return com.dao.pattern.abstractfactory.interfaces.IUse
         */
        public abstract <T> IUse getUse(Class<? extends T> clazz);
    }


```

> 步骤 6：创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。

**UseFactory.java**

```markdown
    
    package com.dao.pattern.abstractfactory.core;
    
    import com.dao.pattern.abstractfactory.interfaces.IUse;
    import com.dao.pattern.factory.interfaces.Iliquid;
    
    /**
     * 用处的工厂类
     *
     * @author 阿导
     * @version BUILD1001
     * @fileName com.dao.pattern.abstractfactory.core.UseFactory.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-01-30 16:03:00
     * @modifier 阿导
     * @updated 2018-01-30 16:03:00
     */
    public class UseFactory extends AbstractFactory {
    
    
        /**
         * 液体工厂类
         *
         * @author 阿导
         * @time 2018/1/30
         * @CopyRight 万物皆导
         * @param clazz
         * @return com.dao.pattern.factory.interfaces.Iliquid
         */
        @Override
        public <T> Iliquid getLiquid(Class<? extends T> clazz) {
    
            return null;
        }
    
        /**
         * 用处工厂
         *
         * @author 阿导
         * @time 2018/1/30
         * @CopyRight 万物皆导
         * @param clazz
         * @return com.dao.pattern.abstractfactory.interfaces.IUse
         */
        @Override
        public <T> IUse getUse(Class<? extends T> clazz) {
            IUse obj = null;
    
            try {
                obj = (IUse) Class.forName(clazz.getName()).newInstance();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
    
            return obj;
        }
    }

```

**LiquidFactory.java**

```markdown
    
    package com.dao.pattern.abstractfactory.core;
    
    import com.dao.pattern.abstractfactory.interfaces.IUse;
    import com.dao.pattern.factory.interfaces.Iliquid;
    
    /**
     * 液体的工厂类
     *
     * @author 阿导
     * @version BUILD1001
     * @fileName com.dao.pattern.abstractfactory.core.LiquidFactory.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-01-30 16:03:00
     * @modifier 阿导
     * @updated 2018-01-30 16:03:00
     */
    public class LiquidFactory extends AbstractFactory {
    
        /**
         * 液体工厂类
         *
         * @author 阿导
         * @time 2018/1/30
         * @CopyRight 万物皆导
         * @param clazz
         * @return com.dao.pattern.factory.interfaces.Iliquid
         */
        @Override
        public <T> Iliquid getLiquid(Class<? extends T> clazz) {
    
            Iliquid obj = null;
    
            try {
                obj = (Iliquid) Class.forName(clazz.getName()).newInstance();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
    
            return obj;
        }
    
        /**
         * 用处工厂
         *
         * @author 阿导
         * @time 2018/1/30
         * @CopyRight 万物皆导
         * @param clazz
         * @return com.dao.pattern.abstractfactory.interfaces.IUse
         */
        @Override
        public <T> IUse getUse(Class<? extends T> clazz) {
            return null;
        }
    }


```

> 步骤 7：创建一个工厂创造器/生成器类，通过传递液体或用处信息来获取工厂。

**FactoryProducer.java**

```markdown
    
    package com.dao.pattern.abstractfactory.core;
    /**
     * 工厂创造器，构造器
     *
     * @author 阿导
     * @version BUILD1001
     * @fileName com.dao.pattern.abstractfactory.core.FactoryProducer.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-01-30 16:20:00
     * @modifier 阿导
     * @updated 2018-01-30 16:20:00
     */
    public class FactoryProducer {
       public static final String LIQUID="LIQUID";
       public static final String USE="USE";
       public static AbstractFactory getFactory(String choice){
          if(choice.equalsIgnoreCase(LIQUID)){
             return new LiquidFactory();
          } else if(choice.equalsIgnoreCase(USE)){
             return new UseFactory();
          }
          return null;
       }
    }

```


> 步骤 8：使用 FactoryProducer 来获取 AbstractFactory，通过传递类型信息来获取实体类的对象。

**Main.java**

```markdown
    
    package com.dao.pattern.abstractfactory.main;
    
    import com.dao.pattern.abstractfactory.core.AbstractFactory;
    import com.dao.pattern.abstractfactory.core.FactoryProducer;
    import com.dao.pattern.abstractfactory.impl.GasolineUse;
    import com.dao.pattern.abstractfactory.impl.PerfumeUse;
    import com.dao.pattern.factory.impl.Gasoline;
    import com.dao.pattern.factory.impl.Perfume;
    
    /**
     * 启动类
     *
     * @author 阿导
     * @version BUILD1001
     * @fileName com.dao.pattern.abstractfactory.main.Main.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-01-30 16:20:00
     * @modifier 阿导
     * @updated 2018-01-30 16:20:00
     */
    public class Main {
        /**
         * 主程序入口
         *
         * @author 阿导
         * @time 2018/1/30
         * @CopyRight 万物皆导
         * @param args
         * @return void
         */
        public static void main(String[] args){
            //液体啊
            AbstractFactory liquid = FactoryProducer.getFactory(FactoryProducer.LIQUID);
            //汽油
            liquid.getLiquid(Gasoline.class).taste();
            //香水
            liquid.getLiquid(Perfume.class).taste();
            //用处啊
            AbstractFactory use = FactoryProducer.getFactory(FactoryProducer.USE);
            //汽油的用处
            use.getUse(GasolineUse.class).use();
            //香水的用处
            use.getUse(PerfumeUse.class).use();
        }
    }

```

> 步骤 9：验证输出。

```markdown
    
    汽油好呛人！！！
    这香水有毒。。。
    汽油可以做燃料额！
    装扮于身更加迷人

```
