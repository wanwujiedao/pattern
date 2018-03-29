# 过滤器模式

***

###### 过滤器模式（Filter Pattern）或标准模式（Criteria Pattern）是一种设计模式，这种模式允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准。

***

## 实现

###### 我们将创建一个 Person 对象、Criteria 接口和实现了该接口的实体类，来过滤 Person 对象的列表。Main，我的演示类使用 Criteria 对象，基于各种标准和它们的结合来过滤 Person 对象的列表。

![过滤器模式的 UML 图](https://github.com/wanwujiedao/pattern/blob/master/img/filter_pattern_uml_diagram.jpg)

> 步骤 1：创建一个类，在该类上应用标准。

**Person.java**
   
```markdown
    
    package com.dao.pattern.filter.vo;
    
    import java.io.Serializable;
    
    /**
     * 人，用于制作标准
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.filter.vo.Person.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-22 09:39:00
     */
    public class Person implements Serializable{
    
    
        private static final long serialVersionUID = 7131437071202512187L;
        /**
         * 姓名
         */
        private String name;
    
        /**
         * 国家
         */
        private String country;
    
        /**
         * 肤色
         */
        private String skin;
    
    
        public Person(String name, String country, String skin) {
            this.name = name;
            this.country = country;
            this.skin = skin;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public String getCountry() {
            return country;
        }
    
        public void setCountry(String country) {
            this.country = country;
        }
    
        public String getSkin() {
            return skin;
        }
    
        public void setSkin(String skin) {
            this.skin = skin;
        }
    }

```

> 步骤 2：为标准（Criteria）创建一个接口。

**Criteria.java**

```markdown
        
    package com.dao.pattern.filter.interfaces;
    
    import com.dao.pattern.filter.vo.Person;
    
    import java.util.List;
    
    /**
     * 条件接口
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.filter.interfaces.Criteria.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-22 09:39:00
     */
    public interface Criteria {
    
       /**
        * 条件处理
        *
        * @author 阿导
        * @time 2018/3/22
        * @CopyRight 万物皆导
        * @param persons
        * @return java.util.List<com.dao.pattern.filter.vo.Person>
        */
       List<Person> meetCriteria(List<Person> persons);
    }


```

> 步骤 3：创建实现了 Criteria 接口的实体类。

**ChinaCriteria.java**

```markdown
    
    package com.dao.pattern.filter.impl;
    
    import com.dao.pattern.filter.interfaces.Criteria;
    import com.dao.pattern.filter.vo.Person;
    
    import java.util.ArrayList;
    import java.util.List;
    
    /**
     * 中国人
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.filter.impl.ChinaCriteria.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-22 10:17:00
     */
    public class ChinaCriteria implements Criteria {
    
        /**
         * 条件处理（中国人）
         *
         * @param persons
         * @return java.util.List<com.dao.pattern.filter.vo.Person>
         * @author 阿导
         * @time 2018/3/22
         * @CopyRight 万物皆导
         */
        @Override
        public List<Person> meetCriteria(List<Person> persons) {
            //声明结果集
            List<Person> personList=new ArrayList<Person>();
            //判断集合不为空
            if(!persons.isEmpty()){
                //遍历，过滤
                persons.stream().filter(person->"中国".equalsIgnoreCase(person.getCountry())).forEach(person->personList.add(person));
            }
    
            return personList;
        }
    }

```
    
**AmericaCriteria.java**

```markdown

    package com.dao.pattern.filter.impl;
    
    import com.dao.pattern.filter.interfaces.Criteria;
    import com.dao.pattern.filter.vo.Person;
    
    import java.util.ArrayList;
    import java.util.List;
    
    /**
     * 美国人
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.filter.impl.AmericaCriteria.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-22 10:22:00
     */
    public class AmericaCriteria implements Criteria {
    
        /**
         * 条件处理(美国人)
         *
         * @param persons
         * @return java.util.List<com.dao.pattern.filter.vo.Person>
         * @author 阿导
         * @time 2018/3/22
         * @CopyRight 万物皆导
         */
        @Override
        public List<Person> meetCriteria(List<Person> persons) {
            //声明结果集
            List<Person> personList=new ArrayList<Person>();
            //判断集合不为空
            if(!persons.isEmpty()){
                //遍历，过滤
                persons.stream().filter(person->"美国".equalsIgnoreCase(person.getCountry())).forEach(person->personList.add(person));
            }
    
            return personList;
        }
    }

```

**YellowCriteria.java**

```markdown

    package com.dao.pattern.filter.impl;
    
    import com.dao.pattern.filter.interfaces.Criteria;
    import com.dao.pattern.filter.vo.Person;
    
    import java.util.ArrayList;
    import java.util.List;
    
    /**
     * 黄种人
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.filter.impl.YellowCriteria.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-22 10:31:00
     */
    public class YellowCriteria implements Criteria {
    
        /**
         * 条件处理(黄种人)
         *
         * @param persons
         * @return java.util.List<com.dao.pattern.filter.vo.Person>
         * @author 阿导
         * @time 2018/3/22
         * @CopyRight 万物皆导
         */
        @Override
        public List<Person> meetCriteria(List<Person> persons) {
            //声明结果集
            List<Person> personList=new ArrayList<Person>();
            //判断集合不为空
            if(!persons.isEmpty()){
                //遍历，过滤
                persons.stream().filter(person->"黄色".equalsIgnoreCase(person.getSkin())).forEach(person->personList.add(person));
            }
    
            return personList;
        }
    }

```
   
**WhiteCriteria.java**

```markdown

    package com.dao.pattern.filter.impl;
    
    import com.dao.pattern.filter.interfaces.Criteria;
    import com.dao.pattern.filter.vo.Person;
    
    import java.util.ArrayList;
    import java.util.List;
    
    /**
     * 白种人
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.filter.impl.WhiteCriteria.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-22 10:32:00
     */
    public class WhiteCriteria implements Criteria {
    
        /**
         * 条件处理（白种人）
         *
         * @param persons
         * @return java.util.List<com.dao.pattern.filter.vo.Person>
         * @author 阿导
         * @time 2018/3/22
         * @CopyRight 万物皆导
         */
        @Override
        public List<Person> meetCriteria(List<Person> persons) {
            //声明结果集
            List<Person> personList=new ArrayList<Person>();
            //判断集合不为空
            if(!persons.isEmpty()){
                //遍历，过滤
                persons.stream().filter(person->"白色".equalsIgnoreCase(person.getSkin())).forEach(person->personList.add(person));
            }
    
            return personList;
        }
    }

```

> 步骤 4：配合一些逻辑运算实现 Criteria 接口的实体类。

**AndCriteria.java**
  
```markdown
    
  
    
    package com.dao.pattern.filter.core;
    
    import com.dao.pattern.filter.interfaces.Criteria;
    import com.dao.pattern.filter.vo.Person;
    
    import java.util.ArrayList;
    import java.util.HashSet;
    import java.util.List;
    import java.util.Set;
    
    /**
     * 且关系
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.filter.core.AndCriateria.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-22 10:35:00
     */
    public class AndCriteria implements Criteria{
    
        /**
         * 第一个条件
         */
        private Criteria criteria;
    
        /**
         * 第二个条件
         */
        private Criteria otherCriteria;
    
        /**
         * 构造方法
         *
         * @author 阿导
         * @time 2018/3/22
         * @CopyRight 万物皆导
         * @param criteria
         * @param otherCriteria
         * @return
         */
        public AndCriteria(Criteria criteria, Criteria otherCriteria) {
            this.criteria = criteria;
            this.otherCriteria = otherCriteria;
        }
    
        /**
         * 条件处理（并且关系）
         *
         * @param persons
         * @return java.util.List<com.dao.pattern.filter.vo.Person>
         * @author 阿导
         * @time 2018/3/22
         * @CopyRight 万物皆导
         */
        @Override
        public List<Person> meetCriteria(List<Person> persons) {
            //声明结果集
            List<Person> list=new ArrayList<Person>();
            //获取两个条件的结果
            List<Person> personFirst = criteria.meetCriteria(persons);
            List<Person> personSecond = otherCriteria.meetCriteria(persons);
    
            //若未空，交集肯定是空
            if(personFirst.isEmpty()){
                return new ArrayList<>();
            }
            //遍历取交集
            personFirst.stream().filter(person ->personSecond.contains(person)).forEach(person ->list.add(person));
            //返回结果
            return list;
        }
    }
    
```
    
**OrCriteria.java**

```markdown    

    package com.dao.pattern.filter.core;
    
    import com.dao.pattern.filter.interfaces.Criteria;
    import com.dao.pattern.filter.vo.Person;
    
    import java.util.ArrayList;
    import java.util.HashSet;
    import java.util.List;
    import java.util.Set;
    
    /**
     * 或关系
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.filter.core.OrCriteria.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-22 10:34:00
     */
    public class OrCriteria implements Criteria {
        /**
         * 第一个条件
         */
        private Criteria criteria;
    
        /**
         * 第二个条件
         */
        private Criteria otherCriteria;
    
        /**
         * 构造方法
         *
         * @author 阿导
         * @time 2018/3/22
         * @CopyRight 万物皆导
         * @param criteria
         * @param otherCriteria
         * @return
         */
        public OrCriteria(Criteria criteria, Criteria otherCriteria) {
            this.criteria = criteria;
            this.otherCriteria = otherCriteria;
        }
    
        /**
         * 条件处理(或者关系)
         *
         * @param persons
         * @return java.util.List<com.dao.pattern.filter.vo.Person>
         * @author 阿导
         * @time 2018/3/22
         * @CopyRight 万物皆导
         */
        @Override
        public List<Person> meetCriteria(List<Person> persons) {
            //获取第一个条件结果【另一边已经做了空处理】
            Set<Person> personSet =new HashSet<>(criteria.meetCriteria(persons));
            //添加第二个集合【已做空处理】
            personSet.addAll(otherCriteria.meetCriteria(persons));
    
            return new ArrayList<Person>(personSet.isEmpty()?new ArrayList<Person>():personSet);
        }
    }

```

**ContraryCriteria.java**

```markdown
    
    package com.dao.pattern.filter.core;
    
    import com.dao.pattern.filter.interfaces.Criteria;
    import com.dao.pattern.filter.vo.Person;
    
    import java.util.ArrayList;
    import java.util.List;
    
    /**
     * 相反的
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.filter.core.ContraryCriteria.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-22 12:49:00
     */
    public class ContraryCriteria implements Criteria {
    
        /**
         * 条件
         */
        private Criteria criteria;
    
    
        /**
         * 构造方法
         *
         * @author 阿导
         * @time 2018/3/22
         * @CopyRight 万物皆导
         * @param criteria
         * @return
         */
        public ContraryCriteria(Criteria criteria) {
            this.criteria = criteria;
        }
    
        /**
         * 条件处理（非关系）
         *
         * @param persons
         * @return java.util.List<com.dao.pattern.filter.vo.Person>
         * @author 阿导
         * @time 2018/3/22
         * @CopyRight 万物皆导
         */
        @Override
        public List<Person> meetCriteria(List<Person> persons) {
            //复制一份
            List<Person> list=new ArrayList<>(persons);
            //取结果
            List<Person> personList = criteria.meetCriteria(persons);
            //取非情况
            list.removeAll(personList);
            //返回结果
            return list;
        }
    }


```
> 步骤 5：使用不同的标准（Criteria）和它们的结合来过滤 Person 对象的列表。

**Main.java**

```markdown
    
    package com.dao.pattern.filter.main;
    
    import com.alibaba.fastjson.JSON;
    import com.dao.pattern.filter.core.AndCriteria;
    import com.dao.pattern.filter.core.ContraryCriteria;
    import com.dao.pattern.filter.core.OrCriteria;
    import com.dao.pattern.filter.impl.AmericaCriteria;
    import com.dao.pattern.filter.impl.ChinaCriteria;
    import com.dao.pattern.filter.impl.WhiteCriteria;
    import com.dao.pattern.filter.impl.YellowCriteria;
    import com.dao.pattern.filter.vo.Person;
    
    import java.util.ArrayList;
    import java.util.List;
    
    /**
     * 抓方法入口
     *
     * @author 阿导
     * @version 1.0
     * @fileName com.dao.pattern.filter.main.Main.java
     * @CopyRright (c) 2018-万物皆导
     * @created 2018-03-22 15:22:00
     */
    public class Main {
        /**
         * 主方法入口
         *
         * @author 阿导
         * @time 2018/3/22
         * @CopyRight 万物皆导
         * @param args
         * @return void
         */
        public static void main(String[] args){
            //声明一下
            List<Person> persons=new ArrayList<Person>();
            //添加一些人物信息
            persons.add(new Person("孙中山","中国","黄色"));
            persons.add(new Person("张柏芝","中国","白色"));
            persons.add(new Person("比尔盖茨","美国","白色"));
            persons.add(new Person("奥巴马","美国","黑色"));
            persons.add(new Person("神秘人","美国","黄色"));
    
            //美国人
            List<Person> personAmerica = new AmericaCriteria().meetCriteria(persons);
            System.out.println("美国人："+ JSON.toJSONString(personAmerica));
            //中国人
            List<Person> personChina = new ChinaCriteria().meetCriteria(persons);
            System.out.println("黄种人："+ JSON.toJSONString(personChina));
    
            //黄种人
            List<Person> personYellow = new YellowCriteria().meetCriteria(persons);
            System.out.println("黄种人："+ JSON.toJSONString(personYellow));
    
            //白种人
            List<Person> personWhite = new WhiteCriteria().meetCriteria(persons);
            System.out.println("白种人："+ JSON.toJSONString(personWhite));
    
            //~黄种人
            List<Person> personContraryYellow = new ContraryCriteria(new YellowCriteria()).meetCriteria(persons);
            System.out.println("非黄种人："+ JSON.toJSONString(personContraryYellow));
    
            //白种人&美国人
            List<Person> personWhiteAndAmerica = new AndCriteria(new WhiteCriteria(), new AmericaCriteria()).meetCriteria(persons);
            System.out.println("白种人并且美国人："+ JSON.toJSONString(personWhiteAndAmerica));
    
            //白种人||美国人
            List<Person> personWhiteOrAmerica = new OrCriteria(new WhiteCriteria(), new AmericaCriteria()).meetCriteria(persons);
            System.out.println("白种人或者美国人："+ JSON.toJSONString(personWhiteOrAmerica));
    
        }
    
    }

```

> 步骤 6：验证输出。

```markdown

    美国人：[{"country":"美国","name":"比尔盖茨","skin":"白色"},{"country":"美国","name":"奥巴马","skin":"黑色"},{"country":"美国","name":"神秘人","skin":"黄色"}]
    黄种人：[{"country":"中国","name":"孙中山","skin":"黄色"},{"country":"中国","name":"张柏芝","skin":"白色"}]
    黄种人：[{"country":"中国","name":"孙中山","skin":"黄色"},{"country":"美国","name":"神秘人","skin":"黄色"}]
    白种人：[{"country":"中国","name":"张柏芝","skin":"白色"},{"country":"美国","name":"比尔盖茨","skin":"白色"}]
    非黄种人：[{"country":"中国","name":"张柏芝","skin":"白色"},{"country":"美国","name":"比尔盖茨","skin":"白色"},{"country":"美国","name":"奥巴马","skin":"黑色"}]
    白种人并且美国人：[{"country":"美国","name":"比尔盖茨","skin":"白色"}]
    白种人或者美国人：[{"country":"美国","name":"比尔盖茨","skin":"白色"},{"country":"中国","name":"张柏芝","skin":"白色"},{"country":"美国","name":"奥巴马","skin":"黑色"},{"country":"美国","name":"神秘人","skin":"黄色"}]

```
