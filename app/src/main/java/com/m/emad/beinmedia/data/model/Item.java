package com.m.emad.beinmedia.data.model;

import com.m.emad.beinmedia.base.BaseModel;

import java.util.List;

/**
 * Created by M.Emad
 */
public class Item extends BaseModel {

    protected List<Locale> descriptionsLocalized;

    protected String itemCategoryId;

    protected String itemDesc;

    protected String itemId;

    protected String itemImage;

    protected String itemName;

    protected String itemPrice;

    protected String itemSort;

    protected List<Locale> namesLocalized;

    protected String visible;

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String str) {
        this.itemId = str;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String str) {
        this.itemName = str;
    }

    public String getItemDesc() {
        return this.itemDesc;
    }

    public void setItemDesc(String str) {
        this.itemDesc = str;
    }

    public String getItemPrice() {
        return this.itemPrice;
    }

    public void setItemPrice(String str) {
        this.itemPrice = str;
    }

    public String getItemImage() {
        return this.itemImage;
    }

    public void setItemImage(String str) {
        this.itemImage = str;
    }

    public String getItemCategoryId() {
        return this.itemCategoryId;
    }

    public void setItemCategoryId(String str) {
        this.itemCategoryId = str;
    }

    public String getItemSort() {
        return this.itemSort;
    }

    public void setItemSort(String str) {
        this.itemSort = str;
    }

    public List<Locale> getNamesLocalized() {
        return this.namesLocalized;
    }

    public Item setNamesLocalized(List<Locale> list) {
        this.namesLocalized = list;
        return this;
    }

    public List<Locale> getDescriptionsLocalized() {
        return this.descriptionsLocalized;
    }

    public Item setDescriptionsLocalized(List<Locale> list) {
        this.descriptionsLocalized = list;
        return this;
    }

    public String getVisible() {
        return this.visible;
    }

    public void setVisible(String str) {
        this.visible = str;
    }

    public void init(Item item) {
        this.itemName = item.getItemName();
        this.itemImage = item.getItemImage();
        this.itemDesc = item.getItemDesc();
        this.itemSort = item.getItemSort();
        this.itemPrice = item.getItemPrice();
        this.visible = item.getVisible();
        this.namesLocalized = item.getNamesLocalized();
        this.descriptionsLocalized = item.getDescriptionsLocalized();
    }
}
