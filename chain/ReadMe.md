# 责任链模式

***

###### 顾名思义，责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。这种模式给予请求的类型，对请求的发送者和接收者进行解耦。这种类型的设计模式属于行为型模式。

###### 在这种模式中，通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。

***

## 介绍

- **意图**：避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。

- **主要解决**：职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，无须关心请求的处理细节和请求的传递，所以职责链将请求的发送者和请求的处理者解耦了。

- **何时使用**：在处理消息的时候以过滤很多道。

- **如何解决**：拦截的类都实现统一接口。

- **关键代码**：Handler 里面聚合它自己，在 HanleRequest 里判断是否合适，如果没达到条件则向下传递，向谁传递之前 set 进去。

- **应用实例**： 

> 1、红楼梦中的"击鼓传花"。

> 2、JS 中的事件冒泡。 

> 3、JAVA WEB 中 Apache Tomcat 对 Encoding 的处理，Struts2 的拦截器，jsp servlet 的 Filter。

- **优点*8： 

> 1、降低耦合度。它将请求的发送者和接收者解耦。 

> 2、简化了对象。使得对象不需要知道链的结构。 

> 3、增强给对象指派职责的灵活性。通过改变链内的成员或者调动它们的次序，允许动态地新增或者删除责任。 

> 4、增加新的请求处理类很方便。

- **缺点**： 

> 1、不能保证请求一定被接收。 

> 2、系统性能将受到一定影响，而且在进行代码调试时不太方便，可能会造成循环调用。 

> 3、可能不容易观察运行时的特征，有碍于除错。

- **使用场景**： 

> 1、有多个对象可以处理同一个请求，具体哪个对象处理该请求由运行时刻自动确定。 

> 2、在不明确指定接收者的情况下，向多个对象中的一个提交一个请求。 

> 3、可动态指定一组对象处理请求。

- **注意事项**：在 JAVA WEB 中遇到很多应用。

***

## 实现

###### 我们创建抽象类 AbstractLogger，带有详细的日志记录级别。然后我们创建三种类型的记录器，都扩展了 AbstractLogger。每个记录器消息的级别是否属于自己的级别，如果是则相应地打印出来，否则将不打印并把消息传给下一个记录器。

![责任链模式的 UML 图](https://github.com/wanwujiedao/pattern/blob/master/img/chain_pattern_uml_diagram.jpg)

> 步骤 1：创建抽象的记录器类。

**AbstractPrice.java**
 
```markdown
        
    package com.dao.pattern.chain.abstracts;
    
    /**
     * 抽象类，价钱
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.chain.abstracts.AbstractPrice.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-27 09:09:00
     */
    public abstract class AbstractPrice {
        /**
         * 贵重
         */
        public static final int EXPENSIVE=1000;
        /**
         * 中等
         */
        public static final int SECONDARY=100;
        /**
         * 廉价
         */
        public static final int CHEAP=10;
    
    
    
    
        /**
         * 所带的钱
         */
        protected int price;
    
        /**
         * 责任链中的下一个元素
         */
        protected AbstractPrice next;
    
        /**
         * 设置下一个节点
         *
         * @author 阿导
         * @time 2018/3/27
         * @CopyRight 万物皆导
         * @param next
         * @return void
         */
        public void setNext(AbstractPrice next){
            this.next = next;
        }
    
        /**
         * 购买能力
         *
         * @author 阿导
         * @time 2018/3/27
         * @CopyRight 万物皆导
         * @param price
         * @param msg
         * @return void
         */
        public void buy(int price,String msg){
            /**
             * 当前性别
             */
            if(this.price<=price){
                buy(msg);
            }
            //看看是否满足
            if(this.next!=null){
                this.next.buy(price, msg);
            }
        }
    
        /**
         * 某人的购买能力
         *
         * @author 阿导
         * @time 2018/3/27
         * @CopyRight 万物皆导
         * @param msg
         * @return void
         */
        protected abstract void buy(String msg);
    
    }

```

> 步骤 2：创建扩展了该记录器类的实体类。

**Expensive.java**
 
```markdown

    package com.dao.pattern.chain.buy;
    
    import com.dao.pattern.chain.abstracts.AbstractPrice;
    
    /**
     * 购买能力达到昂贵的水平
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.chain.buy.Expensive.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-27 09:27:00
     */
    public class Expensive extends AbstractPrice {
    
        /**
         * 构造函数
         *
         * @author 阿导
         * @time 2018/3/27
         * @CopyRight 万物皆导
         * @param price
         * @return
         */
        public Expensive(int price) {
            this.price=price;
        }
    
        /**
         * 某人的购买能力：昂贵
         *
         * @param msg
         * @return void
         * @author 阿导
         * @time 2018/3/27
         * @CopyRight 万物皆导
         */
        @Override
        protected void buy(String msg) {
            System.out.println(msg+"，所带的钱购买能力已经达到昂贵的水准。");
        }
    }

```
    
**Secondary.java**

```markdown    

    package com.dao.pattern.chain.buy;
    
    import com.dao.pattern.chain.abstracts.AbstractPrice;
    
    /**
     * 中等购买能力
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.chain.buy.Secondary.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-27 09:30:00
     */
    public class Secondary extends AbstractPrice {
    
        /**
         * 构造函数
         *
         * @author 阿导
         * @time 2018/3/27
         * @CopyRight 万物皆导
         * @param price
         * @return
         */
        public Secondary(int price) {
            this.price=price;
        }
    
        /**
         * 某人的购买能力：中等
         *
         * @param msg
         * @return void
         * @author 阿导
         * @time 2018/3/27
         * @CopyRight 万物皆导
         */
        @Override
        protected void buy(String msg) {
            System.out.println(msg+"，所带的钱购买能力已经达到中等的水准。");
        }
    }

```

**Cheap.java**

```markdown

    package com.dao.pattern.chain.buy;
    
    import com.dao.pattern.chain.abstracts.AbstractPrice;
    
    /**
     * 廉价的购买能力
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.chain.buy.Cheap.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-27 09:31:00
     */
    public class Cheap extends AbstractPrice {
    
        /**
         * 构造函数
         *
         * @author 阿导
         * @time 2018/3/27
         * @CopyRight 万物皆导
         * @param price
         * @return
         */
        public Cheap(int price) {
            this.price=price;
        }
    
        /**
         * 某人的购买能力：廉价
         *
         * @param msg
         * @return void
         * @author 阿导
         * @time 2018/3/27
         * @CopyRight 万物皆导
         */
        @Override
        protected void buy(String msg) {
            System.out.println(msg+"，所带的钱购买能力已经达到廉价的水准。");
        }
    }


```
> 步骤 3：创建不同类型的记录器。赋予它们不同的错误级别，并在每个记录器中设置下一个记录器。每个记录器中的下一个记录器代表的是链的一部分。

**ChainMaker.java**
 
```markdown
    
    package com.dao.pattern.chain.core;
    
    import com.dao.pattern.chain.abstracts.AbstractPrice;
    import com.dao.pattern.chain.buy.Cheap;
    import com.dao.pattern.chain.buy.Expensive;
    import com.dao.pattern.chain.buy.Secondary;
    
    /**
     * 责任链生成
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.chain.core.ChainMaker.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-27 09:32:00
     */
    public class ChainMaker {
    
    
        public static AbstractPrice getAbstractPrice(){
    
            // 昂贵的购买能力
            AbstractPrice expensive=new Expensive(AbstractPrice.EXPENSIVE);
            //下一个责任节点是中等
            AbstractPrice secondary=new Secondary(AbstractPrice.SECONDARY);
            // 下一个责任节点是廉价
            AbstractPrice cheap=new Cheap(AbstractPrice.CHEAP);
            //链路链接
            secondary.setNext(cheap);
            expensive.setNext(secondary);
    
            //返回结果
            return expensive;
        }
    }

```

> 步骤 4：Main 是我的演示类

**Main.java**
 
```markdown
        
    package com.dao.pattern.chain.main;
    
    import com.dao.pattern.chain.abstracts.AbstractPrice;
    import com.dao.pattern.chain.core.ChainMaker;
    
    /**
     * 主程序入口
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.chain.main.Main.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-27 09:40:00
     */
    public class Main {
        /**
         * 主程序入口
         *
         * @author 阿导
         * @time 2018/3/27
         * @CopyRight 万物皆导
         * @param args
         * @return void
         */
        public static void main(String[] args){
            //获取购买能力责任链
            AbstractPrice buy = ChainMaker.getAbstractPrice();
            System.out.println("==================三个购买能力都达到的===================");
            buy.buy(1500,"小明带了 1500 元");
            System.out.println("==================未能达到昂贵的购买能力===================");
            buy.buy(800,"小明带了 800 元");
            System.out.println("==================只能达到廉价的购买能力===================");
            buy.buy(90,"小明带了 90 元");
        }
    }


```

> 步骤 5：验证输出。

```markdown
    
    ==================三个购买能力都达到的===================
    小明带了 1500 元，所带的钱购买能力已经达到昂贵的水准。
    小明带了 1500 元，所带的钱购买能力已经达到中等的水准。
    小明带了 1500 元，所带的钱购买能力已经达到廉价的水准。
    ==================未能达到昂贵的购买能力===================
    小明带了 800 元，所带的钱购买能力已经达到中等的水准。
    小明带了 800 元，所带的钱购买能力已经达到廉价的水准。
    ==================只能达到廉价的购买能力===================
    小明带了 90 元，所带的钱购买能力已经达到廉价的水准。
    
```
