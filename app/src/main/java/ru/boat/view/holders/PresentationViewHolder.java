package ru.boat.view.holders;


import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import me.relex.circleindicator.CircleIndicator;
import ru.boat.R;
import ru.boat.model.data.Presentation;
import ru.boat.view.adapter.ViewPagerAdapter;
import ru.boat.view.customviews.InsideViewPager;

public class PresentationViewHolder extends RecyclerView.ViewHolder {

    private TextView title;
    private InsideViewPager pager;
    private CircleIndicator indicator;

    public PresentationViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.title);
        pager = (InsideViewPager) itemView.findViewById(R.id.presentation_pager);
        indicator = (CircleIndicator) itemView.findViewById(R.id.indicator);
    }

    public void bind(int position, Presentation presentation) {
        title.setText(presentation.getTitle());
        pager.setId(position + 1);
        pager.setAdapter(new ViewPagerAdapter(presentation.getPictures()));
        indicator.setViewPager(pager);
    }
}
