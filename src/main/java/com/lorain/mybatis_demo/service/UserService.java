package com.lorain.mybatis_demo.service;

import com.lorain.mybatis_demo.dao.model.User;

public interface UserService {
    User getUserByName(String name);

    int create(User user);
}

