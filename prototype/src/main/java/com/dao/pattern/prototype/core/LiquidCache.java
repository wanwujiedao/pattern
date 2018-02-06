package com.dao.pattern.prototype.core;

import com.dao.pattern.prototype.abstracts.Liquid;
import com.dao.pattern.prototype.extend.Gasoline;
import com.dao.pattern.prototype.extend.Perfume;

import java.util.Hashtable;

/**
 * 模拟从数据库获取数据
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.prototype.core.LiquidCache.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-02-06 11:53:00
 * @modifier 阿导
 */
public class LiquidCache {

    /**
     * 声明一个 map 存储液体信息
     */
    private static Hashtable<Long, Liquid> liquidMap = new Hashtable<Long, Liquid>();

    /**
     * 通过 ID 获取对应的液体
     *
     * @author 阿导
     * @time 2018/2/6
     * @CopyRight 万物皆导
     * @param id
     * @return com.dao.pattern.prototype.abstracts.Liquid
     */
    public static Liquid getLiquid(Long id) {
        Liquid cachedShape = liquidMap.get(id);
        return (Liquid) cachedShape.clone();
    }

    /**
     * 假设这里是从数据库获取的数据
     *
     * @author 阿导
     * @time 2018/2/6
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    public static void loadCache() {
        Gasoline gasoline = new Gasoline();
        gasoline.setId(1L);
        liquidMap.put(gasoline.getId(), gasoline);

        Perfume perfume = new Perfume();
        perfume.setId(2L);
        liquidMap.put(perfume.getId(), perfume);

    }
}
