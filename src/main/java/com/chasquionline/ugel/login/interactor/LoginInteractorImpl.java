package com.chasquionline.ugel.login.interactor;

import com.chasquionline.ugel.login.presenter.LoginPresenter;
import com.chasquionline.ugel.login.repository.LoginRepository;
import com.chasquionline.ugel.login.repository.LoginRepositoryImpl;

public class LoginInteractorImpl implements LoginInteractor {

    private LoginPresenter presenter;
    private LoginRepository repository;

    public LoginInteractorImpl(LoginPresenter presenter) {
        this.presenter = presenter;
        repository = new LoginRepositoryImpl(presenter);
    }
}
