package com.dao.pattern.builder.impl;

import com.dao.pattern.builder.interfaces.ISettlement;

/**
 * 按数量结算
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.builder.impl.Number.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-02-05 16:34:00
 * @modifier 阿导
 */
public class Number implements ISettlement {
    /**
     * 返回数量结算的类型的内心独白
     *
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @return java.lang.String
     */
    @Override
    public String buyWay() {
        return "多少钱？数一数就知道";
    }
}
