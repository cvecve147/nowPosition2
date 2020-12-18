package com.openlife.checkme.p100ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: com.openlife.checkme.ui.PointCircleView */
public class PointCircleView extends View {

    /* renamed from: a */
    private Paint f14263a;

    /* renamed from: b */
    private RectF f14264b;

    /* renamed from: c */
    private float f14265c;

    public PointCircleView(Context context) {
        super(context);
        this.f14265c = 0.0f;
    }

    public PointCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14265c = 0.0f;
        this.f14263a = new Paint();
        this.f14263a.setAntiAlias(true);
        this.f14263a.setStyle(Paint.Style.STROKE);
        this.f14263a.setStrokeWidth(5.0f);
        this.f14263a.setColor(-1);
        this.f14264b = new RectF();
    }

    public float getAngle() {
        return this.f14265c;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f14264b.set(5.0f, 5.0f, (float) (getHeight() - 5), (float) (getWidth() - 5));
        canvas.drawArc(this.f14264b, 270.0f, this.f14265c, false, this.f14263a);
    }

    public void setAngle(float f) {
        this.f14265c = f;
    }
}
