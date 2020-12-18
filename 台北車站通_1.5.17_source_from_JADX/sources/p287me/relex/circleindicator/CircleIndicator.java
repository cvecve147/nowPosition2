package p287me.relex.circleindicator;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.support.p007v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* renamed from: me.relex.circleindicator.CircleIndicator */
public class CircleIndicator extends LinearLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ViewPager f18839a;

    /* renamed from: b */
    private int f18840b = -1;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f18841c = -1;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f18842d = -1;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f18843e = -1;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f18844f = -1;

    /* renamed from: g */
    private int f18845g = C6790c.scale_with_alpha;

    /* renamed from: h */
    private int f18846h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f18847i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f18848j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Animator f18849k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Animator f18850l;

    /* renamed from: m */
    private Animator f18851m;

    /* renamed from: n */
    private Animator f18852n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f18853o;

    /* renamed from: p */
    private final ViewPager.C0440f f18854p;

    /* renamed from: q */
    private DataSetObserver f18855q;

    /* renamed from: me.relex.circleindicator.CircleIndicator$a */
    private class C6787a implements Interpolator {
        private C6787a() {
        }

        /* synthetic */ C6787a(CircleIndicator circleIndicator, C6788a aVar) {
            this();
        }

        public float getInterpolation(float f) {
            return Math.abs(1.0f - f);
        }
    }

    public CircleIndicator(Context context) {
        super(context);
        int i = C6791d.white_radius;
        this.f18847i = i;
        this.f18848j = i;
        this.f18853o = -1;
        this.f18854p = new C6788a(this);
        this.f18855q = new C6789b(this);
        m25720b(context, (AttributeSet) null);
    }

    public CircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = C6791d.white_radius;
        this.f18847i = i;
        this.f18848j = i;
        this.f18853o = -1;
        this.f18854p = new C6788a(this);
        this.f18855q = new C6789b(this);
        m25720b(context, attributeSet);
    }

    public CircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = C6791d.white_radius;
        this.f18847i = i2;
        this.f18848j = i2;
        this.f18853o = -1;
        this.f18854p = new C6788a(this);
        this.f18855q = new C6789b(this);
        m25720b(context, attributeSet);
    }

    @TargetApi(21)
    public CircleIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int i3 = C6791d.white_radius;
        this.f18847i = i3;
        this.f18848j = i3;
        this.f18853o = -1;
        this.f18854p = new C6788a(this);
        this.f18855q = new C6789b(this);
        m25720b(context, attributeSet);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25714a() {
        Animator animator;
        int i;
        removeAllViews();
        int a = this.f18839a.getAdapter().mo1972a();
        if (a > 0) {
            int currentItem = this.f18839a.getCurrentItem();
            int orientation = getOrientation();
            for (int i2 = 0; i2 < a; i2++) {
                if (currentItem == i2) {
                    i = this.f18847i;
                    animator = this.f18851m;
                } else {
                    i = this.f18848j;
                    animator = this.f18852n;
                }
                m25715a(orientation, i, animator);
            }
        }
    }

    /* renamed from: a */
    private void m25715a(int i, int i2, Animator animator) {
        if (animator.isRunning()) {
            animator.end();
            animator.cancel();
        }
        View view = new View(getContext());
        view.setBackgroundResource(i2);
        addView(view, this.f18843e, this.f18844f);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (i == 0) {
            int i3 = this.f18840b;
            layoutParams.leftMargin = i3;
            layoutParams.rightMargin = i3;
        } else {
            int i4 = this.f18840b;
            layoutParams.topMargin = i4;
            layoutParams.bottomMargin = i4;
        }
        view.setLayoutParams(layoutParams);
        animator.setTarget(view);
        animator.start();
    }

    /* renamed from: a */
    private void m25716a(Context context) {
        int i = this.f18841c;
        if (i < 0) {
            i = mo17355a(5.0f);
        }
        this.f18841c = i;
        int i2 = this.f18842d;
        if (i2 < 0) {
            i2 = mo17355a(5.0f);
        }
        this.f18842d = i2;
        int i3 = this.f18840b;
        if (i3 < 0) {
            i3 = mo17355a(5.0f);
        }
        this.f18840b = i3;
        int i4 = this.f18843e;
        if (i4 < 0) {
            i4 = mo17355a(5.0f);
        }
        this.f18843e = i4;
        int i5 = this.f18844f;
        if (i5 < 0) {
            i5 = mo17355a(5.0f);
        }
        this.f18844f = i5;
        int i6 = this.f18845g;
        if (i6 == 0) {
            i6 = C6790c.scale_with_alpha;
        }
        this.f18845g = i6;
        this.f18849k = m25721c(context);
        this.f18851m = m25721c(context);
        this.f18851m.setDuration(0);
        this.f18850l = m25719b(context);
        this.f18852n = m25719b(context);
        this.f18852n.setDuration(0);
        int i7 = this.f18847i;
        if (i7 == 0) {
            i7 = C6791d.white_radius;
        }
        this.f18847i = i7;
        int i8 = this.f18848j;
        if (i8 == 0) {
            i8 = this.f18847i;
        }
        this.f18848j = i8;
    }

    /* renamed from: a */
    private void m25717a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6792e.CircleIndicator);
            this.f18841c = obtainStyledAttributes.getDimensionPixelSize(C6792e.CircleIndicator_ci_width, -1);
            this.f18842d = obtainStyledAttributes.getDimensionPixelSize(C6792e.CircleIndicator_ci_height, -1);
            this.f18840b = obtainStyledAttributes.getDimensionPixelSize(C6792e.CircleIndicator_ci_margin, -1);
            this.f18843e = obtainStyledAttributes.getDimensionPixelSize(C6792e.CircleIndicator_ci_width_unselected, -1);
            this.f18844f = obtainStyledAttributes.getDimensionPixelSize(C6792e.CircleIndicator_ci_height_unselected, -1);
            this.f18845g = obtainStyledAttributes.getResourceId(C6792e.CircleIndicator_ci_animator, C6790c.scale_with_alpha);
            int i = 0;
            this.f18846h = obtainStyledAttributes.getResourceId(C6792e.CircleIndicator_ci_animator_reverse, 0);
            this.f18847i = obtainStyledAttributes.getResourceId(C6792e.CircleIndicator_ci_drawable, C6791d.white_radius);
            this.f18848j = obtainStyledAttributes.getResourceId(C6792e.CircleIndicator_ci_drawable_unselected, this.f18847i);
            if (obtainStyledAttributes.getInt(C6792e.CircleIndicator_ci_orientation, -1) == 1) {
                i = 1;
            }
            setOrientation(i);
            int i2 = obtainStyledAttributes.getInt(C6792e.CircleIndicator_ci_gravity, -1);
            if (i2 < 0) {
                i2 = 17;
            }
            setGravity(i2);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    private Animator m25719b(Context context) {
        int i = this.f18846h;
        if (i != 0) {
            return AnimatorInflater.loadAnimator(context, i);
        }
        Animator loadAnimator = AnimatorInflater.loadAnimator(context, this.f18845g);
        loadAnimator.setInterpolator(new C6787a(this, (C6788a) null));
        return loadAnimator;
    }

    /* renamed from: b */
    private void m25720b(Context context, AttributeSet attributeSet) {
        m25717a(context, attributeSet);
        m25716a(context);
    }

    /* renamed from: c */
    private Animator m25721c(Context context) {
        return AnimatorInflater.loadAnimator(context, this.f18845g);
    }

    /* renamed from: a */
    public int mo17355a(float f) {
        return (int) ((f * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public DataSetObserver getDataSetObserver() {
        return this.f18855q;
    }

    @Deprecated
    public void setOnPageChangeListener(ViewPager.C0440f fVar) {
        ViewPager viewPager = this.f18839a;
        if (viewPager != null) {
            viewPager.mo1799b(fVar);
            this.f18839a.mo1786a(fVar);
            return;
        }
        throw new NullPointerException("can not find Viewpager , setViewPager first");
    }

    public void setViewPager(ViewPager viewPager) {
        this.f18839a = viewPager;
        ViewPager viewPager2 = this.f18839a;
        if (viewPager2 != null && viewPager2.getAdapter() != null) {
            this.f18853o = -1;
            m25714a();
            this.f18839a.mo1799b(this.f18854p);
            this.f18839a.mo1786a(this.f18854p);
            this.f18854p.mo783b(this.f18839a.getCurrentItem());
        }
    }
}
