package com.example.canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;


import java.util.ArrayList;

public class WritingView extends View {

    Paint paint;
    int x1,y1,x2,y2;
    Mypoint lastpoint;

    ArrayList<Line> lines = new ArrayList<>();
    public WritingView(Context context) {
        super(context);
        init();
    }

    public WritingView(Context context,AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public void init(){
        paint = new Paint();
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(15f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    protected void onDraw( Canvas canvas) {
        super.onDraw(canvas);

        for (Line l: lines){
            canvas.drawLine(l.Start.x,l.Start.y,l.end.x,l.end.y,paint);
        }
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

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1 = (int) event.getX();
                y1 = (int) event.getY();
                lastpoint = new Mypoint(x1, y1);
                break;
            case MotionEvent.ACTION_MOVE:
                x2 = (int) event.getX();
                y2 = (int) event.getY();
                Mypoint newpoint = new Mypoint(x2, y2);
                lines.add(new Line(lastpoint, newpoint));
                lastpoint = newpoint;
                invalidate();
                break;
            case MotionEvent.ACTION_UP:
                // Handle action up if necessary
                break;
        }
        return true;
    }
}
