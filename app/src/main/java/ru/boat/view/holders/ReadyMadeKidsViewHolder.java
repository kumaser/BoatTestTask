package ru.boat.view.holders;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ru.boat.R;
import ru.boat.model.data.ReadyMadeKits;
import ru.boat.view.adapter.ReadyMadeKitsItemAdapter;
import ru.boat.view.adapter.SliderAdapter;

public class ReadyMadeKidsViewHolder extends RecyclerView.ViewHolder {
    private TextView title;
    private TextView showAll;
    private RecyclerView cardsRecycler;

    public ReadyMadeKidsViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.title);
        showAll = (TextView) itemView.findViewById(R.id.show_all);
        cardsRecycler = (RecyclerView) itemView.findViewById(R.id.cards_recycler);
        cardsRecycler.setLayoutManager(new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.HORIZONTAL, false));
    }

    public void bind(ReadyMadeKits readyMadeKits) {
        title.setText(readyMadeKits.getTitle());
        cardsRecycler.setAdapter(new ReadyMadeKitsItemAdapter(readyMadeKits.getItems()));
    }
}
