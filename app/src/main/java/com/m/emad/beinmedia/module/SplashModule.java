package com.m.emad.beinmedia.module;

import com.m.emad.beinmedia.scope.ActivityScoped;
import com.m.emad.beinmedia.view.splash.SplashContract;
import com.m.emad.beinmedia.view.splash.presenter.SplashPresenter;

import dagger.Binds;
import dagger.Module;

/**
 * Created by M.Emad
 */
@Module
public abstract class SplashModule {

    @ActivityScoped
    @Binds
    abstract SplashContract.Presenter splashPresenter(SplashPresenter presenter);

}
