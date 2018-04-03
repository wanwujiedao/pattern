package com.dao.pattern.visitor.impl;

import com.dao.pattern.visitor.core.Visitor;
import com.dao.pattern.visitor.interfaces.FileOptoin;

/**
 * 读文件
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.visitor.impl.FileRead.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-03 08:36:00
 */
public class FileRead implements FileOptoin {

    /**
     * 文件读取
     *
     * @param visitor
     * @return void
     * @author 阿导
     * @time 2018/4/3
     * @CopyRight 万物皆导
     */
    @Override
    public void option(Visitor visitor) {
        visitor.visitor(this);
    }
}
