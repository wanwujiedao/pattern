package com.dao.pattern.abstractfactory.core;

import com.dao.pattern.abstractfactory.interfaces.IUse;
import com.dao.pattern.factory.interfaces.Iliquid;

/**
 * 用处的工厂类
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.abstractfactory.core.UseFactory.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-01-30 16:03:00
 * @modifier 阿导
 * @updated 2018-01-30 16:03:00
 */
public class UseFactory extends AbstractFactory {


    /**
     * 液体工厂类
     *
     * @author 阿导
     * @time 2018/1/30
     * @CopyRight 万物皆导
     * @param clazz
     * @return com.dao.pattern.factory.interfaces.Iliquid
     */
    @Override
    public <T> Iliquid getLiquid(Class<? extends T> clazz) {

        return null;
    }

    /**
     * 用处工厂
     *
     * @author 阿导
     * @time 2018/1/30
     * @CopyRight 万物皆导
     * @param clazz
     * @return com.dao.pattern.abstractfactory.interfaces.IUse
     */
    @Override
    public <T> IUse getUse(Class<? extends T> clazz) {
        IUse obj = null;

        try {
            obj = (IUse) Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return obj;
    }
}
