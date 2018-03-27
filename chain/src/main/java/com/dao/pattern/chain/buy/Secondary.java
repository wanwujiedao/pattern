package com.dao.pattern.chain.buy;

import com.dao.pattern.chain.abstracts.AbstractPrice;

/**
 * 中等购买能力
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.chain.buy.Secondary.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-27 09:30:00
 */
public class Secondary extends AbstractPrice {

    /**
     * 构造函数
     *
     * @author 阿导
     * @time 2018/3/27
     * @CopyRight 万物皆导
     * @param price
     * @return
     */
    public Secondary(int price) {
        this.price=price;
    }

    /**
     * 某人的购买能力：中等
     *
     * @param msg
     * @return void
     * @author 阿导
     * @time 2018/3/27
     * @CopyRight 万物皆导
     */
    @Override
    protected void buy(String msg) {
        System.out.println(msg+"，所带的钱购买能力已经达到中等的水准。");
    }
}
