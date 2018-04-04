package com.dao.pattern.dataaccessobject.main;

import com.alibaba.fastjson.JSON;
import com.dao.pattern.dataaccessobject.dao.UserDao;
import com.dao.pattern.dataaccessobject.dao.UserDaoImpl;
import com.dao.pattern.dataaccessobject.vo.User;

import java.util.List;

/**
 * 郑旭入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.dataaccessobject.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-04 17:24:00
 */
public class Main {

    /**
     * 主方法入口
     *
     * @author 阿导
     * @time 2018/4/4
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        //初始化 Dao 层
        UserDao userDao=new UserDaoImpl();

        //添加用户
        userDao.saveUser(new User("小明"));
        userDao.saveUser(new User("大明"));
        userDao.saveUser(new User("孙明"));
        userDao.saveUser(new User("小花"));
        userDao.saveUser(new User("小芳"));

        //查询用户
        List<User> users = userDao.findUser("小");

        //打印用户
        System.out.println(JSON.toJSONString(users));
    }

}
