package com.dao.pattern.proxy.main;

import com.dao.pattern.proxy.core.ProxyDataBase;
import com.dao.pattern.proxy.interfaces.DataBase;

/**
 * 主方法入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.proxy.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-26 19:29:00
 */
public class Main {

    /**
     * 主程序入口
     *
     * @author 阿导
     * @time 2018/3/26
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        //数据库
        DataBase dataBase=new ProxyDataBase("用户库");
        //第一次连接用户库
        dataBase.connect();
        System.out.println("============再次使用用户库======");
        //说话
        dataBase.connect();
    }
}
