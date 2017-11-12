package ru.boat.view.holders;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import ru.boat.R;
import ru.boat.model.data.PersonalRecommendations;

public class PersonalRecommendationsViewHolder extends RecyclerView.ViewHolder {

    private Button buttonBoy;
    private Button buttonGirl;

    public PersonalRecommendationsViewHolder(View itemView) {
        super(itemView);
        buttonBoy = (Button) itemView.findViewById(R.id.button_boy);
        buttonGirl = (Button) itemView.findViewById(R.id.button_girl);
    }

    public void bind(PersonalRecommendations personalRecommendations) {

    }
}
