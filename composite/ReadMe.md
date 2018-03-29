# 组合模式

***

###### 组合模式（Composite Pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。

###### 这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。

###### 我们通过下面的实例来演示组合模式的用法。实例演示了一个地球生态圈的层次结构。

***

## 介绍

- **意图**：将对象组合成树形结构以表示"部分-整体"的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。

- **主要解决**：它在我们树型结构的问题中，模糊了简单元素和复杂元素的概念，客户程序可以向处理简单元素一样来处理复杂元素，从而使得客户程序与复杂元素的内部结构解耦。

- **何时使用**：

> 1、您想表示对象的部分-整体层次结构（树形结构）。

> 2、您希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象。

- **如何解决**：树枝和叶子实现统一接口，树枝内部组合该接口。

- **关键代码**：树枝内部组合该接口，并且含有内部属性 List，里面放 Component。

- **应用实例**：

> 1、算术表达式包括操作数、操作符和另一个操作数，其中，另一个操作符也可以是操作树、操作符和另一个操作数。 

> 2、在 JAVA AWT 和 SWING 中，对于 Button 和 Checkbox 是树叶，Container 是树枝。

- **优点**：

> 1、高层模块调用简单。 

> 2、节点自由增加。

- **缺点**：在使用组合模式时，其叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则。

- **使用场景**：部分、整体场景，如树形菜单，文件、文件夹的管理。

- **注意事项**：定义时为具体类。

***

## 实现

###### 我们有一个类 Biology，该类被当作组合模型类。Main，我的演示类使用 Biology 类来添加生物圈层次结构，并打印生物圈信息。
![组合模式的 UML 图](https://github.com/wanwujiedao/pattern/blob/master/img/composite_pattern_uml_diagram.jpg)

> 步骤 1：创建 Biology 类，该类带有 Biology 对象的列表。

**Biology.java**

```markdown
        
   package com.dao.pattern.composite.core;
   
   import java.io.Serializable;
   import java.util.ArrayList;
   import java.util.List;
   
   /**
    * 生物
    *
    * @author 阿导
    * @version 1.0
    * @fileName com.dao.pattern.composite.core.Biology.java
    * @CopyRright (c) 2018-万物皆导
    * @created 2018-03-24 16:03:00
    */
   public class Biology implements Serializable{
   
       private static final long serialVersionUID = 1813417278587323463L;
       /**
        * 名称
        */
       private String name;
       /**
        * 下一层级
        */
       private List<Biology> next;
   
       public Biology(String name) {
           this.name = name;
           next=new ArrayList<Biology>();
       }
   
       public void addBiology(Biology biology){
           this.next.add(biology);
       }
   
       public void removeBiology(Biology biology){
           this.next.remove(biology);
       }
   
       public String getName() {
           return name;
       }
   
       public void setName(String name) {
           this.name = name;
       }
   
       public List<Biology> getNext() {
           return next;
       }
   
       public void setNext(List<Biology> next) {
           this.next = next;
       }
   }


```

> 步骤 2：使用 Biology 类来创建和打印生物圈的层次结构。

**Main.java**

```markdown
    
    package com.dao.pattern.composite.main;
    
    import com.alibaba.fastjson.JSON;
    import com.dao.pattern.composite.core.Biology;
    
    import java.util.ArrayList;
    import java.util.List;
    
    /**
     * 主程序入口
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.composite.main.Main.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-24 16:06:00
     */
    public class Main {
    
        /**
         * 主程序入口
         *
         * @author 阿导
         * @time 2018/3/24
         * @CopyRight 万物皆导
         * @param args
         * @return void
         */
        public static void main(String[] args){
    
            //创建生物圈
            Biology biology=new Biology("生物");
    
            //生物圈下面的层级
            Biology animal=new Biology("动物");
            biology.addBiology(animal);
            Biology botany=new Biology("植物");
            biology.addBiology(botany);
            Biology microorganism=new Biology("微生物");
            biology.addBiology(microorganism);
    
    
            //动物下面的生物
            List<Biology> animals=new ArrayList<>();
            Biology cat=new Biology("猫");
            animal.addBiology(cat);
            Biology dog=new Biology("狗");
            animal.addBiology(dog);
    
            //输出
            System.out.println(JSON.toJSONString(biology));
    
        }
    
    }


```

> 步骤 3：验证输出。

```markdown
    
    {"name":"生物","next":[
        {"name":"动物","next":[
           {"name":"猫","next":[]},
           {"name":"狗","next":[]}
        ]},
        {"name":"植物","next":[]},
        {"name":"微生物","next":[]}
    ]}
    
```
