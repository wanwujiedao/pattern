package com.dao.pattern.state.core;

import com.dao.pattern.state.vo.Saiyan;

/**
 * 赛亚人之蓝
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.state.core.BlueSaiyanState.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-30 17:32:00
 */
public class BlueSaiyanState implements State {

    /**
     * 处理赛亚人的状态
     *
     * @param saiyan
     * @return void
     * @author 阿导
     * @time 2018/3/30
     * @CopyRight 万物皆导
     */
    @Override
    public void doAction(Saiyan saiyan) {
        System.out.println("===赛亚人正在向赛亚人之蓝状态改变===");
        saiyan.setState(this);
    }

    /**
     * 赛亚人当前的状态
     *
     * @return void
     * @author 阿导
     * @time 2018/3/30
     * @CopyRight 万物皆导
     */
    @Override
    public void getResult() {
        System.out.println("+++当前为赛亚人之蓝状态+++");
    }
}
