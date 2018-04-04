package com.dao.pattern.business.core;

import com.dao.pattern.business.impl.*;

import com.dao.pattern.business.interfaces.BusinessService;

/**
 * 模拟注册中心，查询服务
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.business.core.BusinessQuery.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-04 10:59:00
 */
public class BusinessQuery {
    /**
     * 注册订单服务
     */
     public static final String ORDER="ORDER";

    /**
     * 注册用户服务
     */
    public static final String USER="USER";

    /**
     * 通过注册中心查询服务
     *
     * @author 阿导
     * @time 2018/4/4
     * @CopyRight 万物皆导
     * @param serverName
     * @return com.dao.pattern.business.interfaces.BusinessService
     */
    public static BusinessService getBusinessService(String serverName){
        if(ORDER.equalsIgnoreCase(serverName)){
            return new OrderService();
        }else if(USER.equalsIgnoreCase(serverName)){
            return new UserService();
        }
        return new NULLService();
    }

}
