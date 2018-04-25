package com.m.emad.beinmedia.Manager;

import android.content.Context;

import com.m.emad.beinmedia.data.source.database.DataBaseHelper;

/**
 * Created by M.Emad
 */
public class DataBaseManager {

    private static DataBaseManager dataBaseManager;
    private DataBaseHelper dataBaseHelper;

    private DataBaseManager(Context context , String DataBaseName , int version) {
        synchronized (this){
            dataBaseHelper = DataBaseHelper.getInstance(context,DataBaseName,version);
        }
    }

    public static void init (Context context , String DBname , int version){
        if(dataBaseManager == null){
            dataBaseManager = new DataBaseManager(context ,DBname , version);
        }
    }

    public static DataBaseManager getInstance(){
        if(dataBaseManager == null){
            throw new RuntimeException("You must init DB first");
        }
        return dataBaseManager;
    }


    public DataBaseHelper getDataBaseHelper() {
        return dataBaseHelper;
    }
}
