package com.dao.pattern.dataaccessobject.vo;

/**
 * 用户
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.dataaccessobject.vo.User.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-04 16:23:00
 */
public class User {
    /**
     * 名称
     */
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
