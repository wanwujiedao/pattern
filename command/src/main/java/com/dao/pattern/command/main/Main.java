package com.dao.pattern.command.main;

import com.dao.pattern.command.core.Broker;
import com.dao.pattern.command.impl.InsertOperation;
import com.dao.pattern.command.impl.QueryOperation;
import com.dao.pattern.command.vo.DataBase;

/**
 * 主程序入口、
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.command.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-28 11:01:00
 */
public class Main {
    /**
     * 主方法
     *
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        //请求类：数据库
        DataBase dataBase=new DataBase();
        //命令调用类
        Broker broker = new Broker();

        //添加新增和查询命令
        broker.takeOrder(new InsertOperation(dataBase,"小明"));
        broker.takeOrder(new QueryOperation(dataBase));

        //执行所有命令
        broker.placeOrders();

    }

}
