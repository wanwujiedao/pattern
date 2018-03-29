# 中介者模式

***

###### 中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。中介者模式属于行为型模式。

***

## 介绍

- **意图**：用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
主要解决：对象与对象之间存在大量的关联关系，这样势必会导致系统的结构变得很复杂，同时若一个对象发生改变，我们也需要跟踪与之相关联的对象，同时做出相应的处理。

- **何时使用**：多个类相互耦合，形成了网状结构。

- **如何解决**：将上述网状结构分离为星型结构。

- **关键代码**：对象 Colleague 之间的通信封装到一个类中单独处理。

- **应用实例**： 

> 1、中国加入 WTO 之前是各个国家相互贸易，结构复杂，现在是各个国家通过 WTO 来互相贸易。 

> 2、机场调度系统。 

> 3、MVC 框架，其中C（控制器）就是 M（模型）和 V（视图）的中介者。

- **优点**： 

> 1、降低了类的复杂度，将一对多转化成了一对一。 

> 2、各个类之间的解耦。 

> 3、符合迪米特原则。

- **缺点**：中介者会庞大，变得复杂难以维护。

- **使用场景**： 

> 1、系统中对象之间存在比较复杂的引用关系，导致它们之间的依赖关系结构混乱而且难以复用该对象。 

> 2、想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类。

- **注意事项**：不应当在职责混乱的时候使用。

***

##实现

###### 我们通过聊天室实例来演示中介者模式。实例中，多个用户可以向聊天室发送消息，聊天室向所有的用户显示消息。我们将创建两个类 ChatRoom 和 User。User 对象使用 ChatRoom 方法来分享他们的消息。

###### MediatorPatternDemo，我的演示类使用 User 对象来显示他们之间的通信。

![中介者模式的 UML 图](https://github.com/wanwujiedao/pattern/blob/master/img/mediator_pattern_uml_diagram.jpg)


> 步骤 1：创建中介类。

**Mediator.java**

```markdown

   package com.dao.pattern.mediator.core;
   
   import java.util.concurrent.LinkedBlockingQueue;
   
   /**
    * 中介
    *
    * @author 阿导
    * @version 1.0
    * @fileName com.dao.pattern.mediator.core.Mediator.java
    * @CopyRright (c) 2018-万物皆导
    * @created 2018-03-29 15:07:00
    */
   public class Mediator {
       /**
        * 声明一个队列，作为中介传递信息
        */
       private static LinkedBlockingQueue queue;
       
       static {
           queue=new LinkedBlockingQueue();
       }
   
       /**
        * 获取队列
        * @author 阿导
        * @time 2018/3/29
        * @CopyRight 万物皆导
        * @param
        * @return java.util.concurrent.LinkedBlockingQueue
        */
       public static LinkedBlockingQueue getQueue() {
           return queue;
       }
   
   
   }


```

> 步骤 2：创建管理员类，给员工发送信息。

**Administrators.java**

```markdown
    
    package com.dao.pattern.mediator.core;
    
    /**
     * 发送信息的人
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.mediator.core.Administrators.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-29 15:17:00
     */
    public class Administrators {
    
        /**
         * 发送信息
         *
         * @author 阿导
         * @time 2018/3/29
         * @CopyRight 万物皆导
         * @param msg
         * @return void
         */
        public static void sendMsg(String msg){
            Mediator.getQueue().offer(msg);
        }
    }

```

> 步骤 3：创建员工类，进行接收信息。

**Staff.java**

```markdown
    
    package com.dao.pattern.mediator.core;
    
    import java.util.Iterator;
    
    /**
     * 员工
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.mediator.core.Staff.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-29 15:18:00
     */
    public class Staff {
    
        /**
         * 打印信息
         *
         * @author 阿导
         * @time 2018/3/29
         * @CopyRight 万物皆导
         * @param
         * @return void
         */
        public static void printMsg(){
            Iterator iterator = Mediator.getQueue().iterator();
            while (iterator.hasNext()){
                Object next = iterator.next();
                System.out.println(next);
            }
        }
    }

```

> 步骤 4：Main 我的演示类，让管理员通过中介（可认为是邮件或者广播的形式）给员工发送信息

**Main.java**

```markdown
    
    package com.dao.pattern.mediator.main;
    
    import com.dao.pattern.mediator.core.Administrators;
    import com.dao.pattern.mediator.core.Staff;
    
    /**
     * 主程序入口
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.mediator.main.Main.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-29 15:17:00
     */
    public class Main {
    
        /**
         * 主程序入口
         *
         * @author 阿导
         * @time 2018/3/29
         * @CopyRight 万物皆导
         * @param args
         * @return void
         */
        public static void main(String[] args){
            //管理员首先向所有员工发送放假信息
            Administrators.sendMsg("今天上午放假！");
            //管理员向所有员工发送发放工资信息
            Administrators.sendMsg("今天下午三点发放上个月的薪资！");
            //管理员向所有员工发送团建信息
            Administrators.sendMsg("今天今天晚上来阿导大酒店团建！");
    
            //员工接收信息
            Staff.printMsg();
        }
    }

```

> 步骤 5：验证输出。

```markdown

    今天上午放假！
    今天下午三点发放上个月的薪资！
    今天今天晚上来阿导大酒店团建！
    
```
