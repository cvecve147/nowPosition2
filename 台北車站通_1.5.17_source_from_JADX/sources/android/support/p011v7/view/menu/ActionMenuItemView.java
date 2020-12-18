package android.support.p011v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.p011v7.view.menu.C0662l;
import android.support.p011v7.view.menu.C0681w;
import android.support.p011v7.widget.ActionMenuView;
import android.support.p011v7.widget.C0721I;
import android.support.p011v7.widget.C0859ma;
import android.support.p011v7.widget.C0862mb;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import p013b.p018b.p040i.p041a.C1112j;

/* renamed from: android.support.v7.view.menu.ActionMenuItemView */
public class ActionMenuItemView extends C0721I implements C0681w.C0682a, View.OnClickListener, ActionMenuView.C0696a {

    /* renamed from: c */
    C0668p f2389c;

    /* renamed from: d */
    private CharSequence f2390d;

    /* renamed from: e */
    private Drawable f2391e;

    /* renamed from: f */
    C0662l.C0664b f2392f;

    /* renamed from: g */
    private C0859ma f2393g;

    /* renamed from: h */
    C0644b f2394h;

    /* renamed from: i */
    private boolean f2395i;

    /* renamed from: j */
    private boolean f2396j;

    /* renamed from: k */
    private int f2397k;

    /* renamed from: l */
    private int f2398l;

    /* renamed from: m */
    private int f2399m;

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$a */
    private class C0643a extends C0859ma {
        public C0643a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: a */
        public C0685z mo2688a() {
            C0644b bVar = ActionMenuItemView.this.f2394h;
            if (bVar != null) {
                return bVar.mo2690a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = mo2688a();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo2689b() {
            /*
                r3 = this;
                android.support.v7.view.menu.ActionMenuItemView r0 = android.support.p011v7.view.menu.ActionMenuItemView.this
                android.support.v7.view.menu.l$b r1 = r0.f2392f
                r2 = 0
                if (r1 == 0) goto L_0x001c
                android.support.v7.view.menu.p r0 = r0.f2389c
                boolean r0 = r1.mo2736a(r0)
                if (r0 == 0) goto L_0x001c
                android.support.v7.view.menu.z r0 = r3.mo2688a()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.mo2706w()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.view.menu.ActionMenuItemView.C0643a.mo2689b():boolean");
        }
    }

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$b */
    public static abstract class C0644b {
        /* renamed from: a */
        public abstract C0685z mo2690a();
    }

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f2395i = m3145e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1112j.ActionMenuItemView, i, 0);
        this.f2397k = obtainStyledAttributes.getDimensionPixelSize(C1112j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f2399m = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f2398l = -1;
        setSaveEnabled(false);
    }

    /* renamed from: e */
    private boolean m3145e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: f */
    private void m3146f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f2390d);
        if (this.f2391e != null && (!this.f2389c.mo2952n() || (!this.f2395i && !this.f2396j))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f2390d : null);
        CharSequence contentDescription = this.f2389c.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f2389c.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f2389c.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence = this.f2389c.getTitle();
            }
            C0862mb.m4963a(this, charSequence);
            return;
        }
        C0862mb.m4963a(this, tooltipText);
    }

    /* renamed from: a */
    public void mo276a(C0668p pVar, int i) {
        this.f2389c = pVar;
        setIcon(pVar.getIcon());
        setTitle(pVar.mo2915a((C0681w.C0682a) this));
        setId(pVar.getItemId());
        setVisibility(pVar.isVisible() ? 0 : 8);
        setEnabled(pVar.isEnabled());
        if (pVar.hasSubMenu() && this.f2393g == null) {
            this.f2393g = new C0643a();
        }
    }

    /* renamed from: a */
    public boolean mo277a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo2672b() {
        return mo2674d();
    }

    /* renamed from: c */
    public boolean mo2673c() {
        return mo2674d() && this.f2389c.getIcon() == null;
    }

    /* renamed from: d */
    public boolean mo2674d() {
        return !TextUtils.isEmpty(getText());
    }

    public C0668p getItemData() {
        return this.f2389c;
    }

    public void onClick(View view) {
        C0662l.C0664b bVar = this.f2392f;
        if (bVar != null) {
            bVar.mo2736a(this.f2389c);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2395i = m3145e();
        m3146f();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        boolean d = mo2674d();
        if (d && (i3 = this.f2398l) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f2397k) : this.f2397k;
        if (mode != 1073741824 && this.f2397k > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!d && this.f2391e != null) {
            super.setPadding((getMeasuredWidth() - this.f2391e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0859ma maVar;
        if (!this.f2389c.hasSubMenu() || (maVar = this.f2393g) == null || !maVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f2396j != z) {
            this.f2396j = z;
            C0668p pVar = this.f2389c;
            if (pVar != null) {
                pVar.mo2919b();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2391e = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f2399m;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            int i2 = this.f2399m;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        m3146f();
    }

    public void setItemInvoker(C0662l.C0664b bVar) {
        this.f2392f = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f2398l = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0644b bVar) {
        this.f2394h = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f2390d = charSequence;
        m3146f();
    }
}
