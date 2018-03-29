package com.dao.pattern.proxy.core;

import com.dao.pattern.proxy.impl.RealDataBase;
import com.dao.pattern.proxy.interfaces.DataBase;

/**
 * 数据库代理类
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.proxy.core.ProxyDataBase.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-26 19:53:00
 */
public class ProxyDataBase implements DataBase {

    /**
     * 数据库名称
     */
    private String name;

    /**
     * 声明数据库
     */
    private DataBase dataBase;


    /**
     * 代理构造方法
     *
     * @author 阿导
     * @time 2018/3/26
     * @CopyRight 万物皆导
     * @param name
     * @return
     */
    public ProxyDataBase(String name) {
        this.name = name;
    }

    /**
     * 数据库连接信息
     *
     * @author 阿导
     * @time 2018/3/26
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    @Override
    public void connect() {
        if(this.dataBase==null){
            this.dataBase=new RealDataBase(name);
        }
        this.dataBase.connect();
    }
}
