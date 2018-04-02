package com.dao.pattern.strategy.core;

/**
 * 偶数
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.strategy.core.EvenNumber.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-02 18:53:00
 */
public class EvenNumber implements StrategyNumber {

    /**
     * 操作:是否是偶数
     *
     * @param num
     * @return boolean
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     */
    @Override
    public boolean doOperation(int num) {
        return num%2==0;
    }
}
