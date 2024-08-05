package com.example.canvas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

public class MyCanvasView extends View {

    private Paint paint;

    public MyCanvasView(Context context) {
        super(context);
        init();
    }
    public MyCanvasView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setAntiAlias(true); // Enable anti-aliasing for smoother edges
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Clear canvas
        canvas.drawColor(Color.WHITE);

        // Draw a red circle
        paint.setColor(Color.RED);
        canvas.drawCircle(200, 200, 100, paint);

        // Draw a green rectangle
        paint.setColor(Color.GREEN);
        canvas.drawRect(300, 300, 500, 500, paint);

        // Draw a blue line
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(10); // Set stroke width
        canvas.drawLine(100, 100, 300, 300, paint);

        // Draw a yellow oval
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.STROKE); // Set drawing style to stroke
        canvas.drawOval(100, 600, 400, 800, paint);
    }
}