package com.dao.pattern.memento.core;

import com.dao.pattern.memento.vo.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘存储
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.memento.core.MementoMaker.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-29 19:18:00
 */
public class MementoMaker {
    /**
     * 备忘 List
     */
    private List<Memento> mementos;

    /**
     * 静态块初始化
     */

    {
        mementos=new ArrayList<>();
    }

    /**
     * 添加备忘录
     *
     * @author 阿导
     * @time 2018/3/29
     * @CopyRight 万物皆导
     * @param memento
     * @return void
     */
    public void add(Memento memento){
        mementos.add(memento);
    }

    /**
     * 获取所有备忘录
     *
     * @author 阿导
     * @time 2018/3/29
     * @CopyRight 万物皆导
     * @param
     * @return java.util.List<com.dao.pattern.memento.vo.Memento>
     */
    public List<Memento> getAllMemento(){
        return mementos;
    }

}
