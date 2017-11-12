package ru.boat.view.holders;


import android.content.Context;
import android.graphics.Paint;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import ru.boat.R;
import ru.boat.model.data.SliderCard;
import ru.boat.utils.Utils;

public class SliderCardViewHolder extends RecyclerView.ViewHolder {

    private TextView textBadge;
    private ImageView discountBadge;
    private ImageView picture;
    private ImageView favorite;
    private TextView title;
    private TextView price;
    private TextView priceBeforeDiscount;
    private TextView benefit;
    private Button buttonBasket;

    public SliderCardViewHolder(View itemView) {
        super(itemView);
        textBadge = (TextView) itemView.findViewById(R.id.text_badge);
        discountBadge = (ImageView) itemView.findViewById(R.id.discount_badge);
        picture = (ImageView) itemView.findViewById(R.id.picture);
        favorite = (ImageView) itemView.findViewById(R.id.favorite);
        title = (TextView) itemView.findViewById(R.id.title);
        price = (TextView) itemView.findViewById(R.id.price);
        priceBeforeDiscount = (TextView) itemView.findViewById(R.id.price_before_discount);
        benefit = (TextView) itemView.findViewById(R.id.benefit);
        buttonBasket = (Button) itemView.findViewById(R.id.button_basket);
    }

    public void bind(SliderCard card) {
        bindTextBadge(card);
        bindFavorite(card);
        bindPicture(card);
        bindTitle(card);
        bindPrice(card);
        bindPriceBeforeDiscount(card);
        bindBenefit(card);
    }

    private void bindTextBadge(SliderCard card) {
        if (card.isNew()) {
            textBadge.setText(R.string.new_label);
            textBadge.setVisibility(View.VISIBLE);
            discountBadge.setVisibility(View.GONE);
            textBadge.setBackgroundResource(R.drawable.green_badge);
            textBadge.setAllCaps(true);
        } else if (card.isHasCard()) {
            textBadge.setVisibility(View.GONE);
            discountBadge.setVisibility(View.VISIBLE);
            discountBadge.setBackgroundResource(R.mipmap.ic_discount_card);
        } else if (card.isHasDiscount()) {
            textBadge.setText(card.getDiscountInPercent());
            textBadge.setVisibility(View.VISIBLE);
            discountBadge.setVisibility(View.GONE);
            textBadge.setBackgroundResource(R.drawable.red_badge);
            textBadge.setAllCaps(true);
        } else if (card.isHasForPresent()) {
            textBadge.setText(card.getPresent());
            textBadge.setVisibility(View.VISIBLE);
            discountBadge.setVisibility(View.GONE);
            textBadge.setBackgroundResource(R.drawable.pumpkin_orange_badge);
            textBadge.setAllCaps(false);
        }
    }

    private void bindFavorite(SliderCard card) {
        favorite.setImageResource(card.isFavorite() ? R.drawable.ic_favorite : R.drawable.ic_favorite);
    }

    private void bindPicture(SliderCard card) {
        picture.setImageResource(card.getPictureId());
    }

    private void bindTitle(SliderCard card) {
        title.setText(card.getTitle());
        if (card.isHasCard() || card.isHasDiscount()) {
            title.setMaxLines(2);
            title.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            title.setMaxLines(3);
            title.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    private void bindPrice(SliderCard card) {
        Context context = itemView.getContext();
        Utils.createCurrencyLabel(context, price, card.getPrice());
        if (card.isHasCard() || card.isHasDiscount()) {
            price.setTextColor(ContextCompat.getColor(context, R.color.colorVermillion));
        } else {
            price.setTextColor(ContextCompat.getColor(context, R.color.colorBlack));
        }
    }

    private void bindPriceBeforeDiscount(SliderCard card) {
        Context context = itemView.getContext();
        if (card.isHasDiscount()) {
            Utils.createCurrencyLabel(context, priceBeforeDiscount, card.getPriceBeforeDiscount());
            priceBeforeDiscount.setPaintFlags(priceBeforeDiscount.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        } else if (card.isHasCard()) {
            String price = context.getString(R.string.before_discount_pattern, card.getPriceBeforeDiscount());
            Utils.createCurrencyLabel(context, priceBeforeDiscount, price);
            priceBeforeDiscount.setPaintFlags(priceBeforeDiscount.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
        } else {
            priceBeforeDiscount.setVisibility(View.GONE);
        }
    }

    private void bindBenefit(SliderCard card) {
        if (card.isHasCard() || card.isHasDiscount()) {
            benefit.setVisibility(View.VISIBLE);
            Context context = itemView.getContext();
            Utils.createCurrencyLabelWithPattern(context, benefit, card.getBenefitPrice(), R.string.benefit_pattern);
        } else {
            benefit.setVisibility(View.GONE);
        }
    }

}
