package com.m.emad.beinmedia.usecase;

import android.util.Log;

import com.m.emad.beinmedia.Manager.UserManager;
import com.m.emad.beinmedia.data.model.UserViewer;
import com.m.emad.beinmedia.data.repository.ProfileRepository;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

/**
 * Created by M.Emad on 4/25/2018.
 */
public class ProfileUseCase extends UseCase<UserViewer> {

    private final ProfileRepository profileRepository;
    UserManager userManager;

    @Inject
    public ProfileUseCase(@Named("executor_thread") Scheduler executorThread,
                       @Named("ui_thread") Scheduler uiThread, ProfileRepository profileRepository, UserManager userManager) {
        super(executorThread, uiThread);
        this.profileRepository = profileRepository;
        this.userManager = userManager;
    }

    @Override
    protected Observable<UserViewer> createObservableUseCase(Map<String, Object> map) {
        String ref_id = userManager.getCurrentSession().getRefId();
        Log.d("error", ref_id);
        Log.e("error", ref_id);
        Log.v("error", ref_id);
        Log.i("error", ref_id);
        Log.e("error", ref_id);
        System.out.println("error"+ ref_id);
        return profileRepository.getUserData(ref_id);
    }
}
