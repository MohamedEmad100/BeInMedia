package com.m.emad.beinmedia;

import com.m.emad.beinmedia.Manager.DataBaseManager;
import com.m.emad.beinmedia.component.AppComponent;
import com.m.emad.beinmedia.component.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by M.Emad
 */
public class BeInMediaApp extends DaggerApplication {

    private static BeInMediaApp instance;



    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        DataBaseManager.init(this , "BeInMediaDB" , 1);

    }

    public static BeInMediaApp get(){
        return instance;
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        AppComponent appComponent = DaggerAppComponent.builder().application(this).build();
        appComponent.inject(this);
        return appComponent;
    }

    }


