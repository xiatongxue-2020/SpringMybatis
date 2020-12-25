package com.zzc.dao;

import com.zzc.entity.User;

import java.util.List;

/**
 * @Auther James_Gosling
 * @Date 2020/12/16
 */
public interface UserDao {
    List<User> findAll();
}
