package com.dao.pattern.compositeentity.main;

import com.dao.pattern.compositeentity.core.Client;

/**
 * 主程序入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.compositeentity.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-04 13:35:00
 */
public class Main {

    /**
     * 主程序入口
     * @author 阿导
     * @time 2018/4/4
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        //声明客户端
        Client client=new Client();
        //小明养了黑子这条狗
        client.setName("小明","黑子");
        client.printName();
        //刘鑫养了花花这条狗
        client.setName("刘鑫","花花");
        client.printName();
    }
}
