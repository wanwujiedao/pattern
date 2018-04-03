package com.dao.pattern.visitor.core;

import com.dao.pattern.visitor.impl.File;
import com.dao.pattern.visitor.impl.FileExecute;
import com.dao.pattern.visitor.impl.FileRead;
import com.dao.pattern.visitor.impl.FileWrite;

/**
 * 访问者
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.visitor.core.Visitor.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-03 08:41:00
 */
public interface Visitor {
    /**
     * 文件
     *
     * @author 阿导
     * @time 2018/4/3
     * @CopyRight 万物皆导
     * @param file
     * @return void
     */
    void visitor(File file);
    /**
     * 读文件
     *
     * @author 阿导
     * @time 2018/4/3
     * @CopyRight 万物皆导
     * @param fileRead
     * @return void
     */
    void visitor(FileRead fileRead);
    /**
     * 写文件
     *
     * @author 阿导
     * @time 2018/4/3
     * @CopyRight 万物皆导
     * @param fileWrite
     * @return void
     */
    void visitor(FileWrite fileWrite);
    /**
     * 执行文件
     *
     * @author 阿导
     * @time 2018/4/3
     * @CopyRight 万物皆导
     * @param fileExecute
     * @return void
     */
    void visitor(FileExecute fileExecute);
}
