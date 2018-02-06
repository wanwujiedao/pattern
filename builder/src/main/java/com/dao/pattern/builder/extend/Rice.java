package com.dao.pattern.builder.extend;

import com.dao.pattern.builder.impl.QualityGoods;

/**
 * 按质量结算的商品：大米
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.builder.extend.Rice.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-02-05 17:22:00
 * @modifier 阿导
 */
public class Rice extends QualityGoods {
    /**
     * 返回大米的内心独白
     *
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @return java.lang.String
     */
    @Override
    public String getName() {
        return "我是按质量结算的商品：大米【十斤大米】";
    }
    /**
     * 返回十斤大米价格
     *
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @param
     * @return float
     */
    @Override
    public float price() {
        return 65.88F;
    }
}
