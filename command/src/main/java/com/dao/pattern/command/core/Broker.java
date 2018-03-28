package com.dao.pattern.command.core;

import com.dao.pattern.command.interfaces.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令调用类
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.command.core.Broker.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-28 11:02:00
 */
public class Broker {
    /**
     * 声明命令类
     */
    private List<Order> orderList = new ArrayList<Order>();

    /**
     * 添加命令
     *
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     * @param order
     * @return void
     */
    public void takeOrder(Order order){
        orderList.add(order);
    }
    /**
     * 开始执行命令
     *
     * @author 阿导
     * @time 2018/3/28
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
