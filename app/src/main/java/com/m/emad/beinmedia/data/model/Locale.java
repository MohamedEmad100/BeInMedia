package com.m.emad.beinmedia.data.model;

import com.m.emad.beinmedia.base.BaseModel;

/**
 * Created by M.Emad
 */
public class Locale extends BaseModel {

    protected String content;

    protected String locale;

    public String getLocale() {
        return this.locale;
    }

    public void setLocale(String str) {
        this.locale = str;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Locale{locale='");
        stringBuilder.append(this.locale);
        stringBuilder.append('\'');
        stringBuilder.append(", content='");
        stringBuilder.append(this.content);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
