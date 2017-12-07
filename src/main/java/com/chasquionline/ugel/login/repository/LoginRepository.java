package com.chasquionline.ugel.login.repository;

import com.chasquionline.ugel.bean.User;

public interface LoginRepository {
    void signIn(User user);
}
