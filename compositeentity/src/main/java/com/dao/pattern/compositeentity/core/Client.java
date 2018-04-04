package com.dao.pattern.compositeentity.core;

/**
 * 客户端
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.compositeentity.core.Client.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-04 14:25:00
 */
public class Client {
    /**
     * 组合实体
     */
    private CompositeEntity compositeEntity;

    {
        compositeEntity = new CompositeEntity();
    }

    /**
     * 打印信息
     *
     * @author 阿导
     * @time 2018/4/4
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    public void printName(){
        int count=0;
        for(String name:compositeEntity.getName()){
            if(count++==0) {
                System.out.print(name+"养了一条狗，");
            }else{
                System.out.println("名字叫"+name+"。");

            }
        }
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
        compositeEntity.setName(humanName, dogName);
    }
}
