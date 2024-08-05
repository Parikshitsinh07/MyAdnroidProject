package com.example.myapplicationli;

import static android.opengl.ETC1.getHeight;
import static android.opengl.ETC1.getWidth;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

public class ViewWithGradientCircle extends View {
    private Paint circlePaint;
    private int circleRadius = 100;

    public ViewWithGradientCircle(Context context) {
        super(context);
        init();
    }

    public ViewWithGradientCircle(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ViewWithGradientCircle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        circlePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        int[] colors = {Color.RED, Color.BLACK};
        float[] positions = {0, 1};
        circlePaint.setShader(new LinearGradient(0, 0, circleRadius * 2, circleRadius * 2, colors, positions, Shader.TileMode.MIRROR));
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        canvas.drawCircle(centerX, centerY, circleRadius, circlePaint);
    }
}
