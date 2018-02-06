package com.dao.pattern.abstractfactory.core;

import com.dao.pattern.abstractfactory.interfaces.IUse;
import com.dao.pattern.factory.interfaces.Iliquid;

/**
 * 抽象工厂类
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.abstractfactory.core.AbstractFactory.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-01-30 15:54:00
 */
public abstract class AbstractFactory {
    /**
     * 液体工厂类
     *
     * @author 阿导
     * @time 2018/1/30
     * @CopyRight 万物皆导
     * @param clazz
     * @return com.dao.pattern.factory.interfaces.Iliquid
     */
    public abstract <T> Iliquid getLiquid(Class<? extends T> clazz);

    /**
     * 用处工厂
     *
     * @author 阿导
     * @time 2018/1/30
     * @CopyRight 万物皆导
     * @param clazz
     * @return com.dao.pattern.abstractfactory.interfaces.IUse
     */
    public abstract <T> IUse getUse(Class<? extends T> clazz);
}
