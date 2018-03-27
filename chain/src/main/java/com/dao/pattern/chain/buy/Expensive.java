package com.dao.pattern.chain.buy;

import com.dao.pattern.chain.abstracts.AbstractPrice;

/**
 * 购买能力达到昂贵的水平
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.chain.buy.Expensive.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-27 09:27:00
 */
public class Expensive extends AbstractPrice {

    /**
     * 构造函数
     *
     * @author 阿导
     * @time 2018/3/27
     * @CopyRight 万物皆导
     * @param price
     * @return
     */
    public Expensive(int price) {
        this.price=price;
    }

    /**
     * 某人的购买能力：昂贵
     *
     * @param msg
     * @return void
     * @author 阿导
     * @time 2018/3/27
     * @CopyRight 万物皆导
     */
    @Override
    protected void buy(String msg) {
        System.out.println(msg+"，所带的钱购买能力已经达到昂贵的水准。");
    }
}
