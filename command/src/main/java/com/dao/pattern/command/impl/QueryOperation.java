package com.dao.pattern.command.impl;

import com.dao.pattern.command.interfaces.Order;
import com.dao.pattern.command.vo.DataBase;

/**
 * 查询操作
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.command.impl.QueryOperation.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-28 10:54:00
 */
public class QueryOperation implements Order {

    private DataBase dataBase;

    /**
     * 查询构造函数
     *
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     * @param dataBase
     * @return
     */
    public QueryOperation(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    /**
     * 执行查询命令
     *
     * @return void
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     */
    @Override
    public void execute() {
        this.dataBase.query();
    }
}
