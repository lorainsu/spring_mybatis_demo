package com.lorain.mybatis_demo.service.impl;

import com.lorain.mybatis_demo.dao.mapper.UserMapper;
import com.lorain.mybatis_demo.dao.model.User;
import com.lorain.mybatis_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByName(String name) {
        return userMapper.selectUserByName(name);
    }

    @Override
    @Transactional
    public int create(User user) {
        if (user == null || user.getUsername() == null || user.getPassword() == null)
            return -1;
        return userMapper.insert(user);
    }

}

