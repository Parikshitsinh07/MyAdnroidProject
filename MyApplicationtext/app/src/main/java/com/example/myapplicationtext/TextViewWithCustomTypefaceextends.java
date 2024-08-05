package com.example.myapplicationtext;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

public class TextViewWithCustomTypefaceextends extends View {

    private Paint textPaint;
    private Typeface typeface;

    /**
     * Simple constructor to use when creating a view from code.
     *
     * @param context The Context the view is running in, through which it can
     *                access the current theme, resources, etc.
     */
    public TextViewWithCustomTypefaceextends(Context context) {
        super(context);
    }

    public void TextViewWithCustomTypeface(Context context) {
        super(context);
        init();
    }

    public void TextViewWithCustomTypeface(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public void TextViewWithCustomTypeface(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        textPaint.setColor(Color.BLACK);
        textPaint.setTextSize(60);

        // Load your custom typeface
        typeface = Typeface.create(Typeface.MONOSPACE, Typeface.NORMAL);
        // Or you can use system font by passing null to setTypeface
        // typeface = Typeface.create(null, Typeface.ITALIC);
        textPaint.setTypeface(typeface);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawText("Custom Typeface", 20, 100, textPaint);
    }
}
