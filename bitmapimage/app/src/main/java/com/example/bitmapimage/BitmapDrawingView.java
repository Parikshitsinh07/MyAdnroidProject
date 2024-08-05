package com.example.bitmapimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class BitmapDrawingView  extends View {

private Bitmap bitmap;

public BitmapDrawingView(Context context) {
        super(context);
        init();
        }

public BitmapDrawingView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
        }

public BitmapDrawingView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
        }

private void init() {
        // Load bitmap from resources
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.bluejay);
        }

@Override
protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // Draw the bitmap on canvas at (0, 0)
        canvas.drawBitmap(bitmap, 0, 0, null);
        }
        }

