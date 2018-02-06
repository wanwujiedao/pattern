package com.dao.pattern.abstractfactory.core;
/**
 * 工厂创造器，构造器
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.abstractfactory.core.FactoryProducer.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-01-30 16:20:00
 * @modifier 阿导
 * @updated 2018-01-30 16:20:00
 */
public class FactoryProducer {
   public static final String LIQUID="LIQUID";
   public static final String USE="USE";
   public static AbstractFactory getFactory(String choice){
      if(choice.equalsIgnoreCase(LIQUID)){
         return new LiquidFactory();
      } else if(choice.equalsIgnoreCase(USE)){
         return new UseFactory();
      }
      return null;
   }
}
