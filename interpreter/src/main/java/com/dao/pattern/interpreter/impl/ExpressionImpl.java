package com.dao.pattern.interpreter.impl;

import com.dao.pattern.interpreter.interfaces.Expression;

/**
 * 人类的解释器
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.interpreter.impl.ExpressionImpl.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-28 17:09:00
 */
public class ExpressionImpl implements Expression {

    /**
     * 类型
     */
    private String type;

    /**
     * 构造方法
     *
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     * @param type
     * @return
     */
    public ExpressionImpl(String type) {
        this.type = type;
    }

    /**
     * 判断是否是人类
     *
     * @param msg
     * @return boolean
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     */
    @Override
    public boolean interpret(String msg) {
       //包含信息
        if(msg.contains(type)){
            return true;
        }
        return false;
    }
}
