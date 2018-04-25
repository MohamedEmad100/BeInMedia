package com.m.emad.beinmedia.module;

import com.m.emad.beinmedia.scope.FragmentScoped;
import com.m.emad.beinmedia.view.login.LoginContract;
import com.m.emad.beinmedia.view.login.presenter.LoginPresenter;
import com.m.emad.beinmedia.view.login.view.LoginFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by M.Emad
 */
@Module
public abstract class LoginModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract LoginFragment loginFragment();


    @FragmentScoped
    @Binds
    abstract LoginContract.Presenter loginPresenter(LoginPresenter presenter);

}