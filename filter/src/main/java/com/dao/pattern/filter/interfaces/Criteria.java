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
