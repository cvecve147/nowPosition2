package com.openlife.checkme.p100ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.openlife.checkme.C4948e;
import com.openlife.checkme.C4963n;
import java.util.Locale;
import p013b.p018b.p028h.p029a.C1006a;

/* renamed from: com.openlife.checkme.ui.LoadingView */
public class LoadingView extends View {

    /* renamed from: a */
    private Paint f14229a;

    /* renamed from: b */
    private Paint f14230b;

    /* renamed from: c */
    private Paint f14231c;

    /* renamed from: d */
    private Paint f14232d;

    /* renamed from: e */
    private String f14233e;

    /* renamed from: f */
    private String f14234f;

    /* renamed from: g */
    private String f14235g;

    /* renamed from: h */
    private float f14236h = 8.0f;

    /* renamed from: i */
    private final int f14237i = C4948e.loading_title;

    /* renamed from: j */
    private final int f14238j = C4948e.loading_subtitle;

    /* renamed from: k */
    private final int f14239k = this.f14238j;

    /* renamed from: l */
    private final int f14240l = this.f14237i;

    /* renamed from: m */
    private final int f14241m = C4948e.loading_color_dark;

    /* renamed from: n */
    private String f14242n = Locale.CHINESE.getLanguage();

    /* renamed from: o */
    private RectF f14243o = new RectF();

    /* renamed from: p */
    private final float f14244p = 10.0f;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public float f14245q = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public float f14246r = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f14247s = -60.0f;

    /* renamed from: t */
    private int f14248t = 0;

    /* renamed from: u */
    private AnimatorSet f14249u;

    /* renamed from: v */
    private int f14250v = 3;

    /* renamed from: w */
    private int f14251w = 1000;

    /* renamed from: x */
    private int f14252x = 36;

    /* renamed from: y */
    private int f14253y = 18;

    public LoadingView(Context context) {
        super(context);
        mo14063a((AttributeSet) null, 0);
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo14063a(attributeSet, 0);
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo14063a(attributeSet, i);
    }

    /* renamed from: a */
    private float m19795a(float f, DisplayMetrics displayMetrics) {
        return f * displayMetrics.scaledDensity;
    }

    /* renamed from: a */
    private AnimatorSet m19798a(float f) {
        int i = this.f14250v;
        float f2 = ((((float) (i - 1)) * 360.0f) / ((float) i)) + 10.0f;
        float f3 = ((f2 - 10.0f) * f) - 0.0703125f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{10.0f, f2});
        ofFloat.setDuration((long) this.f14251w);
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new C5025i(this));
        int i2 = this.f14250v;
        float f4 = (0.5f + f) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(f * 720.0f) / ((float) i2), f4 / ((float) i2)});
        ofFloat2.setDuration((long) this.f14251w);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new C5026j(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{f3, (f3 + f2) - 10.0f});
        ofFloat3.setDuration((long) this.f14251w);
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new C5027k(this, f2, f3));
        int i3 = this.f14250v;
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{f4 / ((float) i3), ((f + 1.0f) * 720.0f) / ((float) i3)});
        ofFloat4.setDuration((long) this.f14251w);
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new C5028l(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat2);
        return animatorSet;
    }

    /* renamed from: b */
    static /* synthetic */ int m19800b(LoadingView loadingView) {
        int i = loadingView.f14248t;
        loadingView.f14248t = i + 1;
        return i;
    }

    /* renamed from: d */
    private void m19803d() {
        m19804e();
    }

    /* renamed from: e */
    private void m19804e() {
        this.f14229a = new TextPaint();
        this.f14229a.setTextSize((float) this.f14252x);
        this.f14229a.setAntiAlias(true);
        this.f14229a.setColor(C1006a.m5386a(getContext(), this.f14237i));
        this.f14230b = new TextPaint();
        this.f14230b.setTextSize((float) this.f14253y);
        this.f14230b.setAntiAlias(true);
        this.f14230b.setColor(C1006a.m5386a(getContext(), this.f14238j));
        this.f14231c = new Paint();
        this.f14231c.setAntiAlias(true);
        this.f14231c.setColor(C1006a.m5386a(getContext(), this.f14239k));
        this.f14231c.setStyle(Paint.Style.STROKE);
        this.f14231c.setStrokeWidth(m19795a(2.0f, getContext().getResources().getDisplayMetrics()));
        this.f14232d = new Paint();
        this.f14232d.setAntiAlias(true);
        this.f14232d.setColor(C1006a.m5386a(getContext(), this.f14240l));
        this.f14232d.setStyle(Paint.Style.STROKE);
        this.f14232d.setStrokeWidth(m19795a(5.0f, getContext().getResources().getDisplayMetrics()));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m19805f() {
        int i;
        Context context;
        Paint paint;
        if (this.f14248t % 2 == 0) {
            paint = this.f14232d;
            context = getContext();
            i = this.f14240l;
        } else {
            paint = this.f14232d;
            context = getContext();
            i = this.f14241m;
        }
        paint.setColor(C1006a.m5386a(context, i));
    }

    /* renamed from: a */
    public void mo14062a() {
        AnimatorSet animatorSet = this.f14249u;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f14249u = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14063a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C4963n.LoadingView, i, 0);
        this.f14251w = obtainStyledAttributes.getInteger(C4963n.LoadingView_duration, 1000);
        this.f14247s = (float) obtainStyledAttributes.getInteger(C4963n.LoadingView_startAngle, -60);
        this.f14233e = obtainStyledAttributes.getString(C4963n.LoadingView_title);
        this.f14235g = obtainStyledAttributes.getString(C4963n.LoadingView_subTitle);
        this.f14252x = obtainStyledAttributes.getDimensionPixelSize(C4963n.LoadingView_titleTextSize, 36);
        this.f14253y = obtainStyledAttributes.getDimensionPixelSize(C4963n.LoadingView_subTitleTextSize, 18);
        obtainStyledAttributes.recycle();
        m19803d();
    }

    /* renamed from: b */
    public void mo14064b() {
        AnimatorSet animatorSet = this.f14249u;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f14249u.cancel();
        }
        this.f14245q = 10.0f;
        this.f14249u = new AnimatorSet();
        AnimatorSet animatorSet2 = null;
        int i = 0;
        while (i < this.f14250v) {
            AnimatorSet a = m19798a((float) i);
            a.addListener(new C5029m(this));
            AnimatorSet.Builder play = this.f14249u.play(a);
            if (animatorSet2 != null) {
                play.after(animatorSet2);
            }
            i++;
            animatorSet2 = a;
        }
        this.f14249u.addListener(new C5030n(this));
        this.f14249u.start();
    }

    /* renamed from: c */
    public void mo14065c() {
        mo14064b();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        String str;
        if (this.f14242n == Locale.CHINESE.getLanguage()) {
            if (!TextUtils.isEmpty(this.f14233e)) {
                Paint.FontMetrics fontMetrics = this.f14229a.getFontMetrics();
                canvas.drawText(this.f14233e, (((float) getWidth()) - this.f14229a.measureText(this.f14233e)) / 2.0f, ((float) (getWidth() / 2)) - (fontMetrics.bottom - fontMetrics.descent), this.f14229a);
            }
            if (!TextUtils.isEmpty(this.f14235g)) {
                float width = ((((float) getWidth()) - this.f14229a.measureText(this.f14233e)) / 2.0f) + this.f14236h;
                float measureText = ((((this.f14229a.measureText(this.f14233e) + width) - this.f14230b.measureText(this.f14235g.substring(0, 1))) - this.f14236h) - width) / ((float) (this.f14235g.length() - 1));
                Paint.FontMetrics fontMetrics2 = this.f14230b.getFontMetrics();
                float f2 = fontMetrics2.descent - fontMetrics2.ascent;
                for (int i = 0; i < this.f14235g.length(); i++) {
                    char charAt = this.f14235g.charAt(i);
                    canvas.drawText(charAt + "", (((float) i) * measureText) + width, ((float) (getWidth() / 2)) + f2, this.f14230b);
                }
            }
        } else {
            if (!TextUtils.isEmpty(this.f14233e)) {
                if (!TextUtils.isEmpty(this.f14234f)) {
                    Paint.FontMetrics fontMetrics3 = this.f14229a.getFontMetrics();
                    float f3 = fontMetrics3.bottom;
                    float f4 = fontMetrics3.descent;
                    f = f3 - f4;
                    float f5 = f4 - fontMetrics3.ascent;
                    this.f14229a.setTextAlign(Paint.Align.CENTER);
                    canvas.drawText(this.f14233e, ((float) getWidth()) / 2.0f, (((float) (getWidth() / 2)) - f) - f5, this.f14229a);
                    str = this.f14234f;
                } else {
                    Paint.FontMetrics fontMetrics4 = this.f14229a.getFontMetrics();
                    f = fontMetrics4.bottom - fontMetrics4.descent;
                    this.f14229a.setTextAlign(Paint.Align.CENTER);
                    str = this.f14233e;
                }
                canvas.drawText(str, ((float) getWidth()) / 2.0f, ((float) (getWidth() / 2)) - f, this.f14229a);
            }
            if (!TextUtils.isEmpty(this.f14235g)) {
                Paint.FontMetrics fontMetrics5 = this.f14230b.getFontMetrics();
                float f6 = fontMetrics5.bottom;
                float f7 = fontMetrics5.descent;
                float f8 = f6 - f7;
                float f9 = f7 - fontMetrics5.ascent;
                this.f14230b.setTextAlign(Paint.Align.CENTER);
                canvas.drawText(this.f14235g, (float) (getWidth() / 2), (((float) (getWidth() / 2)) - f8) + (f9 * 2.0f), this.f14230b);
            }
        }
        canvas.drawCircle((float) (getWidth() / 2), (float) (getWidth() / 2), (((float) getWidth()) / 2.0f) - m19795a(2.0f, getContext().getResources().getDisplayMetrics()), this.f14231c);
        this.f14243o.set(m19795a(2.5f, getContext().getResources().getDisplayMetrics()), m19795a(2.5f, getContext().getResources().getDisplayMetrics()), ((float) getWidth()) - m19795a(2.5f, getContext().getResources().getDisplayMetrics()), ((float) getWidth()) - m19795a(2.5f, getContext().getResources().getDisplayMetrics()));
        canvas.drawArc(this.f14243o, this.f14247s + this.f14246r, this.f14245q, false, this.f14232d);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(i, i2);
    }

    public void setLanguage(String str) {
        this.f14242n = str;
        invalidate();
    }

    public void setSubTitle(String str) {
        this.f14235g = str;
        invalidate();
    }

    public void setSubTitleFontSize(int i) {
        this.f14253y = (int) (((float) i) * getResources().getDisplayMetrics().scaledDensity);
        this.f14230b.setTextSize((float) this.f14253y);
        invalidate();
    }

    public void setTitle(String str) {
        this.f14233e = str;
        invalidate();
    }

    public void setTitle2(String str) {
        this.f14234f = str;
        invalidate();
    }

    public void setTitleFontSize(int i) {
        this.f14252x = (int) (((float) i) * getResources().getDisplayMetrics().scaledDensity);
        this.f14229a.setTextSize((float) this.f14252x);
        invalidate();
    }
}
