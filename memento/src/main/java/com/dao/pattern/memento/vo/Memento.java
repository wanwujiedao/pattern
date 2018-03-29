package com.dao.pattern.memento.vo;

import java.sql.Timestamp;

/**
 * 备忘存储实体类
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.memento.vo.Memento.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-29 19:05:00
 */
public class Memento {

    /**
     * 玩游戏备忘，存储时间
     */
    private Timestamp time;

    /**
     * 构造函数
     *
     * @author 阿导
     * @time 2018/3/29
     * @CopyRight 万物皆导
     * @param time
     * @return
     */
    public Memento(Timestamp time) {
        this.time = time;
    }

    /**
     * 获取时间
     *
     * @author 阿导
     * @time 2018/3/29
     * @CopyRight 万物皆导
     * @param
     * @return import java.sql.Timestamp;
     */
    public Timestamp getTime() {
        return time;
    }
}
