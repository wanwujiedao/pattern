package com.dao.pattern.servicelocator.interfaces;

/**
 * 服务接口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.servicelocator.interfaces.Service.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-07 15:42:00
 */
public interface Service {
    /**
     * 获取服务名称
     *
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     * @param
     * @return java.lang.String
     */
    String getName();
    /**
     * 处理一些事情
     *
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    void dealSomething();
}
