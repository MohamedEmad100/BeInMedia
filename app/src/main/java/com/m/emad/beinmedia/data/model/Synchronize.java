package com.m.emad.beinmedia.data.model;

import java.util.List;

/**
 * Created by M.Emad
 */
public class Synchronize extends Session {


    protected List<Category> categories;

    protected int categoriesError;
    protected String categoriesMessage;
    protected List<Item> items ;
    protected int itemsError;
    protected String itemsMessage;


    public List<Category> getCategories() {
        return this.categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Integer getCategoriesError() {
        return this.categoriesError;
    }

    public void setCategoriesError(int categoriesError) {
        this.categoriesError = categoriesError;
    }

    public String getCategoriesMessage() {
        return this.categoriesMessage;
    }

    public void setCategoriesMessage(String categoriesMessage) {
        this.categoriesMessage = categoriesMessage;
    }

    public List<Item> getItems() {
        return this.items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Integer getItemsError() {
        return this.itemsError;
    }

    public void setItemsError(int itemsError) {
        this.itemsError = itemsError;
    }

    public String getItemsMessage() {
        return this.itemsMessage;
    }

    public void setItemsMessage(String itemsMessage) {
        this.itemsMessage = itemsMessage;
    }

}
