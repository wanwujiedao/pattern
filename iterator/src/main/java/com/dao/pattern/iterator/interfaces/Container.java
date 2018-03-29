package com.dao.pattern.iterator.interfaces;

/**
 * 容器
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.iterator.interfaces.Container.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-28 18:47:00
 */
public interface Container<E> {

    /**
     * 获取迭代器
     *
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     * @param
     * @return com.dao.pattern.iterator.interfaces.Iterator<E>
     */
    Iterator<E> getIterator();
}
