package com.dao.pattern.state.core;

import com.dao.pattern.state.vo.Saiyan;

/**
 * 赛亚人的状态
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.state.core.State.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-30 17:27:00
 */
public interface State {
    /**
     * 处理赛亚人的状态
     *
     * @author 阿导
     * @time 2018/3/30
     * @CopyRight 万物皆导
     * @param saiyan
     * @return void
     */
    void doAction(Saiyan saiyan);

    /**
     * 赛亚人当前的状态
     *
     * @author 阿导
     * @time 2018/3/30
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    void getResult();
}
