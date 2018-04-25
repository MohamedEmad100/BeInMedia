package com.m.emad.beinmedia.data.source.database.DAO;

import com.m.emad.beinmedia.base.BaseDAO;
import com.m.emad.beinmedia.data.model.Category;

import javax.inject.Inject;

/**
 * Created by M.Emad
 * /
 **/
public class CategoryDAO extends BaseDAO<Category> {

    @Inject
    public CategoryDAO() { super(Category.class); }
}
