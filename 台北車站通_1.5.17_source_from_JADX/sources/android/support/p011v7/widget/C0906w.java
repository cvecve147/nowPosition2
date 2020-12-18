package android.support.p011v7.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p013b.p018b.p028h.p031b.p032a.C1028c;

/* renamed from: android.support.v7.widget.w */
class C0906w {

    /* renamed from: a */
    private static final int[] f3702a = {16843067, 16843068};

    /* renamed from: b */
    private final ProgressBar f3703b;

    /* renamed from: c */
    private Bitmap f3704c;

    C0906w(ProgressBar progressBar) {
        this.f3703b = progressBar;
    }

    /* renamed from: a */
    private Drawable mo4789a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable a = m5148a(animationDrawable.getFrame(i), true);
            a.setLevel(10000);
            animationDrawable2.addFrame(a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* renamed from: a */
    private Drawable m5148a(Drawable drawable, boolean z) {
        if (drawable instanceof C1028c) {
            C1028c cVar = (C1028c) drawable;
            Drawable a = cVar.mo5022a();
            if (a == null) {
                return drawable;
            }
            cVar.mo5023a(m5148a(a, z));
            return drawable;
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m5148a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (!(drawable instanceof BitmapDrawable)) {
            return drawable;
        } else {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f3704c == null) {
                this.f3704c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(mo4790b());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
    }

    /* renamed from: b */
    private Shape mo4790b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Bitmap mo4773a() {
        return this.f3704c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4774a(AttributeSet attributeSet, int i) {
        C0829eb a = C0829eb.m4793a(this.f3703b.getContext(), attributeSet, f3702a, i, 0);
        Drawable c = a.mo4479c(0);
        if (c != null) {
            this.f3703b.setIndeterminateDrawable(mo4789a(c));
        }
        Drawable c2 = a.mo4479c(1);
        if (c2 != null) {
            this.f3703b.setProgressDrawable(m5148a(c2, false));
        }
        a.mo4474a();
    }
}
