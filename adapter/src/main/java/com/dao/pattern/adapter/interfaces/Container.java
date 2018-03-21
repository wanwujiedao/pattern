package com.dao.pattern.adapter.interfaces;

/**
 * 容器
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.adapter.interfaces.Container.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-21 15:20:00
 */
public interface Container {

    /**
     * 用容器装物体
     *
     * @author 阿导
     * @time 2018/3/21
     * @CopyRight 万物皆导
     * @param type 物体性质
     * @param name 物体名称
     * @return void
     */
    void assemble(String type,String name);

}
