package com.dao.pattern.adapter.core;

import com.dao.pattern.adapter.interfaces.Container;

import java.util.Arrays;

/**
 * 容器实现
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.adapter.core.ContainerImpl.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-21 15:46:00
 */
public class ContainerImpl implements Container {

    private ContainerAdapter containerAdapter;
    /**
     * 用容器装物体
     *
     * @param type 物体性质
     * @param name 物体名称
     * @return void
     * @author 阿导
     * @time 2018/3/21
     * @CopyRight 万物皆导
     */
    public void assemble(String type, String name) {
        if (Arrays.asList(new String[]{"liquid","solid"}).contains(type)) {
            //调用适配器
            containerAdapter=new ContainerAdapter(type);
            //根据适配调用不同的实现
            containerAdapter.assemble(type,name);
        }else{
            System.out.println("其他状态的物体暂时无处可放！".concat("["+name+"]"));
        }
    }
}
