package ru.boat.view.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import ru.boat.R;

public class ViewPagerAdapter extends PagerAdapter {

    private List<Integer> slides = new ArrayList<>();

    public ViewPagerAdapter(List<Integer> slides) {
        this.slides = slides;
    }

    @Override
    public int getCount() {
        return 5; //todo slides.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(container.getContext());
        LinearLayout view = (LinearLayout) inflater.inflate(R.layout.item_presentation_slide, container, false);
        ImageView slide = (ImageView) view.findViewById(R.id.slide_picture);
        slide.setBackgroundResource(slides.get(0));//todo change to position
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }
}
