package com.chasquionline.ugel.login.presenter;

import com.chasquionline.ugel.login.interactor.LoginInteractor;
import com.chasquionline.ugel.login.interactor.LoginInteractorImpl;
import com.chasquionline.ugel.login.view.LoginView;

public class LoginPresenterImpl implements LoginPresenter {

    private LoginView loginView;
    private LoginInteractor interactor;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        interactor = new LoginInteractorImpl(this);
    }
}
