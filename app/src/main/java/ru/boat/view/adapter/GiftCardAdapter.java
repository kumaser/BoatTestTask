package ru.boat.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ru.boat.R;
import ru.boat.model.data.GiftCard;
import ru.boat.view.holders.GiftCardViewHolder;

public class GiftCardAdapter extends RecyclerView.Adapter<GiftCardViewHolder> {

    private List<GiftCard> giftCards = new ArrayList<>();

    public GiftCardAdapter(List<GiftCard> giftCards) {
        this.giftCards = giftCards;
    }

    @Override
    public GiftCardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        return new GiftCardViewHolder(inflater.inflate(R.layout.item_gift_card, parent, false));
    }

    @Override
    public void onBindViewHolder(GiftCardViewHolder holder, int position) {
        holder.bind(giftCards.get(position));
    }

    @Override
    public int getItemCount() {
        return giftCards.size();
    }
}