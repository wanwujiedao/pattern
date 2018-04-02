package com.dao.pattern.strategy.main;

import com.dao.pattern.strategy.core.Context;
import com.dao.pattern.strategy.core.EvenNumber;
import com.dao.pattern.strategy.core.RadixNumber;

import java.math.BigInteger;

/**
 * 主程序入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.strategy.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-02 17:09:00
 */
public class Main {

    /**
     * 主程序入口
     *
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        //基数策略
        Context radixContext = new Context(new RadixNumber());
        //偶数策略
        Context evenContext = new Context(new EvenNumber());

        //3是基数吗？
        System.out.println("3是基数吗？"+radixContext.executeStrategy(3));
        //3是偶数吗？
        System.out.println("3是偶数吗？"+evenContext.executeStrategy(3));
        //4是基数吗？
        System.out.println("4是基数吗？"+radixContext.executeStrategy(4));
        //4是偶数吗？
        System.out.println("4是偶数吗？"+evenContext.executeStrategy(4));

    }
}
