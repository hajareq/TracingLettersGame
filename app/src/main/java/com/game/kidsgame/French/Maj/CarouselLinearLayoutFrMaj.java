package com.game.kidsgame.French.Maj;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class CarouselLinearLayoutFrMaj extends LinearLayout {
    private float scale = CarouselPagerAdapterFrMaj.BIG_SCALE;

    public CarouselLinearLayoutFrMaj(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CarouselLinearLayoutFrMaj(Context context) {
        super(context);
    }

    public void setScaleBoth(float scale) {
        this.scale = scale;
        this.invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // The main mechanism to display scale animation, you can customize it as your needs
        int w = this.getWidth();
        int h = this.getHeight();
        canvas.scale(scale, scale, w/2, h/2);
    }
}