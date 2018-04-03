package com.dao.pattern.visitor.main;

import com.dao.pattern.visitor.core.VisitorImpl;
import com.dao.pattern.visitor.impl.File;

/**
 * 主程序入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.visitor.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-03 09:06:00
 */
public class Main {

    /**
     * 主程序入口
     *
     * @author 阿导
     * @time 2018/4/3
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        new File().option(new VisitorImpl());
    }
}
