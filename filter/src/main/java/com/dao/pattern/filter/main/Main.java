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
