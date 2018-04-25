package com.m.emad.beinmedia.data.repository;

import com.m.emad.beinmedia.Manager.RequestManager;
import com.m.emad.beinmedia.base.Repository;
import com.m.emad.beinmedia.data.model.Synchronize;
import com.m.emad.beinmedia.data.source.network.API;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by
 */
public class HomeRepository extends Repository {

    @Inject
    public HomeRepository(RequestManager requestManager) {
        this.mRequestManager = requestManager;
    }

    public Observable<Synchronize> getSynchronize(int ref_id) {
        return mRequestManager.startRequest(API.class).getSynchronize(ref_id);
    }

}