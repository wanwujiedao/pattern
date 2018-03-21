package com.dao.pattern.adapter.main;

import com.dao.pattern.adapter.core.ContainerImpl;
import com.dao.pattern.adapter.interfaces.Container;

/**
 * 主方法入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.adapter.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-21 15:55:00
 */
public class Main {
    /**
     * 主方法入口
     *
     * @author 阿导
     * @time 2018/3/21
     * @CopyRight 万物皆导
     * @param arg
     * @return void
     */
    public static void main(String[] arg){
        Container container=new ContainerImpl();

        container.assemble("liquid","水");
        container.assemble("solid","石头");
        container.assemble("gas","氧气");
    }

}
