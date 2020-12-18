package android.support.p011v7.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.view.C0487v;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import org.apache.http.message.TokenParser;
import p013b.p018b.p028h.p031b.p032a.C1026a;
import p013b.p018b.p040i.p041a.C1103a;
import p013b.p018b.p040i.p041a.C1112j;
import p013b.p018b.p040i.p043c.p044a.C1118b;
import p013b.p018b.p040i.p048f.C1124a;

/* renamed from: android.support.v7.widget.SwitchCompat */
public class SwitchCompat extends CompoundButton {

    /* renamed from: a */
    private static final Property<SwitchCompat, Float> f3222a = new C0809Za(Float.class, "thumbPos");

    /* renamed from: b */
    private static final int[] f3223b = {16842912};

    /* renamed from: A */
    private int f3224A;

    /* renamed from: B */
    private int f3225B;

    /* renamed from: C */
    private int f3226C;

    /* renamed from: D */
    private int f3227D;

    /* renamed from: E */
    private int f3228E;

    /* renamed from: F */
    private int f3229F;

    /* renamed from: G */
    private int f3230G;

    /* renamed from: H */
    private final TextPaint f3231H;

    /* renamed from: I */
    private ColorStateList f3232I;

    /* renamed from: J */
    private Layout f3233J;

    /* renamed from: K */
    private Layout f3234K;

    /* renamed from: L */
    private TransformationMethod f3235L;

    /* renamed from: M */
    ObjectAnimator f3236M;

    /* renamed from: N */
    private final Rect f3237N;

    /* renamed from: c */
    private Drawable f3238c;

    /* renamed from: d */
    private ColorStateList f3239d;

    /* renamed from: e */
    private PorterDuff.Mode f3240e;

    /* renamed from: f */
    private boolean f3241f;

    /* renamed from: g */
    private boolean f3242g;

    /* renamed from: h */
    private Drawable f3243h;

    /* renamed from: i */
    private ColorStateList f3244i;

    /* renamed from: j */
    private PorterDuff.Mode f3245j;

    /* renamed from: k */
    private boolean f3246k;

    /* renamed from: l */
    private boolean f3247l;

    /* renamed from: m */
    private int f3248m;

    /* renamed from: n */
    private int f3249n;

    /* renamed from: o */
    private int f3250o;

    /* renamed from: p */
    private boolean f3251p;

    /* renamed from: q */
    private CharSequence f3252q;

    /* renamed from: r */
    private CharSequence f3253r;

    /* renamed from: s */
    private boolean f3254s;

    /* renamed from: t */
    private int f3255t;

    /* renamed from: u */
    private int f3256u;

    /* renamed from: v */
    private float f3257v;

    /* renamed from: w */
    private float f3258w;

    /* renamed from: x */
    private VelocityTracker f3259x;

    /* renamed from: y */
    private int f3260y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public float f3261z;

    public SwitchCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1103a.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3239d = null;
        this.f3240e = null;
        this.f3241f = false;
        this.f3242g = false;
        this.f3244i = null;
        this.f3245j = null;
        this.f3246k = false;
        this.f3247l = false;
        this.f3259x = VelocityTracker.obtain();
        this.f3237N = new Rect();
        this.f3231H = new TextPaint(1);
        Resources resources = getResources();
        this.f3231H.density = resources.getDisplayMetrics().density;
        C0829eb a = C0829eb.m4793a(context, attributeSet, C1112j.SwitchCompat, i, 0);
        this.f3238c = a.mo4477b(C1112j.SwitchCompat_android_thumb);
        Drawable drawable = this.f3238c;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        this.f3243h = a.mo4477b(C1112j.SwitchCompat_track);
        Drawable drawable2 = this.f3243h;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        this.f3252q = a.mo4483e(C1112j.SwitchCompat_android_textOn);
        this.f3253r = a.mo4483e(C1112j.SwitchCompat_android_textOff);
        this.f3254s = a.mo4475a(C1112j.SwitchCompat_showText, true);
        this.f3248m = a.mo4478c(C1112j.SwitchCompat_thumbTextPadding, 0);
        this.f3249n = a.mo4478c(C1112j.SwitchCompat_switchMinWidth, 0);
        this.f3250o = a.mo4478c(C1112j.SwitchCompat_switchPadding, 0);
        this.f3251p = a.mo4475a(C1112j.SwitchCompat_splitTrack, false);
        ColorStateList a2 = a.mo4472a(C1112j.SwitchCompat_thumbTint);
        if (a2 != null) {
            this.f3239d = a2;
            this.f3241f = true;
        }
        PorterDuff.Mode a3 = C0831fa.m4812a(a.mo4480d(C1112j.SwitchCompat_thumbTintMode, -1), (PorterDuff.Mode) null);
        if (this.f3240e != a3) {
            this.f3240e = a3;
            this.f3242g = true;
        }
        if (this.f3241f || this.f3242g) {
            m4573a();
        }
        ColorStateList a4 = a.mo4472a(C1112j.SwitchCompat_trackTint);
        if (a4 != null) {
            this.f3244i = a4;
            this.f3246k = true;
        }
        PorterDuff.Mode a5 = C0831fa.m4812a(a.mo4480d(C1112j.SwitchCompat_trackTintMode, -1), (PorterDuff.Mode) null);
        if (this.f3245j != a5) {
            this.f3245j = a5;
            this.f3247l = true;
        }
        if (this.f3246k || this.f3247l) {
            m4578b();
        }
        int g = a.mo4486g(C1112j.SwitchCompat_switchTextAppearance, 0);
        if (g != 0) {
            mo4193a(context, g);
        }
        a.mo4474a();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3256u = viewConfiguration.getScaledTouchSlop();
        this.f3260y = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: a */
    private static float m4570a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: a */
    private Layout m4572a(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f3235L;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f3231H;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: a */
    private void m4573a() {
        if (this.f3238c == null) {
            return;
        }
        if (this.f3241f || this.f3242g) {
            this.f3238c = this.f3238c.mutate();
            if (this.f3241f) {
                C1026a.m5447a(this.f3238c, this.f3239d);
            }
            if (this.f3242g) {
                C1026a.m5450a(this.f3238c, this.f3240e);
            }
            if (this.f3238c.isStateful()) {
                this.f3238c.setState(getDrawableState());
            }
        }
    }

    /* renamed from: a */
    private void m4574a(int i, int i2) {
        mo4194a(i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i2);
    }

    /* renamed from: a */
    private void m4575a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    private void m4576a(boolean z) {
        this.f3236M = ObjectAnimator.ofFloat(this, f3222a, new float[]{z ? 1.0f : 0.0f});
        this.f3236M.setDuration(250);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f3236M.setAutoCancel(true);
        }
        this.f3236M.start();
    }

    /* renamed from: a */
    private boolean m4577a(float f, float f2) {
        if (this.f3238c == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f3238c.getPadding(this.f3237N);
        int i = this.f3228E;
        int i2 = this.f3256u;
        int i3 = i - i2;
        int i4 = (this.f3227D + thumbOffset) - i2;
        Rect rect = this.f3237N;
        return f > ((float) i4) && f < ((float) ((((this.f3226C + i4) + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.f3230G + i2));
    }

    /* renamed from: b */
    private void m4578b() {
        if (this.f3243h == null) {
            return;
        }
        if (this.f3246k || this.f3247l) {
            this.f3243h = this.f3243h.mutate();
            if (this.f3246k) {
                C1026a.m5447a(this.f3243h, this.f3244i);
            }
            if (this.f3247l) {
                C1026a.m5450a(this.f3243h, this.f3245j);
            }
            if (this.f3243h.isStateful()) {
                this.f3243h.setState(getDrawableState());
            }
        }
    }

    /* renamed from: b */
    private void m4579b(MotionEvent motionEvent) {
        boolean z;
        this.f3255t = 0;
        boolean z2 = true;
        boolean z3 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z3) {
            this.f3259x.computeCurrentVelocity(1000);
            float xVelocity = this.f3259x.getXVelocity();
            if (Math.abs(xVelocity) > ((float) this.f3260y)) {
                if (!C0902ub.m5141a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z2 = false;
                }
                z = z2;
            } else {
                z = getTargetCheckedState();
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m4575a(motionEvent);
    }

    /* renamed from: c */
    private void m4580c() {
        ObjectAnimator objectAnimator = this.f3236M;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private boolean getTargetCheckedState() {
        return this.f3261z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C0902ub.m5141a(this) ? 1.0f - this.f3261z : this.f3261z) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f3243h;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f3237N;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f3238c;
        Rect c = drawable2 != null ? C0831fa.m4815c(drawable2) : C0831fa.f3431a;
        return ((((this.f3224A - this.f3226C) - rect.left) - rect.right) - c.left) - c.right;
    }

    /* renamed from: a */
    public void mo4193a(Context context, int i) {
        C0829eb a = C0829eb.m4791a(context, i, C1112j.TextAppearance);
        ColorStateList a2 = a.mo4472a(C1112j.TextAppearance_android_textColor);
        if (a2 == null) {
            a2 = getTextColors();
        }
        this.f3232I = a2;
        int c = a.mo4478c(C1112j.TextAppearance_android_textSize, 0);
        if (c != 0) {
            float f = (float) c;
            if (f != this.f3231H.getTextSize()) {
                this.f3231H.setTextSize(f);
                requestLayout();
            }
        }
        m4574a(a.mo4480d(C1112j.TextAppearance_android_typeface, -1), a.mo4480d(C1112j.TextAppearance_android_textStyle, -1));
        this.f3235L = a.mo4475a(C1112j.TextAppearance_textAllCaps, false) ? new C1124a(getContext()) : null;
        a.mo4474a();
    }

    /* renamed from: a */
    public void mo4194a(Typeface typeface, int i) {
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(defaultFromStyle);
            int i2 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i;
            TextPaint textPaint = this.f3231H;
            if ((i2 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f3231H;
            if ((i2 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f3231H.setFakeBoldText(false);
        this.f3231H.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f3237N;
        int i3 = this.f3227D;
        int i4 = this.f3228E;
        int i5 = this.f3229F;
        int i6 = this.f3230G;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f3238c;
        Rect c = drawable != null ? C0831fa.m4815c(drawable) : C0831fa.f3431a;
        Drawable drawable2 = this.f3243h;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (c != null) {
                int i8 = c.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = c.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = c.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = c.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f3243h.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f3243h.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f3238c;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f3226C + rect.right;
            this.f3238c.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C1026a.m5446a(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f3238c;
        if (drawable != null) {
            C1026a.m5445a(drawable, f, f2);
        }
        Drawable drawable2 = this.f3243h;
        if (drawable2 != null) {
            C1026a.m5445a(drawable2, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3238c;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f3243h;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!C0902ub.m5141a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f3224A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f3250o : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C0902ub.m5141a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f3224A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f3250o : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f3254s;
    }

    public boolean getSplitTrack() {
        return this.f3251p;
    }

    public int getSwitchMinWidth() {
        return this.f3249n;
    }

    public int getSwitchPadding() {
        return this.f3250o;
    }

    public CharSequence getTextOff() {
        return this.f3253r;
    }

    public CharSequence getTextOn() {
        return this.f3252q;
    }

    public Drawable getThumbDrawable() {
        return this.f3238c;
    }

    public int getThumbTextPadding() {
        return this.f3248m;
    }

    public ColorStateList getThumbTintList() {
        return this.f3239d;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f3240e;
    }

    public Drawable getTrackDrawable() {
        return this.f3243h;
    }

    public ColorStateList getTrackTintList() {
        return this.f3244i;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f3245j;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3238c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3243h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f3236M;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f3236M.end();
            this.f3236M = null;
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f3223b);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f3237N;
        Drawable drawable = this.f3243h;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f3228E;
        int i3 = this.f3230G;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f3238c;
        if (drawable != null) {
            if (!this.f3251p || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect c = C0831fa.m4815c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += c.left;
                rect.right -= c.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f3233J : this.f3234K;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f3232I;
            if (colorStateList != null) {
                this.f3231H.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f3231H.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f3252q : this.f3253r;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(TokenParser.f19315SP);
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i2, i3, i4);
        int i11 = 0;
        if (this.f3238c != null) {
            Rect rect = this.f3237N;
            Drawable drawable = this.f3243h;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect c = C0831fa.m4815c(this.f3238c);
            i5 = Math.max(0, c.left - rect.left);
            i11 = Math.max(0, c.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0902ub.m5141a(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f3224A + i7) - i5) - i11;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i11;
            i7 = (i6 - this.f3224A) + i5 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i10 = this.f3225B;
            i9 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i10 / 2);
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i10 = this.f3225B;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f3225B;
            this.f3227D = i7;
            this.f3228E = i9;
            this.f3230G = i8;
            this.f3229F = i6;
        }
        i8 = i10 + i9;
        this.f3227D = i7;
        this.f3228E = i9;
        this.f3230G = i8;
        this.f3229F = i6;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f3254s) {
            if (this.f3233J == null) {
                this.f3233J = m4572a(this.f3252q);
            }
            if (this.f3234K == null) {
                this.f3234K = m4572a(this.f3253r);
            }
        }
        Rect rect = this.f3237N;
        Drawable drawable = this.f3238c;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f3238c.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f3238c.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.f3226C = Math.max(this.f3254s ? Math.max(this.f3233J.getWidth(), this.f3234K.getWidth()) + (this.f3248m * 2) : 0, i4);
        Drawable drawable2 = this.f3243h;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f3243h.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f3238c;
        if (drawable3 != null) {
            Rect c = C0831fa.m4815c(drawable3);
            i6 = Math.max(i6, c.left);
            i7 = Math.max(i7, c.right);
        }
        int max = Math.max(this.f3249n, (this.f3226C * 2) + i6 + i7);
        int max2 = Math.max(i5, i3);
        this.f3224A = max;
        this.f3225B = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f3252q : this.f3253r;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f3259x
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x009f
            r2 = 2
            if (r0 == r1) goto L_0x008b
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x008b
            goto L_0x00b9
        L_0x0016:
            int r0 = r6.f3255t
            if (r0 == 0) goto L_0x00b9
            if (r0 == r1) goto L_0x0057
            if (r0 == r2) goto L_0x0020
            goto L_0x00b9
        L_0x0020:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f3257v
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0034
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003d
        L_0x0034:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x003a
            r2 = r3
            goto L_0x003d
        L_0x003a:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L_0x003d:
            boolean r0 = android.support.p011v7.widget.C0902ub.m5141a(r6)
            if (r0 == 0) goto L_0x0044
            float r2 = -r2
        L_0x0044:
            float r0 = r6.f3261z
            float r0 = r0 + r2
            float r0 = m4570a(r0, r4, r3)
            float r2 = r6.f3261z
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0056
            r6.f3257v = r7
            r6.setThumbPosition(r0)
        L_0x0056:
            return r1
        L_0x0057:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f3257v
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f3256u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007d
            float r4 = r6.f3258w
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f3256u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b9
        L_0x007d:
            r6.f3255t = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f3257v = r0
            r6.f3258w = r3
            return r1
        L_0x008b:
            int r0 = r6.f3255t
            if (r0 != r2) goto L_0x0096
            r6.m4579b(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0096:
            r0 = 0
            r6.f3255t = r0
            android.view.VelocityTracker r0 = r6.f3259x
            r0.clear()
            goto L_0x00b9
        L_0x009f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00b9
            boolean r3 = r6.m4577a((float) r0, (float) r2)
            if (r3 == 0) goto L_0x00b9
            r6.f3255t = r1
            r6.f3257v = r0
            r6.f3258w = r2
        L_0x00b9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !C0487v.m2309y(this)) {
            m4580c();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        m4576a(isChecked);
    }

    public void setShowText(boolean z) {
        if (this.f3254s != z) {
            this.f3254s = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f3251p = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f3249n = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f3250o = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f3231H.getTypeface() != null && !this.f3231H.getTypeface().equals(typeface)) || (this.f3231H.getTypeface() == null && typeface != null)) {
            this.f3231H.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f3253r = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f3252q = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3238c;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f3238c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f) {
        this.f3261z = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C1118b.m5721b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f3248m = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f3239d = colorStateList;
        this.f3241f = true;
        m4573a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f3240e = mode;
        this.f3242g = true;
        m4573a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3243h;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f3243h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C1118b.m5721b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f3244i = colorStateList;
        this.f3246k = true;
        m4578b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f3245j = mode;
        this.f3247l = true;
        m4578b();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3238c || drawable == this.f3243h;
    }
}
