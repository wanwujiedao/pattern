package com.dao.pattern.composite.main;

import com.alibaba.fastjson.JSON;
import com.dao.pattern.composite.core.Biology;

import java.util.ArrayList;
import java.util.List;

/**
 * 主程序入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.composite.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-24 16:06:00
 */
public class Main {

    /**
     * 主程序入口
     *
     * @author 阿导
     * @time 2018/3/24
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){

        //创建生物圈
        Biology biology=new Biology("生物");

        //生物圈下面的层级
        Biology animal=new Biology("动物");
        biology.addBiology(animal);
        Biology botany=new Biology("植物");
        biology.addBiology(botany);
        Biology microorganism=new Biology("微生物");
        biology.addBiology(microorganism);


        //动物下面的生物
        List<Biology> animals=new ArrayList<>();
        Biology cat=new Biology("猫");
        animal.addBiology(cat);
        Biology dog=new Biology("狗");
        animal.addBiology(dog);

        //输出
        System.out.println(JSON.toJSONString(biology));

    }

}
