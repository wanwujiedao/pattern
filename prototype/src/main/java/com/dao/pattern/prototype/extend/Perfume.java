package com.dao.pattern.prototype.extend;

import com.dao.pattern.prototype.abstracts.Liquid;

/**
 * 香水
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.factory.impl.Perfume.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-01-30 15:21:00
 */
public class Perfume extends Liquid {

    /**
     * 香水的构造方法
     * @author 阿导
     * @time 2018/2/6
     * @CopyRight 万物皆导
     * @return
     */
    public Perfume() {
        name="香水";
    }

    /**
     * 香水的用处
     *
     * @author 阿导
     * @time 2018/2/6
     * @CopyRight 万物皆导
     * @return void
     */
    @Override
    public void use() {
        System.out.println("这香水有毒。。。");
    }
}
