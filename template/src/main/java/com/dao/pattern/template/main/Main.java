package com.dao.pattern.template.main;

import com.dao.pattern.template.core.AbstractDabaseSource;
import com.dao.pattern.template.mapper.OrderDao;
import com.dao.pattern.template.mapper.UserDao;

/**
 * 主程序入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.template.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-02 21:45:00
 */
public class Main {

    /**
     * 主程序入口
     *
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        //声明用户库的数据访问层
        AbstractDabaseSource userDao=new UserDao();
        //声明订单库的数据访问层
        AbstractDabaseSource orderDao=new OrderDao();
        //用户库的操作
        System.out.println("============用户库的操作===============");
        userDao.dataBaseOption();
        //订单库的操作
        System.out.println("============订单库的操作===============");
        orderDao.dataBaseOption();
    }
}
