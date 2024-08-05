package com.example.ppt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

public class GradientView extends View {

    private Paint paint;
    private Shader linearGradient;
    private Shader radialGradient;
    private Shader sweepGradient;
    public GradientView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setAntiAlias(true);

        // LinearGradient (Top)
        linearGradient = new LinearGradient(0, 0, 0, getHeight(),
                Color.BLUE, Color.RED, Shader.TileMode.CLAMP);

        // RadialGradient (Right)
        radialGradient = new RadialGradient(getWidth(), 0, 200,
                Color.GREEN, Color.YELLOW, Shader.TileMode.CLAMP);

        // SweepGradient (Bottom)
        sweepGradient = new SweepGradient(getWidth() / 2, getHeight(),
                Color.YELLOW, Color.BLUE);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Draw LinearGradient
        paint.setShader(linearGradient);
        canvas.drawRect(0, 0, getWidth(), getHeight() / 3, paint);

        // Draw RadialGradient
        paint.setShader(radialGradient);
        canvas.drawRect(getWidth() * 2 / 3, 0, getWidth(), getHeight(), paint);

        // Draw SweepGradient
        paint.setShader(sweepGradient);
        canvas.drawRect(0, getHeight() * 2 / 3, getWidth(), getHeight(), paint);
    }
}