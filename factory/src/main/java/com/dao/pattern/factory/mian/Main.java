package com.dao.pattern.factory.mian;

import com.dao.pattern.factory.core.LiquidFactory;
import com.dao.pattern.factory.impl.Gasoline;
import com.dao.pattern.factory.impl.Perfume;

/**
 * 启动类
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.factory.mian.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-01-30 15:28:00
 */
public class Main {

    /**
     * 主程序入口
     *
     * @author 阿导
     * @time 2018/1/30
     * @CopyRight 万物皆导
     * @param arg
     * @return void
     */
    public static void main(String[] arg){
        //汽油来了
        Gasoline gasoline= LiquidFactory.getClass(Gasoline.class);
        gasoline.taste();
        //香水也跟上
        Perfume perfume=LiquidFactory.getClass(Perfume.class);
        perfume.taste();
    }
}
