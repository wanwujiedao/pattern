package com.dao.pattern.bridge.impl;

import com.dao.pattern.bridge.interfaces.Voice;

/**
 * 男人的声音
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.bridge.PeopleImpl.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-21 17:35:00
 */
public class VoiceManImpl implements Voice {
    /**
     * 这个男人想说什么呢？
     *
     * @author 阿导
     * @time 2018/3/21
     * @CopyRight 杭州微财科技有限公司
     * @param contry 国家
     * @param skin 肤色
     * @return void
     */
    public void say(String contry, String skin) {
        //输出男人想说的话
        System.out.println("我是男人，来自".concat(contry).concat("，皮肤的颜色是").concat(skin));
    }
}
