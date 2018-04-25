package com.m.emad.beinmedia.view.home.presenter;

import com.m.emad.beinmedia.Manager.UserManager;
import com.m.emad.beinmedia.base.BasePresenter;
import com.m.emad.beinmedia.data.model.Category;
import com.m.emad.beinmedia.data.model.Synchronize;
import com.m.emad.beinmedia.error.ErrorModel;
import com.m.emad.beinmedia.usecase.HomeUseCase;
import com.m.emad.beinmedia.usecase.UseCaseObserver;
import com.m.emad.beinmedia.view.home.HomeContract;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by M.Emad
 */
public class HomePresenter extends BasePresenter<HomeContract.View> implements HomeContract.Presenter {

    final private HomeUseCase homeUseCase;

    @Inject
    HomePresenter(HomeUseCase homeUseCase, UserManager userManager) {
        this.homeUseCase = homeUseCase;
        //this.userManager = userManager;
    }


    @Override
    public void cancelAllRequests() {
        homeUseCase.clear();
    }

    @Override
    public void initialize() {
        loadCategory();
    }

    @Override
    public void loadCategory() {

        homeUseCase.execute(new UseCaseObserver<Synchronize>() {
            @Override
            public void onSuccess(Synchronize synchronize) {


                List<Category> categories = synchronize.getCategories();
                getView().showCategories(categories);
            }

            @Override
            public void OnFailed(ErrorModel errorModel) {

                getView().showError(errorModel.getErrorDes());
            }
        },null);
    }
}
