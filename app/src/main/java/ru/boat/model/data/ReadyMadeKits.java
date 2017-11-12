package ru.boat.model.data;

import java.util.ArrayList;
import java.util.List;

public class ReadyMadeKits implements MainItem {

    public static final int MODEL_ID = 7;

    private String title;
    private List<ReadyMadeKitsItem> items = new ArrayList<>();

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<ReadyMadeKitsItem> getItems() {
        return items;
    }
    public void setItems(List<ReadyMadeKitsItem> items) {
        this.items = items;
    }

    @Override
    public int getModelId() {
        return MODEL_ID;
    }
}
