package com.dao.pattern.interpreter.core;

import com.dao.pattern.interpreter.impl.ExpressionImpl;
import com.dao.pattern.interpreter.interfaces.Expression;

/**
 * 解释器生成器
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.interpreter.core.ExpressionMaker.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-28 17:26:00
 */
public class ExpressionMaker {

    /**
     * 获取人类
     *
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     * @param
     * @return com.dao.pattern.interpreter.interfaces.Expression
     */
    public static Expression getHumanExpression(){
        Expression bob = new ExpressionImpl("鲍勃");
        Expression tom = new ExpressionImpl("汤姆");
        return new OrExpression(bob, tom);
    }

    /**
     * 不是人
     *
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     * @param
     * @return com.dao.pattern.interpreter.interfaces.Expression
     */
    public static Expression getContraryHumanExpression(){
        Expression wangzai = new ExpressionImpl("旺仔");
        return new ContraryExpression(wangzai);
    }

    /**
     * 男的并且是人类
     *
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     * @param
     * @return com.dao.pattern.interpreter.interfaces.Expression
     */
    public static Expression getManHumanExpression(){
        Expression bob = new ExpressionImpl("鲍勃");
        Expression tom = new ExpressionImpl("男");
        return new AndExpression(bob, tom);
    }

}
