package com.dao.pattern.adapter.core;

import com.dao.pattern.adapter.impl.AssembleLiquidImpl;
import com.dao.pattern.adapter.impl.AssembleSolidImpl;
import com.dao.pattern.adapter.interfaces.Assemble;
import com.dao.pattern.adapter.interfaces.Container;

/**
 * Container 接口的适配器类
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.adapter.core.ContainerAdapter.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-21 15:37:00
 */
public class ContainerAdapter implements Container {

    /**
     * 用什么容器去装物体
     */
    private Assemble assemble;
    /**
     * 构造方法， * @param null
     * @author 阿导
     * @time 2018/3/21
     * @CopyRight 万物皆导
     * @param type
     * @return
     */
    public ContainerAdapter(String type) {
        if("liquid".equalsIgnoreCase(type)){
            //实例化液体适配器
            assemble=new AssembleLiquidImpl();
        }else if("solid".equalsIgnoreCase(type)){
            //实例化固体适配器
            assemble=new AssembleSolidImpl();
        }
    }

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
        if("liquid".equalsIgnoreCase(type)){
            //液体盛放
            assemble.assembleLiquid(name);
        }else if("solid".equalsIgnoreCase(type)){
            //固体盛放
            assemble.assembleSolid(name);
        }
    }
}
