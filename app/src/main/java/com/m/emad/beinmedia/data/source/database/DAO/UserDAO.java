package com.m.emad.beinmedia.data.source.database.DAO;

import com.m.emad.beinmedia.base.BaseDAO;
import com.m.emad.beinmedia.data.model.User;

import javax.inject.Inject;

/**
 * Created by M.Emad
 */

public class UserDAO extends BaseDAO<User> {

    @Inject
    public UserDAO() { super(User.class); }
}
