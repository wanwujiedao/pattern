package com.dao.pattern.interpreter.core;

import com.dao.pattern.interpreter.interfaces.Expression;

/**
 * 非关系
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.interpreter.core.ContraryExpression.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-28 17:19:00
 */
public class ContraryExpression implements Expression{

    /**
     * 解释器
     */
    private Expression expression;

    /**
     * 非关系解释器
     *
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     * @param expression
     * @return
     */
    public ContraryExpression(Expression expression) {
        this.expression = expression;
    }

    /**
     * 判断是否不是人类
     *
     * @param msg
     * @return boolean
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     */
    @Override
    public boolean interpret(String msg) {
        return !expression.interpret(msg);
    }
}
