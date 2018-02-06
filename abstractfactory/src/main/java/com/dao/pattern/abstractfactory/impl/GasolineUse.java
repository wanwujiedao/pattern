package com.dao.pattern.abstractfactory.impl;

import com.dao.pattern.abstractfactory.interfaces.IUse;

/**
 * 汽油的用处
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.abstractfactory.iml.GasolineUse.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-01-30 15:48:00
 * @modifier 阿导
 * @updated 2018-01-30 15:48:00
 */
public class GasolineUse implements IUse {
    /**
     * 汽油的使用
     *
     * @author 阿导
     * @time 2018/1/30
     * @CopyRight 万物皆导
     * @return void
     */
    @Override
    public void use() {
        System.out.println("汽油可以做燃料额！");
    }
}
