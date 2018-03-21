package com.dao.pattern.bridge.core;

import com.dao.pattern.bridge.interfaces.Voice;

/**
 * 动物
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.bridge.core.Animals.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-21 17:42:00
 */
public abstract class Animals {
    protected Voice voice;
    /**
     * 构造方法
     *
     * @author 阿导
     * @time 2018/3/21
     * @CopyRight 杭州微财科技有限公司
     * @param voice
     * @return
     */
    protected  Animals(Voice voice) {
        this.voice = voice;
    }

    /**
     * 动物想发声
     *
     * @author 阿导
     * @time 2018/3/21
     * @CopyRight 杭州微财科技有限公司
     * @param
     * @return void
     */
    public abstract void voice();
}
