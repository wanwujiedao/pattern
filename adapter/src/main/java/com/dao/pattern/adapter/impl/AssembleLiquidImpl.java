package com.dao.pattern.adapter.impl;

import com.dao.pattern.adapter.interfaces.Assemble;

/**
 * 液体适配
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.adapter.impl.AssembleLiquidImpl.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-21 15:28:00
 */
public class AssembleLiquidImpl implements Assemble{

    /**
     * 装液体
     *
     * @param name
     * @return void
     * @author 阿导
     * @time 2018/3/21
     * @CopyRight 万物皆导
     */
    public void assembleLiquid(String name) {
        System.out.println(name.concat("是液体，请装在玻璃瓶"));
    }

    /**
     * 装固体
     *
     * @param name
     * @return void
     * @author 阿导
     * @time 2018/3/21
     * @CopyRight 万物皆导
     */
    public void assembleSolid(String name) {
        //什么也不做
    }
}
