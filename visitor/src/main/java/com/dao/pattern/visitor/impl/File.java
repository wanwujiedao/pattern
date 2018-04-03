package com.dao.pattern.visitor.impl;

import com.dao.pattern.visitor.core.Visitor;
import com.dao.pattern.visitor.interfaces.FileOptoin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 文件
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.visitor.impl.File.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-03 08:46:00
 */
public class File implements FileOptoin {
    /**
     * 文件的操作集合
     */
    private List<FileOptoin> fileOptoins;

    //集合内容添加
    {
        fileOptoins=new ArrayList<>();
        fileOptoins.addAll(Arrays.asList(new FileOptoin[]{new FileRead(),new FileWrite(),new FileExecute()}));
    }

    /**
     * 文件操作
     *
     * @author 阿导
     * @time 2018/4/3
     * @CopyRight 万物皆导
     * @param visitor
     * @return void
     */
    @Override
    public void option(Visitor visitor) {
        fileOptoins.forEach(fileOptoin -> fileOptoin.option(visitor));
        visitor.visitor(this);
    }
}
