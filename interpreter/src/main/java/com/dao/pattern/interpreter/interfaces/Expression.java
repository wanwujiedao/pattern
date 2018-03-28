package com.dao.pattern.interpreter.interfaces;

/**
 * 解释器接口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.interpreter.interfaces.Expression.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-28 17:07:00
 */
public interface Expression {
    /**
     * 判断是否是人类
     *
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     * @param msg
     * @return boolean
     */
    boolean interpret(String msg);
}
