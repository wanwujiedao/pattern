package com.dao.pattern.template.vo;

/**
 * 用户库
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.template.vo.UserDataBase.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-02 20:13:00
 */
public class UserDataBase extends DataBase {

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
        System.out.println("1.获取用户库的数据库链接");
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
        System.out.println("2.执行用户库的 SQL");
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
        System.out.println("3.处理用户库执行后的操作");
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
        System.out.println("4.关闭用户库的数据库链接");
    }
}
