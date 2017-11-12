package ru.boat.view.holders;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ru.boat.R;
import ru.boat.model.data.Slider;
import ru.boat.view.adapter.SliderAdapter;

public class SliderViewHolder extends RecyclerView.ViewHolder {

    private TextView title;
    private TextView showAll;
    private RecyclerView sliderCards;
    private SliderAdapter adapter;

    public SliderViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.title);
        showAll = (TextView) itemView.findViewById(R.id.show_all);
        sliderCards = (RecyclerView) itemView.findViewById(R.id.slider_cards);
        sliderCards.setLayoutManager(new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.HORIZONTAL, false));
    }

    public void bind(Slider slider) {
        title.setText(slider.getTitle());
        sliderCards.setAdapter(new SliderAdapter(slider.getCards()));
    }
}
