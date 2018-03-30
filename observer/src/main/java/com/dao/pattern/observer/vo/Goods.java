package com.dao.pattern.observer.vo;

import com.dao.pattern.observer.core.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 购买能力
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.observer.vo.Goods.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-03-30 10:19:00
 */
public class Goods {
    /**
     * 观察者集合
     */
    private List<Observer> observers;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 价格
     */
    private Integer price;

    //静态块初始化
    {
        observers = new ArrayList<>();
    }

    /**
     * 传入物品价格
     *
     * @param name
     * @param price
     * @return void
     * @author 阿导
     * @time 2018/3/30
     * @CopyRight 万物皆导
     */
    public void setGoods(String name, Integer price) {
        this.name = name;
        this.price = price;
        //通知所有的观察者
        notifyAllObservers();
    }

    /**
     * 钱能买此商品吗？
     *
     * @param money
     * @return void
     * @author 阿导
     * @time 2018/3/30
     * @CopyRight 万物皆导
     */
    public void msg(int money, String name) {
        if (money < this.price) {
            System.out.println(name + "只有" + money + "元，买不起价格为" + this.price+"的商品"+this.name);
        }else{
            System.out.println(name + "只有" + money + "元，可以买价格为" + this.price+"的商品"+this.name);
        }
    }

    /**
     * 添加观察者
     *
     * @param observer
     * @return void
     * @author 阿导
     * @time 2018/3/30
     * @CopyRight 万物皆导
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 通知所有的观察者
     *
     * @param
     * @return void
     * @author 阿导
     * @time 2018/3/30
     * @CopyRight 万物皆导
     */
    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.isBuy();
        }
    }
}
