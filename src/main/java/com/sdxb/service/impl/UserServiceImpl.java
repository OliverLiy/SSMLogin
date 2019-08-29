package com.sdxb.service.impl;

import com.sdxb.dao.UserDao;
import com.sdxb.pojo.User;
import com.sdxb.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
// @Service用于业务层 功能等同于@component
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User get(User user) {
        // 通过Mapper的select方法查询用户
        return userDao.select(user);
    }
}
