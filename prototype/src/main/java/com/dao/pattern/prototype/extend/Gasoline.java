package com.dao.pattern.prototype.extend;


import com.dao.pattern.prototype.abstracts.Liquid;

/**
 * 汽油
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.factory.impl.Gasoline.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-01-30 15:20:00
 *
 */
public class Gasoline extends Liquid {

    /**
     * 汽油的构造方法
     *
     * @author 阿导
     * @time 2018/2/6
     * @CopyRight 万物皆导
     * @return
     */
    public Gasoline() {
        name="汽油";
    }

    /**
     * 汽油的用处
     *
     * @author 阿导
     * @time 2018/2/6
     * @CopyRight 万物皆导
     * @return void
     */
    @Override
    public void use() {
        System.out.println("汽油好呛人！！！");
    }
}
