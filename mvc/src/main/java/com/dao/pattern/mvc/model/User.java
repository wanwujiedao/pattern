package com.dao.pattern.mvc.model;

/**
 * 用户模型
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.mvc.model.User.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-03 09:54:00
 */
public class User {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
