package com.dao.pattern.transferobject.core;

/**
 * 用户实体
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.transferobject.core.UserVo.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-07 13:50:00
 */
public class UserVo {
    /**
     * 主键 ID
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    public UserVo(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public UserVo(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
