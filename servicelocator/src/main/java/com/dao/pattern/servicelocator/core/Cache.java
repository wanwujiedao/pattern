package com.dao.pattern.servicelocator.core;

import com.dao.pattern.servicelocator.interfaces.Service;

import java.util.HashMap;

/**
 * 创建缓存，存入服务名
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.servicelocator.core.Cache.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-07 15:53:00
 */
public class Cache {
    /**
     * 缓存集合，存储服务
     */
    private HashMap<String,Service> mapService;
    {
        mapService=new HashMap<>();
    }

    /**
     * 根据服务名进行查询服务
     *
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     * @param serviceName
     * @return com.dao.pattern.servicelocator.interfaces.Service
     */
    public Service getService(String serviceName){
        System.out.println("。。。。。尝试从缓存获取服务。。。。。");
        return mapService.getOrDefault(serviceName,null);
    }
    /**
     * 添加服务
     *
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     * @param newService
     * @return void
     */
    public void addService(Service newService){
        if(!mapService.keySet().contains(newService.getName())) {
            mapService.put(newService.getName(), newService);
        }
    }
}
