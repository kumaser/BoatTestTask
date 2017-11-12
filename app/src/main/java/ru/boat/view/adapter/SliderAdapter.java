package ru.boat.view.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import ru.boat.R;
import ru.boat.model.data.SliderCard;
import ru.boat.view.holders.SliderCardViewHolder;

public class SliderAdapter extends RecyclerView.Adapter<SliderCardViewHolder> {

    private final List<SliderCard> cards;

    public SliderAdapter(List<SliderCard> cards) {
        this.cards = cards;
    }

    @Override
    public SliderCardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new SliderCardViewHolder(inflater.inflate(R.layout.item_slider_card, parent, false));
    }

    @Override
    public void onBindViewHolder(SliderCardViewHolder holder, int position) {
        holder.bind(cards.get(position));
    }

    @Override
    public int getItemCount() {
        return cards.size();
    }
}
