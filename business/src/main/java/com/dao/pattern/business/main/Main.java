package com.dao.pattern.business.main;

import com.dao.pattern.business.core.BusinessDelegate;
import com.dao.pattern.business.core.BusinessQuery;
import com.dao.pattern.business.core.Client;

/**
 * 主程序入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.business.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-04 11:57:00
 */
public class Main {


    /**
     * 主程序入口
     *
     * @author 阿导
     * @time 2018/4/4
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        //创建业务代表
        BusinessDelegate businessDelegate=new BusinessDelegate();
        //创建客户端
        Client client=new Client(businessDelegate);

        //注入订单服务名
        businessDelegate.setServerName(BusinessQuery.ORDER);
        client.dealBusiness();
        //注入用户服务名
        businessDelegate.setServerName(BusinessQuery.USER);
        client.dealBusiness();
        //注入其他服务名
        businessDelegate.setServerName("AAA");
        client.dealBusiness();
    }
}
