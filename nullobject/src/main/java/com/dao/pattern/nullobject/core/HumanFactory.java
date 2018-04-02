package com.dao.pattern.nullobject.core;

/**
 * 制造人类的工厂
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.nullobject.core.HumanFactory.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-02 15:57:00
 */
public class HumanFactory {

    private static final int ADULT=18;

    public static AbstractHuman getHuman(String name,int age){
        if(age<ADULT){
            return new NullHuman();
        }

        return new AdultHuman(name,age);
    }
}
