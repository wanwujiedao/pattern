package com.dao.pattern.factory.core;

/**
 * 液体的工厂类
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.factory.mian.IliquidFactory.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-01-30 15:27:00
 */
public class LiquidFactory {

    /**
     * 通过工厂模式获取某个液体
     *
     * @author 阿导
     * @time 2018/1/30
     * @CopyRight 万物皆导
     * @param clazz
     * @return T
     */
    public static <T> T getClass(Class<? extends T> clazz) {

        T obj = null;

        try {
            obj = (T) Class.forName(clazz.getName()).newInstance();
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
