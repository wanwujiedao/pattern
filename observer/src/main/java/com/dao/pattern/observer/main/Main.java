package com.dao.pattern.observer.main;

import com.dao.pattern.observer.core.Bob;
import com.dao.pattern.observer.core.Tom;
import com.dao.pattern.observer.vo.Goods;

import java.util.ArrayList;
import java.util.List;

/**
 * 主程序入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.observer.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-29 21:08:00
 */
public class Main {

    /**
     * 主程序入口
     *
     * @author 阿导
     * @time 2018/3/29
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        //商店初始化商品
        Goods goods=new Goods();
        //鲍勃带50元来买东西
        new Bob(goods);
        //汤姆带100元来买东西
        new Tom(goods);

        System.out.println("-----------听到第一件商品价格【第一件商品，纪念版笔记簿，20元】，两位顾客内心活动-----------\n");
        //第一件商品，纪念版笔记簿，20元
        goods.setGoods("纪念版笔记簿",20);
        System.out.println("\n-----------听到第二件商品价格【第二件商品，真男人 T 恤，70元】，两位顾客内心活动-----------\n");
        //第二件商品，真男人 T 恤，70元
        goods.setGoods("真男人 T 恤",70);
        System.out.println("\n-----------听到第三件商品价格【第三件商品，固态硬盘 256G，400元】，两位顾客内心活动-----------\n");
        //第三件商品，固态硬盘 256G，400元
        goods.setGoods("固态硬盘 256G",400);
        System.out.println("\n-------------------------------------------------");

    }
}

