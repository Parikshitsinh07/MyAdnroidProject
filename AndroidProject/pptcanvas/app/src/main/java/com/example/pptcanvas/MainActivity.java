package com.example.pptcanvas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends View {

    public ViewWithRedDot(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.BLACK);
        Paint circlePaint new Paint();
        circlePaint.setColor(Color.RED);
        canvas.drawCircle(canvas.getWidth() / 2,
                canvas.getHeight() / 2,
                canvas.getWidth() / 3, circlePaint);
    }
}