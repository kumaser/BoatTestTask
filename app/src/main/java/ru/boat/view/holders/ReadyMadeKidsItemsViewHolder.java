package ru.boat.view.holders;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import ru.boat.R;
import ru.boat.model.data.ReadyMadeKitsItem;
import ru.boat.utils.Utils;

public class ReadyMadeKidsItemsViewHolder extends RecyclerView.ViewHolder {

    private ImageView pictureLeft;
    private ImageView pictureMiddle;
    private ImageView pictureRight;
    private TextView title;
    private TextView price;
    private Button basketButton;

    public ReadyMadeKidsItemsViewHolder(View itemView) {
        super(itemView);
        pictureLeft = (ImageView) itemView.findViewById(R.id.picture_left);
        pictureMiddle = (ImageView) itemView.findViewById(R.id.picture_middle);
        pictureRight = (ImageView) itemView.findViewById(R.id.picture_right);
        title = (TextView) itemView.findViewById(R.id.title);
        price = (TextView) itemView.findViewById(R.id.price);
        basketButton = (Button) itemView.findViewById(R.id.button_basket);
    }

    public void bind(ReadyMadeKitsItem item) {
        pictureLeft.setImageResource(item.getPictures().get(0));
        pictureMiddle.setImageResource(item.getPictures().get(1));
        pictureRight.setImageResource(item.getPictures().get(2));
        title.setText(item.getTitle());
        Utils.createCurrencyLabel(itemView.getContext(), price, item.getPrice());
    }
}
