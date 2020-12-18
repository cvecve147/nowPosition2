package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p007v4.view.C0429H;
import android.support.p007v4.view.C0431I;
import android.support.p007v4.view.C0487v;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p013b.p018b.p040i.p041a.C1103a;
import p013b.p018b.p040i.p041a.C1112j;

/* renamed from: android.support.v7.widget.a */
abstract class C0811a extends ViewGroup {

    /* renamed from: a */
    protected final C0812a f3362a;

    /* renamed from: b */
    protected final Context f3363b;

    /* renamed from: c */
    protected ActionMenuView f3364c;

    /* renamed from: d */
    protected ActionMenuPresenter f3365d;

    /* renamed from: e */
    protected int f3366e;

    /* renamed from: f */
    protected C0429H f3367f;

    /* renamed from: g */
    private boolean f3368g;

    /* renamed from: h */
    private boolean f3369h;

    /* renamed from: android.support.v7.widget.a$a */
    protected class C0812a implements C0431I {

        /* renamed from: a */
        private boolean f3370a = false;

        /* renamed from: b */
        int f3371b;

        protected C0812a() {
        }

        /* renamed from: a */
        public C0812a mo4438a(C0429H h, int i) {
            C0811a.this.f3367f = h;
            this.f3371b = i;
            return this;
        }

        /* renamed from: a */
        public void mo1763a(View view) {
            this.f3370a = true;
        }

        /* renamed from: b */
        public void mo1764b(View view) {
            if (!this.f3370a) {
                C0811a aVar = C0811a.this;
                aVar.f3367f = null;
                C0811a.super.setVisibility(this.f3371b);
            }
        }

        /* renamed from: c */
        public void mo1765c(View view) {
            C0811a.super.setVisibility(0);
            this.f3370a = false;
        }
    }

    C0811a(Context context) {
        this(context, (AttributeSet) null);
    }

    C0811a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    C0811a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.f3362a = new C0812a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C1103a.actionBarPopupTheme, typedValue, true) || (i2 = typedValue.resourceId) == 0) {
            this.f3363b = context;
        } else {
            this.f3363b = new ContextThemeWrapper(context, i2);
        }
    }

    /* renamed from: a */
    protected static int m4759a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo4435a(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo4436a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: a */
    public C0429H mo3107a(int i, long j) {
        C0429H h = this.f3367f;
        if (h != null) {
            h.mo1758a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0429H a = C0487v.m2264a(this);
            a.mo1753a(1.0f);
            a.mo1754a(j);
            C0812a aVar = this.f3362a;
            aVar.mo4438a(a, i);
            a.mo1755a((C0431I) aVar);
            return a;
        }
        C0429H a2 = C0487v.m2264a(this);
        a2.mo1753a(0.0f);
        a2.mo1754a(j);
        C0812a aVar2 = this.f3362a;
        aVar2.mo4438a(a2, i);
        a2.mo1755a((C0431I) aVar2);
        return a2;
    }

    public int getAnimatedVisibility() {
        return this.f3367f != null ? this.f3362a.f3371b : getVisibility();
    }

    public int getContentHeight() {
        return this.f3366e;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C1112j.ActionBar, C1103a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C1112j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f3365d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo3172a(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3369h = false;
        }
        if (!this.f3369h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3369h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3369h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3368g = false;
        }
        if (!this.f3368g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3368g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3368g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0429H h = this.f3367f;
            if (h != null) {
                h.mo1758a();
            }
            super.setVisibility(i);
        }
    }
}
