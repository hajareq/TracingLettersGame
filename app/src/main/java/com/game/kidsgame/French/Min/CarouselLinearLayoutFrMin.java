package com.game.kidsgame.French.Min;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class CarouselLinearLayoutFrMin extends LinearLayout {
    private float scale = CarouselPagerAdapterFrMin.BIG_SCALE;

    public CarouselLinearLayoutFrMin(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CarouselLinearLayoutFrMin(Context context) {
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