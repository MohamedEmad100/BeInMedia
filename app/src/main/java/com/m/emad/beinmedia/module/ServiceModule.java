package com.m.emad.beinmedia.module;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import io.reactivex.android.schedulers.AndroidSchedulers;

/**
 * Created by M.Emad
 */
@Module
public class ServiceModule {

    @Provides
    @Named("executor_thread")
    io.reactivex.Scheduler provideExecutorThread() {
        return io.reactivex.schedulers.Schedulers.io();
    }

    @Provides @Named("ui_thread")
    io.reactivex.Scheduler provideUiThread() {
        return AndroidSchedulers.mainThread();
    }

}
