package com.lorain.mybatis_demo.dao.mapper;

import com.lorain.mybatis_demo.dao.model.User;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
    User selectUserByName(@Param("name") String name);
}

