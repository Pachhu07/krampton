package com.aximo.krampton.Activity.Model;

import java.io.Serializable;

public class MainActivityModel implements Serializable {
    private int itemImage;
    private String itemName;

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
