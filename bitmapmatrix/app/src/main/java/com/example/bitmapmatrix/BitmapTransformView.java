package com.example.bitmapmatrix;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;

public class BitmapTransformView extends View {

private Bitmap originalBitmap;
private Bitmap transformedBitmap;

public BitmapTransformView(Context context) {
        super(context);
        init();
        }

public BitmapTransformView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
        }

public BitmapTransformView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
        }

private void init() {
        // Load the original bitmap from resources
        originalBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.bluejay);

        // Create a matrix for mirroring
        Matrix mirrorMatrix = new Matrix();
        mirrorMatrix.preScale(-1, 1);
        // Apply mirroring to the original bitmap
        transformedBitmap = Bitmap.createBitmap(originalBitmap, 0, 0, originalBitmap.getWidth(), originalBitmap.getHeight(), mirrorMatrix, false);

        // Create a matrix for mirroring and rotating
        Matrix mirrorAndTilt30 = new Matrix();
        mirrorAndTilt30.preRotate(30);
        mirrorAndTilt30.preScale(-1, 1);
        // Apply mirroring and rotating to the original bitmap
        transformedBitmap = Bitmap.createBitmap(originalBitmap, 0, 0, originalBitmap.getWidth(), originalBitmap.getHeight(), mirrorAndTilt30, false);
        }

@Override
protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Draw the transformed bitmap on canvas at (0, 0)
        canvas.drawBitmap(transformedBitmap, 0, 0, null);
        }
    }