package com.dao.pattern.builder.main;

import com.dao.pattern.builder.core.Buy;
import com.dao.pattern.builder.core.BuyBuilder;

/**
 * 启动类
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.builder.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-02-05 18:04:00
 * @modifier 阿导
 * @updated 2018-02-05 18:04:00
 */
public class Main {
    /**
     * 主方法入口
     *
     * @author 阿导
     * @time 2018/3/21
     * @CopyRight 万物皆导
     * @param arg
     * @return void
     */
    public static void main(String[] arg){
        BuyBuilder buyBuilder = new BuyBuilder();

        Buy numberBuy = buyBuilder.prepareNumberGoods();
        System.out.println("===========================按数量结算的商品开始=============================");
        System.out.println("");
        numberBuy.showGoods();
        System.out.println("按数量结算的商品总价为: " +numberBuy.getCost());
        System.out.println("===========================按数量结算的商品结束=============================");

        Buy qualityBuy = buyBuilder.prepareQualityGoods();
        System.out.println("\n\n\n===========================按质量结算的商品开始=============================");
        System.out.println("");
        qualityBuy.showGoods();
        System.out.println("按质量结算的商品总价为: " +qualityBuy.getCost());
        System.out.println("===========================按质量结算的商品结束=============================");

    }
}
