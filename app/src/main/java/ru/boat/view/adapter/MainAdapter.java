package ru.boat.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ru.boat.R;
import ru.boat.model.data.Additional;
import ru.boat.model.data.AdditionalItem;
import ru.boat.model.data.MainItem;
import ru.boat.model.data.GiftCards;
import ru.boat.model.data.PersonalRecommendations;
import ru.boat.model.data.Present;
import ru.boat.model.data.Presentation;
import ru.boat.model.data.ReadyMadeKits;
import ru.boat.model.data.Search;
import ru.boat.model.data.Slider;
import ru.boat.view.holders.AdditionalViewHolder;
import ru.boat.view.holders.GiftCardsViewHolder;
import ru.boat.view.holders.EmptyViewHolder;
import ru.boat.view.holders.PersonalRecommendationsViewHolder;
import ru.boat.view.holders.PresentViewHolder;
import ru.boat.view.holders.PresentationViewHolder;
import ru.boat.view.holders.ReadyMadeKidsViewHolder;
import ru.boat.view.holders.SearchViewHolder;
import ru.boat.view.holders.SliderViewHolder;

public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<MainItem> page = new ArrayList<>();

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        if (viewType == Search.MODEL_ID) {
            return new SearchViewHolder(inflater.inflate(R.layout.item_search, parent, false));
        } else if (viewType == Presentation.MODEL_ID) {
            return new PresentationViewHolder(inflater.inflate(R.layout.item_presentation, parent, false));
        } else if (viewType == Slider.MODEL_ID) {
            return new SliderViewHolder(inflater.inflate(R.layout.item_slider, parent, false));
        } else if (viewType == PersonalRecommendations.MODEL_ID) {
            return new PersonalRecommendationsViewHolder(inflater.inflate(R.layout.item_personal_recommendations, parent, false));
        } else if (viewType == Present.MODEL_ID) {
            return new PresentViewHolder(inflater.inflate(R.layout.item_present, parent, false));
        } else if (viewType == GiftCards.MODEL_ID) {
            return new GiftCardsViewHolder(inflater.inflate(R.layout.item_gift_cards, parent, false));
        } else if (viewType == ReadyMadeKits.MODEL_ID) {
            return new ReadyMadeKidsViewHolder(inflater.inflate(R.layout.item_ready_made_kits, parent, false));
        } else if (viewType == Additional.MODEL_ID) {
            return new AdditionalViewHolder(inflater.inflate(R.layout.item_additional, parent, false));
        } else {
            return new EmptyViewHolder(new View(context));
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof SearchViewHolder) {
            Search item = (Search) page.get(position);
            ((SearchViewHolder) holder).bind(item);
        } else if (holder instanceof PresentViewHolder) {
            Present item = (Present) page.get(position);
            ((PresentViewHolder) holder).bind(item);
        } else if (holder instanceof SliderViewHolder) {
            Slider item = (Slider) page.get(position);
            ((SliderViewHolder) holder).bind(item);
        } else if (holder instanceof PersonalRecommendationsViewHolder) {
            PersonalRecommendations item = (PersonalRecommendations) page.get(position);
            ((PersonalRecommendationsViewHolder) holder).bind(item);
        } else if (holder instanceof PresentationViewHolder) {
            Presentation item = (Presentation) page.get(position);
            ((PresentationViewHolder) holder).bind(position, item);
        } else if (holder instanceof GiftCardsViewHolder) {
            GiftCards item = (GiftCards) page.get(position);
            ((GiftCardsViewHolder) holder).bind(position, item);
        } else if (holder instanceof ReadyMadeKidsViewHolder) {
            ReadyMadeKits item = (ReadyMadeKits) page.get(position);
            ((ReadyMadeKidsViewHolder) holder).bind(item);
        } else if (holder instanceof AdditionalViewHolder) {
            Additional item = (Additional) page.get(position);
            ((AdditionalViewHolder) holder).bind(item);
        }
    }

    @Override
    public int getItemCount() {
        return page.size();
    }

    @Override
    public int getItemViewType(int position) {
        return page.get(position).getModelId();
    }

    public void showPage(List<MainItem> items) {
        page.addAll(items);
        notifyDataSetChanged();
    }
}
