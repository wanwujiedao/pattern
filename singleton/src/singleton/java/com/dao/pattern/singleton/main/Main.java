package com.dao.pattern.singleton.main;

import com.dao.pattern.singleton.core.*;

/**
 * 主函数入口（启动类）
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.singleten.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-02-05 09:42:00
 * @modifier 阿导
 * @updated 2018-02-05 09:42:00
 */
public class Main {
    /**
     * 主程序入口
     *
     * @author 阿导
     * @time 2018/1/30
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        one();two();three();four();five();six();
    }
    /**
     * 单例模式-懒汉式，线程不安全
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    private static void one(){
        SingletonOne one=SingletonOne.getInstance();
        one.saySomething("万物皆导。");
    }
    /**
     * 单例模式-懒汉式，线程安全
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    private static void two(){
        SingletonTwo two=SingletonTwo.getInstance();
        two.saySomething("万物皆导。");
    }
    /**
     * 单例模式-饿汉式
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    private static void three(){
        SingletonThree three=SingletonThree.getInstance();
        three.saySomething("万物皆导。");
    }
    /**
     * 单例模式-双检锁/双重校验锁（DCL，即 double-checked locking）
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    private static void four(){
        SingletonFour four=SingletonFour.getInstance();
        four.saySomething("万物皆导。");
    }
    /**
     * 单例模式-登记式/静态内部类
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    private static void five(){
        SingletonFive five= SingletonFive.getInstance();
        five.saySomething("万物皆导。");
    }
    /**
     * 单例模式-枚举
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    private static void six(){
        SingletonSix.INSTANCE.saySomething("万物皆导。");
    }
}
