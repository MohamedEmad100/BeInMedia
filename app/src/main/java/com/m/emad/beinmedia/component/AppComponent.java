package com.m.emad.beinmedia.component;

import android.app.Application;

import com.m.emad.beinmedia.BeInMediaApp;
import com.m.emad.beinmedia.module.ActivityBindingModule;
import com.m.emad.beinmedia.module.ApplicationModule;
import com.m.emad.beinmedia.module.ServiceModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by M.Emad
 */
@Singleton
@Component(modules = {ApplicationModule.class, ServiceModule.class, ActivityBindingModule.class,
        AndroidSupportInjectionModule.class})
public interface AppComponent extends AndroidInjector<DaggerApplication> {

    void inject(BeInMediaApp application);


    @Override
    void inject(DaggerApplication instance);

    // Gives us syntactic sugar. we can then do DaggerAppComponent.builder().application(this).build().inject(this);
    // never having to instantiate any modules or say which module we are passing the application to.
    // Application will just be provided into our app graph now.
    @Component.Builder
    interface Builder {

        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }
}