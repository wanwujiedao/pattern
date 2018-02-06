package com.dao.pattern.singleton.core;

/**
 * 单例模式-饿汉式
 * 这种方式比较常用，但容易产生垃圾对象。
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.singleten.demo.SingletonThree.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-02-05 09:41:00
 * @modifier 阿导
 * @updated 2018-02-05 09:41:00
 */
public class SingletonThree {

    /**
     * 创建一个 SingletonThree 的对象
     */
    private static SingletonThree instance=new SingletonThree();

    /**
     * 构造方法私有
     *
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @return
     */
    private SingletonThree(){}
    /**
     * 获取唯一可使用的对象
     *
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @param
     * @return com.dao.pattern.demo.SingletonThree
     */
    public static SingletonThree getInstance(){
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
        System.out.println("（饿汉式）您好！".concat(name));
    }

}
