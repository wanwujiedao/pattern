package com.dao.pattern.builder.core;

import com.dao.pattern.builder.interfaces.IGoods;

import java.util.ArrayList;
import java.util.List;

/**
 * 购买商品
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.builder.extend.Apple.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-02-05 17:23:00
 * @modifier 阿导
 */

public class Buy {
   private List<IGoods> goodsList = new ArrayList<IGoods>();

   public void addGoods(IGoods goods){
      goodsList.add(goods);
   }

   public float getCost(){
      float cost = 0.0f;
      for (IGoods goods : goodsList) {
         cost += goods.price();
      }        
      return cost;
   }

   public void showGoods(){
      for (IGoods goods : goodsList) {
         System.out.println("============================");
         System.out.println("商品的独白: "+goods.getName());
         System.out.println("结算方式: "+goods.settlement().buyWay());
         System.out.println("商品的价格: "+goods.price());
         System.out.println("============================");
      }        
   }    
}
