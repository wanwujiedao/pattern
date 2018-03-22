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
