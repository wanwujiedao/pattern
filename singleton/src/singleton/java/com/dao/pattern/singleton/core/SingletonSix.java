package com.dao.pattern.singleton.core;
/**
 * 单例模式-枚举
 * 这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.singleten.demo.SingletonTwo.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-02-05 09:41:00
 * @modifier 阿导
 * @updated 2018-02-05 09:41:00
 */
public enum SingletonSix {
    INSTANCE;  

    /**
     * 让这个对象说些什么
     *
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @param name
     * @return void
     */
    public void saySomething(String name){
        System.out.println("（枚举）您好！".concat(name));
    }
} 
