package ru.boat.model;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ru.boat.R;
import ru.boat.contract.MainContract;
import ru.boat.model.data.Additional;
import ru.boat.model.data.AdditionalItem;
import ru.boat.model.data.GiftCard;
import ru.boat.model.data.GiftCards;
import ru.boat.model.data.MainItem;
import ru.boat.model.data.PersonalRecommendations;
import ru.boat.model.data.Present;
import ru.boat.model.data.Presentation;
import ru.boat.model.data.ReadyMadeKits;
import ru.boat.model.data.ReadyMadeKitsItem;
import ru.boat.model.data.Search;
import ru.boat.model.data.Slider;
import ru.boat.model.data.SliderCard;

public class MainModel implements MainContract.Model {

    static List<MainItem> items = new ArrayList<>();

    static {
        Search search = new Search();
        search.setLeftPictureId(R.drawable.ic_search);
        search.setRightPictureId(R.mipmap.ic_scan);
        search.setTitle("Что вы ищете?");
        items.add(search);
        Presentation presentation = new Presentation();
        presentation.setTitle("Акции");
        presentation.setPictures(Collections.singletonList(R.mipmap.ic_slide_1));
        items.add(presentation);
        Slider slider = new Slider();
        slider.setTitle("Рекомендуем вам");
        for (int i = 0; i < 5; i++) {
            SliderCard card1 = new SliderCard();
            card1.setFavorite(false);
            card1.setTitle("Футболка с коротким рукавом для мальчиков BARKITO");
            card1.setPrice("259");
            card1.setPriceBeforeDiscount("400");
            card1.setBenefitPrice("141");
            card1.setPictureId(R.drawable.ic_cat);
            slider.getCards().add(card1);
            SliderCard card2 = new SliderCard();
            card2.setDiscountInPercent("-10%");
            card2.setBenefitPrice("141");
            card2.setTitle("Футболка с коротким рукавом для мальчиков BARKITO");
            card2.setPrice("259");
            card2.setHasDiscount(true);
            card2.setPriceBeforeDiscount("400");
            card2.setPictureId(R.drawable.ic_cat);
            slider.getCards().add(card2);
        }
        items.add(slider);

        PersonalRecommendations recommendations = new PersonalRecommendations();
        items.add(recommendations);

        Slider sale = new Slider();
        sale.setTitle("Распродажа");
        for (int i = 0; i < 5; i++) {
            SliderCard card11 = new SliderCard();
            card11.setDiscountInPercent("-10%");
            card11.setBenefitPrice("141");
            card11.setTitle("Футболка с коротким рукавом для мальчиков BARKITO");
            card11.setPrice("259");
            card11.setHasDiscount(true);
            card11.setPriceBeforeDiscount("400");
            card11.setPictureId(R.drawable.ic_cat);
            sale.getCards().add(card11);
            SliderCard card2 = new SliderCard();
            card2.setHasCard(true);
            card2.setTitle("Футболка с коротким рукавом для мальчиков BARKITO");
            card2.setPrice("259");
            card2.setPriceBeforeDiscount("400");
            card2.setBenefitPrice("141");
            card2.setPictureId(R.drawable.ic_cat);
            sale.getCards().add(card2);

        }
        items.add(sale);

        Slider news = new Slider();
        news.setTitle("Новинки");
        for (int i = 0; i < 10; i++) {
            SliderCard card11 = new SliderCard();
            card11.setTitle("Футболка с коротким рукавом для мальчиков BARKITO");
            card11.setPrice("259");
            card11.setNew(true);
            card11.setPictureId(R.drawable.ic_cat);
            news.getCards().add(card11);
        }
        items.add(news);

        Present present = new Present();
        items.add(present);

        Slider topSales = new Slider();
        topSales.setTitle("Топ продаж");
        for (int i = 0; i < 5; i++) {
            SliderCard card11 = new SliderCard();
            card11.setDiscountInPercent("-10%");
            card11.setBenefitPrice("141");
            card11.setTitle("Футболка с коротким рукавом для мальчиков BARKITO");
            card11.setPrice("259");
            card11.setHasDiscount(true);
            card11.setPriceBeforeDiscount("400");
            card11.setPictureId(R.drawable.ic_cat);
            topSales.getCards().add(card11);
            SliderCard card2 = new SliderCard();
            card2.setPresent("2+1");
            card2.setHasForPresent(true);
            card2.setTitle("Футболка с коротким рукавом для мальчиков BARKITO");
            card2.setPrice("259");
            card2.setPriceBeforeDiscount("400");
            card2.setBenefitPrice("141");
            card2.setPictureId(R.drawable.ic_cat);
            topSales.getCards().add(card2);

        }
        items.add(topSales);

        GiftCards giftCards = new GiftCards();
        giftCards.setTitle("Подарочные карты");
        List<GiftCard> cards = new ArrayList<>();
        GiftCard card1 = new GiftCard();
        card1.setPictureId(R.mipmap.ic_red_card);
        card1.setTitle("Электронный подарочный сертификат");
        cards.add(card1);
        GiftCard card2 = new GiftCard();
        card2.setPictureId(R.mipmap.ic_gold_card);
        card2.setTitle("Подарочная карта гибкого номинала");
        cards.add(card2);
        GiftCard card3 = new GiftCard();
        card3.setPictureId(R.mipmap.ic_blue_card);
        card3.setTitle("Корпоративные подарочные карты");
        cards.add(card3);
        giftCards.setCards(cards);
        items.add(giftCards);

        ReadyMadeKits readyMadeKits = new ReadyMadeKits();
        readyMadeKits.setTitle("Готовые комплекты");
        List<ReadyMadeKitsItem> readyMadeKitsItems = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ReadyMadeKitsItem readyMadeKitsItem = new ReadyMadeKitsItem();
            readyMadeKitsItem.getPictures().add(0, R.mipmap.ic_picture_1);
            readyMadeKitsItem.getPictures().add(1, R.mipmap.ic_picture_2);
            readyMadeKitsItem.getPictures().add(2, R.mipmap.ic_picture_3);
            readyMadeKitsItem.setTitle("Комплект Barkito Водолазка + пижама + носки");
            readyMadeKitsItem.setPrice("250");
            readyMadeKitsItems.add(readyMadeKitsItem);
        }
        readyMadeKits.setItems(readyMadeKitsItems);
        items.add(readyMadeKits);

        Slider recently = new Slider();
        recently.setTitle("Недавно смотрели");
        for (int i = 0; i < 5; i++) {
            SliderCard card11 = new SliderCard();
            card11.setNew(true);
            card11.setTitle("Футболка с коротким рукавом для мальчиков BARKITO");
            card11.setPrice("259");
            card11.setPictureId(R.drawable.ic_cat);
            recently.getCards().add(card11);
            SliderCard card22 = new SliderCard();
            card22.setHasCard(true);
            card22.setTitle("Футболка с коротким рукавом для мальчиков BARKITO");
            card22.setPrice("259");
            card22.setPriceBeforeDiscount("400");
            card22.setBenefitPrice("141");
            card22.setPictureId(R.drawable.ic_cat);
            recently.getCards().add(card22);
        }
        items.add(recently);

        Additional additional = new Additional();
        List<AdditionalItem> items1 = new ArrayList<>();
        AdditionalItem item1 = new AdditionalItem();
        item1.setPictureId(R.mipmap.ic_location);
        item1.setTitle("Адреса магазинов");
        item1.setSubtitle("Найдите магазины, которые находятся с рядом с вами!");
        items1.add(item1);
        AdditionalItem item2 = new AdditionalItem();
        item2.setPictureId(R.mipmap.ic_call_copy);
        item2.setTitle("Связь с нами");
        item2.setSubtitle("Присоединяйтесь к нам в соц. сетях и следите за новостями!");
        items1.add(item2);
        additional.setItems(items1);

        items.add(additional);

    }

    @Override
    public List<MainItem> getModel() {
        return items;
    }

}
