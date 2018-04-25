package com.m.emad.beinmedia.data.model;

import com.m.emad.beinmedia.base.BaseModel;

import java.util.List;

/**
 * Created by M.Emad
 */

public class Category extends BaseModel {

    protected String categoryDesc;

    protected String categoryId;

    protected String categoryImage;

    protected String categoryItemsCount;

    protected String categoryName;

    protected String categorySort;

    protected List<Locale> descriptionsLocalized;

    protected List<Locale> categoryNameLocalized;

    public String getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(String str) {
        this.categoryId = str;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(String str) {
        this.categoryName = str;
    }

    public String getCategoryImage() {
        return this.categoryImage;
    }

    public void setCategoryImage(String str) {
        this.categoryImage = str;
    }

    public String getCategoryDesc() {
        return this.categoryDesc;
    }

    public void setCategoryDesc(String str) {
        this.categoryDesc = str;
    }

    public String getCategoryItemsCount() {
        return this.categoryItemsCount;
    }

    public void setCategoryItemsCount(String str) {
        this.categoryItemsCount = str;
    }

    public String getCategorySort() {
        return this.categorySort;
    }

    public void setCategorySort(String str) {
        this.categorySort = str;
    }

    public List<Locale> getNamesLocalized() {
        return this.categoryNameLocalized;
    }

    public Category setNamesLocalized(List<Locale> list) {
        this.categoryNameLocalized = list;
        return this;
    }

    public List<Locale> getDescriptionsLocalized() {
        return this.descriptionsLocalized;
    }

    public Category setDescriptionsLocalized(List<Locale> list) {
        this.descriptionsLocalized = list;
        return this;
    }

    public void init(Category category) {
        this.categoryId = category.getCategoryId();
        this.categoryName = category.getCategoryName();
        this.categoryImage = category.getCategoryImage();
        this.categoryDesc = category.getCategoryDesc();
        this.categoryItemsCount = category.getCategoryItemsCount();
        this.categorySort = category.getCategorySort();
        this.categoryNameLocalized = category.getNamesLocalized();
        this.descriptionsLocalized = category.getDescriptionsLocalized();
    }
}
