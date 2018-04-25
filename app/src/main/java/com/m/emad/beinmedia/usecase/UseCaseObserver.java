package com.m.emad.beinmedia.usecase;


import com.m.emad.beinmedia.error.ErrorHandler;
import com.m.emad.beinmedia.error.ErrorModel;

import io.reactivex.observers.DisposableObserver;

/**
 * Craeted by M.Emad
 */
public abstract class UseCaseObserver<T> extends DisposableObserver<T> {


    @Override
    public void onError(Throwable e) {
        OnFailed(ErrorHandler.getErrorModel(e));
    }

    @Override
    public void onNext(T t) {
        onSuccess(t);
    }

    public abstract void onSuccess(T t);
    public abstract void OnFailed(ErrorModel errorModel);

    @Override
    public void onComplete() {

    }
}
