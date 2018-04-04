package com.dao.pattern.compositeentity.core;

/**
 * 组合实体
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.compositeentity.core.CompositeEntity.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-04 14:11:00
 */
public class CompositeEntity {
    /**
     * 声明粗粒度对象
     */
    private CoarseGrainedObject cgo;

    /**
     * 构造方法
     *
     * @author 阿导
     * @time 2018/4/4
     * @CopyRight 万物皆导
     * @param
     * @return
     */
    public CompositeEntity() {
        cgo=new CoarseGrainedObject();
    }

    /**
     * 设置人和狗的名字
     *
     * @author 阿导
     * @time 2018/4/4
     * @CopyRight 万物皆导
     * @param humanName
     * @param dogName
     * @return void
     */
    public void setName(String humanName, String dogName){
        this.cgo.setName(humanName, dogName);
    }

    /**
     * 获取人和狗的名称
     *
     * @author 阿导
     * @time 2018/4/4
     * @CopyRight 万物皆导
     * @param
     * @return java.lang.String[]
     */
    public String[] getName(){
        return cgo.getName();
    }

}
