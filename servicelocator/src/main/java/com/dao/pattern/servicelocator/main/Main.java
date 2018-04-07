package com.dao.pattern.servicelocator.main;

import com.dao.pattern.servicelocator.core.InitialContext;
import com.dao.pattern.servicelocator.core.ServiceLocator;
import com.dao.pattern.servicelocator.interfaces.Service;

/**
 * 主程序入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.servicelocator.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-07 16:05:00
 */
public class Main {

    /**
     * 主程序入口
     *
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){

        //第一次获取订单服务
        Service service= ServiceLocator.getService(InitialContext.ORDER_SERVICE);
        service.dealSomething();
        //第一次获取用户服务
        service=ServiceLocator.getService(InitialContext.USER_SERVICE);
        service.dealSomething();
        //第二次获取用户服务
        service= ServiceLocator.getService(InitialContext.ORDER_SERVICE);
        service.dealSomething();
        //第二次获取订单服务
        service=ServiceLocator.getService(InitialContext.USER_SERVICE);
        service.dealSomething();

    }

}
