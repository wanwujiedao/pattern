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
