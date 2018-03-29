package com.dao.pattern.mediator.main;

import com.dao.pattern.mediator.core.Administrators;
import com.dao.pattern.mediator.core.Staff;

/**
 * 主程序入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.mediator.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-29 15:17:00
 */
public class Main {

    /**
     * 主程序入口
     *
     * @author 阿导
     * @time 2018/3/29
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        //管理员首先向所有员工发送放假信息
        Administrators.sendMsg("今天上午放假！");
        //管理员向所有员工发送发放工资信息
        Administrators.sendMsg("今天下午三点发放上个月的薪资！");
        //管理员向所有员工发送团建信息
        Administrators.sendMsg("今天今天晚上来阿导大酒店团建！");

        //员工接收信息
        Staff.printMsg();
    }
}
