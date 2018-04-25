package com.m.emad.beinmedia.data.source.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.m.emad.beinmedia.data.model.Session;
import com.m.emad.beinmedia.data.model.User;

import java.sql.SQLException;

/**
 * Created by M.Emad
 */
public class DataBaseHelper extends OrmLiteSqliteOpenHelper {

    private static DataBaseHelper mDataBaseHelper;
    private Context mContext;

    public static DataBaseHelper getInstance(Context context, String dataBaseName, int version) {
        if (mDataBaseHelper == null) {
            mDataBaseHelper = new DataBaseHelper(context, dataBaseName, null, version);
        }
        return mDataBaseHelper;
    }

    private DataBaseHelper(Context context, String databaseName, SQLiteDatabase.CursorFactory factory, int databaseVersion) {
        super(context, databaseName, factory, databaseVersion);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {

            TableUtils.createTable(connectionSource, User.class);
            TableUtils.createTable(connectionSource, Session.class);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

    }
}