package com.dao.pattern.template.vo;

/**
 * 订单库
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.template.vo.OrderDataBase.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-02 20:14:00
 */
public class OrderDataBase extends DataBase {


    /**
     * 链接到数据库
     *
     * @return void
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     */
    @Override
    public void getConnect() {
        System.out.println("1.获取订单库的数据库链接");
    }

    /**
     * 执行 sql
     *
     * @return void
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     */
    @Override
    public void executeSql() {
        System.out.println("2.执行订单库的 SQL");
    }

    /**
     * 处理结果
     *
     * @return void
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     */
    @Override
    public void dealResult() {
        System.out.println("3.处理订单库执行后的操作");
    }

    /**
     * 关闭链接
     *
     * @return void
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     */
    @Override
    public void closeConnect() {
        System.out.println("4.关闭订单库的数据库链接");
    }
}
