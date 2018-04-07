package com.dao.pattern.servicelocator.impl;

import com.dao.pattern.servicelocator.interfaces.Service;

/**
 * 订单服务
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.servicelocator.impl.OrderService.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-07 15:44:00
 */
public class OrderService implements Service {

    /**
     * 获取服务名称
     *
     * @return java.lang.String
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     */
    @Override
    public String getName() {
        return "ORDER_SERVICE";
    }


    /**
     * 处理一些事情
     *
     * @return void
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     */
    @Override
    public void dealSomething() {
        System.out.println("这里是定单服务，正在处理订单相关操作。");
    }
}
