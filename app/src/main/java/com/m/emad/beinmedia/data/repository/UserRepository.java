package com.m.emad.beinmedia.data.repository;


import com.m.emad.beinmedia.Manager.RequestManager;
import com.m.emad.beinmedia.base.Repository;
import com.m.emad.beinmedia.data.model.Session;
import com.m.emad.beinmedia.data.model.User;
import com.m.emad.beinmedia.data.source.network.API;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by M.Emad
 */
public class UserRepository extends Repository {

    @Inject
    public UserRepository(RequestManager requestManager) {
        this.mRequestManager = requestManager;
    }

    public Observable<Session> login(User user) {
        return mRequestManager.startRequest(API.class).login(user.getEmail(), user.getPassword() ,user.getDeviceToken());
    }

}
