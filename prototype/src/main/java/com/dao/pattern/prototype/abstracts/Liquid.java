package com.dao.pattern.prototype.abstracts;

/**
 * 液体：实现了 Clonable 接口的抽象类
 *
 * @author 阿导
 * @version BUILD1001
 * @fileName com.dao.pattern.prototype.abstracts.Liquid.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-02-06 11:53:00
 * @modifier 阿导
 */
public abstract class Liquid  implements Cloneable{

    /**
     * id
     */
    private Long id;

    /**
     * 液体名称
     */
    protected String name;

    /**
     * 获取液体的 ID
     *
     * @author 阿导
     * @time 2018/2/6
     * @CopyRight 万物皆导
     * @return java.lang.Long
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置液体的 ID
     *
     * @author 阿导
     * @time 2018/2/6
     * @CopyRight 万物皆导
     * @param id
     * @return void
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 液体的用处
     *
     * @author 阿导
     * @time 2018/2/6
     * @CopyRight 万物皆导
     * @return void
     */
    public abstract void use();

    /**
     * 获取液体名称
     *
     * @author 阿导
     * @time 2018/2/6
     * @CopyRight 万物皆导
     * @return java.lang.String
     */
    public String getName() {
        return name;
    }

    /**
     * 设置液体名称
     *
     * @author 阿导
     * @time 2018/2/6
     * @CopyRight 万物皆导
     * @param name
     * @return void
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
