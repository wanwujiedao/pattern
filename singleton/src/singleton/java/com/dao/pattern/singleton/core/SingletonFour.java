package com.dao.pattern.singleton.core;
/**
 * 单例模式-双检锁/双重校验锁（DCL，即 double-checked locking）
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.singleten.demo.SingletonFour.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-02-05 09:41:00
 * @modifier 阿导
 * @updated 2018-02-05 09:41:00
 */
public class SingletonFour {
    /**
     * 创建一个 SingletonFour 的对象，使用 volatile 关键字修饰的变量，用来确保将变量的更新操作通知到其他线程
     */
    private volatile static SingletonFour instance;

    /**
     * 构造方法私有
     *
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @return
     */
    private SingletonFour() {}

    /**
     * 通过双检锁/双重校验锁 获取可使用的对象
     *
     * @author 阿导
     * @time 2018/2/5
     * @CopyRight 万物皆导
     * @param
     * @return com.dao.pattern.singleton.demo.SingletonOne
     */
    public static SingletonFour getInstance() {
        //判断是否存在实例
        if (instance == null) {
            //同步锁限制，防止线程并发创建多个对象实例
            synchronized (SingletonFour.class) {
                if (instance == null) {
                    instance = new SingletonFour();
                }
            }
        }
        //返回实例
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
        System.out.println("（双检锁/双重校验锁）您好！".concat(name));
    }
} 
