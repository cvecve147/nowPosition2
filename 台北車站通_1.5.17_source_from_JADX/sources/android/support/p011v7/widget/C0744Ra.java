package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p011v7.app.C0607a;
import android.support.p011v7.widget.C0879qa;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import p013b.p018b.p040i.p041a.C1103a;
import p013b.p018b.p040i.p050h.C1135a;

/* renamed from: android.support.v7.widget.Ra */
public class C0744Ra extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    private static final Interpolator f2905a = new DecelerateInterpolator();

    /* renamed from: b */
    Runnable f2906b;

    /* renamed from: c */
    private C0746b f2907c;

    /* renamed from: d */
    C0879qa f2908d;

    /* renamed from: e */
    private Spinner f2909e;

    /* renamed from: f */
    private boolean f2910f;

    /* renamed from: g */
    int f2911g;

    /* renamed from: h */
    int f2912h;

    /* renamed from: i */
    private int f2913i;

    /* renamed from: j */
    private int f2914j;

    /* renamed from: android.support.v7.widget.Ra$a */
    private class C0745a extends BaseAdapter {
        C0745a() {
        }

        public int getCount() {
            return C0744Ra.this.f2908d.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0747c) C0744Ra.this.f2908d.getChildAt(i)).mo3618a();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0744Ra.this.mo3602a((C0607a.C0610c) getItem(i), true);
            }
            ((C0747c) view).mo3619a((C0607a.C0610c) getItem(i));
            return view;
        }
    }

    /* renamed from: android.support.v7.widget.Ra$b */
    private class C0746b implements View.OnClickListener {
        C0746b() {
        }

        public void onClick(View view) {
            ((C0747c) view).mo3618a().mo2581e();
            int childCount = C0744Ra.this.f2908d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0744Ra.this.f2908d.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: android.support.v7.widget.Ra$c */
    private class C0747c extends LinearLayout {

        /* renamed from: a */
        private final int[] f2917a = {16842964};

        /* renamed from: b */
        private C0607a.C0610c f2918b;

        /* renamed from: c */
        private TextView f2919c;

        /* renamed from: d */
        private ImageView f2920d;

        /* renamed from: e */
        private View f2921e;

        public C0747c(Context context, C0607a.C0610c cVar, boolean z) {
            super(context, (AttributeSet) null, C1103a.actionBarTabStyle);
            this.f2918b = cVar;
            C0829eb a = C0829eb.m4793a(context, (AttributeSet) null, this.f2917a, C1103a.actionBarTabStyle, 0);
            if (a.mo4487g(0)) {
                setBackgroundDrawable(a.mo4477b(0));
            }
            a.mo4474a();
            if (z) {
                setGravity(8388627);
            }
            mo3620b();
        }

        /* renamed from: a */
        public C0607a.C0610c mo3618a() {
            return this.f2918b;
        }

        /* renamed from: a */
        public void mo3619a(C0607a.C0610c cVar) {
            this.f2918b = cVar;
            mo3620b();
        }

        /* renamed from: b */
        public void mo3620b() {
            C0607a.C0610c cVar = this.f2918b;
            View b = cVar.mo2578b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f2921e = b;
                TextView textView = this.f2919c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f2920d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f2920d.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f2921e;
            if (view != null) {
                removeView(view);
                this.f2921e = null;
            }
            Drawable c = cVar.mo2579c();
            CharSequence d = cVar.mo2580d();
            if (c != null) {
                if (this.f2920d == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f2920d = appCompatImageView;
                }
                this.f2920d.setImageDrawable(c);
                this.f2920d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f2920d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f2920d.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (z) {
                if (this.f2919c == null) {
                    C0721I i = new C0721I(getContext(), (AttributeSet) null, C1103a.actionBarTabTextStyle);
                    i.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    i.setLayoutParams(layoutParams2);
                    addView(i);
                    this.f2919c = i;
                }
                this.f2919c.setText(d);
                this.f2919c.setVisibility(0);
            } else {
                TextView textView2 = this.f2919c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f2919c.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f2920d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.mo2577a());
            }
            if (!z) {
                charSequence = cVar.mo2577a();
            }
            C0862mb.m4963a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C0607a.C0610c.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C0607a.C0610c.class.getName());
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (C0744Ra.this.f2911g > 0 && getMeasuredWidth() > (i3 = C0744Ra.this.f2911g)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: a */
    private Spinner m3888a() {
        C0701B b = new C0701B(getContext(), (AttributeSet) null, C1103a.actionDropDownStyle);
        b.setLayoutParams(new C0879qa.C0880a(-2, -1));
        b.setOnItemSelectedListener(this);
        return b;
    }

    /* renamed from: b */
    private boolean m3889b() {
        Spinner spinner = this.f2909e;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: c */
    private void m3890c() {
        if (!m3889b()) {
            if (this.f2909e == null) {
                this.f2909e = m3888a();
            }
            removeView(this.f2908d);
            addView(this.f2909e, new ViewGroup.LayoutParams(-2, -1));
            if (this.f2909e.getAdapter() == null) {
                this.f2909e.setAdapter(new C0745a());
            }
            Runnable runnable = this.f2906b;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f2906b = null;
            }
            this.f2909e.setSelection(this.f2914j);
        }
    }

    /* renamed from: d */
    private boolean m3891d() {
        if (!m3889b()) {
            return false;
        }
        removeView(this.f2909e);
        addView(this.f2908d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f2909e.getSelectedItemPosition());
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0747c mo3602a(C0607a.C0610c cVar, boolean z) {
        C0747c cVar2 = new C0747c(getContext(), cVar, z);
        if (z) {
            cVar2.setBackgroundDrawable((Drawable) null);
            cVar2.setLayoutParams(new AbsListView.LayoutParams(-1, this.f2913i));
        } else {
            cVar2.setFocusable(true);
            if (this.f2907c == null) {
                this.f2907c = new C0746b();
            }
            cVar2.setOnClickListener(this.f2907c);
        }
        return cVar2;
    }

    /* renamed from: a */
    public void mo3603a(int i) {
        View childAt = this.f2908d.getChildAt(i);
        Runnable runnable = this.f2906b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f2906b = new C0743Qa(this, childAt);
        post(this.f2906b);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f2906b;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1135a a = C1135a.m5761a(getContext());
        setContentHeight(a.mo5311e());
        this.f2912h = a.mo5310d();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f2906b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0747c) view).mo3618a().mo2581e();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f2908d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.f2911g = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f2911g = View.MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.f2911g, this.f2912h);
        }
        this.f2911g = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f2913i, 1073741824);
        if (z2 || !this.f2910f) {
            z = false;
        }
        if (z) {
            this.f2908d.measure(0, makeMeasureSpec);
            if (this.f2908d.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m3890c();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.f2914j);
                    return;
                }
            }
        }
        m3891d();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f2910f = z;
    }

    public void setContentHeight(int i) {
        this.f2913i = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f2914j = i;
        int childCount = this.f2908d.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f2908d.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo3603a(i);
            }
            i2++;
        }
        Spinner spinner = this.f2909e;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}
