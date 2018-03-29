package com.dao.pattern.facade.core;

import com.dao.pattern.facade.impl.Cat;
import com.dao.pattern.facade.impl.Dog;
import com.dao.pattern.facade.interfaces.Animals;

/**
 * 动物的对外接口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.facade.core.AnimalsFacade.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-26 10:48:00
 */
public class AnimalsFacade {
    /**
     * 狗
     */
    private Animals dog;

    /**
     * 猫
     */
    private Animals cat;

    /**
     * 初始化
     */
    {
        dog=new Dog();
        cat=new Cat();
    }

    /**
     * 获取狗的名称
     *
     * @author 阿导
     * @time 2018/3/26
     * @CopyRight 万物皆导
     * @param
     * @return java.lang.String
     */
    public String getDogName(){
        return dog.name();
    }

    /**
     * 获取猫的名称
     *
     * @author 阿导
     * @time 2018/3/26
     * @CopyRight 万物皆导
     * @param
     * @return java.lang.String
     */
    public String getCatName(){
        return cat.name();
    }

}
