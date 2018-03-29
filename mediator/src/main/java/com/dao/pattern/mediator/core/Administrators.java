package com.dao.pattern.mediator.core;

/**
 * 发送信息的人
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.mediator.core.Administrators.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-29 15:17:00
 */
public class Administrators {

    /**
     * 发送信息
     *
     * @author 阿导
     * @time 2018/3/29
     * @CopyRight 万物皆导
     * @param msg
     * @return void
     */
    public static void sendMsg(String msg){
        Mediator.getQueue().offer(msg);
    }
}
