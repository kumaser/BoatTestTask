package ru.boat.model.data;

public class SliderCard {

    private boolean isNew;
    private boolean hasCard;
    private boolean hasDiscount;
    private boolean favorite;
    private boolean hasForPresent;
    private String discountInPercent;
    private String present;
    private int pictureId;
    private String title;
    private String price;
    private String priceBeforeDiscount;
    private String benefitPrice;
    private boolean inBasket;

    public boolean isNew() {
        return isNew;
    }
    public void setNew(boolean aNew) {
        isNew = aNew;
    }
    public boolean isHasCard() {
        return hasCard;
    }
    public void setHasCard(boolean hasCard) {
        this.hasCard = hasCard;
    }
    public boolean isHasDiscount() {
        return hasDiscount;
    }
    public void setHasDiscount(boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }
    public boolean isFavorite() {
        return favorite;
    }
    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
    public boolean isHasForPresent() {
        return hasForPresent;
    }
    public void setHasForPresent(boolean hasForPresent) {
        this.hasForPresent = hasForPresent;
    }
    public String getDiscountInPercent() {
        return discountInPercent;
    }
    public void setDiscountInPercent(String discountInPercent) {
        this.discountInPercent = discountInPercent;
    }
    public String getPresent() {
        return present;
    }
    public void setPresent(String present) {
        this.present = present;
    }
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
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getPriceBeforeDiscount() {
        return priceBeforeDiscount;
    }
    public void setPriceBeforeDiscount(String priceBeforeDiscount) {
        this.priceBeforeDiscount = priceBeforeDiscount;
    }
    public String getBenefitPrice() {
        return benefitPrice;
    }
    public void setBenefitPrice(String benefitPrice) {
        this.benefitPrice = benefitPrice;
    }
    public boolean isInBasket() {
        return inBasket;
    }
    public void setInBasket(boolean inBasket) {
        this.inBasket = inBasket;
    }
}
