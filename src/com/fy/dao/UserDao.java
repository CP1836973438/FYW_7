package com.fy.dao;

import com.fy.model.User;

public interface UserDao {

    public User getUser(String username, String password);

}
