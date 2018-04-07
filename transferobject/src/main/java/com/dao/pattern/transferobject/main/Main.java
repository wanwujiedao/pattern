package com.dao.pattern.transferobject.main;

import com.alibaba.fastjson.JSON;
import com.dao.pattern.transferobject.core.UserBo;
import com.dao.pattern.transferobject.core.UserVo;

/**
 * 主程序入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.transferobject.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-07 13:52:00
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
        //声明业务对象
        UserBo userBo=new UserBo();
        //查询库里面的用户
        System.out.println("新增用户前："+JSON.toJSONString(userBo.findAllUsers()));
        //新增用户
        userBo.insert(new UserVo("柯西",26));
        //看看用户是否存入
        System.out.println("新增用户后："+JSON.toJSONString(userBo.findAllUsers()));
    }
}
