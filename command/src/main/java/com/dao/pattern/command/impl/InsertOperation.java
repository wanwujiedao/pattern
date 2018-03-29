package com.dao.pattern.command.impl;

import com.dao.pattern.command.interfaces.Order;
import com.dao.pattern.command.vo.DataBase;

/**
 * 新增操作
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.command.impl.InsertOperation.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-28 10:54:00
 */
public class InsertOperation implements Order {

    /**
     * 数据库
     */
    private DataBase dataBase;
    /**
     * 姓名
     */
    private String name;

    /**
     * 新增构造函数
     *
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     * @param dataBase
     * @return
     */
    public InsertOperation(DataBase dataBase,String name) {
        this.dataBase = dataBase;
        this.name=name;
    }

    /**
     * 执行新增命令
     *
     * @return void
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     */
    @Override
    public void execute() {
        this.dataBase.insert(this.name);
    }
}
