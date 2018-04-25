package com.m.emad.beinmedia.module;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Created by M.Emad
 */
@Module
public abstract class ApplicationModule {

    @Binds
    abstract Context bindContext(Application application);
}
