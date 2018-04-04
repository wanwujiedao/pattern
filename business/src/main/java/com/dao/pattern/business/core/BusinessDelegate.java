package com.dao.pattern.business.core;

import com.dao.pattern.business.interfaces.BusinessService;

/**
 * 创建业务代表
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.business.core.BusinessDelegate.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-04 11:28:00
 */
public class BusinessDelegate {

    /**
     * 业务接口
     */
    private BusinessService businessService;
    /**
     * 具体服务名
     */
    private String serverName;


    /**
     * 服务名，标识
     *
     * @author 阿导
     * @time 2018/4/4
     * @CopyRight 万物皆导
     * @param serverName
     * @return
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
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
        this.businessService=BusinessQuery.getBusinessService(this.serverName);
        this.businessService.dosomething();
    }
}
