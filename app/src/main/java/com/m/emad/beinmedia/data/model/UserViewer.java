package com.m.emad.beinmedia.data.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.m.emad.beinmedia.base.BaseModel;

import java.util.List;

/**
 * Created by M.Emad
 *
 */
@DatabaseTable(tableName = "USERVIEWER")
public class UserViewer extends BaseModel {
    @DatabaseField(columnName = "USER_ID")
    private String id;
    @DatabaseField(columnName = "USER_NAME")
    private String name;
    @DatabaseField(columnName = "USER_EMAIL")
    private String email;

    @DatabaseField(columnName = "USER_IMAGE")
    private String image;
    @DatabaseField(columnName = "USER_THEMECOLOR")
    private String themeColor;
    @DatabaseField(columnName = "USER_COLOR")
    private String themeAccentColor;
    @DatabaseField(columnName = "USER_REFID")
    private String refId;
    @DatabaseField(columnName = "RESTAURANT_NAME")
    private String restaurantName;
    @DatabaseField(columnName = "USER_CURRENCY")
    private String currency;
    @DatabaseField(columnName = "USER_CURRENCYFORMAT")
    private String currencyFormat;
    @DatabaseField(columnName = "USER_PHONE")

    private String phone;
    private List<String> locales;
    private String message;
    private int error;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getThemeColor() {
        return themeColor;
    }

    public void setThemeColor(String themeColor) {
        this.themeColor = themeColor;
    }

    public String getThemeAccentColor() {
        return themeAccentColor;
    }

    public void setThemeAccentColor(String themeAccentColor) {
        this.themeAccentColor = themeAccentColor;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrencyFormat() {
        return currencyFormat;
    }

    public void setCurrencyFormat(String currencyFormat) {
        this.currencyFormat = currencyFormat;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getLocales() {
        return locales;
    }

    public void setLocales(List<String> locales) {
        this.locales = locales;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String emai) {
        this.email = emai;
    }
}

