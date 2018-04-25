package com.m.emad.beinmedia.data.source.database.DAO;

import com.m.emad.beinmedia.base.BaseDAO;
import com.m.emad.beinmedia.data.model.Session;

import javax.inject.Inject;

/**
 * Created by M.Emad
 */
public class SessionDAO extends BaseDAO<Session> {

    @Inject
    public SessionDAO() { super(Session.class); }
}
