package ru.boat.view.holders;


import android.support.v7.widget.RecyclerView;
import android.view.View;

import ru.boat.model.data.MainItem;

public class EmptyViewHolder extends RecyclerView.ViewHolder {

    public EmptyViewHolder(View itemView) {
        super(itemView);
    }

    public void bind(MainItem model) {
    }

}
