package com.m.emad.beinmedia.view.profile.presenter;

import com.m.emad.beinmedia.base.BasePresenter;
import com.m.emad.beinmedia.data.model.UserViewer;
import com.m.emad.beinmedia.error.ErrorModel;
import com.m.emad.beinmedia.usecase.ProfileUseCase;
import com.m.emad.beinmedia.usecase.UseCaseObserver;
import com.m.emad.beinmedia.view.profile.ProfileContract;

import javax.inject.Inject;

/**
 * Created by M.Emad
 */
public class ProfilePresenter extends BasePresenter<ProfileContract.View> implements ProfileContract.Presenter {

    final private ProfileUseCase profileUseCase;

    @Inject
    public ProfilePresenter(ProfileUseCase profileUseCase) {
        this.profileUseCase = profileUseCase;
    }

    @Override
    public void initialize() {
        loadUserData();
    }

    @Override
    public void loadUserData() {

        profileUseCase.execute(new UseCaseObserver<UserViewer>() {
            @Override
            public void onSuccess(UserViewer userViewer) {

                getView().showProfile(userViewer);

            }
            @Override
            public void OnFailed(ErrorModel errorModel) {

                getView().showError(errorModel.getErrorDes());
            }
        },null);
    }


    @Override
    public void cancelAllRequests() { profileUseCase.clear();}
}
