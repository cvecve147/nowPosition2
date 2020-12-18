package com.marshalchen.ultimaterecyclerview.p083ui.floatingactionbutton;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.shapes.Shape;

/* renamed from: com.marshalchen.ultimaterecyclerview.ui.floatingactionbutton.a */
class C4201a extends Shape {

    /* renamed from: a */
    final /* synthetic */ float f12507a;

    /* renamed from: b */
    final /* synthetic */ float f12508b;

    /* renamed from: c */
    final /* synthetic */ float f12509c;

    /* renamed from: d */
    final /* synthetic */ float f12510d;

    /* renamed from: e */
    final /* synthetic */ AddFloatingActionButton f12511e;

    C4201a(AddFloatingActionButton addFloatingActionButton, float f, float f2, float f3, float f4) {
        this.f12511e = addFloatingActionButton;
        this.f12507a = f;
        this.f12508b = f2;
        this.f12509c = f3;
        this.f12510d = f4;
    }

    public void draw(Canvas canvas, Paint paint) {
        float f = this.f12507a;
        float f2 = this.f12508b;
        float f3 = this.f12509c;
        canvas.drawRect(f, f2 - f3, this.f12510d - f, f2 + f3, paint);
        float f4 = this.f12508b;
        float f5 = this.f12509c;
        float f6 = this.f12507a;
        canvas.drawRect(f4 - f5, f6, f4 + f5, this.f12510d - f6, paint);
    }
}
