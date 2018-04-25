package com.m.emad.beinmedia.usecase;

import com.m.emad.beinmedia.Manager.UserManager;
import com.m.emad.beinmedia.constants.NetworkConstants;
import com.m.emad.beinmedia.data.model.Session;
import com.m.emad.beinmedia.data.model.User;
import com.m.emad.beinmedia.data.repository.UserRepository;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

/**
 * Created by M.Emad
 */
public class LoginUseCase extends UseCase<Session> {

    private final UserRepository userRepository;
    @Inject
    public LoginUseCase(@Named("executor_thread") Scheduler executorThread,
                         @Named("ui_thread") Scheduler uiThread, UserRepository userRepository , UserManager userManager) {
        super(executorThread, uiThread);
        this.userRepository = userRepository;
    }

    @Override
    protected Observable<Session> createObservableUseCase(Map<String, Object> map) {
        return userRepository.login((User) map.get(NetworkConstants.USER));
    }
}
