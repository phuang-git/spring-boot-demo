package com.echounion.mc.modules.sys.dao;

import com.echounion.mc.common.orm.generic.BaseDao;
import com.echounion.mc.modules.sys.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseDao<User,Long> {
    int insert(User record);
    int updateByPrimaryKey(User record);

    /**
     * 根据用户名查找用户
     * @param user
     * @return
     */
    User findByUsername(@Param("user") User user);
}