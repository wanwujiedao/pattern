package com.dao.pattern.interpreter.main;

import com.dao.pattern.interpreter.core.ExpressionMaker;
import com.dao.pattern.interpreter.interfaces.Expression;

/**
 * 主程序入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.interpreter.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-28 17:40:00
 */
public class Main {

    /**
     * 主方法入口
     *
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        //人类
        Expression human= ExpressionMaker.getHumanExpression();
        //非人类
        Expression contraryHuman= ExpressionMaker.getContraryHumanExpression();
        //男人
        Expression man= ExpressionMaker.getManHumanExpression();


        System.out.println("汤姆是人类吗？答曰：".concat(human.interpret("汤姆")?"是":"否"));
        System.out.println("旺仔是人类吗？答曰：".concat(contraryHuman.interpret("旺仔")?"是":"否"));
        System.out.println("鲍勃是男人嘛？答曰：".concat(man.interpret("鲍勃 男")?"是":"否"));
    }
}
