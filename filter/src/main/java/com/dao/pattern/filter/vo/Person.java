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
