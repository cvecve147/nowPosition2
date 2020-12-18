package com.afollestad.materialdialogs.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.p011v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import p101d.p108c.p109a.C5192g;
import p101d.p108c.p109a.C5208m;
import p101d.p108c.p109a.C5210o;
import p101d.p108c.p109a.C5212q;
import p101d.p108c.p109a.C5215t;
import p101d.p108c.p109a.C5216u;
import p101d.p108c.p109a.p110a.C5182c;

public class MDRootLayout extends ViewGroup {

    /* renamed from: a */
    private int f4223a;

    /* renamed from: b */
    private View f4224b;

    /* renamed from: c */
    private View f4225c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f4226d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f4227e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final MDButton[] f4228f = new MDButton[3];

    /* renamed from: g */
    private C5216u f4229g = C5216u.ADAPTIVE;

    /* renamed from: h */
    private boolean f4230h = false;

    /* renamed from: i */
    private boolean f4231i = true;

    /* renamed from: j */
    private boolean f4232j;

    /* renamed from: k */
    private boolean f4233k;

    /* renamed from: l */
    private int f4234l;

    /* renamed from: m */
    private int f4235m;

    /* renamed from: n */
    private int f4236n;

    /* renamed from: o */
    private C5192g f4237o = C5192g.START;

    /* renamed from: p */
    private int f4238p;

    /* renamed from: q */
    private Paint f4239q;

    /* renamed from: r */
    private ViewTreeObserver.OnScrollChangedListener f4240r;

    /* renamed from: s */
    private ViewTreeObserver.OnScrollChangedListener f4241s;

    /* renamed from: t */
    private int f4242t;

    public MDRootLayout(Context context) {
        super(context);
        m5858a(context, (AttributeSet) null, 0);
    }

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5858a(context, attributeSet, 0);
    }

    @TargetApi(11)
    public MDRootLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5858a(context, attributeSet, i);
    }

    @TargetApi(21)
    public MDRootLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m5858a(context, attributeSet, i);
    }

    /* renamed from: a */
    private static View m5857a(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getBottom() == viewGroup.getMeasuredHeight()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m5858a(Context context, AttributeSet attributeSet, int i) {
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5215t.MDRootLayout, i, 0);
        this.f4232j = obtainStyledAttributes.getBoolean(C5215t.MDRootLayout_md_reduce_padding_no_title_no_buttons, true);
        obtainStyledAttributes.recycle();
        this.f4234l = resources.getDimensionPixelSize(C5210o.md_notitle_vertical_padding);
        this.f4235m = resources.getDimensionPixelSize(C5210o.md_button_frame_vertical_padding);
        this.f4238p = resources.getDimensionPixelSize(C5210o.md_button_padding_frame_side);
        this.f4236n = resources.getDimensionPixelSize(C5210o.md_button_height);
        this.f4239q = new Paint();
        this.f4242t = resources.getDimensionPixelSize(C5210o.md_divider_height);
        this.f4239q.setColor(C5182c.m20050d(context, C5208m.md_divider_color));
        setWillNotDraw(false);
    }

    /* renamed from: a */
    private void m5859a(View view, boolean z, boolean z2) {
        ScrollView scrollView;
        if (view != null) {
            if (view instanceof ScrollView) {
                ScrollView scrollView2 = (ScrollView) view;
                boolean a = m5870a(scrollView2);
                scrollView = scrollView2;
                if (!a) {
                    if (z) {
                        this.f4226d = false;
                    }
                    if (!z2) {
                        return;
                    }
                    this.f4227e = false;
                    return;
                }
            } else if (view instanceof AdapterView) {
                AdapterView adapterView = (AdapterView) view;
                boolean a2 = m5869a(adapterView);
                scrollView = adapterView;
                if (!a2) {
                    if (z) {
                        this.f4226d = false;
                    }
                    if (!z2) {
                        return;
                    }
                    this.f4227e = false;
                    return;
                }
            } else if (view instanceof WebView) {
                view.getViewTreeObserver().addOnPreDrawListener(new C1156b(this, view, z, z2));
                return;
            } else if (view instanceof RecyclerView) {
                boolean a3 = m5866a((RecyclerView) view);
                if (z) {
                    this.f4226d = a3;
                }
                if (z2) {
                    this.f4227e = a3;
                }
                if (a3) {
                    scrollView = (ViewGroup) view;
                } else {
                    return;
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                View b = m5873b(viewGroup);
                m5859a(b, z, z2);
                View a4 = m5857a(viewGroup);
                if (a4 != b) {
                    m5859a(a4, false, true);
                    return;
                }
                return;
            } else {
                return;
            }
            m5860a(scrollView, z, z2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5860a(ViewGroup viewGroup, boolean z, boolean z2) {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
        ViewTreeObserver viewTreeObserver;
        if ((!z2 && this.f4240r == null) || (z2 && this.f4241s == null)) {
            if (viewGroup instanceof RecyclerView) {
                C1157c cVar = new C1157c(this, viewGroup, z, z2);
                RecyclerView recyclerView = (RecyclerView) viewGroup;
                recyclerView.mo3636a((RecyclerView.C0766n) cVar);
                cVar.mo3951a(recyclerView, 0, 0);
                return;
            }
            C1158d dVar = new C1158d(this, viewGroup, z, z2);
            if (!z2) {
                this.f4240r = dVar;
                viewTreeObserver = viewGroup.getViewTreeObserver();
                onScrollChangedListener = this.f4240r;
            } else {
                this.f4241s = dVar;
                viewTreeObserver = viewGroup.getViewTreeObserver();
                onScrollChangedListener = this.f4241s;
            }
            viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
            dVar.onScrollChanged();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5861a(ViewGroup viewGroup, boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        if (z && viewGroup.getChildCount() > 0) {
            View view = this.f4224b;
            this.f4226d = (view == null || view.getVisibility() == 8 || viewGroup.getScrollY() + viewGroup.getPaddingTop() <= viewGroup.getChildAt(0).getTop()) ? false : true;
        }
        if (z2 && viewGroup.getChildCount() > 0) {
            if (!z3 || (viewGroup.getScrollY() + viewGroup.getHeight()) - viewGroup.getPaddingBottom() >= viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom()) {
                z4 = false;
            }
            this.f4227e = z4;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5862a(WebView webView, boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        if (z) {
            View view = this.f4224b;
            this.f4226d = (view == null || view.getVisibility() == 8 || webView.getScrollY() + webView.getPaddingTop() <= 0) ? false : true;
        }
        if (z2) {
            if (!z3 || ((float) ((webView.getScrollY() + webView.getMeasuredHeight()) - webView.getPaddingBottom())) >= ((float) webView.getContentHeight()) * webView.getScale()) {
                z4 = false;
            }
            this.f4227e = z4;
        }
    }

    /* renamed from: a */
    public static boolean m5866a(RecyclerView recyclerView) {
        return (recyclerView == null || recyclerView.getLayoutManager() == null || !recyclerView.getLayoutManager().mo3513b()) ? false : true;
    }

    /* renamed from: a */
    private static boolean m5867a(View view) {
        boolean z = (view == null || view.getVisibility() == 8) ? false : true;
        return (!z || !(view instanceof MDButton)) ? z : ((MDButton) view).getText().toString().trim().length() > 0;
    }

    /* renamed from: a */
    private static boolean m5869a(AdapterView adapterView) {
        if (adapterView.getLastVisiblePosition() == -1) {
            return false;
        }
        boolean z = adapterView.getFirstVisiblePosition() == 0;
        boolean z2 = adapterView.getLastVisiblePosition() == adapterView.getCount() - 1;
        if (!z || !z2 || adapterView.getChildCount() <= 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop()) {
            return true;
        }
        return adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r4.getChildAt(0).getMeasuredHeight();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m5870a(android.widget.ScrollView r4) {
        /*
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r0 = r4.getChildAt(r1)
            int r0 = r0.getMeasuredHeight()
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r4 = r4.getPaddingBottom()
            int r2 = r2 - r4
            if (r2 >= r0) goto L_0x0021
            r1 = 1
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.MDRootLayout.m5870a(android.widget.ScrollView):boolean");
    }

    /* renamed from: b */
    private static View m5873b(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getTop() == 0) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m5874b() {
        C5192g gVar;
        if (Build.VERSION.SDK_INT >= 17 && getResources().getConfiguration().getLayoutDirection() == 1) {
            int i = C1159e.f4255a[this.f4237o.ordinal()];
            if (i == 1) {
                gVar = C5192g.END;
            } else if (i == 2) {
                gVar = C5192g.START;
            } else {
                return;
            }
            this.f4237o = gVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m5875b(WebView webView) {
        return ((float) webView.getMeasuredHeight()) < ((float) webView.getContentHeight()) * webView.getScale();
    }

    /* renamed from: a */
    public void mo5385a() {
        this.f4233k = true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.f4225c;
        if (view != null) {
            if (this.f4226d) {
                int top = view.getTop();
                canvas.drawRect(0.0f, (float) (top - this.f4242t), (float) getMeasuredWidth(), (float) top, this.f4239q);
            }
            if (this.f4227e) {
                int bottom = this.f4225c.getBottom();
                canvas.drawRect(0.0f, (float) bottom, (float) getMeasuredWidth(), (float) (bottom + this.f4242t), this.f4239q);
            }
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() == C5212q.md_titleFrame) {
                this.f4224b = childAt;
            } else if (childAt.getId() == C5212q.md_buttonDefaultNeutral) {
                this.f4228f[0] = (MDButton) childAt;
            } else if (childAt.getId() == C5212q.md_buttonDefaultNegative) {
                this.f4228f[1] = (MDButton) childAt;
            } else if (childAt.getId() == C5212q.md_buttonDefaultPositive) {
                this.f4228f[2] = (MDButton) childAt;
            } else {
                this.f4225c = childAt;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        MDButton mDButton;
        int i9;
        int i10;
        int i11;
        int i12;
        if (m5867a(this.f4224b)) {
            int measuredHeight = this.f4224b.getMeasuredHeight() + i2;
            this.f4224b.layout(i, i2, i3, measuredHeight);
            i2 = measuredHeight;
        } else if (!this.f4233k && this.f4231i) {
            i2 += this.f4234l;
        }
        if (m5867a(this.f4225c)) {
            View view = this.f4225c;
            view.layout(i, i2, i3, view.getMeasuredHeight() + i2);
        }
        if (this.f4230h) {
            int i13 = i4 - this.f4235m;
            for (MDButton mDButton2 : this.f4228f) {
                if (m5867a((View) mDButton2)) {
                    mDButton2.layout(i, i13 - mDButton2.getMeasuredHeight(), i3, i13);
                    i13 -= mDButton2.getMeasuredHeight();
                }
            }
        } else {
            if (this.f4231i) {
                i4 -= this.f4235m;
            }
            int i14 = i4 - this.f4236n;
            int i15 = this.f4238p;
            if (m5867a((View) this.f4228f[2])) {
                if (this.f4237o == C5192g.END) {
                    i12 = i + i15;
                    i11 = this.f4228f[2].getMeasuredWidth() + i12;
                    i5 = -1;
                } else {
                    i11 = i3 - i15;
                    i12 = i11 - this.f4228f[2].getMeasuredWidth();
                    i5 = i12;
                }
                this.f4228f[2].layout(i12, i14, i11, i4);
                i15 += this.f4228f[2].getMeasuredWidth();
            } else {
                i5 = -1;
            }
            if (m5867a((View) this.f4228f[1])) {
                C5192g gVar = this.f4237o;
                if (gVar == C5192g.END) {
                    i10 = i15 + i;
                    i9 = this.f4228f[1].getMeasuredWidth() + i10;
                } else if (gVar == C5192g.START) {
                    i9 = i3 - i15;
                    i10 = i9 - this.f4228f[1].getMeasuredWidth();
                } else {
                    i10 = this.f4238p + i;
                    i9 = this.f4228f[1].getMeasuredWidth() + i10;
                    i6 = i9;
                    this.f4228f[1].layout(i10, i14, i9, i4);
                }
                i6 = -1;
                this.f4228f[1].layout(i10, i14, i9, i4);
            } else {
                i6 = -1;
            }
            if (m5867a((View) this.f4228f[0])) {
                C5192g gVar2 = this.f4237o;
                if (gVar2 == C5192g.END) {
                    i7 = i3 - this.f4238p;
                    i8 = i7 - this.f4228f[0].getMeasuredWidth();
                } else if (gVar2 == C5192g.START) {
                    i8 = i + this.f4238p;
                    i7 = this.f4228f[0].getMeasuredWidth() + i8;
                } else {
                    if (i6 != -1 || i5 == -1) {
                        if (i5 == -1 && i6 != -1) {
                            mDButton = this.f4228f[0];
                        } else if (i5 == -1) {
                            i6 = ((i3 - i) / 2) - (this.f4228f[0].getMeasuredWidth() / 2);
                            mDButton = this.f4228f[0];
                        }
                        i5 = i6 + mDButton.getMeasuredWidth();
                    } else {
                        i6 = i5 - this.f4228f[0].getMeasuredWidth();
                    }
                    i8 = i6;
                    i7 = i5;
                }
                this.f4228f[0].layout(i8, i14, i7, i4);
            }
        }
        m5859a(this.f4225c, true, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r12)
            int r1 = android.view.View.MeasureSpec.getSize(r13)
            int r2 = r11.f4223a
            if (r1 <= r2) goto L_0x000d
            r1 = r2
        L_0x000d:
            r2 = 1
            r11.f4231i = r2
            d.c.a.u r3 = r11.f4229g
            d.c.a.u r4 = p101d.p108c.p109a.C5216u.ALWAYS
            r5 = 0
            if (r3 != r4) goto L_0x001a
            r3 = r2
            r8 = r5
            goto L_0x0059
        L_0x001a:
            d.c.a.u r4 = p101d.p108c.p109a.C5216u.NEVER
            if (r3 != r4) goto L_0x0021
            r3 = r5
            r8 = r3
            goto L_0x0059
        L_0x0021:
            com.afollestad.materialdialogs.internal.MDButton[] r3 = r11.f4228f
            int r4 = r3.length
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x0027:
            if (r6 >= r4) goto L_0x0042
            r9 = r3[r6]
            if (r9 == 0) goto L_0x003f
            boolean r10 = m5867a((android.view.View) r9)
            if (r10 == 0) goto L_0x003f
            r9.mo5380a(r5, r5)
            r11.measureChild(r9, r12, r13)
            int r8 = r9.getMeasuredWidth()
            int r7 = r7 + r8
            r8 = r2
        L_0x003f:
            int r6 = r6 + 1
            goto L_0x0027
        L_0x0042:
            android.content.Context r3 = r11.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r4 = p101d.p108c.p109a.C5210o.md_neutral_button_margin
            int r3 = r3.getDimensionPixelSize(r4)
            int r3 = r3 * 2
            int r3 = r0 - r3
            if (r7 <= r3) goto L_0x0058
            r3 = r2
            goto L_0x0059
        L_0x0058:
            r3 = r5
        L_0x0059:
            r11.f4230h = r3
            if (r3 == 0) goto L_0x007d
            com.afollestad.materialdialogs.internal.MDButton[] r3 = r11.f4228f
            int r4 = r3.length
            r6 = r5
            r7 = r6
        L_0x0062:
            if (r6 >= r4) goto L_0x007e
            r9 = r3[r6]
            if (r9 == 0) goto L_0x007a
            boolean r10 = m5867a((android.view.View) r9)
            if (r10 == 0) goto L_0x007a
            r9.mo5380a(r2, r5)
            r11.measureChild(r9, r12, r13)
            int r8 = r9.getMeasuredHeight()
            int r7 = r7 + r8
            r8 = r2
        L_0x007a:
            int r6 = r6 + 1
            goto L_0x0062
        L_0x007d:
            r7 = r5
        L_0x007e:
            if (r8 == 0) goto L_0x009a
            boolean r12 = r11.f4230h
            if (r12 == 0) goto L_0x008f
            int r12 = r1 - r7
            int r13 = r11.f4235m
            int r3 = r13 * 2
            int r3 = r3 + r5
            int r13 = r13 * 2
            int r13 = r13 + r5
            goto L_0x00a2
        L_0x008f:
            int r12 = r11.f4236n
            int r12 = r1 - r12
            int r13 = r11.f4235m
            int r13 = r13 * 2
            int r3 = r13 + 0
            goto L_0x00a1
        L_0x009a:
            int r12 = r11.f4235m
            int r12 = r12 * 2
            int r3 = r12 + 0
            r12 = r1
        L_0x00a1:
            r13 = r5
        L_0x00a2:
            android.view.View r4 = r11.f4224b
            boolean r4 = m5867a((android.view.View) r4)
            r6 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L_0x00bd
            android.view.View r4 = r11.f4224b
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6)
            r4.measure(r7, r5)
            android.view.View r4 = r11.f4224b
            int r4 = r4.getMeasuredHeight()
            int r12 = r12 - r4
            goto L_0x00c4
        L_0x00bd:
            boolean r4 = r11.f4233k
            if (r4 != 0) goto L_0x00c4
            int r4 = r11.f4234l
            int r3 = r3 + r4
        L_0x00c4:
            android.view.View r4 = r11.f4225c
            boolean r4 = m5867a((android.view.View) r4)
            if (r4 == 0) goto L_0x0111
            android.view.View r4 = r11.f4225c
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6)
            int r7 = r12 - r13
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            r4.measure(r6, r7)
            android.view.View r4 = r11.f4225c
            int r4 = r4.getMeasuredHeight()
            int r6 = r12 - r3
            if (r4 > r6) goto L_0x010e
            boolean r4 = r11.f4232j
            if (r4 == 0) goto L_0x0102
            android.view.View r4 = r11.f4224b
            boolean r4 = m5867a((android.view.View) r4)
            if (r4 != 0) goto L_0x0102
            if (r8 == 0) goto L_0x00f6
            goto L_0x0102
        L_0x00f6:
            r11.f4231i = r5
            android.view.View r2 = r11.f4225c
            int r2 = r2.getMeasuredHeight()
            int r2 = r2 + r13
            int r5 = r12 - r2
            goto L_0x0112
        L_0x0102:
            r11.f4231i = r2
            android.view.View r13 = r11.f4225c
            int r13 = r13.getMeasuredHeight()
            int r13 = r13 + r3
            int r5 = r12 - r13
            goto L_0x0112
        L_0x010e:
            r11.f4231i = r5
            goto L_0x0112
        L_0x0111:
            r5 = r12
        L_0x0112:
            int r1 = r1 - r5
            r11.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.MDRootLayout.onMeasure(int, int):void");
    }

    public void setButtonGravity(C5192g gVar) {
        this.f4237o = gVar;
        m5874b();
    }

    public void setButtonStackedGravity(C5192g gVar) {
        for (MDButton mDButton : this.f4228f) {
            if (mDButton != null) {
                mDButton.setStackedGravity(gVar);
            }
        }
    }

    public void setDividerColor(int i) {
        this.f4239q.setColor(i);
        invalidate();
    }

    public void setMaxHeight(int i) {
        this.f4223a = i;
    }

    public void setStackingBehavior(C5216u uVar) {
        this.f4229g = uVar;
        invalidate();
    }
}
