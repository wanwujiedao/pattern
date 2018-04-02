package com.dao.pattern.nullobject.core;

/**
 * 成人
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.nullobject.core.AdultHuman.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-02 15:51:00
 */
public class AdultHuman extends AbstractHuman {

    /**
     * 构造方法
     *
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     * @param name
     * @param age
     * @return
     */
    public AdultHuman(String name,int age) {
        super();
        this.name=name;
        this.age=age;
    }

    /**
     * 判断是不是空
     *
     * @return boolean
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     */
    @Override
    public boolean isNil() {
        return false;
    }

    /**
     * 说一些什么
     *
     * @return void
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     */
    @Override
    public void say() {
        System.out.println(name+"的年龄为"+age+",已经成年了，可以进入网吧。");
    }


}
