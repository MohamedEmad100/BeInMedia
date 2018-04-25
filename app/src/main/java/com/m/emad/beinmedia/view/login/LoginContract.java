package com.m.emad.beinmedia.view.login;

import com.m.emad.beinmedia.base.BaseContract;

/**
 * Created by M.Emad
 */
public interface LoginContract {

    interface View extends BaseContract.BaseView{
        void navigateToHome();
        void showNetworkError();
        void showLoginError();
        void showLoading();
        void showContent();
    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void login(String email , String password);
    }
}
