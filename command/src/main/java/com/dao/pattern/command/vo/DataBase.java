package com.dao.pattern.command.vo;

/**
 * 数据库
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.command.vo.DataBase.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-28 09:43:00
 */
public class DataBase {

    private String name;

    /**
     * 新增操作
     *
     * @param name
     * @return void
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     */
    public void insert(String name) {
        System.out.println("正在执行新增操作...");
        this.name = name;
        System.out.println("新增姓名【" + this.name + "]成功");
    }

    /**
     * 查询操作
     *
     * @param
     * @return void
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     */
    public void query() {
        System.out.println("正在进行查询操作...");
        System.out.println("查询姓名【" + this.name + "]成功");
    }
}
