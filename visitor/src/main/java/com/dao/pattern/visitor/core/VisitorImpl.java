package com.dao.pattern.visitor.core;

import com.dao.pattern.visitor.impl.File;
import com.dao.pattern.visitor.impl.FileExecute;
import com.dao.pattern.visitor.impl.FileRead;
import com.dao.pattern.visitor.impl.FileWrite;

/**
 * 访问者实现
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.visitor.core.VisitorImpl.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-03 09:03:00
 */
public class VisitorImpl implements Visitor {

    /**
     * 文件
     *
     * @param file
     * @return void
     * @author 阿导
     * @time 2018/4/3
     * @CopyRight 万物皆导
     */
    @Override
    public void visitor(File file) {
        System.out.println("结束文件操作。。。。");
    }

    /**
     * 读文件
     *
     * @param fileRead
     * @return void
     * @author 阿导
     * @time 2018/4/3
     * @CopyRight 万物皆导
     */
    @Override
    public void visitor(FileRead fileRead) {
        System.out.println("正在读取文件。。。。");
    }

    /**
     * 写文件
     *
     * @param fileWrite
     * @return void
     * @author 阿导
     * @time 2018/4/3
     * @CopyRight 万物皆导
     */
    @Override
    public void visitor(FileWrite fileWrite) {
        System.out.println("正在写入文件。。。。");
    }

    /**
     * 执行文件
     *
     * @param fileExecute
     * @return void
     * @author 阿导
     * @time 2018/4/3
     * @CopyRight 万物皆导
     */
    @Override
    public void visitor(FileExecute fileExecute) {
        System.out.println("正在执行文件。。。。");
    }
}
