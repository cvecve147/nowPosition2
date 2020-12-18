package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.widget.C0149e;
import android.support.p007v4.view.C0487v;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import p013b.p018b.p022d.C0958d;
import p013b.p018b.p022d.C0963i;

public class SnackbarContentLayout extends LinearLayout implements C0149e {

    /* renamed from: a */
    private TextView f472a;

    /* renamed from: b */
    private Button f473b;

    /* renamed from: c */
    private int f474c;

    /* renamed from: d */
    private int f475d;

    public SnackbarContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0963i.SnackbarLayout);
        this.f474c = obtainStyledAttributes.getDimensionPixelSize(C0963i.SnackbarLayout_android_maxWidth, -1);
        this.f475d = obtainStyledAttributes.getDimensionPixelSize(C0963i.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static void m349a(View view, int i, int i2) {
        if (C0487v.m2260A(view)) {
            C0487v.m2269a(view, C0487v.m2297m(view), i, C0487v.m2296l(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: a */
    private boolean m350a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f472a.getPaddingTop() == i2 && this.f472a.getPaddingBottom() == i3) {
            return z;
        }
        m349a((View) this.f472a, i2, i3);
        return true;
    }

    public Button getActionView() {
        return this.f473b;
    }

    public TextView getMessageView() {
        return this.f472a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f472a = (TextView) findViewById(C0958d.snackbar_text);
        this.f473b = (Button) findViewById(C0958d.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (m350a(1, r0, r0 - r1) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (m350a(0, r0, r0) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f474c
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f474c
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = p013b.p018b.p022d.C0956b.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = p013b.p018b.p022d.C0956b.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f472a
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = r4
            goto L_0x003d
        L_0x003c:
            r2 = r3
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f475d
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.f473b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f475d
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.m350a((int) r4, (int) r0, (int) r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.m350a((int) r3, (int) r0, (int) r0)
            if (r0 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r4 = r3
        L_0x0062:
            if (r4 == 0) goto L_0x0067
            super.onMeasure(r8, r9)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.internal.SnackbarContentLayout.onMeasure(int, int):void");
    }
}
