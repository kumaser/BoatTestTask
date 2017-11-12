package ru.boat.model.data;


import java.util.ArrayList;
import java.util.List;

public class Slider implements MainItem {

    public static final int MODEL_ID = 3;

    private String title;
    private List<SliderCard> cards = new ArrayList<>();

    public List<SliderCard> getCards() {
        return cards;
    }
    public void setCards(List<SliderCard> cards) {
        this.cards = cards;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int getModelId() {
        return MODEL_ID;
    }
}
