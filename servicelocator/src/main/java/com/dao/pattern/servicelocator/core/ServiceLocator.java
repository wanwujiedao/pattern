package com.dao.pattern.servicelocator.core;

import com.dao.pattern.servicelocator.interfaces.Service;

/**
 * 创建服务定位器
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.servicelocator.core.ServiceLocator.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-07 16:00:00
 */
public class ServiceLocator {
    /**
     * 声明缓存并分配内存空间
     */
    public static Cache cache;
    static {
        cache=new Cache();
    }
    /**
     * 从服务定位器里面获取服务
     *
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     * @param jndiName
     * @return com.dao.pattern.servicelocator.interfaces.Service
     */
    public static Service getService(String jndiName){

        //从缓存获取服务
        Service service = cache.getService(jndiName);
        //未获取到
        if(service==null){
            //通过 JNDI 查询服务
            InitialContext context = new InitialContext();
            service=context.queryService(jndiName);
            //若服务不为空
            if(service!=null) {
                cache.addService(service);
            }
        }
        //返回服务
        return service;

    }
}
