package com.dao.pattern.compositeentity.core;

import com.dao.pattern.compositeentity.vo.Dog;
import com.dao.pattern.compositeentity.vo.Human;

/**
 * 粗粒度对象
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.compositeentity.core.CoarseGrainedObject.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-04 13:51:00
 */
public class CoarseGrainedObject {
    /**
     * 这是一个人
     */
    private Human human;
    /**
     * 人
     */
    private Dog dog;

    /**
     * 构造函数
     *
     * @author 阿导
     * @time 2018/4/4
     * @CopyRight 万物皆导
     * @param
     * @return
     */
    public CoarseGrainedObject() {
        human=new Human();
        dog=new Dog();
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
        this.human.setName(humanName);
        this.dog.setName(dogName);
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
        return new String[]{this.human.getName(),this.dog.getName()};
    }
}
