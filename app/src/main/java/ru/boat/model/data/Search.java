package ru.boat.model.data;

public class Search implements MainItem {

    public static final int MODEL_ID = 1;

    private int leftPictureId;
    private int rightPictureId;
    private String title;

    public int getRightPictureId() {
        return rightPictureId;
    }
    public void setRightPictureId(int rightPictureId) {
        this.rightPictureId = rightPictureId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getLeftPictureId() {
        return leftPictureId;
    }
    public void setLeftPictureId(int leftPictureId) {
        this.leftPictureId = leftPictureId;
    }

    @Override
    public int getModelId() {
        return MODEL_ID;
    }
}
