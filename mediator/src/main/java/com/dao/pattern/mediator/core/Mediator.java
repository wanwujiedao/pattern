package com.dao.pattern.mediator.core;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * 中介
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.mediator.core.Mediator.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-29 15:07:00
 */
public class Mediator {
    /**
     * 声明一个队列，作为中介传递信息
     */
    private static LinkedBlockingQueue queue;

    static {
        queue=new LinkedBlockingQueue();
    }

    /**
     * 获取队列
     * @author 阿导
     * @time 2018/3/29
     * @CopyRight 万物皆导
     * @param
     * @return java.util.concurrent.LinkedBlockingQueue
     */
    public static LinkedBlockingQueue getQueue() {
        return queue;
    }


}
