package com.example.myapplicationsg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;

public class ViewWithSweepGradientCircle extends View {

private Paint circlePaint;
private int circleRadius = 100;

public ViewWithSweepGradientCircle(Context context) {
        super(context);
        init();
        }

public ViewWithSweepGradientCircle(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
        }

public ViewWithSweepGradientCircle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
        }

private void init() {
        circlePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        int[] colors = {Color.RED, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA};
        float[] positions = {0, 0.25f, 0.5f, 0.75f, 1};
        circlePaint.setShader(new SweepGradient(getWidth() - 175, getHeight() - 175, colors, positions));
        }

@Override
protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int centerX = getWidth() - 175;
        int centerY = getHeight() - 175;
        canvas.drawCircle(centerX, centerY, circleRadius, circlePaint);
        }
        }
