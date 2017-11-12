package ru.boat.model.data;


import java.util.ArrayList;
import java.util.List;

public class Additional implements MainItem {

    public static final int MODEL_ID = 8;

    private List<AdditionalItem> items = new ArrayList<>();

    public List<AdditionalItem> getItems() {
        return items;
    }
    public void setItems(List<AdditionalItem> items) {
        this.items = items;
    }

    @Override
    public int getModelId() {
        return MODEL_ID;
    }
}
