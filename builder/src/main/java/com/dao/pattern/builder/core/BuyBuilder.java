package com.dao.pattern.builder.core;

import com.dao.pattern.builder.extend.Apple;
import com.dao.pattern.builder.extend.Dumplings;
import com.dao.pattern.builder.extend.Milk;
import com.dao.pattern.builder.extend.Rice;

/**
 * 购买商品的建造者
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.builder.extend.Apple.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-02-05 17:23:00
 * @modifier 阿导
 */

public class BuyBuilder {

   /**
    * 以数量结算的商品
    *
    * @author 阿导
    * @time 2018/2/6
    * @CopyRight 万物皆导
    * @return com.dao.pattern.builder.core.Buy
    */
   public Buy prepareNumberGoods(){
      Buy buy = new Buy();
      buy.addGoods(new Dumplings());
      buy.addGoods(new Milk());
      return buy;
   }

   /**
    * 以质量结算的商品
    *
    * @author 阿导
    * @time 2018/2/6
    * @CopyRight 万物皆导
    * @return com.dao.pattern.builder.core.Buy
    */
   public Buy prepareQualityGoods (){
      Buy buy = new Buy();
      buy.addGoods(new Apple());
      buy.addGoods(new Rice());
      return buy;
   }
}
