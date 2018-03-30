package com.dao.pattern.observer.core;

import com.dao.pattern.observer.vo.Goods;

/**
 * 观察者
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.observer.core.Observer.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-30 10:12:00
 */
public abstract class Observer {
    /**
     * 能否购买的商品
     */
    protected Goods goods;

    /**
     * 能否购买的的价钱
     *
     * @author 阿导
     * @time 2018/3/30
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    public abstract void isBuy();
}
