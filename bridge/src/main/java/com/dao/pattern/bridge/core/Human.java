package com.dao.pattern.bridge.core;

import com.dao.pattern.bridge.interfaces.Voice;

/**
 * 人类
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.bridge.core.Human.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-21 17:46:00
 */
public class Human extends Animals {

    /**
     * 国家
     */
    private String country;
    /**
     * 肤色
     */
    private String skin;

    /**
     * 构造方法
     *
     * @author 阿导
     * @time 2018/3/21
     * @CopyRight 万物皆导
     * @param country
     * @param skin
     * @param voice
     * @return
     */
    public Human(String country,String skin,Voice voice){
        super(voice);
        this.country=country;
        this.skin=skin;
    }

    /**
     * 人有话说
     *
     * @return void
     * @author 阿导
     * @time 2018/3/21
     * @CopyRight 万物皆导
     */
    @Override
    public void voice() {
        //人要说话了
        voice.say(this.country,this.skin);
    }
}
