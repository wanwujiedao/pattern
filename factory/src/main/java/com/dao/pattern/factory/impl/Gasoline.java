package com.dao.pattern.factory.impl;

import com.dao.pattern.factory.interfaces.Iliquid;

/**
 * 汽油
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.factory.impl.Gasoline.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-01-30 15:20:00
 *
 */
public class Gasoline implements Iliquid {
    /**
     * 汽油的味道
     *
     * @author 阿导
     * @time 2018/1/30
     * @CopyRight 万物皆导
     * @return void
     */
    @Override
    public void taste() {
        System.out.println("汽油好呛人！！！");
    }
}
