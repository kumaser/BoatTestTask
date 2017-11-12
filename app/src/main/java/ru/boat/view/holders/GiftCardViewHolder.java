package ru.boat.view.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import ru.boat.R;
import ru.boat.model.data.GiftCard;

public class GiftCardViewHolder extends RecyclerView.ViewHolder {

    private ImageView picture;
    private TextView title;

    public GiftCardViewHolder(View itemView) {
        super(itemView);
        picture = (ImageView) itemView.findViewById(R.id.picture);
        title = (TextView) itemView.findViewById(R.id.title);
    }

    public void bind(GiftCard card) {
        picture.setImageResource(card.getPictureId());
        title.setText(card.getTitle());
    }

}