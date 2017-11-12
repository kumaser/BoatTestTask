package ru.boat.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import ru.boat.R;
import ru.boat.model.data.ReadyMadeKitsItem;
import ru.boat.view.holders.ReadyMadeKidsItemsViewHolder;

public class ReadyMadeKitsItemAdapter extends RecyclerView.Adapter<ReadyMadeKidsItemsViewHolder> {

    private List<ReadyMadeKitsItem> items;

    public ReadyMadeKitsItemAdapter(List<ReadyMadeKitsItem> items) {
        this.items = items;
    }

    @Override
    public ReadyMadeKidsItemsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new ReadyMadeKidsItemsViewHolder(inflater.inflate(R.layout.item_ready_made_kids_items, parent, false));
    }

    @Override
    public void onBindViewHolder(ReadyMadeKidsItemsViewHolder holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
