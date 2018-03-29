package com.dao.pattern.chain.main;

import com.dao.pattern.chain.abstracts.AbstractPrice;
import com.dao.pattern.chain.core.ChainMaker;

/**
 * 主程序入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.chain.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-27 09:40:00
 */
public class Main {
    /**
     * 主程序入口
     *
     * @author 阿导
     * @time 2018/3/27
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        //获取购买能力责任链
        AbstractPrice buy = ChainMaker.getAbstractPrice();
        System.out.println("==================三个购买能力都达到的===================");
        buy.buy(1500,"小明带了 1500 元");
        System.out.println("==================未能达到昂贵的购买能力===================");
        buy.buy(800,"小明带了 800 元");
        System.out.println("==================只能达到廉价的购买能力===================");
        buy.buy(90,"小明带了 90 元");
    }
}
