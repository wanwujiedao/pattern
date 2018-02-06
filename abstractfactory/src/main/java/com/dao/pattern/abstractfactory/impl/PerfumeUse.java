package com.dao.pattern.abstractfactory.impl;

import com.dao.pattern.abstractfactory.interfaces.IUse;

/**
 * 香水的用处
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.abstractfactory.iml.PerfumeUse.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-01-30 15:50:00
 * @modifier 阿导
 * @updated 2018-01-30 15:50:00
 */
public class PerfumeUse implements IUse{
    /**
     * 香水的用处
     *
     * @author 阿导
     * @time 2018/1/30
     * @CopyRight 万物皆导
     * @return void
     */
    @Override
    public void use() {
        System.out.println("装扮于身更加迷人");
    }
}
