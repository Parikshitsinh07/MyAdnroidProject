package com.example.circle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class ViewWithRedDot extends View {

    private Paint circlePaint;

    public ViewWithRedDot(Context context) {
        super(context);
        init();
    }

    public ViewWithRedDot(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ViewWithRedDot(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        circlePaint = new Paint();
        circlePaint.setColor(Color.RED);
        circlePaint.setStyle(Paint.Style.FILL);
        circlePaint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int radius = Math.min(getWidth(), getHeight()) / 3;
        canvas.drawCircle(centerX, centerY, radius, circlePaint);
    }
}