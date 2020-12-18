package android.support.p011v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p007v4.view.C0487v;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* renamed from: android.support.v7.widget.ContentFrameLayout */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a */
    private TypedValue f2761a;

    /* renamed from: b */
    private TypedValue f2762b;

    /* renamed from: c */
    private TypedValue f2763c;

    /* renamed from: d */
    private TypedValue f2764d;

    /* renamed from: e */
    private TypedValue f2765e;

    /* renamed from: f */
    private TypedValue f2766f;

    /* renamed from: g */
    private final Rect f2767g;

    /* renamed from: h */
    private C0707a f2768h;

    /* renamed from: android.support.v7.widget.ContentFrameLayout$a */
    public interface C0707a {
        /* renamed from: a */
        void mo2669a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2767g = new Rect();
    }

    /* renamed from: a */
    public void mo3304a(int i, int i2, int i3, int i4) {
        this.f2767g.set(i, i2, i3, i4);
        if (C0487v.m2309y(this)) {
            requestLayout();
        }
    }

    /* renamed from: a */
    public void mo3305a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f2765e == null) {
            this.f2765e = new TypedValue();
        }
        return this.f2765e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f2766f == null) {
            this.f2766f = new TypedValue();
        }
        return this.f2766f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f2763c == null) {
            this.f2763c = new TypedValue();
        }
        return this.f2763c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f2764d == null) {
            this.f2764d = new TypedValue();
        }
        return this.f2764d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f2761a == null) {
            this.f2761a = new TypedValue();
        }
        return this.f2761a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f2762b == null) {
            this.f2762b = new TypedValue();
        }
        return this.f2762b;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0707a aVar = this.f2768h;
        if (aVar != null) {
            aVar.mo2669a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0707a aVar = this.f2768h;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            android.content.Context r0 = r13.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.widthPixels
            int r2 = r0.heightPixels
            r3 = 1
            r4 = 0
            if (r1 >= r2) goto L_0x0016
            r1 = r3
            goto L_0x0017
        L_0x0016:
            r1 = r4
        L_0x0017:
            int r2 = android.view.View.MeasureSpec.getMode(r14)
            int r5 = android.view.View.MeasureSpec.getMode(r15)
            r6 = 6
            r7 = 5
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 1073741824(0x40000000, float:2.0)
            if (r2 != r8) goto L_0x0061
            if (r1 == 0) goto L_0x002c
            android.util.TypedValue r10 = r13.f2764d
            goto L_0x002e
        L_0x002c:
            android.util.TypedValue r10 = r13.f2763c
        L_0x002e:
            if (r10 == 0) goto L_0x0061
            int r11 = r10.type
            if (r11 == 0) goto L_0x0061
            if (r11 != r7) goto L_0x003c
            float r10 = r10.getDimension(r0)
        L_0x003a:
            int r10 = (int) r10
            goto L_0x0048
        L_0x003c:
            if (r11 != r6) goto L_0x0047
            int r11 = r0.widthPixels
            float r12 = (float) r11
            float r11 = (float) r11
            float r10 = r10.getFraction(r12, r11)
            goto L_0x003a
        L_0x0047:
            r10 = r4
        L_0x0048:
            if (r10 <= 0) goto L_0x0061
            android.graphics.Rect r11 = r13.f2767g
            int r12 = r11.left
            int r11 = r11.right
            int r12 = r12 + r11
            int r10 = r10 - r12
            int r14 = android.view.View.MeasureSpec.getSize(r14)
            int r14 = java.lang.Math.min(r10, r14)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r9)
            r10 = r14
            r14 = r3
            goto L_0x0063
        L_0x0061:
            r10 = r14
            r14 = r4
        L_0x0063:
            if (r5 != r8) goto L_0x009c
            if (r1 == 0) goto L_0x006a
            android.util.TypedValue r5 = r13.f2765e
            goto L_0x006c
        L_0x006a:
            android.util.TypedValue r5 = r13.f2766f
        L_0x006c:
            if (r5 == 0) goto L_0x009c
            int r11 = r5.type
            if (r11 == 0) goto L_0x009c
            if (r11 != r7) goto L_0x007a
            float r5 = r5.getDimension(r0)
        L_0x0078:
            int r5 = (int) r5
            goto L_0x0086
        L_0x007a:
            if (r11 != r6) goto L_0x0085
            int r11 = r0.heightPixels
            float r12 = (float) r11
            float r11 = (float) r11
            float r5 = r5.getFraction(r12, r11)
            goto L_0x0078
        L_0x0085:
            r5 = r4
        L_0x0086:
            if (r5 <= 0) goto L_0x009c
            android.graphics.Rect r11 = r13.f2767g
            int r12 = r11.top
            int r11 = r11.bottom
            int r12 = r12 + r11
            int r5 = r5 - r12
            int r15 = android.view.View.MeasureSpec.getSize(r15)
            int r15 = java.lang.Math.min(r5, r15)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r9)
        L_0x009c:
            super.onMeasure(r10, r15)
            int r5 = r13.getMeasuredWidth()
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r9)
            if (r14 != 0) goto L_0x00dd
            if (r2 != r8) goto L_0x00dd
            if (r1 == 0) goto L_0x00b0
            android.util.TypedValue r14 = r13.f2762b
            goto L_0x00b2
        L_0x00b0:
            android.util.TypedValue r14 = r13.f2761a
        L_0x00b2:
            if (r14 == 0) goto L_0x00dd
            int r1 = r14.type
            if (r1 == 0) goto L_0x00dd
            if (r1 != r7) goto L_0x00c0
            float r14 = r14.getDimension(r0)
        L_0x00be:
            int r14 = (int) r14
            goto L_0x00cc
        L_0x00c0:
            if (r1 != r6) goto L_0x00cb
            int r0 = r0.widthPixels
            float r1 = (float) r0
            float r0 = (float) r0
            float r14 = r14.getFraction(r1, r0)
            goto L_0x00be
        L_0x00cb:
            r14 = r4
        L_0x00cc:
            if (r14 <= 0) goto L_0x00d6
            android.graphics.Rect r0 = r13.f2767g
            int r1 = r0.left
            int r0 = r0.right
            int r1 = r1 + r0
            int r14 = r14 - r1
        L_0x00d6:
            if (r5 >= r14) goto L_0x00dd
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r9)
            goto L_0x00de
        L_0x00dd:
            r3 = r4
        L_0x00de:
            if (r3 == 0) goto L_0x00e3
            super.onMeasure(r10, r15)
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(C0707a aVar) {
        this.f2768h = aVar;
    }
}
