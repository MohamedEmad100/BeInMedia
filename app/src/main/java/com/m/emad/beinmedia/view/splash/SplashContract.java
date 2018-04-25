package com.m.emad.beinmedia.view.splash;

import com.m.emad.beinmedia.base.BaseContract;

/**
 * Created by M.Emad
 */
public interface SplashContract {


    interface View extends BaseContract.BaseView{
        void NavigateToHome(String ss);
        void NavigateToLogin();
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void isUserLogin();

    }

}
