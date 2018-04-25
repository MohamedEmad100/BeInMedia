package com.m.emad.beinmedia.data.repository;

import com.m.emad.beinmedia.Manager.RequestManager;
import com.m.emad.beinmedia.base.Repository;
import com.m.emad.beinmedia.data.model.UserViewer;
import com.m.emad.beinmedia.data.source.network.API;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by M.Emad
 */
public class ProfileRepository extends Repository {


    @Inject
    public ProfileRepository(RequestManager requestManager) {
        this.mRequestManager = requestManager;
    }

    public Observable<UserViewer> getUserData(String ref_id) {
        return mRequestManager.startRequest(API.class).getUserData(ref_id);
    }
}
