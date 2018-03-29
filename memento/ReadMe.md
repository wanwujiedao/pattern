# 备忘录模式

***

###### 备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象。备忘录模式属于行为型模式。

***

## 介绍

- **意图**：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。

- **主要解决**：所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。

- **何时使用**：很多时候我们总是需要记录一个对象的内部状态，这样做的目的就是为了允许用户取消不确定或者错误的操作，能够恢复到他原先的状态，使得他有"后悔药"可吃。

- **如何解决**：通过一个备忘录类专门存储对象状态。

- **关键代码**：客户不与备忘录类耦合，与备忘录管理类耦合。

- **应用实例**： 

> 1、后悔药。 

> 2、打游戏时的存档。 

> 3、Windows 里的 ctri + z。 

> 4、IE 中的后退。 

> 4、数据库的事务管理。

- **优点**： 

> 1、给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态。 

> 2、实现了信息的封装，使得用户不需要关心状态的保存细节。

- **缺点**：消耗资源。如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存。

- **使用场景**： 

> 1、需要保存/恢复数据的相关状态场景。 

> 2、提供一个可回滚的操作。

- **注意事项**： 

> 1、为了符合迪米特原则，还要增加一个管理备忘录的类。 

> 2、为了节约内存，可使用原型模式+备忘录模式。

***

## 实现

###### 备忘录模式使用三个类 Memento、Game 和 MementoMaker。Memento 包含了要被恢复的对象的状态[即游戏的存储时间，其他状态忽略]。Game 创建并在 Memento 对象中存储状态。MementoMaker 对象负责从 Memento 中恢复对象的状态。

###### Main，我的演示类使用 MementoMaker 和 Game 对象来显示对象的状态恢复。

![备忘录模式的 UML 图](https://github.com/wanwujiedao/pattern/blob/master/img/memento_pattern_uml_diagram.jpg)


> 步骤 1：创建 Memento 类。

**Memento.java**

```markdown
    
    package com.dao.pattern.memento.vo;
    
    import java.sql.Timestamp;
    
    /**
     * 备忘存储实体类
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.memento.vo.Memento.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-29 19:05:00
     */
    public class Memento {
    
        /**
         * 玩游戏备忘，存储时间
         */
        private Timestamp time;
    
        /**
         * 构造函数
         *
         * @author 阿导
         * @time 2018/3/29
         * @CopyRight 万物皆导
         * @param time
         * @return
         */
        public Memento(Timestamp time) {
            this.time = time;
        }
    
        /**
         * 获取时间
         *
         * @author 阿导
         * @time 2018/3/29
         * @CopyRight 万物皆导
         * @param
         * @return import java.sql.Timestamp;
         */
        public Timestamp getTime() {
            return time;
        }
    }

```

> 步骤 2：创建 Game 类。

**Game.java**

```markdown

    package com.dao.pattern.memento.core;
    
    import com.dao.pattern.memento.vo.Memento;
    
    import java.sql.Timestamp;
    
    /**
     * 游戏
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.memento.core.Game.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-29 19:09:00
     */
    public class Game {
        /**
         * 游戏存储的时间戳
         */
        private Timestamp time;
    
        /**
         * 获取游戏进行的时间
         * 
         * @author 阿导
         * @time 2018/3/29
         * @CopyRight 杭州微财科技有限公司
         * @param
         * @return java.sql.Timestamp
         */
        public Timestamp getTime() {
            return time;
        }
    
        /**
         * 存储游戏进行的时间
         * @author 阿导
         * @time 2018/3/29
         * @CopyRight 杭州微财科技有限公司
         * @param time
         * @return void
         */
        public void setTime(Timestamp time) {
            this.time = time;
        }
    
        /**
         * 存档
         * @author 阿导
         * @time 2018/3/29
         * @CopyRight 杭州微财科技有限公司
         * @param
         * @return com.dao.pattern.memento.vo.Memento
         */
        
        public Memento saveTimeToMemento(){
            return new Memento(time);
        }
    
        /**
         * 获取存档
         * 
         * @author 阿导
         * @time 2018/3/29
         * @CopyRight 杭州微财科技有限公司
         * @param memento
         * @return void
         */
        public void getTimeFromMemento(Memento memento){
          time=memento.getTime();
        }
    }


```

> 步骤 3：创建 MementoMaker 类。

**MementoMaker.java**

```markdown
    
   package com.dao.pattern.memento.core;
   
   import com.dao.pattern.memento.vo.Memento;
   
   import java.util.ArrayList;
   import java.util.List;
   
   /**
    * 备忘存储
    * @author 阿导
    * @version 1.0
    * @fileName com.dao.pattern.memento.core.MementoMaker.java
    * @CopyRright (c) 2018-万物皆导
    * @created 2018-03-29 19:18:00
    */
   public class MementoMaker {
       /**
        * 备忘 List
        */
       private List<Memento> mementos;
   
       /**
        * 静态块初始化
        */
       
       {
           mementos=new ArrayList<>();
       }
   
       /**
        * 添加备忘录
        *
        * @author 阿导
        * @time 2018/3/29
        * @CopyRight 万物皆导
        * @param memento
        * @return void
        */
       public void add(Memento memento){
           mementos.add(memento);
       }
   
       /**
        * 获取所有备忘录
        *
        * @author 阿导
        * @time 2018/3/29
        * @CopyRight 万物皆导
        * @param
        * @return java.util.List<com.dao.pattern.memento.vo.Memento>
        */
       public List<Memento> getAllMemento(){
           return mementos;
       }
   
   }

```

> 步骤 4：Main 演示类，演示游戏的存档过程

**Main.java**

```markdown

    package com.dao.pattern.memento.main;
    
    import com.dao.pattern.memento.core.Game;
    import com.dao.pattern.memento.core.MementoMaker;
    import com.dao.pattern.memento.vo.Memento;
    
    import java.sql.Timestamp;
    import java.text.SimpleDateFormat;
    import java.util.List;
    
    /**
     * 主程序入口
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.memento.main.Main.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-29 19:26:00
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
        public static void main(String[] args) throws InterruptedException {
    
            //声明备忘录
            MementoMaker mementoMaker=new MementoMaker();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
            //声明玩的游戏
            Game game=new Game();
            int i=0;
            while (++i<10){
                game.setTime(new Timestamp(System.currentTimeMillis()));
                //因为吃饭，游戏保存
                if(i==5) {
                    System.out.println("=========【存储游戏："+sdf.format(game.getTime())+"】===========");
                    mementoMaker.add(game.saveTimeToMemento());
                }
                System.out.println("#########【正在进行游戏："+sdf.format(game.getTime())+"】########");
                //每次循环都睡眠一分钟
                Thread.sleep(1000);
            }
            //睡觉了，再次存档
            game.setTime(new Timestamp(System.currentTimeMillis()));
            System.out.println("=========【存储游戏："+sdf.format(game.getTime())+"】===========");
            mementoMaker.add(game.saveTimeToMemento());
    
            //第二天看看昨天的存档
            List<Memento> mementos=mementoMaker.getAllMemento();
            for(Memento memento:mementos){
                //从游戏读取存档
                game.getTimeFromMemento(memento);
                System.out.println("备忘记录：【"+sdf.format(game.getTime())+"】");
            }
        }
    }


```

> 步骤 5：验证输出。

```markdown
    
    #########【正在进行游戏：2018-03-29 19:45:23】########
    #########【正在进行游戏：2018-03-29 19:45:24】########
    #########【正在进行游戏：2018-03-29 19:45:25】########
    #########【正在进行游戏：2018-03-29 19:45:26】########
    =========【存储游戏：2018-03-29 19:45:27】===========
    #########【正在进行游戏：2018-03-29 19:45:27】########
    #########【正在进行游戏：2018-03-29 19:45:28】########
    #########【正在进行游戏：2018-03-29 19:45:29】########
    #########【正在进行游戏：2018-03-29 19:45:30】########
    #########【正在进行游戏：2018-03-29 19:45:31】########
    =========【存储游戏：2018-03-29 19:45:32】===========
    备忘记录：【2018-03-29 19:45:27】
    备忘记录：【2018-03-29 19:45:32】
    
```
