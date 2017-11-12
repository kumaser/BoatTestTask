package ru.boat.model.data;


import java.util.ArrayList;
import java.util.List;

public class ReadyMadeKitsItem {

    private String title;
    private String price;
    private List<Integer> pictures = new ArrayList<>();
    private boolean inBasket;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public List<Integer> getPictures() {
        return pictures;
    }
    public void setPictures(List<Integer> pictures) {
        this.pictures = pictures;
    }
    public boolean isInBasket() {
        return inBasket;
    }
    public void setInBasket(boolean inBasket) {
        this.inBasket = inBasket;
    }
}
