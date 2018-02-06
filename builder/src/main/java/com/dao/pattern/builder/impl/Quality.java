package com.dao.pattern.builder.impl;

import com.dao.pattern.builder.interfaces.ISettlement;

/**
 * 按质量结算
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.builder.impl.Quality.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-02-05 16:34:00
 * @modifier 阿导
 */
public class Quality implements ISettlement{
    /**
     * 返回质量结算的类型的内心独白
     *
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @return java.lang.String
     */
    @Override
    public String buyWay() {
        return "多少钱？称一称就知道。";
    }
}
