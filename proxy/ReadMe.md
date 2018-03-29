# 代理模式

***

######在代理模式（Proxy Pattern）中，一个类代表另一个类的功能。这种类型的设计模式属于结构型模式。

###### 在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。

***

##介绍

- **意图**：为其他对象提供一种代理以控制对这个对象的访问。

- **主要解决**：在直接访问对象时带来的问题，比如说：要访问的对象在远程的机器上。在面向对象系统中，有些对象由于某些原因（比如对象创建开销很大，或者某些操作需要安全控制，或者需要进程外的访问），直接访问会给使用者或者系统结构带来很多麻烦，我们可以在访问此对象时加上一个对此对象的访问层。
何时使用：想在访问一个类时做一些控制。

- **如何解决**：增加中间层。

- **关键代码**：实现与被代理类组合。

- **应用实例**：

> 1、Windows 里面的快捷方式。
 
> 2、猪八戒去找高翠兰结果是孙悟空变的，可以这样理解：把高翠兰的外貌抽象出来，高翠兰本人和孙悟空都实现了这个接口，猪八戒访问高翠兰的时候看不出来这个是孙悟空，所以说孙悟空是高翠兰代理类。

> 3、买火车票不一定在火车站买，也可以去代售点。 

> 4、一张支票或银行存单是账户中资金的代理。支票在市场交易中用来代替现金，并提供对签发人账号上资金的控制。 

> 5、spring aop。

- **优点**：

> 1、职责清晰。 

> 2、高扩展性。 

> 3、智能化。

- **缺点**：
 
> 1、由于在客户端和真实主题之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢。
 
> 2、实现代理模式需要额外的工作，有些代理模式的实现非常复杂。

- **使用场景**：按职责来划分，通常有以下使用场景：

> 1、远程代理。 

> 2、虚拟代理。 

> 3、Copy-on-Write 代理。 

> 4、保护（Protect or Access）代理。 

> 5、Cache代理。 

> 6、防火墙（Firewall）代理。 

> 7、同步化（Synchronization）代理。 

> 8、智能引用（Smart Reference）代理。

- **注意事项**：

> 1、和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口。 

> 2、和装饰器模式的区别：装饰器模式为了增强功能，而代理模式是为了加以控制。

***

## 实现

###### 我们将创建一个 DataBase 接口和实现了 DataBase 接口的实体类。ProxyDataBase 是一个代理类，减少 RealDataBase 对象加载的 IO 通信。

###### Main，我的演示类使用 ProxyDataBase 来获取要加载的 DataBase 对象，看当前是否连的是相同的库，若是相同的库，直接用。

![代理模式的 UML 图](https://github.com/wanwujiedao/pattern/blob/master/img/proxy_pattern_uml_diagram.jpg)


> 步骤 1：创建一个接口。

**DataBase.java**

```markdown
        
    package com.dao.pattern.proxy.interfaces;
    
    /**
     * 数据库
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.proxy.interfaces.DataBase.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-26 19:50:00
     */
    public interface DataBase {
        /**
         * 数据库连接信息
         *
         * @author 阿导
         * @time 2018/3/26
         * @CopyRight 万物皆导
         * @param
         * @return void
         */
        void connect();
    }

```

> 步骤 2：创建实现接口的实体类(包含代理类 ProxyDataBase 和被代理类 RealDataBase)。

**RealDataBase.java**
 
```markdown

   package com.dao.pattern.proxy.impl;
   
   import com.dao.pattern.proxy.interfaces.DataBase;
   
   /**
    * 真正的数据库
    *
    * @author 阿导
    * @version 1.0
    * @fileName com.dao.pattern.proxy.impl.RealDataBase.java
    * @CopyRright (c) 2018-万物皆导
    * @created 2018-03-26 19:51:00
    */
   public class RealDataBase implements DataBase{
   
       /**
        * 数据库名称
        */
       private String name;
   
       /**
        * 初始化数据库
        *
        * @author 阿导
        * @time 2018/3/26
        * @CopyRight 万物皆导
        * @param name
        * @return
        */
       public RealDataBase(String name) {
           this.name = name;
           System.out.println("准备连接数据库："+name);
       }
       /**
        * 数据库连接信息
        *
        * @author 阿导
        * @time 2018/3/26
        * @CopyRight 万物皆导
        * @param
        * @return void
        */
       @Override
       public void connect() {
           System.out.println("已经连接数据库："+name);
       }
   }

```
    
 **ProxyDatabase.java**

```markdown

   package com.dao.pattern.proxy.core;
   
   import com.dao.pattern.proxy.impl.RealDataBase;
   import com.dao.pattern.proxy.interfaces.DataBase;
   
   /**
    * 数据库代理类
    *
    * @author 阿导
    * @version 1.0
    * @fileName com.dao.pattern.proxy.core.ProxyDataBase.java
    * @CopyRright (c) 2018-万物皆导
    * @created 2018-03-26 19:53:00
    */
   public class ProxyDataBase implements DataBase {
   
       /**
        * 数据库名称
        */
       private String name;
   
       /**
        * 声明数据库
        */
       private DataBase dataBase;
   
   
       /**
        * 代理构造方法
        *
        * @author 阿导
        * @time 2018/3/26
        * @CopyRight 万物皆导
        * @param name
        * @return
        */
       public ProxyDataBase(String name) {
           this.name = name;
       }
   
       /**
        * 数据库连接信息
        *
        * @author 阿导
        * @time 2018/3/26
        * @CopyRight 万物皆导
        * @param
        * @return void
        */
       @Override
       public void connect() {
           if(this.dataBase==null){
               this.dataBase=new RealDataBase(name);
           }
           this.dataBase.connect();
       }
   }

```

> 步骤 3：当被请求时，使用 ProxyDataBase 来获取 RealDataBase 类的对象。

**Main.java**

```markdown

   package com.dao.pattern.proxy.main;
   
   import com.dao.pattern.proxy.core.ProxyDataBase;
   import com.dao.pattern.proxy.interfaces.DataBase;
   
   /**
    * 主方法入口
    *
    * @author 阿导
    * @version 1.0
    * @fileName com.dao.pattern.proxy.main.Main.java
    * @CopyRright (c) 2018-万物皆导
    * @created 2018-03-26 19:29:00
    */
   public class Main {
   
       /**
        * 主程序入口
        *
        * @author 阿导
        * @time 2018/3/26
        * @CopyRight 万物皆导
        * @param args
        * @return void
        */
       public static void main(String[] args){
           //数据库
           DataBase dataBase=new ProxyDataBase("用户库");
           //第一次连接用户库
           dataBase.connect();
           System.out.println("============再次使用用户库======");
           //说话
           dataBase.connect();
       }
   }


```

> 步骤 4：验证输出。

```markdown
  
  准备连接数据库：用户库
  已经连接数据库：用户库
  ============再次使用用户库======
  已经连接数据库：用户库
  
```
