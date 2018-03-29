package com.dao.pattern.interpreter.core;

import com.dao.pattern.interpreter.interfaces.Expression;

/**
 * 且关系
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.interpreter.core.AndExpression.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-28 17:16:00
 */
public class AndExpression implements Expression{
    /**
     * 第一个解释器
     */
    private Expression expression;
    /**
     * 第二个解释器
     */
    private Expression otherExpression;

    /**
     * 且关系的构造方法
     *
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     * @param expression
     * @param otherExpression
     * @return
     */
    public AndExpression(Expression expression, Expression otherExpression) {
        this.expression = expression;
        this.otherExpression = otherExpression;
    }

    /**
     * 判断是否都是人类
     *
     * @param msg
     * @return boolean
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     */
    @Override
    public boolean interpret(String msg) {
        return expression.interpret(msg)&&otherExpression.interpret(msg);
    }
}
