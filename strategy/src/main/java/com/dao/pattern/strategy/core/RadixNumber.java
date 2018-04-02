package com.dao.pattern.strategy.core;

/**
 * 基数
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.strategy.core.RadixNumber.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-02 18:52:00
 */
public class RadixNumber implements StrategyNumber {

    /**
     * 操作：是否是基数
     *
     * @param num
     * @return void
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     */
    @Override
    public boolean doOperation(int num) {
        return num%2==1;
    }
}
