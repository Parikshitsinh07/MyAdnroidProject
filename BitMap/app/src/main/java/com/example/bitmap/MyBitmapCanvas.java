package com.example.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.Nullable;

public class MyBitmapCanvas extends View {

    Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.ful);
    int x = 0;
    int y =-500;


    public MyBitmapCanvas(Context context) {
        super(context);
    }


    public MyBitmapCanvas(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(bitmap,y,x,null);
    }


}
