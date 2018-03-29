# 迭代器模式

***

###### 迭代器模式（Iterator Pattern）是 Java 和 .Net 编程环境中非常常用的设计模式。这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。

###### 迭代器模式属于行为型模式。

***

### 介绍

- **意图**：提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。

- **主要解决**：不同的方式来遍历整个整合对象。

- **何时使用**：遍历一个聚合对象。

- **如何解决**：把在元素之间游走的责任交给迭代器，而不是聚合对象。

- **关键代码**：定义接口：hasNext, next。

- **应用实例**：JAVA 中的 iterator。

- **优点**：

> 1、它支持以不同的方式遍历一个聚合对象。 

> 2、迭代器简化了聚合类。 

> 3、在同一个聚合上可以有多个遍历。 

> 4、在迭代器模式中，增加新的聚合类和迭代器类都很方便，无须修改原有代码。

- **缺点**：由于迭代器模式将存储数据和遍历数据的职责分离，增加新的聚合类需要对应增加新的迭代器类，类的个数成对增加，这在一定程度上增加了系统的复杂性。

- **使用场景**：
 
> 1、访问一个聚合对象的内容而无须暴露它的内部表示。 

> 2、需要为聚合对象提供多种遍历方式。 

> 3、为遍历不同的聚合结构提供一个统一的接口。

- **注意事项**：迭代器模式就是分离了集合对象的遍历行为，抽象出一个迭代器类来负责，这样既可以做到不暴露集合的内部结构，又可让外部代码透明地访问集合内部的数据。

***

## 实现

###### 我们将创建一个叙述导航方法的 Iterator 接口和一个返回迭代器的 Container 接口。实现了 Container 接口的实体类将负责实现 Iterator 接口。

###### Main，我们的演示类使用实体类 Repository 来存储想要的数据，其中数据使用的是泛型，内部是通过数组动态扩容存储信息的。

![迭代器模式的 UML 图](https://github.com/wanwujiedao/pattern/blob/master/img/iterator_pattern_uml_diagram.jpg)

> 步骤 1：创建接口。

**Iterator.java**

```markdown
    package com.dao.pattern.iterator.interfaces;
    
    /**
     * 迭代器接口
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.iterator.interfaces.Iterator.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-28 18:43:00
     */
    public interface Iterator<E> {
    
        /**
         * 是否有下一个节点
         *
         * @author 阿导
         * @time 2018/3/28
         * @CopyRight 万物皆导
         * @param
         * @return boolean
         */
        boolean hasNext();
    
        /**
         * 获取下一个节点
         *
         * @author 阿导
         * @time 2018/3/28
         * @CopyRight 万物皆导
         * @param
         * @return E
         */
        E next();
    }

```

**Container.java**

```markdown
    
    package com.dao.pattern.iterator.interfaces;
    
    /**
     * 容器
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.iterator.interfaces.Container.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-28 18:47:00
     */
    public interface Container<E> {
    
        /**
         * 获取迭代器
         *
         * @author 阿导
         * @time 2018/3/28
         * @CopyRight 万物皆导
         * @param
         * @return com.dao.pattern.iterator.interfaces.Iterator<E>
         */
        Iterator<E> getIterator();
    }

```

> 步骤 2：创建实现了 Container 接口的实体类。该类有实现了 Iterator 接口的内部类 RepositoryIterator。

**Repository.java**

```markdown

    package com.dao.pattern.iterator.core;
    
    import com.dao.pattern.iterator.interfaces.Container;
    import com.dao.pattern.iterator.interfaces.Iterator;
    
    /**
     * 实现容器的接口
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.iterator.core.Repository.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-28 18:50:00
     */
    public class Repository<E> implements Container<E> {
    
        public static final int INIT=0;
    
        /**
         * 当前下标
         */
        private int index;
    
        /**
         * 长度
         */
        private int length;
        /**
         * 元素
         */
        private Object[] es;
    
        /**
         * 构造方法
         *
         * @author 阿导
         * @time 2018/3/29
         * @Co2018/3/29州微财科技有限公司
         * @param
         */
        public Repository() {
            this.index=INIT;
            this.length=INIT;
            this.es=new Object[INIT];
        }
    
        public void add(E e){
            //数组动态扩容
            Object[] esTemp=new Object[++this.length];
            //数组复制
            System.arraycopy(es, 0, esTemp, 0, es.length);
            //赋值
            esTemp[es.length]=e;
            //改变引用
            this.es=esTemp;
        }
        /**
         * 获取迭代器
         *
         * @return com.dao.pattern.iterator.interfaces.Iterator<E>
         * @author 阿导
         * @time 2018/3/28
         * @CopyRight 万物皆导
         */
        @Override
        public Iterator<E> getIterator() {
            return new RepositoryIterator<E>();
        }
    
    
        class RepositoryIterator<E> implements Iterator<E> {
    
            /**
             * 是否有下一个节点
             *
             * @return boolean
             * @author 阿导
             * @time 2018/3/28
             * @CopyRight 万物皆导
             */
            @Override
            public boolean hasNext() {
                if(index<length){
                    return true;
                }
                return false;
            }
    
            /**
             * 获取下一个节点
             *
             * @return E
             * @author 阿导
             * @time 2018/3/28
             * @CopyRight 万物皆导
             */
            @Override
            public E next() {
                if(hasNext()){
                    return (E) es[index++];
                }
                return null;
            }
        }
    
    
    }

```

> 步骤 3：使用 Repository 存储数据并且获取迭代器，并打印数据。

**Main.java**

```markdown

    package com.dao.pattern.iterator.main;    
    
    import com.dao.pattern.iterator.core.Repository;
    import com.dao.pattern.iterator.interfaces.Iterator;
    
    /**
     * 主方法入口
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.iterator.main.Main.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-29 09:30:00
     */
    public class Main {
    
        /**
         * 主方法入口
         *
         * @author 阿导
         * @time 2018/3/29
         * @CopyRight 万物皆导
         * @param args
         * @return void
         */
        public static void main(String[] args){
            Repository<String> repository=new Repository<>();
            repository.add("A");
            repository.add("B");
            repository.add("C");
            repository.add("D");
    
            Iterator<String> iterator = repository.getIterator();
    
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }

```

> 步骤 4：验证输出。

```markdown

    A
    B
    C
    D
    
```
