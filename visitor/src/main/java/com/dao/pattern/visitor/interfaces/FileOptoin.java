package com.dao.pattern.visitor.interfaces;

import com.dao.pattern.visitor.core.Visitor;

/**
 * 文件操作
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.visitor.interfaces.FileOptoin.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-03 08:36:00
 */
public interface FileOptoin {
    /**
     * 文件操作
     *
     * @author 阿导
     * @time 2018/4/3
     * @CopyRight 万物皆导
     * @param visitor
     * @return void
     */
    void option(Visitor visitor);
}
