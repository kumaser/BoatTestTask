package ru.boat.view.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import ru.boat.R;
import ru.boat.model.data.Search;

public class SearchViewHolder extends RecyclerView.ViewHolder {

    private ImageView leftPicture;
    private ImageView rightPicture;
    private TextView title;

    public SearchViewHolder(View itemView) {
        super(itemView);
        leftPicture = (ImageView) itemView.findViewById(R.id.left_picture);
        rightPicture = (ImageView) itemView.findViewById(R.id.right_picture);
        title = (TextView) itemView.findViewById(R.id.title);
    }

    public void bind(Search search) {
        leftPicture.setImageResource(search.getLeftPictureId());
        rightPicture.setImageResource(search.getRightPictureId());
        title.setText(search.getTitle());
    }
}
