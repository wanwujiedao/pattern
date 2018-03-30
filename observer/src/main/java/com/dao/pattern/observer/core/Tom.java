package com.dao.pattern.observer.core;

import com.dao.pattern.observer.vo.Goods;

/**
 * 汤姆来买东西
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.observer.core.Tom.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-30 14:47:00
 */
public class Tom extends Observer {
    /**
     * 汤姆有多少钱
     */
    private int money;
    //初始化汤姆拥有的钱
    {
        money=100;
    }

    /**
     * 初始化观察者汤姆，让其关注商品
     *
     * @author 阿导
     * @time 2018/3/30
     * @CopyRight 万物皆导
     * @param goods
     * @return
     */
    public Tom(Goods goods) {
        this.goods=goods;
        this.goods.addObserver(this);
    }

    /**
     * 能否购买的的价钱
     *
     * @return void
     * @author 阿导
     * @time 2018/3/30
     * @CopyRight 万物皆导
     */
    @Override
    public void isBuy() {
       goods.msg(money,"汤姆");
    }
}
