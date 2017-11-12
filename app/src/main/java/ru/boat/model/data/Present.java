package ru.boat.model.data;

public class Present implements MainItem {

    public static final int MODEL_ID = 5;

    private int pictureId;
    private String title;
    private String buttonCaption;

    public int getPictureId() {
        return pictureId;
    }
    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getButtonCaption() {
        return buttonCaption;
    }
    public void setButtonCaption(String buttonCaption) {
        this.buttonCaption = buttonCaption;
    }

    @Override
    public int getModelId() {
        return MODEL_ID;
    }
}
