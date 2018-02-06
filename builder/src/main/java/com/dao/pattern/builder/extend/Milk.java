package com.dao.pattern.builder.extend;

import com.dao.pattern.builder.impl.NumberGoods;

/**
 * 按数量结算的商品：牛奶
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.builder.extend.Milk.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-02-05 17:21:00
 * @modifier 阿导
 */
public class Milk extends NumberGoods {
    /**
     * 返回牛奶的内心独白
     *
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @return java.lang.String
     */
    @Override
    public String getName() {
        return "我是按数量结算的商品：牛奶【一瓶牛奶】";
    }
    /**
     * 返回牛奶的单价
     *
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @param
     * @return float
     */
    @Override
    public float price() {
        return 5.80F;
    }
}
