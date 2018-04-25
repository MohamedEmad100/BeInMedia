package com.m.emad.beinmedia.view.profile;

import com.m.emad.beinmedia.base.BaseContract;
import com.m.emad.beinmedia.data.model.UserViewer;

/**
 * Created by M.Emad
 */
public interface ProfileContract {

    interface View extends BaseContract.BaseView{
        void showProfile(UserViewer userViewer);
        void showError(String errorMessage);

    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void initialize();
        void loadUserData();
    }
}
