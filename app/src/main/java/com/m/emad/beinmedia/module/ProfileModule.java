package com.m.emad.beinmedia.module;

import com.m.emad.beinmedia.scope.FragmentScoped;
import com.m.emad.beinmedia.view.profile.ProfileContract;
import com.m.emad.beinmedia.view.profile.presenter.ProfilePresenter;
import com.m.emad.beinmedia.view.profile.view.ProfileFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by M.Emad
 */
@Module
public abstract class ProfileModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract ProfileFragment profileFragment();


    @FragmentScoped
    @Binds
    abstract ProfileContract.Presenter profilePresenter(ProfilePresenter presenter);
}
