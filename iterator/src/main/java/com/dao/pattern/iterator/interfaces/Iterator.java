package com.dao.pattern.iterator.interfaces;

/**
 * 迭代器接口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.iterator.interfaces.Iterator.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-28 18:43:00
 */
public interface Iterator<E> {

    /**
     * 是否有下一个节点
     *
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     * @param
     * @return boolean
     */
    boolean hasNext();

    /**
     * 获取下一个节点
     *
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     * @param
     * @return E
     */
    E next();
}
