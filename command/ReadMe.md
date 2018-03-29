# 命令模式

***

###### 命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。

***

## 介绍

- **意图**：将一个请求封装成一个对象，从而使您可以用不同的请求对客户进行参数化。

- **主要解决**：在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系，但某些场合，比如需要对行为进行记录、撤销或重做、事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适。

- **何时使用**：在某些场合，比如要对行为进行"记录、撤销/重做、事务"等处理，这种无法抵御变化的紧耦合是不合适的。在这种情况下，如何将"行为请求者"与"行为实现者"解耦？将一组行为抽象为对象，可以实现二者之间的松耦合。

- **如何解决**：通过调用者调用接受者执行命令，顺序：调用者→接受者→命令。

- **关键代码**：定义三个角色：

> 1、received 真正的命令执行对象 

> 2、Command 

> 3、invoker 使用命令对象的入口

- **应用实例**：struts 1 中的 action 核心控制器 ActionServlet 只有一个，相当于 Invoker，而模型层的类会随着不同的应用有不同的模型类，相当于具体的 Command。

- **优点**： 

> 1、降低了系统耦合度。 

> 2、新的命令可以很容易添加到系统中去。

- **缺点**：使用命令模式可能会导致某些系统有过多的具体命令类。

- **使用场景**：认为是命令的地方都可以使用命令模式，比如： 

> 1、GUI 中每一个按钮都是一条命令。 

> 2、模拟 CMD。

- **注意事项**：系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作，也可以考虑使用命令模式，见命令模式的扩展。

***

## 实现

###### 我们首先创建作为命令的接口 Order，然后创建作为请求的 DataBase 类。实体命令类 InsertOperation 和 QueryOperation，实现了 Order 接口，将执行实际的命令处理。创建作为调用对象的类 Broker，它通过模拟数据库进行相应的操作。

###### Broker 对象使用命令模式，基于命令的类型确定哪个对象执行哪个命令。Main，我的演示类使用 Broker 类来演示命令模式。

![命令模式的 UML 图](https://github.com/wanwujiedao/pattern/blob/master/img/command_pattern_uml_diagram.jpg)


> 步骤 1：创建一个命令接口。

**Order.java**

```markdown

    package com.dao.pattern.command.interfaces;
    
    /**
     * 命令
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.command.interfaces.Order.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-28 09:35:00
     */
    public interface Order {
        /**
         * 执行命令
         *
         * @author 阿导
         * @time 2018/3/28
         * @CopyRight 万物皆导
         * @param
         * @return void
         */
        void execute();
    }

```

> 步骤 2：创建一个请求类。

**DataBase.java**

```markdown
    
    package com.dao.pattern.command.vo;
    
    /**
     * 数据库
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.command.vo.DataBase.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-28 09:43:00
     */
    public class DataBase {
    
        private String name;
    
        /**
         * 新增操作
         *
         * @param name
         * @return void
         * @author 阿导
         * @time 2018/3/28
         * @CopyRight 万物皆导
         */
        public void insert(String name) {
            System.out.println("正在执行新增操作...");
            this.name = name;
            System.out.println("新增姓名【" + this.name + "]成功");
        }
    
        /**
         * 查询操作
         *
         * @param
         * @return void
         * @author 阿导
         * @time 2018/3/28
         * @CopyRight 万物皆导
         */
        public void query() {
            System.out.println("正在进行查询操作...");
            System.out.println("查询姓名【" + this.name + "]成功");
        }
    }

```

> 步骤 3：创建实现了 Order 接口的实体类。

**InsertOperation.java**

```markdown

    package com.dao.pattern.command.impl;
    
    import com.dao.pattern.command.interfaces.Order;
    import com.dao.pattern.command.vo.DataBase;
    
    /**
     * 新增操作
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.command.impl.InsertOperation.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-28 10:54:00
     */
    public class InsertOperation implements Order {
    
        /**
         * 数据库
         */
        private DataBase dataBase;
        /**
         * 姓名
         */
        private String name;
    
        /**
         * 新增构造函数
         *
         * @author 阿导
         * @time 2018/3/28
         * @CopyRight 万物皆导
         * @param dataBase
         * @return
         */
        public InsertOperation(DataBase dataBase,String name) {
            this.dataBase = dataBase;
            this.name=name;
        }
    
        /**
         * 执行新增命令
         *
         * @return void
         * @author 阿导
         * @time 2018/3/28
         * @CopyRight 万物皆导
         */
        @Override
        public void execute() {
            this.dataBase.insert(this.name);
        }
    }

```
    
**QueryOperation.java**

```markdown
    
    package com.dao.pattern.command.impl;
    
    import com.dao.pattern.command.interfaces.Order;
    import com.dao.pattern.command.vo.DataBase;
    
    /**
     * 查询操作
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.command.impl.QueryOperation.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-28 10:54:00
     */
    public class QueryOperation implements Order {
    
        private DataBase dataBase;
    
        /**
         * 查询构造函数
         *
         * @author 阿导
         * @time 2018/3/28
         * @CopyRight 万物皆导
         * @param dataBase
         * @return
         */
        public QueryOperation(DataBase dataBase) {
            this.dataBase = dataBase;
        }
    
        /**
         * 执行查询命令
         *
         * @return void
         * @author 阿导
         * @time 2018/3/28
         * @CopyRight 万物皆导
         */
        @Override
        public void execute() {
            this.dataBase.query();
        }
    }


```

> 步骤 4：创建命令调用类。

**Broker.java**

```markdown
    
    package com.dao.pattern.command.core;
    
    import com.dao.pattern.command.interfaces.Order;
    
    import java.util.ArrayList;
    import java.util.List;
    
    /**
     * 命令调用类
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.command.core.Broker.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-28 11:02:00
     */
    public class Broker {
        /**
         * 声明命令类
         */
        private List<Order> orderList = new ArrayList<Order>();
    
        /**
         * 添加命令
         *
         * @author 阿导
         * @time 2018/3/28
         * @CopyRight 万物皆导
         * @param order
         * @return void
         */
        public void takeOrder(Order order){
            orderList.add(order);
        }
        /**
         * 开始执行命令
         *
         * @author 阿导
         * @time 2018/3/28
         * @CopyRight 万物皆导
         * @param
         * @return void
         */
        public void placeOrders(){
            for (Order order : orderList) {
                order.execute();
            }
            orderList.clear();
        }
    }

```

> 步骤 5：使用 Broker 类来接受并执行命令。

**Main.java**

```markdown

    package com.dao.pattern.command.main;
    
    import com.dao.pattern.command.core.Broker;
    import com.dao.pattern.command.impl.InsertOperation;
    import com.dao.pattern.command.impl.QueryOperation;
    import com.dao.pattern.command.vo.DataBase;
    
    /**
     * 主程序入口、
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.command.main.Main.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-28 11:01:00
     */
    public class Main {
        /**
         * 主方法
         *
         * @author 阿导
         * @time 2018/3/28
         * @CopyRight 万物皆导
         * @param args
         * @return void
         */
        public static void main(String[] args){
            //请求类：数据库
            DataBase dataBase=new DataBase();
            //命令调用类
            Broker broker = new Broker();
    
            //添加新增和查询命令
            broker.takeOrder(new InsertOperation(dataBase,"小明"));
            broker.takeOrder(new QueryOperation(dataBase));
    
            //执行所有命令
            broker.placeOrders();
    
        }
    
    }

```

> 步骤 6：验证输出。

```markdown

    正在执行新增操作...
    新增姓名【小明]成功
    正在进行查询操作...
    查询姓名【小明]成功

```
