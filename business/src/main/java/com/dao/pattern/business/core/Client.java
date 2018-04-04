package com.dao.pattern.business.core;

/**
 * 客户端
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.business.core.Client.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-04 11:59:00
 */
public class Client {
    /**
     * 业务代表
     */
    private BusinessDelegate businessDelegate;

    /**
     * 构造方法
     *
     * @author 阿导
     * @time 2018/4/4
     * @CopyRight 万物皆导
     * @param businessDelegate
     * @return
     */
    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    /**
     * 处理业务
     *
     * @author 阿导
     * @time 2018/4/4
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    public void dealBusiness(){
        this.businessDelegate.dealBusiness();
    }
}
