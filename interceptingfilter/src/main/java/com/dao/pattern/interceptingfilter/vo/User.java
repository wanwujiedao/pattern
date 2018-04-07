package com.dao.pattern.interceptingfilter.vo;

/**
 * 用户，作为过滤的实体，也就是处理的对象：target
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.interceptingfilter.vo.User.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-07 14:27:00
 */
public class User {
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String sex;
    /**
     * 年龄
     */
    private Integer age;

    public User(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
