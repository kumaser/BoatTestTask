package ru.boat.view.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import ru.boat.R;
import ru.boat.model.data.AdditionalItem;
import ru.boat.view.holders.AdditionalItemViewHolder;

public class AdditionalItemAdapter extends RecyclerView.Adapter<AdditionalItemViewHolder> {

    private List<AdditionalItem> items;

    public AdditionalItemAdapter(List<AdditionalItem> items) {
        this.items = items;
    }

    @Override
    public AdditionalItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new AdditionalItemViewHolder(inflater.inflate(R.layout.item_additional_inside, parent, false));
    }

    @Override
    public void onBindViewHolder(AdditionalItemViewHolder holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
