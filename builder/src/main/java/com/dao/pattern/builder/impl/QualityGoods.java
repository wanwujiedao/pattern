package com.dao.pattern.builder.impl;

import com.dao.pattern.builder.interfaces.IGoods;
import com.dao.pattern.builder.interfaces.ISettlement;

/**
 * 按质量卖的商品
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.builder.impl.QualityGoods.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-02-05 17:17:00
 * @modifier 阿导
 */
public abstract class QualityGoods implements IGoods {

    /**
     * 返回质量结算的类型
     *
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @return com.dao.pattern.builder.interfaces.ISettlement
     */
    @Override
    public ISettlement settlement() {
        return new Quality();
    }
}
