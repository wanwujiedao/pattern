package com.dao.pattern.prototype.main;

import com.dao.pattern.prototype.abstracts.Liquid;
import com.dao.pattern.prototype.core.LiquidCache;

/**
 * 启动类
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.prototype.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-02-06 12:58:00
 * @modifier 阿导
 * @updated 2018-02-06 12:58:00
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
    public static void main(String[] args) {
        //获取液体数据
        LiquidCache.loadCache();

        Liquid gasoline = LiquidCache.getLiquid(1L);
        System.out.println("液体名称 : " + gasoline.getName());
        gasoline.use();
        System.out.println("========================");
        Liquid perfume = LiquidCache.getLiquid(1L);
        System.out.println("液体名称 : " + perfume.getName());
        perfume.use();



    }
}
