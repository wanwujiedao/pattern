package com.dao.pattern.frontcontroller.main;

import com.dao.pattern.frontcontroller.core.Dispatcher;
import com.dao.pattern.frontcontroller.core.FrontController;

/**
 * 主程序入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.frontcontroller.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-07 12:59:00
 */
public class Main {

    /**
     * 主方法入口
     *
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        //声明前端控制器
        FrontController controller=new FrontController();
        //进入首页
        controller.dispatchRequest(Dispatcher.HOME);
        System.out.println("=================================");
        //进入用户中心
        controller.dispatchRequest(Dispatcher.HOME);
        System.out.println("=================================");
        //进入其他页面
        controller.dispatchRequest("OTHER");
    }

}
