package com.m.emad.beinmedia.data.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.m.emad.beinmedia.base.BaseModel;

import java.util.List;

/**
 * Created by M.Emad
 */
@DatabaseTable(tableName = "SESSION")
public class Session extends BaseModel {
    @DatabaseField(columnName = "USER_ID")
    int id;
    @DatabaseField(columnName = "NAME")
    String name;
    @DatabaseField(columnName = "EMAIL")
    String email;
    @DatabaseField(columnName = "PHONE")
    String phone;
    @DatabaseField(columnName = "IMAGE")
    String image;
    @DatabaseField(columnName = "THEME_COLOR")
    String themeColor;
    @DatabaseField(columnName = "THEME_ACCENT_COLOR")
    String themeAccentColor;
    @DatabaseField(columnName = "REF_ID")
    String refId;
    @DatabaseField(columnName = "RESTAURANT")
    String restaurantName;
    @DatabaseField(columnName = "CURRENCY")
    String currency;
    @DatabaseField(columnName = "CURRENCY_FORMAT")
    String currencyFormat;

    int error;
    String message;
    List<String> locales;

    public List<String> getLocales() {
        return locales;
    }

    public void setLocales(List<String> locales) {
        this.locales = locales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}