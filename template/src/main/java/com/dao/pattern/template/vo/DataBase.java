package com.dao.pattern.template.vo;

/**
 * 模拟数据库
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.template.vo.DataBase.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-02 20:12:00
 */
public abstract class DataBase {

    /**
     * 链接到数据库
     *
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     * @return void
     */
    public abstract void getConnect();

    /**
     * 执行 sql
     *
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    public abstract void executeSql();

    /**
     * 处理结果
     *
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    public abstract void dealResult();

    /**
     * 关闭链接
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    public abstract void closeConnect();
}
