package com.dao.pattern.dataaccessobject.dao;

import com.dao.pattern.dataaccessobject.vo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据访问层实现
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.dataaccessobject.dao.UserDaoImpl.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-04 16:42:00
 */
public class UserDaoImpl  implements UserDao {

    private List<User> users;

    {
        users=new ArrayList<>();
    }

    /**
     * 保存用户信息
     *
     * @author 阿导
     * @time 2018/4/4
     * @CopyRight 万物皆导
     * @param user
     * @return void
     */
    @Override
    public void saveUser(User user) {
        users.add(user);
    }

    /**
     * 查询用户信息
     *
     * @param name
     * @return com.dao.pattern.dataaccessobject.vo.User
     * @author 阿导
     * @time 2018/4/4
     * @CopyRight 万物皆导
     */
    @Override
    public List<User> findUser(String name) {
        List<User> rs=new ArrayList<>();
        users.stream().filter(user -> user.getName().contains(name)).forEach(user -> rs.add(user));
        return rs;
    }


}
