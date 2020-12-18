package com.marshalchen.ultimaterecyclerview.p083ui.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import com.marshalchen.ultimaterecyclerview.C4167c;
import com.marshalchen.ultimaterecyclerview.C4183g;

/* renamed from: com.marshalchen.ultimaterecyclerview.ui.floatingactionbutton.AddFloatingActionButton */
public class AddFloatingActionButton extends C4202b {

    /* renamed from: o */
    protected int f12506o;

    public AddFloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public AddFloatingActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AddFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11910a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4183g.AddFloatingActionButton, 0, 0);
            if (obtainStyledAttributes != null) {
                try {
                    this.f12506o = obtainStyledAttributes.getColor(C4183g.AddFloatingActionButton_plusIconColor, mo11919b(17170443));
                } finally {
                    obtainStyledAttributes.recycle();
                }
            }
        } else {
            this.f12506o = mo11919b(17170443);
        }
        super.mo11910a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public Drawable getIconDrawable() {
        float c = mo11922c(C4167c.fab_icon_size);
        float c2 = mo11922c(C4167c.fab_plus_icon_size);
        float f = (c - c2) / 2.0f;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new C4201a(this, f, c / 2.0f, mo11922c(C4167c.fab_plus_icon_stroke) / 2.0f, c));
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(this.f12506o);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        return shapeDrawable;
    }
}
