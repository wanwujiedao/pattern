package com.dao.pattern.servicelocator.core;

import com.dao.pattern.servicelocator.impl.OrderService;
import com.dao.pattern.servicelocator.impl.UserService;
import com.dao.pattern.servicelocator.interfaces.Service;

/**
 * 为 JNDI 查询服务
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.servicelocator.core.InitialContext.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-07 15:46:00
 */
public class InitialContext {
    /**
     * 用户服务名
     */
    public static final String USER_SERVICE="USER_SERVICE";
    /**
     * 订单服务名
     */
    public static final String ORDER_SERVICE="ORDER_SERVICE";

    /**
     * 根据传入的服务名和存在的服务名进行对比，存在则创建
     *
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     * @param jndiName
     * @return com.dao.pattern.servicelocator.interfaces.Service
     */
    public Service queryService(String jndiName){

        if(USER_SERVICE.equalsIgnoreCase(jndiName)){
            System.out.println("查询到用户服务，并创建用户服务");
            return new UserService();
        }else if (ORDER_SERVICE.equalsIgnoreCase(jndiName)){
            System.out.println("查询到订单服务，并创建订单服务");
            return new OrderService();
        }
        return null;

    }
}
