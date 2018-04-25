package com.m.emad.beinmedia.view.splash.presenter;

import com.m.emad.beinmedia.Manager.UserManager;
import com.m.emad.beinmedia.base.BasePresenter;
import com.m.emad.beinmedia.view.splash.SplashContract;

import javax.inject.Inject;

/**
 * Created by M.Emad
 */
public class SplashPresenter extends BasePresenter<SplashContract.View> implements SplashContract.Presenter{

    private final UserManager userManager;

    @Inject
    public SplashPresenter(UserManager userManager) {
        this.userManager = userManager;
    }



    @Override
    public void cancelAllRequests() { }

    @Override
    public void isUserLogin() {
        if(isViewAttached()){
            if(userManager.getCurrentUser() != null && userManager.getCurrentSession() != null){
                getView().NavigateToHome(userManager.getCurrentSession().getName());
            }else {
                getView().NavigateToLogin();
            }
        }
    }
}
