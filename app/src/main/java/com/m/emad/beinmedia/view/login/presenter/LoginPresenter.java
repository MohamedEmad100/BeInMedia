package com.m.emad.beinmedia.view.login.presenter;

import com.m.emad.beinmedia.Manager.UserManager;
import com.m.emad.beinmedia.base.BasePresenter;
import com.m.emad.beinmedia.constants.NetworkConstants;
import com.m.emad.beinmedia.data.model.Session;
import com.m.emad.beinmedia.data.model.User;
import com.m.emad.beinmedia.error.ErrorModel;
import com.m.emad.beinmedia.usecase.LoginUseCase;
import com.m.emad.beinmedia.usecase.UseCaseObserver;
import com.m.emad.beinmedia.view.login.LoginContract;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

/**
 * Created by M.Emad
 */
public class LoginPresenter extends BasePresenter<LoginContract.View> implements LoginContract.Presenter {

    private final LoginUseCase loginUseCase;
    private final UserManager userManager;

    @Inject
    LoginPresenter(LoginUseCase signInUseCase, UserManager userManager) {
        this.loginUseCase = signInUseCase;
        this.userManager = userManager;
    }

    @Override
    public void login(String email, String password) {
        //getView().showLoading();
        Map<String, Object> map = new HashMap<>();
        final User mUser= new User(email.trim().toLowerCase(),"token_id",password.trim());
        map.put(NetworkConstants.USER, mUser);

        loginUseCase.execute(new UseCaseObserver<Session>() {
            @Override
            public void onSuccess(Session session) {
                if(session.getError() == 1){
                    getView().showLoginError();
                }else {
                    userManager.saveCurrentSession(session);
                    userManager.saveCurrentUser(mUser);
                    if (isViewAttached()) {
                        getView().showContent();
                        getView().navigateToHome();
                    }
                }
            }

            @Override
            public void OnFailed(ErrorModel errorModel) {
                if (isViewAttached()) {
                    getView().showContent();
                    if (errorModel.getErrorType() == ErrorModel.ErrorType.NETWORK_ERROR) {
                        getView().showNetworkError();
                    } else {
                        getView().showLoginError();
                    }
                }
            }
        }, map);
    }

    @Override
    public void cancelAllRequests() {
        loginUseCase.clear();
    }
}
