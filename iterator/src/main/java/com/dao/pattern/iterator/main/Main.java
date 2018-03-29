package com.dao.pattern.iterator.main;


import com.dao.pattern.iterator.core.Repository;
import com.dao.pattern.iterator.interfaces.Iterator;

/**
 * 主方法入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.iterator.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-29 09:30:00
 */
public class Main {

    /**
     * 主方法入口
     *
     * @author 阿导
     * @time 2018/3/29
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        Repository<String> repository=new Repository<>();
        repository.add("A");
        repository.add("B");
        repository.add("C");
        repository.add("D");

        Iterator<String> iterator = repository.getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
