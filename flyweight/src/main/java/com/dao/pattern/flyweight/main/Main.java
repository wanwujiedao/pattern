package com.dao.pattern.flyweight.main;

import com.dao.pattern.flyweight.core.AnimalsFactory;
import com.dao.pattern.flyweight.impl.Human;
import com.dao.pattern.flyweight.interfaces.Animals;

import java.util.Random;

/**
 * 主程序入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.flyweight.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-26 14:14:00
 */
public class Main {
    /**
     * 性别
     */
    private static final String sexs[] ={"男","女","未知的性别"};

    private static final String names="abcdefghijklmnopqrstuvwxyz";
    /**
     * 主方法入口
     *
     * @author 阿导
     * @time 2018/3/26
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        for(int pox=0;pox<10;pox++){
            Human animal = (Human) AnimalsFactory.getAnimals(getRandomSex());
            animal.setName(getName());
            animal.say();
        }
    }

    /**
     * 随机获取性别
     *
     * @author 阿导
     * @time 2018/3/26
     * @CopyRight 万物皆导
     * @param
     * @return java.lang.String
     */
    private static String getRandomSex() {
        return sexs[(int)(Math.random()*sexs.length)];
    }


    /**
     * 随机获取名字
     *
     * @author 阿导
     * @time 2018/3/26
     * @CopyRight 万物皆导
     * @param
     * @return java.lang.String
     */
    private static String getName(){
        StringBuffer sb=new StringBuffer();
        for(int pox=0;pox<6;pox++){
            sb.append( names.charAt(new Random().nextInt(names.toCharArray().length)));
        }
        return sb.toString();
    }
}
