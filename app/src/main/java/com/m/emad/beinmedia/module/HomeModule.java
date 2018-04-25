package com.m.emad.beinmedia.module;

import com.m.emad.beinmedia.scope.FragmentScoped;
import com.m.emad.beinmedia.view.home.HomeContract;
import com.m.emad.beinmedia.view.home.presenter.HomePresenter;
import com.m.emad.beinmedia.view.home.view.HomeFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by M.Emad
 */
@Module
public abstract class HomeModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract HomeFragment homeFragment();


    @FragmentScoped
    @Binds
    abstract HomeContract.Presenter homePresenter(HomePresenter presenter);

}
