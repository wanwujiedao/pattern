package com.dao.pattern.interceptingfilter.main;

import com.alibaba.fastjson.JSON;
import com.dao.pattern.interceptingfilter.core.Client;
import com.dao.pattern.interceptingfilter.vo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * 主程序入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.interceptingfilter.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-07 14:58:00
 */
public class Main {

    /**
     * 主程序入口
     *
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        //声明过滤的对象
        List<User> users=new ArrayList<>();
        users.add(new User("小明","男",19));
        users.add(new User("小刚","男",17));
        users.add(new User("小林","女",16));
        users.add(new User("小许","女",20));
        users.add(new User("小亮","男",22));
        //打印过滤前的用户用于对比
        System.out.println("过滤前："+ JSON.toJSONString(users));
        //进行过滤
        Client client = new Client();
        client.doInterceptor(users);
        //打印过滤后的用户
        System.out.println("过滤后："+ JSON.toJSONString(users));
    }
}
