package ru.boat.view.customviews;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class InsideViewPager extends ViewPager {

    public InsideViewPager(Context context) {
        super(context);
    }

    public InsideViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    int getMeasureExactly(View child, int widthMeasureSpec) {
        child.measure(widthMeasureSpec, MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED));
        int height = child.getMeasuredHeight();
        return MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        boolean wrapHeight = MeasureSpec.getMode(heightMeasureSpec) == MeasureSpec.AT_MOST;
        final View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int width = getMeasuredWidth();
        if (wrapHeight) {
            widthMeasureSpec = MeasureSpec.makeMeasureSpec(width, MeasureSpec.EXACTLY);
        }
        View view = ((View) getAdapter().instantiateItem(this, getCurrentItem()));
        heightMeasureSpec = getMeasureExactly(view, widthMeasureSpec);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
