package com.dao.pattern.transferobject.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 业务对象
 *
 * @author 阿导
 * @version 1.0
 * @fileName com.dao.pattern.transferobject.core.UserBo.java
 * @CopyRright (c) 2018-万物皆导
 * @created 2018-04-07 13:51:00
 */
public class UserBo {
    /**
     * 模拟数据库
     */
    private HashMap<Long,UserVo> users;

    {
        users=new HashMap<>();
        users.put(1L,new UserVo(1L,"小明",18));
        users.put(2L,new UserVo(2L,"小花",20));
        users.put(3L,new UserVo(3L,"阿导",22));
    }

    /**
     * 新增用户
     *
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     * @param userVo
     * @return void
     */
    public void insert(UserVo userVo){
        final Long[] id = {0L};
        users.forEach((k,v)->{
            if(k.intValue()> id[0].intValue()){
                id[0] =k;
            }
        });
       userVo.setId(id[0]+1L);
       users.put(userVo.getId(),userVo);
    }


    /**
     * 查询所有的用户
     * @author 阿导
     * @time 2018/4/7
     * @CopyRight 万物皆导
     * @param
     * @return java.util.List<com.dao.pattern.transferobject.core.UserVo>
     */
    public List<UserVo> findAllUsers(){
        List<UserVo> userVos=new ArrayList<>();
        users.forEach((k,v)->userVos.add(v));
        return userVos;
    }
}
