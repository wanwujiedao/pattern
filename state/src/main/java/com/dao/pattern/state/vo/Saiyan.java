package com.dao.pattern.state.vo;

import com.dao.pattern.state.core.State;

/**
 * 赛亚人
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.state.vo.Saiyan.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-30 17:26:00
 */
public class Saiyan {
    /**
     * 存储赛亚人的状态
     */
    private State state;

    /**
     * 赛亚人默认无状态
     *
     * @author 阿导
     * @time 2018/3/30
     * @CopyRight 万物皆导
     * @param
     * @return
     */
    public Saiyan() {
        state=null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
