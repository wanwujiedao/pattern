package com.dao.pattern.frontcontroller.core;

import com.dao.pattern.frontcontroller.vo.HomeView;
import com.dao.pattern.frontcontroller.vo.NonView;
import com.dao.pattern.frontcontroller.vo.UserView;

/**
 * 调度器
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.frontcontroller.core.Dispatcher.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-07 12:42:00
 */
public class Dispatcher{
    /**
     * 首页
     */
    public static final String HOME="HOME";
    /**
     * 用户
     */
    public static final String USER="USER";

    /**
     * 通过请求的视图关键字来进行调度对应的视图
     *
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     * @param requst
     * @return void
     */
    public void dispatch(String requst){
        if(HOME.equalsIgnoreCase(requst)){
            new HomeView().show();
        }else if(USER.equalsIgnoreCase(requst)){
            new UserView().show();
        }else {
            new NonView().show();
        }
    }

}
