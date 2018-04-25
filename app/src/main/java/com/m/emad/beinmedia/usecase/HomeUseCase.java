package com.m.emad.beinmedia.usecase;

import com.m.emad.beinmedia.Manager.UserManager;
import com.m.emad.beinmedia.data.model.Synchronize;
import com.m.emad.beinmedia.data.repository.HomeRepository;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

/**
 * Created by M.Emad
 */
public class HomeUseCase  extends UseCase<Synchronize> {

    private final HomeRepository homeRepository;
    UserManager userManager;

    @Inject
    public HomeUseCase(@Named("executor_thread") Scheduler executorThread,
                        @Named("ui_thread") Scheduler uiThread, HomeRepository homeRepository, UserManager userManager) {
        super(executorThread, uiThread);
        this.homeRepository = homeRepository;
        this.userManager = userManager;
    }

    @Override
    protected Observable<Synchronize> createObservableUseCase(Map<String, Object> map) {
        int ref_id = userManager.getCurrentSession().getId();
//        Log.d("error ",ref_id);
//        Log.e("error ",ref_id);
//        Log.i("error ",ref_id);
//        Log.v("error ",ref_id);
//        System.out.println("error "+ref_id);
        return homeRepository.getSynchronize(ref_id);
    }
}
