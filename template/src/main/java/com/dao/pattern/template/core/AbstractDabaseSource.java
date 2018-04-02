package com.dao.pattern.template.core;

import com.dao.pattern.template.vo.DataBase;

/**
 * 数据源
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.template.core.AbstractDabaseSource.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-02 20:08:00
 */
public abstract class AbstractDabaseSource {
    /**
     * 数据源
     */
    protected DataBase dataBase;

    /**
     * 链接到数据库
     *
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     * @return void
     */
    protected  void getConnect(){
        dataBase.getConnect();
    }

    /**
     * 执行 sql
     *
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    protected  void executeSql(){
        dataBase.executeSql();
    }

    /**
     * 处理结果
     *
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    protected  void dealResult(){
        dataBase.dealResult();
    }

    /**
     * 关闭链接
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    protected  void closeConnect(){
        dataBase.closeConnect();
    }

    /**
     * 模板应该用关键字 final 修饰
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    public final void dataBaseOption(){
        //获取链接
        this.getConnect();
        //执行 sql
        this.executeSql();
        //处理结果
        this.dealResult();
        //关闭连接
        this.closeConnect();
    }

    /**
     * 数据源注入
     *
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    protected abstract void setDataBase();

    /**
     * 构造方法动态注入数据源
     *
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     * @return
     */
    public AbstractDabaseSource() {
        this.setDataBase();
    }
}
