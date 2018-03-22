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
