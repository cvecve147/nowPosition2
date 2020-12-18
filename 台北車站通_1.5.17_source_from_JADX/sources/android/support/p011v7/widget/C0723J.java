package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p013b.p018b.p040i.p041a.C1112j;

/* renamed from: android.support.v7.widget.J */
class C0723J {

    /* renamed from: a */
    private static final RectF f2806a = new RectF();

    /* renamed from: b */
    private static ConcurrentHashMap<String, Method> f2807b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private int f2808c = 0;

    /* renamed from: d */
    private boolean f2809d = false;

    /* renamed from: e */
    private float f2810e = -1.0f;

    /* renamed from: f */
    private float f2811f = -1.0f;

    /* renamed from: g */
    private float f2812g = -1.0f;

    /* renamed from: h */
    private int[] f2813h = new int[0];

    /* renamed from: i */
    private boolean f2814i = false;

    /* renamed from: j */
    private TextPaint f2815j;

    /* renamed from: k */
    private final TextView f2816k;

    /* renamed from: l */
    private final Context f2817l;

    C0723J(TextView textView) {
        this.f2816k = textView;
        this.f2817l = this.f2816k.getContext();
    }

    /* renamed from: a */
    private int m3673a(RectF rectF) {
        int length = this.f2813h.length;
        if (length != 0) {
            int i = 0;
            int i2 = 1;
            int i3 = length - 1;
            while (true) {
                int i4 = i2;
                int i5 = i;
                i = i4;
                while (i <= i3) {
                    int i6 = (i + i3) / 2;
                    if (m3681a(this.f2813h[i6], rectF)) {
                        i2 = i6 + 1;
                    } else {
                        i5 = i6 - 1;
                        i3 = i5;
                    }
                }
                return this.f2813h[i5];
            }
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: a */
    private StaticLayout m3674a(CharSequence charSequence, Layout.Alignment alignment, int i) {
        boolean z;
        float f;
        float f2;
        if (Build.VERSION.SDK_INT >= 16) {
            f2 = this.f2816k.getLineSpacingMultiplier();
            f = this.f2816k.getLineSpacingExtra();
            z = this.f2816k.getIncludeFontPadding();
        } else {
            f2 = ((Float) m3676a((Object) this.f2816k, "getLineSpacingMultiplier", Float.valueOf(1.0f))).floatValue();
            f = ((Float) m3676a((Object) this.f2816k, "getLineSpacingExtra", Float.valueOf(0.0f))).floatValue();
            z = ((Boolean) m3676a((Object) this.f2816k, "getIncludeFontPadding", true)).booleanValue();
        }
        return new StaticLayout(charSequence, this.f2815j, i, alignment, f2, f, z);
    }

    /* renamed from: a */
    private StaticLayout m3675a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) m3676a((Object) this.f2816k, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f2815j, i).setAlignment(alignment).setLineSpacing(this.f2816k.getLineSpacingExtra(), this.f2816k.getLineSpacingMultiplier()).setIncludePad(this.f2816k.getIncludeFontPadding()).setBreakStrategy(this.f2816k.getBreakStrategy()).setHyphenationFrequency(this.f2816k.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }

    /* renamed from: a */
    private <T> T m3676a(Object obj, String str, T t) {
        try {
            return m3677a(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: a */
    private Method m3677a(String str) {
        try {
            Method method = f2807b.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f2807b.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: a */
    private void m3678a(float f) {
        if (f != this.f2816k.getPaint().getTextSize()) {
            this.f2816k.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f2816k.isInLayout() : false;
            if (this.f2816k.getLayout() != null) {
                this.f2809d = false;
                try {
                    Method a = m3677a("nullLayouts");
                    if (a != null) {
                        a.invoke(this.f2816k, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f2816k.requestLayout();
                } else {
                    this.f2816k.forceLayout();
                }
                this.f2816k.invalidate();
            }
        }
    }

    /* renamed from: a */
    private void m3679a(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size " + "text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f2808c = 1;
            this.f2811f = f;
            this.f2812g = f2;
            this.f2810e = f3;
            this.f2814i = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    /* renamed from: a */
    private void m3680a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f2813h = m3682a(iArr);
            m3685j();
        }
    }

    /* renamed from: a */
    private boolean m3681a(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f2816k.getText();
        TransformationMethod transformationMethod = this.f2816k.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f2816k)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f2816k.getMaxLines() : -1;
        TextPaint textPaint = this.f2815j;
        if (textPaint == null) {
            this.f2815j = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f2815j.set(this.f2816k.getPaint());
        this.f2815j.setTextSize((float) i);
        Layout.Alignment alignment = (Layout.Alignment) m3676a((Object) this.f2816k, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        StaticLayout a = Build.VERSION.SDK_INT >= 23 ? m3675a(text, alignment, Math.round(rectF.right), maxLines) : m3674a(text, alignment, Math.round(rectF.right));
        return (maxLines == -1 || (a.getLineCount() <= maxLines && a.getLineEnd(a.getLineCount() - 1) == text.length())) && ((float) a.getHeight()) <= rectF.bottom;
    }

    /* renamed from: a */
    private int[] m3682a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: h */
    private void m3683h() {
        this.f2808c = 0;
        this.f2811f = -1.0f;
        this.f2812g = -1.0f;
        this.f2810e = -1.0f;
        this.f2813h = new int[0];
        this.f2809d = false;
    }

    /* renamed from: i */
    private boolean m3684i() {
        if (!m3686k() || this.f2808c != 1) {
            this.f2809d = false;
        } else {
            if (!this.f2814i || this.f2813h.length == 0) {
                float round = (float) Math.round(this.f2811f);
                int i = 1;
                while (Math.round(this.f2810e + round) <= Math.round(this.f2812g)) {
                    i++;
                    round += this.f2810e;
                }
                int[] iArr = new int[i];
                float f = this.f2811f;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.f2810e;
                }
                this.f2813h = m3682a(iArr);
            }
            this.f2809d = true;
        }
        return this.f2809d;
    }

    /* renamed from: j */
    private boolean m3685j() {
        int length = this.f2813h.length;
        this.f2814i = length > 0;
        if (this.f2814i) {
            this.f2808c = 1;
            int[] iArr = this.f2813h;
            this.f2811f = (float) iArr[0];
            this.f2812g = (float) iArr[length - 1];
            this.f2810e = -1.0f;
        }
        return this.f2814i;
    }

    /* renamed from: k */
    private boolean m3686k() {
        return !(this.f2816k instanceof C0878q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3423a() {
        if (mo3434g()) {
            if (this.f2809d) {
                if (this.f2816k.getMeasuredHeight() > 0 && this.f2816k.getMeasuredWidth() > 0) {
                    int measuredWidth = ((Boolean) m3676a((Object) this.f2816k, "getHorizontallyScrolling", false)).booleanValue() ? 1048576 : (this.f2816k.getMeasuredWidth() - this.f2816k.getTotalPaddingLeft()) - this.f2816k.getTotalPaddingRight();
                    int height = (this.f2816k.getHeight() - this.f2816k.getCompoundPaddingBottom()) - this.f2816k.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        synchronized (f2806a) {
                            f2806a.setEmpty();
                            f2806a.right = (float) measuredWidth;
                            f2806a.bottom = (float) height;
                            float a = (float) m3673a(f2806a);
                            if (a != this.f2816k.getTextSize()) {
                                mo3425a(0, a);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f2809d = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3424a(int i) {
        if (!m3686k()) {
            return;
        }
        if (i == 0) {
            m3683h();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f2817l.getResources().getDisplayMetrics();
            m3679a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m3684i()) {
                mo3423a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3425a(int i, float f) {
        Context context = this.f2817l;
        m3678a(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3426a(int i, int i2, int i3, int i4) {
        if (m3686k()) {
            DisplayMetrics displayMetrics = this.f2817l.getResources().getDisplayMetrics();
            m3679a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m3684i()) {
                mo3423a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3427a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f2817l.obtainStyledAttributes(attributeSet, C1112j.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(C1112j.AppCompatTextView_autoSizeTextType)) {
            this.f2808c = obtainStyledAttributes.getInt(C1112j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C1112j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C1112j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C1112j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C1112j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C1112j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C1112j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C1112j.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(C1112j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m3680a(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m3686k()) {
            this.f2808c = 0;
        } else if (this.f2808c == 1) {
            if (!this.f2814i) {
                DisplayMetrics displayMetrics = this.f2817l.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m3679a(dimension2, dimension3, dimension);
            }
            m3684i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3428a(int[] iArr, int i) {
        if (m3686k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f2817l.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f2813h = m3682a(iArr2);
                if (!m3685j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f2814i = false;
            }
            if (m3684i()) {
                mo3423a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo3429b() {
        return Math.round(this.f2812g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo3430c() {
        return Math.round(this.f2811f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo3431d() {
        return Math.round(this.f2810e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] mo3432e() {
        return this.f2813h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo3433f() {
        return this.f2808c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo3434g() {
        return m3686k() && this.f2808c != 0;
    }
}
