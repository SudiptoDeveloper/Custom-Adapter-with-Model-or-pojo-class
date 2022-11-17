package com.example.customadapterwithpojoormodelclass;

import android.content.Context;

import java.util.ArrayList;

public class Item {
private String itemNames;
private  String itemDescriptions;

    public Item(String itemNames, String itemDescriptions) {
        this.itemNames = itemNames;
        this.itemDescriptions = itemDescriptions;
    }

    public String getItemNames() {
        return itemNames;
    }

    public void setItemNames(String itemNames) {
        this.itemNames = itemNames;
    }

    public String getItemDescriptions() {
        return itemDescriptions;
    }

    public void setItemDescriptions(String itemDescriptions) {
        this.itemDescriptions = itemDescriptions;
    }
}
