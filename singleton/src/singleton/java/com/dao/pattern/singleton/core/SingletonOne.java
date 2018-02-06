package com.dao.pattern.singleton.core;

/**
 * 单例模式-懒汉式，线程不安全
 * 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.singleten.demo.SingletonOne.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-02-05 09:41:00
 * @modifier 阿导
 * @updated 2018-02-05 09:41:00
 */
public class SingletonOne {

    /**
     * 创建一个 SingletonOne 的对象
     */
    private static SingletonOne instance;

    /**
     * 构造方法私有
     *
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @return
     */
    private SingletonOne (){}

    /**
     * 获取可使用的对象
     *
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @param
     * @return com.dao.pattern.singleton.demo.SingletonOne
     */
    public static SingletonOne getInstance() {
        //判断是否存在
        if (instance == null) {
            instance = new SingletonOne();
        }
        //返回对象
        return instance;
    }
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
        System.out.println("（懒汉式，线程不安全）您好！".concat(name));
    }
} 
