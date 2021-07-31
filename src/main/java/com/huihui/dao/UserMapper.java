package com.huihui.dao;

import com.huihui.domain.User;

import java.io.IOException;
import java.util.List;

/**
 * @author zhazhahui
 * @create 2021-07-29 9:40
 */
public interface UserMapper {
    public List<User> findAll() throws IOException;

    public User findById(int id);

    int age();
}
