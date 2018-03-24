package com.dao.pattern.decorator.main;

import com.dao.pattern.decorator.core.BlackPenDecorator;
import com.dao.pattern.decorator.impl.Ballpen;
import com.dao.pattern.decorator.impl.Pencil;
import com.dao.pattern.decorator.interfaces.Pen;

/**
 * 主程序入口
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.decorator.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-24 16:53:00
 */
public class Main {

    /**
     * 主方法入口
     *
     * @author 阿导
     * @time 2018/3/24
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        //铅笔
        Pen pencil=new Pencil();
        System.out.println("=======铅笔=========");
        pencil.name();

        //圆珠笔
        Pen ballPen=new Ballpen();
        System.out.println("=======圆珠笔=========");
        ballPen.name();

        //黑色的铅笔
        Pen blackPencil=new BlackPenDecorator(pencil);
        System.out.println("=======黑色的铅笔=========");
        blackPencil.name();

        //黑色的圆珠笔
        Pen blackBallPen=new BlackPenDecorator(ballPen);
        System.out.println("=======黑色的圆珠笔=========");
        blackBallPen.name();

    }

}
