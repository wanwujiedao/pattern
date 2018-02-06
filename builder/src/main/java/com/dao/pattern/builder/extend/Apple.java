package com.dao.pattern.builder.extend;

import com.dao.pattern.builder.impl.QualityGoods;

/**
 * 按质量结算的商品：苹果
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.builder.extend.Apple.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-02-05 17:23:00
 * @modifier 阿导
 */
public class Apple extends QualityGoods{
    /**
     * 返回苹果的内心独白
     *
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @return java.lang.String
     */
    @Override
    public String getName() {
        return "我是按质量结算的商品：苹果【一斤苹果】";
    }

    /**
     * 返回苹果的单价
     *
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @param
     * @return float
     */
    @Override
    public float price() {
        return 5.35F;
    }
}
