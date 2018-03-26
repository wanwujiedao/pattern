package com.dao.pattern.flyweight.core;

import com.dao.pattern.flyweight.impl.Human;
import com.dao.pattern.flyweight.interfaces.Animals;

import java.util.HashMap;

/**
 * 动物工厂类
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.flyweight.core.AnimalsFactory.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-26 14:00:00
 */
public class AnimalsFactory {
    /**
     * 存储动物的 map
     */
    private static HashMap<String,Animals> animalsMap=new HashMap<>();

    public static Animals getAnimals(String sex){
        //先尝试从 map 中获取人
        Animals animal = animalsMap.getOrDefault(sex, null);
        //若没有，重新创建
        if(animal==null){
            animal=new Human(sex);
            animalsMap.put(sex,animal);
        }
        //返回结果
        return animal;
    }
}
