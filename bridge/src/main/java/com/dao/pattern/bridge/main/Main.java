package com.dao.pattern.bridge.main;

import com.dao.pattern.bridge.core.Animals;
import com.dao.pattern.bridge.core.Human;
import com.dao.pattern.bridge.impl.VoiceManImpl;
import com.dao.pattern.bridge.impl.VoiceWomanImpl;

/**
 * 主程序入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.bridge.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-21 17:51:00
 */
public class Main {
    /**
     * 主方法入口
     *
     * @author 阿导
     * @time 2018/3/21
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        //中国男人
        Animals chinaMan=new Human("中国","黄色",new VoiceManImpl());
        //日本女人
        Animals japanWoman=new Human("日本","黄偏白",new VoiceWomanImpl());

        //这两个人都有话说
        chinaMan.voice();
        japanWoman.voice();
    }
}
