package com.m.emad.beinmedia.base;

import com.j256.ormlite.field.DatabaseField;

import java.io.Serializable;

/**
 * Created by M.Emad
 */
public class BaseModel implements Serializable {
    @DatabaseField(columnName = "idd" ,unique = true ,id = true)
    protected String IDD;

    public void setIDD(String ID) { this.IDD = ID; }

    public String getIDD() { return IDD; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o ==null ||!(o instanceof BaseModel)) return false;
        BaseModel baseModel = (BaseModel) o;
        return IDD.equals(baseModel.getIDD());
    }

    @Override
    public int hashCode() {
        return IDD.hashCode();
    }
}
