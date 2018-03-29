package com.dao.pattern.memento.main;

import com.dao.pattern.memento.core.Game;
import com.dao.pattern.memento.core.MementoMaker;
import com.dao.pattern.memento.vo.Memento;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * 主程序入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.memento.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-29 19:26:00
 */
public class Main {

    /**
     * 主程序入口
     *
     * @author 阿导
     * @time 2018/3/29
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args) throws InterruptedException {

        //声明备忘录
        MementoMaker mementoMaker=new MementoMaker();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //声明玩的游戏
        Game game=new Game();
        int i=0;
        while (++i<10){
            game.setTime(new Timestamp(System.currentTimeMillis()));
            //因为吃饭，游戏保存
            if(i==5) {
                System.out.println("=========【吃饭时间到，存档游戏："+sdf.format(game.getTime())+"】===========");
                mementoMaker.add(game.saveTimeToMemento());
            }
            System.out.println("#########【正在进行游戏："+sdf.format(game.getTime())+"】########");
            //每次循环都睡眠一分钟
            Thread.sleep(1000);
        }
        //睡觉了，再次存档
        game.setTime(new Timestamp(System.currentTimeMillis()));
        System.out.println("=========【睡觉时间到，存档游戏："+sdf.format(game.getTime())+"】===========");
        mementoMaker.add(game.saveTimeToMemento());

        //第二天看看昨天的存档
        List<Memento> mementos=mementoMaker.getAllMemento();
        for(Memento memento:mementos){
            //从游戏读取存档
            game.getTimeFromMemento(memento);
            System.out.println("存档记录：【"+sdf.format(game.getTime())+"】");
        }
    }
}
