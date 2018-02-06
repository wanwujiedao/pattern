package com.dao.pattern.builder.interfaces;

/**
 * 商品接口
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.builder.interfaces.IGoods.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-02-05 16:25:00
 * @modifier 阿导
 */
public interface IGoods {
    /**
     * 商品名称
     *
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @return java.lang.String
     */
    String getName();

    /**
     * 结算类型
     *
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @param
     * @return com.dao.pattern.builder.interfaces.ISettlement
     */
    ISettlement settlement();

    /**
     * 商品价格
     *
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @param
     * @return float
     */
    float price();
}
