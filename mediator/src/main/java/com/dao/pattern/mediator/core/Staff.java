package com.dao.pattern.mediator.core;

import java.util.Iterator;

/**
 * 员工
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.mediator.core.Staff.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-29 15:18:00
 */
public class Staff {

    /**
     * 打印信息
     *
     * @author 阿导
     * @time 2018/3/29
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    public static void printMsg(){
        Iterator iterator = Mediator.getQueue().iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
