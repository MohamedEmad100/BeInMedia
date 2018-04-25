package com.m.emad.beinmedia.module;

import com.m.emad.beinmedia.scope.ActivityScoped;
import com.m.emad.beinmedia.view.home.view.HomeActivity;
import com.m.emad.beinmedia.view.login.view.LoginActivity;
import com.m.emad.beinmedia.view.splash.view.SplashActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by M.Emad
 */
@Module
public abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = {LoginModule.class})
    abstract LoginActivity loginActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = SplashModule.class)
    abstract SplashActivity splashActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = {HomeModule.class ,ProfileModule.class} )
    abstract HomeActivity homeActivity();

}
