package com.dao.pattern.frontcontroller.core;

/**
 * 前端控制器
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.frontcontroller.core.FrontController.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-07 12:43:00
 */
public class FrontController {
    /**
     * 声明调度器
     */
    private Dispatcher dispatcher;

    /**
     * 构造方法对成员变量进行初始化
     *
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     * @param
     * @return
     */
    public FrontController(){
        dispatcher = new Dispatcher();
    }

    /**
     * 模拟用户校验
     *
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     * @param
     * @return boolean
     */
    private boolean isAuthenticUser(){
        System.out.println("这里一般可以做一些权限校验。");
        return true;
    }

    /**
     * 记录请求记录
     *
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     * @param request
     * @return void
     */
    private void trackRequest(String request){
        System.out.println("用户请求记录：" + request);
    }

    /**
     * 调度器调度视图
     *
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     * @param request
     * @return void
     */
    public void dispatchRequest(String request){
        //记录每一个请求
        trackRequest(request);
        //对用户进行身份验证
        if(isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }
}
