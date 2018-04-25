package com.m.emad.beinmedia.data.repository;

import com.m.emad.beinmedia.data.model.Session;
import com.m.emad.beinmedia.data.model.User;
import com.m.emad.beinmedia.data.source.database.DAO.SessionDAO;
import com.m.emad.beinmedia.data.source.database.DAO.UserDAO;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by M.Emad
 */
public class SessionRepository {
    UserDAO userDAO;
    SessionDAO sessionDAO;

    @Inject
    public SessionRepository(UserDAO userDAO, SessionDAO sessionDAO) {
        this.userDAO = userDAO;
        this.sessionDAO = sessionDAO;
    }

    public void saveLoggedUser(User user) throws SQLException {
        userDAO.deleteAll();
        userDAO.create(user);
    }

    public void saveLoggedSession(Session session) throws SQLException{
        sessionDAO.deleteAll();
        sessionDAO.create(session);
    }

    public void clearUser () throws SQLException{
        userDAO.deleteAll();
        sessionDAO.deleteAll();
    }

    public User getLoggedUser() throws SQLException{
        List<User> list = userDAO.getAll();
        if (list != null && !list.isEmpty()){
            return list.get(0);
        }
        return null;
    }

    public Session getLoggedSession() throws SQLException{
        List<Session> list = sessionDAO.getAll();
        if(list !=null && !list.isEmpty()){
            return list.get(0);
        }
        return null;
    }
}
