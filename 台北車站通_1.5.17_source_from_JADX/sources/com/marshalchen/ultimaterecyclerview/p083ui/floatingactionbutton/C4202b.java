package com.marshalchen.ultimaterecyclerview.p083ui.floatingactionbutton;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.support.p007v4.view.C0487v;
import android.util.AttributeSet;
import android.view.Display;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageButton;
import com.marshalchen.ultimaterecyclerview.C4167c;
import com.marshalchen.ultimaterecyclerview.C4169d;
import com.marshalchen.ultimaterecyclerview.C4183g;

/* renamed from: com.marshalchen.ultimaterecyclerview.ui.floatingactionbutton.b */
public class C4202b extends ImageButton {

    /* renamed from: a */
    private static final int f12512a = Color.argb(128, 255, 255, 255);

    /* renamed from: b */
    private static final int f12513b = Color.argb(128, 0, 0, 0);

    /* renamed from: c */
    private final Interpolator f12514c;

    /* renamed from: d */
    protected int f12515d;

    /* renamed from: e */
    protected int f12516e;

    /* renamed from: f */
    protected int f12517f;

    /* renamed from: g */
    protected int f12518g;

    /* renamed from: h */
    protected float f12519h;

    /* renamed from: i */
    protected float f12520i;

    /* renamed from: j */
    protected float f12521j;

    /* renamed from: k */
    protected int f12522k;

    /* renamed from: l */
    private boolean f12523l;

    /* renamed from: m */
    private float f12524m;

    /* renamed from: n */
    private float f12525n;

    public C4202b(Context context) {
        this(context, (AttributeSet) null);
    }

    public C4202b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12514c = new AccelerateDecelerateInterpolator();
        this.f12523l = false;
        this.f12524m = -1.0f;
        this.f12525n = -1.0f;
        mo11910a(context, attributeSet);
    }

    public C4202b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12514c = new AccelerateDecelerateInterpolator();
        this.f12523l = false;
        this.f12524m = -1.0f;
        this.f12525n = -1.0f;
        mo11910a(context, attributeSet);
    }

    @SuppressLint({"NewApi"})
    private void setBackgroundCompat(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo11913a(int i) {
        int i2;
        if (i != 0) {
            if (i == 1) {
                i2 = C4167c.fab_size_mini;
                return mo11922c(i2);
            }
        }
        i2 = C4167c.fab_size_normal;
        return mo11922c(i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo11914a(float f) {
        return (int) (f * 255.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Drawable mo11915a(RectF rectF, int i) {
        int i2 = this.f12522k;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.drawOval(rectF, paint);
        return new BitmapDrawable(getResources(), createBitmap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public StateListDrawable mo11916a(RectF rectF) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, mo11915a(rectF, this.f12516e));
        stateListDrawable.addState(new int[0], mo11915a(rectF, this.f12515d));
        return stateListDrawable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11917a() {
        float f = this.f12520i;
        float f2 = f - this.f12521j;
        float f3 = this.f12519h;
        LayerDrawable c = mo11923c(new RectF(f, f2, f + f3, f3 + f2));
        float c2 = (this.f12519h - mo11922c(C4167c.fab_icon_size)) / 2.0f;
        float f4 = this.f12520i;
        int i = (int) (f4 + c2);
        LayerDrawable layerDrawable = c;
        layerDrawable.setLayerInset(c.getNumberOfLayers() - 1, i, (int) (f2 + c2), i, (int) (f4 + this.f12521j + c2));
        setBackgroundCompat(c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11910a(Context context, AttributeSet attributeSet) {
        int i;
        this.f12515d = mo11919b(17170451);
        this.f12516e = mo11919b(17170450);
        this.f12517f = 0;
        this.f12518g = 0;
        if (attributeSet != null) {
            mo11921b(context, attributeSet);
        }
        this.f12519h = mo11913a(this.f12518g);
        this.f12520i = mo11922c(C4167c.fab_shadow_radius);
        this.f12521j = mo11922c(C4167c.fab_shadow_offset);
        this.f12522k = (int) (this.f12519h + (this.f12520i * 2.0f));
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 13) {
            defaultDisplay.getSize(point);
            i = point.y;
        } else {
            i = defaultDisplay.getHeight();
        }
        this.f12525n = (float) i;
        mo11917a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11918a(TypedArray typedArray) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo11919b(int i) {
        return getResources().getColor(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Drawable mo11920b(RectF rectF) {
        RectF rectF2 = rectF;
        int i = this.f12522k;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float c = mo11922c(C4167c.fab_stroke_width);
        float f = c / 2.0f;
        RectF rectF3 = new RectF(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        RectF rectF4 = new RectF(rectF2.left + f, rectF2.top + f, rectF2.right - f, rectF2.bottom - f);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(c);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-16777216);
        paint.setAlpha(mo11914a(0.02f));
        canvas.drawOval(rectF3, paint);
        paint.setShader(new LinearGradient(rectF4.centerX(), rectF4.top, rectF4.centerX(), rectF4.bottom, new int[]{0, f12513b, -16777216}, new float[]{0.0f, 0.8f, 1.0f}, Shader.TileMode.CLAMP));
        paint.setAlpha(mo11914a(0.04f));
        canvas.drawOval(rectF4, paint);
        paint.setShader(new LinearGradient(rectF4.centerX(), rectF4.top, rectF4.centerX(), rectF4.bottom, new int[]{-1, f12512a, 0}, new float[]{0.0f, 0.2f, 1.0f}, Shader.TileMode.CLAMP));
        paint.setAlpha(mo11914a(0.8f));
        canvas.drawOval(rectF4, paint);
        return new BitmapDrawable(getResources(), createBitmap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo11921b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4183g.FloatActionButton, 0, 0);
        if (obtainStyledAttributes != null) {
            try {
                this.f12515d = obtainStyledAttributes.getColor(C4183g.FloatActionButton_urv_fab_colorNormal, mo11919b(17170451));
                this.f12516e = obtainStyledAttributes.getColor(C4183g.FloatActionButton_urv_fab_colorPressed, mo11919b(17170450));
                this.f12518g = obtainStyledAttributes.getInt(C4183g.FloatActionButton_urv_fab_size, 0);
                this.f12517f = obtainStyledAttributes.getResourceId(C4183g.FloatActionButton_icon, 0);
                mo11918a(obtainStyledAttributes);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public float mo11922c(int i) {
        return getResources().getDimension(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public LayerDrawable mo11923c(RectF rectF) {
        if (this.f12518g == 2) {
            return new LayerDrawable(new Drawable[]{mo11916a(rectF), mo11920b(rectF), getIconDrawable()});
        }
        return new LayerDrawable(new Drawable[]{getResources().getDrawable(mo11924d(this.f12518g)), mo11916a(rectF), mo11920b(rectF), getIconDrawable()});
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo11924d(int i) {
        if (i == 0) {
            return C4169d.urv_floating_action_button_fab_bg_normal;
        }
        if (i == 1) {
            return C4169d.urv_floating_action_button_fab_bg_mini;
        }
        if (i != 2) {
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public Drawable getIconDrawable() {
        return this.f12517f != 0 ? getResources().getDrawable(this.f12517f) : new ColorDrawable(0);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f12524m == -1.0f) {
            this.f12524m = C0487v.m2302r(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f12522k;
        setMeasuredDimension(i3, i3);
    }
}
