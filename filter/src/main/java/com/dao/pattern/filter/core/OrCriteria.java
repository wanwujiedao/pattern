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
