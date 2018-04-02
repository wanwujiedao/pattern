package com.dao.pattern.strategy.core;

/**
 * 用于策略制定
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.strategy.core.Context.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-02 18:55:00
 */
public class Context {

    private StrategyNumber strategyNumber;

    /**
     * 构造方法
     *
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     * @param strategyNumber
     * @return
     */
    public Context(StrategyNumber strategyNumber) {
        this.strategyNumber = strategyNumber;
    }


    /**
     * 执行策略
     *
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     * @param num
     * @return void
     */
    public String executeStrategy(int num){
        return strategyNumber.doOperation(num)?"是":"不是";
    }
}
