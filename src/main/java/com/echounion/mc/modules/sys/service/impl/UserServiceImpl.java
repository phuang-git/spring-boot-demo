package com.echounion.mc.modules.sys.service.impl;

import com.echounion.mc.common.orm.generic.BaseDao;
import com.echounion.mc.common.orm.generic.BaseServiceImpl;
import com.echounion.mc.modules.sys.dao.UserMapper;
import com.echounion.mc.modules.sys.entity.User;
import com.echounion.mc.modules.sys.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by phuang on 2016/1/18.
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User,Long> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public BaseDao<User, Long> getDao() {
        return userMapper;
    }

    @Override
    public void changePassword(Long userId, String newPassword) {

    }

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(new User(username));
    }
}
