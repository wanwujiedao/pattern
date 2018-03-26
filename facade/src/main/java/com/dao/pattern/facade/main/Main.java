package com.dao.pattern.facade.main;

import com.dao.pattern.facade.core.AnimalsFacade;

/**
 * 主程序入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.facade.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-26 10:51:00
 */
public class Main {

    /**
     * 主程序入口
     *
     * @author 阿导
     * @time 2018/3/26
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        //初始化外观类
        AnimalsFacade animalsFacade=new AnimalsFacade();

        //获取猫狗的名字
        System.out.println("dog:"+animalsFacade.getDogName());
        System.out.println("cat:"+animalsFacade.getCatName());
    }

}
