package android.support.p007v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.support.p007v4.view.C0487v;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: android.support.v4.widget.c */
class C0536c extends ImageView {

    /* renamed from: a */
    private Animation.AnimationListener f2009a;

    /* renamed from: b */
    int f2010b;

    /* renamed from: android.support.v4.widget.c$a */
    private class C0537a extends OvalShape {

        /* renamed from: a */
        private RadialGradient f2011a;

        /* renamed from: b */
        private Paint f2012b = new Paint();

        C0537a(int i) {
            C0536c.this.f2010b = i;
            m2660a((int) rect().width());
        }

        /* renamed from: a */
        private void m2660a(int i) {
            float f = (float) (i / 2);
            this.f2011a = new RadialGradient(f, f, (float) C0536c.this.f2010b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f2012b.setShader(this.f2011a);
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = C0536c.this.getWidth() / 2;
            float f = (float) width;
            float height = (float) (C0536c.this.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f2012b);
            canvas.drawCircle(f, height, (float) (width - C0536c.this.f2010b), paint);
        }

        /* access modifiers changed from: protected */
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m2660a((int) f);
        }
    }

    C0536c(Context context, int i) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f2010b = (int) (3.5f * f);
        if (m2658a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0487v.m2266a((View) this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0537a(this.f2010b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f2010b, (float) i3, (float) i2, 503316480);
            int i4 = this.f2010b;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        C0487v.m2273a((View) this, (Drawable) shapeDrawable);
    }

    /* renamed from: a */
    private boolean m2658a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* renamed from: a */
    public void mo2292a(Animation.AnimationListener animationListener) {
        this.f2009a = animationListener;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f2009a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f2009a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m2658a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f2010b * 2), getMeasuredHeight() + (this.f2010b * 2));
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
