package com.dao.pattern.chain.core;

import com.dao.pattern.chain.abstracts.AbstractPrice;
import com.dao.pattern.chain.buy.Cheap;
import com.dao.pattern.chain.buy.Expensive;
import com.dao.pattern.chain.buy.Secondary;

/**
 * 责任链生成
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.chain.core.ChainMaker.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-27 09:32:00
 */
public class ChainMaker {


    public static AbstractPrice getAbstractPrice(){

        // 昂贵的购买能力
        AbstractPrice expensive=new Expensive(AbstractPrice.EXPENSIVE);
        //下一个责任节点是中等
        AbstractPrice secondary=new Secondary(AbstractPrice.SECONDARY);
        // 下一个责任节点是廉价
        AbstractPrice cheap=new Cheap(AbstractPrice.CHEAP);
        //链路链接
        secondary.setNext(cheap);
        expensive.setNext(secondary);

        //返回结果
        return expensive;
    }
}
