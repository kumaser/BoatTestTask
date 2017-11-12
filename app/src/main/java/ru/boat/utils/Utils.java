package ru.boat.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.StringRes;
import android.widget.TextView;

import ru.boat.R;

public class Utils {

    public static void createCurrencyLabel(Context context, TextView textView, String text) {
        final String rouble = "\u20BD";
        final String result = text + rouble;
        Typeface font = Typeface.createFromAsset(context.getAssets(), "rouble.ttf");
        textView.setTypeface(font);
        textView.setText(result);
    }

    public static void createCurrencyLabelWithPattern(Context context,
                                                      TextView textView,
                                                      String text,
                                                      @StringRes int pattern) {
        final String rouble = "\u20BD";
        final String result = context.getResources().getString(pattern, text, rouble);
        Typeface font = Typeface.createFromAsset(context.getAssets(), "rouble.ttf");
        textView.setTypeface(font);
        textView.setText(result);
    }
}
