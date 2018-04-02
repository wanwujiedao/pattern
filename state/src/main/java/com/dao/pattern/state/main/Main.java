package com.dao.pattern.state.main;

import com.dao.pattern.state.core.BlueSaiyanState;
import com.dao.pattern.state.core.GodSaiyanState;
import com.dao.pattern.state.core.State;
import com.dao.pattern.state.core.SuperSaiyanState;
import com.dao.pattern.state.vo.Saiyan;

/**
 * 演示类
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.state.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-30 17:37:00
 */
public class Main {


    /**
     * 主程序入口
     * @author 阿导
     * @time 2018/3/30
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        //声明赛亚人
        Saiyan saiyan=new Saiyan();

        //声明超级赛亚人状态
        State superSaiyanState=new SuperSaiyanState();
        //声明赛亚人之蓝状态
        State blueSaiyanState=new BlueSaiyanState();
        //声明赛亚人之神状态
        State godSaiyanState=new GodSaiyanState();

        //遇到 boss ，原状态打不过，变成超级赛亚人
        superSaiyanState.doAction(saiyan);
        saiyan.getState().getResult();

        //变成超级赛亚人后依旧打不过，正准备变成赛亚人之蓝
        blueSaiyanState.doAction(saiyan);
        saiyan.getState().getResult();

        //赛亚人蓝和 boss 势均力敌，只能用赛亚人之神状态进行决一胜负
        godSaiyanState.doAction(saiyan);
        saiyan.getState().getResult();


    }
}
