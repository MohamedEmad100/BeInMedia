package com.m.emad.beinmedia.data.source.network;


import com.m.emad.beinmedia.data.model.Session;
import com.m.emad.beinmedia.data.model.Synchronize;
import com.m.emad.beinmedia.data.model.UserViewer;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Craeted by M.Emad
 */
public interface API {

    @FormUrlEncoded
    @POST("users/login")
    Observable<Session> login(@Field("email") String email , @Field("password") String pass , @Field("deviceToken") String token);

    @FormUrlEncoded
    @POST("users/loginViewer")
    Observable<UserViewer> getUserData(@Field("refId") String refId);

    @FormUrlEncoded
    @POST("users/synchronize")
    Observable<Synchronize> getSynchronize(@Field("adminId") int adminId);
}
