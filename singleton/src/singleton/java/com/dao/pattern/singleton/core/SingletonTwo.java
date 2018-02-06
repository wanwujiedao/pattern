package com.dao.pattern.singleton.core;
/**
 * 单例模式-懒汉式，线程安全
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
public class SingletonTwo {
    /**
     * 创建一个 SingletonTwo 的对象
     */
    private static SingletonTwo instance;

    /**
     * 构造方法私有
     *
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @return
     */
    private SingletonTwo (){}

    /**
     * 通过同步关键字-synchronized 获取可使用的对象
     *
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @param
     * @return com.dao.pattern.singleton.demo.SingletonOne
     */
    public static synchronized SingletonTwo getInstance() {
        //判断是否存在
        if (instance == null) {
            instance = new SingletonTwo();
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
        System.out.println("（懒汉式，线程安全）您好！".concat(name));
    }
} 
