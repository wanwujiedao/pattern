package com.dao.pattern.nullobject.main;

import com.dao.pattern.nullobject.core.AbstractHuman;
import com.dao.pattern.nullobject.core.HumanFactory;

/**
 * 主程序入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.nullobject.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-02 15:55:00
 */
public class Main {
    /**
     * 主方法
     *
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        //汤姆来上网
        AbstractHuman Tom= HumanFactory.getHuman("汤姆",20);

        //缇娜来上网
        AbstractHuman Tina= HumanFactory.getHuman("缇娜",16);
        //网管对汤姆说
        System.out.print("网管对汤姆说：");
        Tom.say();
        //网管对缇娜说
        System.out.print("网管对缇娜说：");
        Tina.say();
    }
}
