package ru.boat.view.holders;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import ru.boat.R;
import ru.boat.model.data.AdditionalItem;

public class AdditionalItemViewHolder extends RecyclerView.ViewHolder {

    private ImageView picture;
    private TextView title;
    private TextView subtitle;

    public AdditionalItemViewHolder(View itemView) {
        super(itemView);
        picture = (ImageView) itemView.findViewById(R.id.picture);
        title = (TextView) itemView.findViewById(R.id.title);
        subtitle = (TextView) itemView.findViewById(R.id.subtitle);
    }

    public void bind(AdditionalItem additional) {
        picture.setImageResource(additional.getPictureId());
        title.setText(additional.getTitle());
        subtitle.setText(additional.getSubtitle());
    }
}
