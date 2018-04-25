package com.m.emad.beinmedia.view.home;

import com.m.emad.beinmedia.base.BaseContract;
import com.m.emad.beinmedia.data.model.Category;

import java.util.List;

/**
 * Created by M.Emad
 */
public interface HomeContract {

    interface View extends BaseContract.BaseView{
        void navigateToHome();
        void showNetworkError();
        void showCategories(List<Category> categories);
        void showError(String errorMessage);
    }

    interface Presenter extends BaseContract.BasePresenter<HomeContract.View> {
        void initialize();
        void loadCategory();
    }
}
