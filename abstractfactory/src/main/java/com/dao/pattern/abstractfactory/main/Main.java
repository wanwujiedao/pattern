package com.dao.pattern.abstractfactory.main;

import com.dao.pattern.abstractfactory.core.AbstractFactory;
import com.dao.pattern.abstractfactory.core.FactoryProducer;
import com.dao.pattern.abstractfactory.impl.GasolineUse;
import com.dao.pattern.abstractfactory.impl.PerfumeUse;
import com.dao.pattern.factory.impl.Gasoline;
import com.dao.pattern.factory.impl.Perfume;

/**
 * 启动类
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.abstractfactory.main.Main.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-01-30 16:20:00
 * @modifier 阿导
 * @updated 2018-01-30 16:20:00
 */
public class Main {
    /**
     * 主程序入口
     *
     * @author 阿导
     * @time 2018/1/30
     * @CopyRight 万物皆导
     * @param args
     * @return void
     */
    public static void main(String[] args){
        //液体啊
        AbstractFactory liquid = FactoryProducer.getFactory(FactoryProducer.LIQUID);
        //汽油
        liquid.getLiquid(Gasoline.class).taste();
        //香水
        liquid.getLiquid(Perfume.class).taste();
        //用处啊
        AbstractFactory use = FactoryProducer.getFactory(FactoryProducer.USE);
        //汽油的用处
        use.getUse(GasolineUse.class).use();
        //香水的用处
        use.getUse(PerfumeUse.class).use();
    }
}
