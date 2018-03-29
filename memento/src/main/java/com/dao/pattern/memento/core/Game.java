package com.dao.pattern.memento.core;

import com.dao.pattern.memento.vo.Memento;

import java.sql.Timestamp;

/**
 * 游戏
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.memento.core.Game.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-29 19:09:00
 */
public class Game {
    /**
     * 游戏存储的时间戳
     */
    private Timestamp time;

    /**
     * 获取游戏进行的时间
     *
     * @author 阿导
     * @time 2018/3/29
     * @CopyRight 杭州微财科技有限公司
     * @param
     * @return java.sql.Timestamp
     */
    public Timestamp getTime() {
        return time;
    }

    /**
     * 存储游戏进行的时间
     * @author 阿导
     * @time 2018/3/29
     * @CopyRight 杭州微财科技有限公司
     * @param time
     * @return void
     */
    public void setTime(Timestamp time) {
        this.time = time;
    }

    /**
     * 存档
     * @author 阿导
     * @time 2018/3/29
     * @CopyRight 杭州微财科技有限公司
     * @param
     * @return com.dao.pattern.memento.vo.Memento
     */

    public Memento saveTimeToMemento(){
        return new Memento(time);
    }

    /**
     * 获取存档
     *
     * @author 阿导
     * @time 2018/3/29
     * @CopyRight 杭州微财科技有限公司
     * @param memento
     * @return void
     */
    public void getTimeFromMemento(Memento memento){
      time=memento.getTime();
    }
}
