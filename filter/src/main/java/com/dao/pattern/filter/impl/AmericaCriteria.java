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
