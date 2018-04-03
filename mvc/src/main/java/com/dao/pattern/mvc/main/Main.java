package com.dao.pattern.mvc.main;

import com.dao.pattern.mvc.controller.UserController;
import com.dao.pattern.mvc.model.User;
import com.dao.pattern.mvc.view.UserView;

/**
 * 主程序入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.mvc.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-03 10:15:00
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
        //初始化用户信息，声明模型
        User user=initUser();
        //声明视图
        UserView userView=new UserView();
        //声明控制器
        UserController userController=new UserController(user,userView);
        //查询用户信息
        System.out.print("初始化的用户信息：");
        userController.findUser();
        //创建更新用户模型
        User userUpdate=new User();
        //更新信息写入
        userUpdate.setName(user.getName());
        userUpdate.setAge(105);
        userController.updateUser(userUpdate);
        //再次打印用户信息
        System.out.print("更新的用户信息：");
        userController.findUser();
    }

    /**
     * 初始化用户信息
     *
     * @author 阿导
     * @time 2018/4/3
     * @CopyRight 万物皆导
     * @param
     * @return com.dao.pattern.mvc.model.User
     */
    private static User initUser(){
        User user=new User();
        user.setName("万物");
        user.setAge(10000);
        return user;
    }
}
