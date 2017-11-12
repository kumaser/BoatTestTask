package ru.boat.view.holders;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ru.boat.R;
import ru.boat.model.data.Additional;
import ru.boat.model.data.AdditionalItem;
import ru.boat.view.adapter.AdditionalItemAdapter;
import ru.boat.view.customviews.InsideRecyclerView;

public class AdditionalViewHolder extends RecyclerView.ViewHolder {

    private RecyclerView recyclerView;

    public AdditionalViewHolder(View itemView) {
        super(itemView);
        recyclerView = (RecyclerView) itemView.findViewById(R.id.additional_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(itemView.getContext()));
    }

    public void bind(Additional additional) {
        recyclerView.setAdapter(new AdditionalItemAdapter(additional.getItems()));
    }
}
