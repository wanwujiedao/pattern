package com.dao.pattern.template.mapper;

import com.dao.pattern.template.core.AbstractDabaseSource;
import com.dao.pattern.template.vo.DataBase;
import com.dao.pattern.template.vo.UserDataBase;

/**
 * 用户库数据访问层
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.template.mapper.UserDao.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-02 20:30:00
 */
public class UserDao extends AbstractDabaseSource{

    /**
     * 模拟数据源注入
     *
     * @author 阿导
     * @time 2018/4/2
     * @CopyRight 万物皆导
     * @param
     * @return void
     */
    @Override
    protected void setDataBase() {
        this.dataBase=new UserDataBase();
    }
}
