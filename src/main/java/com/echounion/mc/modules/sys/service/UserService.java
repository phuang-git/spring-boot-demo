package com.echounion.mc.modules.sys.service;

import com.echounion.mc.common.orm.generic.BaseService;
import com.echounion.mc.modules.sys.entity.User;

/**
 * Created by phuang on 2016/1/18.
 */

public interface UserService extends BaseService<User,Long> {

    /**
     * 修改密码
     * @param userId
     * @param newPassword
     */
    void changePassword(Long userId, String newPassword);

    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
     User findByUsername(String username);

}
