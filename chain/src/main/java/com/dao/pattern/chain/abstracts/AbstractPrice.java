package com.dao.pattern.chain.abstracts;

/**
 * 抽象类，价钱
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.chain.abstracts.AbstractPrice.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-27 09:09:00
 */
public abstract class AbstractPrice {
    /**
     * 贵重
     */
    public static final int EXPENSIVE=1000;
    /**
     * 中等
     */
    public static final int SECONDARY=100;
    /**
     * 廉价
     */
    public static final int CHEAP=10;




    /**
     * 所带的钱
     */
    protected int price;

    /**
     * 责任链中的下一个元素
     */
    protected AbstractPrice next;

    /**
     * 设置下一个节点
     *
     * @author 阿导
     * @time 2018/3/27
     * @CopyRight 万物皆导
     * @param next
     * @return void
     */
    public void setNext(AbstractPrice next){
        this.next = next;
    }

    /**
     * 购买能力
     *
     * @author 阿导
     * @time 2018/3/27
     * @CopyRight 万物皆导
     * @param price
     * @param msg
     * @return void
     */
    public void buy(int price,String msg){
        /**
         * 当前性别
         */
        if(this.price<=price){
            buy(msg);
        }
        //看看是否满足
        if(this.next!=null){
            this.next.buy(price, msg);
        }
    }

    /**
     * 某人的购买能力
     *
     * @author 阿导
     * @time 2018/3/27
     * @CopyRight 万物皆导
     * @param msg
     * @return void
     */
    protected abstract void buy(String msg);

}
