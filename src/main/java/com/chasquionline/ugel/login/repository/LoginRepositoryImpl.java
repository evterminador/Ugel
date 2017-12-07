package com.chasquionline.ugel.login.repository;

import com.chasquionline.ugel.bean.User;
import com.chasquionline.ugel.login.presenter.LoginPresenter;

public class LoginRepositoryImpl implements LoginRepository {

    private LoginPresenter presenter;

    public LoginRepositoryImpl(LoginPresenter presenter) {
        presenter = presenter;
    }

    public void signIn(User user) {

    }
}
