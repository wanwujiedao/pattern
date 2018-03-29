package com.dao.pattern.iterator.core;

import com.dao.pattern.iterator.interfaces.Container;
import com.dao.pattern.iterator.interfaces.Iterator;

/**
 * 实现容器的接口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.iterator.core.Repository.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-28 18:50:00
 */
public class Repository<E> implements Container<E> {

    public static final int INIT=0;

    /**
     * 当前下标
     */
    private int index;

    /**
     * 长度
     */
    private int length;
    /**
     * 元素
     */
    private Object[] es;

    /**
     * 构造方法
     *
     * @author 阿导
     * @time 2018/3/29
     * @Co2018/3/29州微财科技有限公司
     * @param
     */
    public Repository() {
        this.index=INIT;
        this.length=INIT;
        this.es=new Object[INIT];
    }

    public void add(E e){
        //数组动态扩容
        Object[] esTemp=new Object[++this.length];
        //数组复制
        System.arraycopy(es, 0, esTemp, 0, es.length);
        //赋值
        esTemp[es.length]=e;
        //改变引用
        this.es=esTemp;
    }
    /**
     * 获取迭代器
     *
     * @return com.dao.pattern.iterator.interfaces.Iterator<E>
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     */
    @Override
    public Iterator<E> getIterator() {
        return new RepositoryIterator<E>();
    }


    class RepositoryIterator<E> implements Iterator<E> {

        /**
         * 是否有下一个节点
         *
         * @return boolean
         * @author 阿导
         * @time 2018/3/28
         * @CopyRight 万物皆导
         */
        @Override
        public boolean hasNext() {
            if(index<length){
                return true;
            }
            return false;
        }

        /**
         * 获取下一个节点
         *
         * @return E
         * @author 阿导
         * @time 2018/3/28
         * @CopyRight 万物皆导
         */
        @Override
        public E next() {
            if(hasNext()){
                return (E) es[index++];
            }
            return null;
        }
    }


}
