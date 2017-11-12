package ru.boat.model.data;

import java.util.ArrayList;
import java.util.List;

public class Presentation implements MainItem {

    public static final int MODEL_ID = 2;

    private String title;
    private List<Integer> pictures = new ArrayList<>();

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<Integer> getPictures() {
        return pictures;
    }
    public void setPictures(List<Integer> pictures) {
        this.pictures = pictures;
    }

    @Override
    public int getModelId() {
        return MODEL_ID;
    }
}
