package com.dao.pattern.dataaccessobject.dao;

import com.dao.pattern.dataaccessobject.vo.User;

import java.util.List;

/**
 * 用户数据访问层
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.dataaccessobject.dao.UserDao.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-04 16:27:00
 */
public interface UserDao {

    void saveUser(User user);

    /**
     * 查询用户信息
     *
     * @author 阿导
     * @time 2018/4/4
     * @CopyRight 万物皆导
     * @param
     * @return com.dao.pattern.dataaccessobject.vo.User
     */
    List<User> findUser(String name);
}
