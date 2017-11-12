package ru.boat.view.holders;

import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;
import ru.boat.R;
import ru.boat.model.data.Presentation;
import ru.boat.view.adapter.ViewPagerAdapter;
import ru.boat.view.customviews.InsideViewPager;

public class PresentationViewHolder extends RecyclerView.ViewHolder {

    private TextView title;
    private InsideViewPager pager;
    private CircleIndicator indicator;
    private Timer timer;
    private Handler handler = new Handler();

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
        startPresentation();
    }

    private void startPresentation() {
        if (timer != null) {
            timer.cancel();
        }
        timer = new Timer();
        PresentationTimerTask timerTask = new PresentationTimerTask();
        timer.schedule(timerTask, 5000);
    }

    private void showNextSlide() {
        int nextPosition = pager.getCurrentItem() + 1;
        int currentItem = nextPosition < 5 ? nextPosition : 0;
        pager.setCurrentItem(currentItem);
    }

    class PresentationTimerTask extends TimerTask {
        @Override
        public void run() {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    showNextSlide();
                    startPresentation();
                }
            });
        }
    }

}
