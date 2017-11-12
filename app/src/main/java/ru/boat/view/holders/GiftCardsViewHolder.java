package ru.boat.view.holders;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ru.boat.R;
import ru.boat.model.data.GiftCards;
import ru.boat.view.adapter.GiftCardAdapter;
import ru.boat.view.customviews.InsideRecyclerView;

public class GiftCardsViewHolder extends RecyclerView.ViewHolder {

    private TextView title;
    private InsideRecyclerView cardsRecycler;

    public GiftCardsViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.title);
        cardsRecycler = (InsideRecyclerView) itemView.findViewById(R.id.cards_recycler);
        cardsRecycler.setLayoutManager(new LinearLayoutManager(itemView.getContext()));
    }

    public void bind(int position, GiftCards cards) {
        title.setText(cards.getTitle());
        cardsRecycler.setId(position + 1);
        cardsRecycler.setAdapter(new GiftCardAdapter(cards.getCards()));
    }
}
