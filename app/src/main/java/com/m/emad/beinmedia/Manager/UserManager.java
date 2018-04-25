package com.m.emad.beinmedia.Manager;

import com.m.emad.beinmedia.data.model.Session;
import com.m.emad.beinmedia.data.model.User;
import com.m.emad.beinmedia.data.repository.SessionRepository;

import java.sql.SQLException;

import javax.inject.Inject;

/**
 * Created by M.Emad
 */
public class UserManager {

    private User mUser;
    private Session mSession;
    private final SessionRepository sessionRepository;

    @Inject
    public UserManager(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    public User getCurrentUser(){
        if(mUser == null){
            try {
                mUser = sessionRepository.getLoggedUser();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return mUser;
    }

    public Session getCurrentSession(){
        if (mSession==null){
            try {
                mSession = sessionRepository.getLoggedSession();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

        return mSession;
    }

    public void saveCurrentUser(User user){
        mUser = user;
        try {
            sessionRepository.saveLoggedUser(user);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void saveCurrentSession(Session session){
        mSession = session;
        try {
            sessionRepository.saveLoggedSession(session);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void clearUserSession(){
        try {
            sessionRepository.clearUser();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
