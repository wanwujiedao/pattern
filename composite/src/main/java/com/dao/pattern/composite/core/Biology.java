package com.dao.pattern.composite.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 生物
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.composite.core.Biology.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-24 16:03:00
 */
public class Biology implements Serializable{

    private static final long serialVersionUID = 1813417278587323463L;
    /**
     * 名称
     */
    private String name;
    /**
     * 下一层级
     */
    private List<Biology> next;

    public Biology(String name) {
        this.name = name;
        next=new ArrayList<Biology>();
    }

    public void addBiology(Biology biology){
        this.next.add(biology);
    }

    public void removeBiology(Biology biology){
        this.next.remove(biology);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Biology> getNext() {
        return next;
    }

    public void setNext(List<Biology> next) {
        this.next = next;
    }
}
