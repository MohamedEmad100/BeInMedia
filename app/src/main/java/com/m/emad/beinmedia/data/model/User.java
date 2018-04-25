package com.m.emad.beinmedia.data.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.m.emad.beinmedia.base.BaseModel;

/**
 * Created by M.Emad
 */
@DatabaseTable(tableName = "USER")
public class User extends BaseModel {

    @DatabaseField(columnName = "EMAIL")
    private String email;

    @DatabaseField(columnName = "PASS")
    private String password;

    @DatabaseField(columnName = "DEVICETOKEN")
    private String deviceToken;

    public User() {
    }

    public User(String email, String deviceToken, String password) {
        this.email = email;
        this.deviceToken = deviceToken;
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeviceToken() { return deviceToken; }

    public void setDeviceToken(String deviceToken) { this.deviceToken = deviceToken; }
}