package ru.boat.model.data;

import java.util.ArrayList;
import java.util.List;

public class GiftCards implements MainItem {

    public static final int MODEL_ID = 6;

    private String title;
    private List<GiftCard> cards = new ArrayList<>();

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<GiftCard> getCards() {
        return cards;
    }
    public void setCards(List<GiftCard> cards) {
        this.cards = cards;
    }

    @Override
    public int getModelId() {
        return MODEL_ID;
    }
}
