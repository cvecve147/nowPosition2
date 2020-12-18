package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.internal.C0075b;
import android.support.design.internal.C0078e;
import android.support.design.internal.C0092i;
import android.support.p007v4.view.AbsSavedState;
import android.support.p007v4.view.C0434L;
import android.support.p007v4.view.C0487v;
import android.support.p011v7.view.menu.C0662l;
import android.support.p011v7.view.menu.C0668p;
import android.support.p011v7.view.menu.C0679v;
import android.support.p011v7.widget.C0829eb;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p013b.p018b.p022d.C0962h;
import p013b.p018b.p022d.C0963i;
import p013b.p018b.p028h.p029a.C1006a;
import p013b.p018b.p040i.p041a.C1103a;
import p013b.p018b.p040i.p043c.p044a.C1118b;
import p013b.p018b.p040i.p050h.C1143g;

public class NavigationView extends C0092i {

    /* renamed from: d */
    private static final int[] f675d = {16842912};

    /* renamed from: e */
    private static final int[] f676e = {-16842910};

    /* renamed from: f */
    private final C0075b f677f;

    /* renamed from: g */
    private final C0078e f678g;

    /* renamed from: h */
    C0124a f679h;

    /* renamed from: i */
    private int f680i;

    /* renamed from: j */
    private MenuInflater f681j;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0097B();

        /* renamed from: a */
        public Bundle f682a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f682a = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f682a);
        }
    }

    /* renamed from: android.support.design.widget.NavigationView$a */
    public interface C0124a {
        /* renamed from: a */
        boolean mo693a(MenuItem menuItem);
    }

    public NavigationView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        boolean z;
        this.f678g = new C0078e();
        C0128S.m655a(context);
        this.f677f = new C0075b(context);
        C0829eb a = C0829eb.m4793a(context, attributeSet, C0963i.NavigationView, i, C0962h.Widget_Design_NavigationView);
        C0487v.m2273a((View) this, a.mo4477b(C0963i.NavigationView_android_background));
        if (a.mo4487g(C0963i.NavigationView_elevation)) {
            C0487v.m2266a((View) this, (float) a.mo4478c(C0963i.NavigationView_elevation, 0));
        }
        C0487v.m2280a((View) this, a.mo4475a(C0963i.NavigationView_android_fitsSystemWindows, false));
        this.f680i = a.mo4478c(C0963i.NavigationView_android_maxWidth, 0);
        ColorStateList a2 = a.mo4487g(C0963i.NavigationView_itemIconTint) ? a.mo4472a(C0963i.NavigationView_itemIconTint) : m649d(16842808);
        if (a.mo4487g(C0963i.NavigationView_itemTextAppearance)) {
            i2 = a.mo4486g(C0963i.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            z = false;
            i2 = 0;
        }
        ColorStateList a3 = a.mo4487g(C0963i.NavigationView_itemTextColor) ? a.mo4472a(C0963i.NavigationView_itemTextColor) : null;
        if (!z && a3 == null) {
            a3 = m649d(16842806);
        }
        Drawable b = a.mo4477b(C0963i.NavigationView_itemBackground);
        this.f677f.mo2708a((C0662l.C0663a) new C0093A(this));
        this.f678g.mo331c(1);
        this.f678g.mo313a(context, (C0662l) this.f677f);
        this.f678g.mo314a(a2);
        if (z) {
            this.f678g.mo333d(i2);
        }
        this.f678g.mo327b(a3);
        this.f678g.mo315a(b);
        this.f677f.mo2856a((C0679v) this.f678g);
        addView((View) this.f678g.mo311a((ViewGroup) this));
        if (a.mo4487g(C0963i.NavigationView_menu)) {
            mo677c(a.mo4486g(C0963i.NavigationView_menu, 0));
        }
        if (a.mo4487g(C0963i.NavigationView_headerLayout)) {
            mo676b(a.mo4486g(C0963i.NavigationView_headerLayout, 0));
        }
        a.mo4474a();
    }

    /* renamed from: d */
    private ColorStateList m649d(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a = C1118b.m5718a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C1103a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a.getDefaultColor();
        return new ColorStateList(new int[][]{f676e, f675d, FrameLayout.EMPTY_STATE_SET}, new int[]{a.getColorForState(f676e, defaultColor), i2, defaultColor});
    }

    private MenuInflater getMenuInflater() {
        if (this.f681j == null) {
            this.f681j = new C1143g(getContext());
        }
        return this.f681j;
    }

    /* renamed from: a */
    public View mo675a(int i) {
        return this.f678g.mo312a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo358a(C0434L l) {
        this.f678g.mo317a(l);
    }

    /* renamed from: b */
    public View mo676b(int i) {
        return this.f678g.mo326b(i);
    }

    /* renamed from: c */
    public void mo677c(int i) {
        this.f678g.mo328b(true);
        getMenuInflater().inflate(i, this.f677f);
        this.f678g.mo328b(false);
        this.f678g.mo321a(false);
    }

    public int getHeaderCount() {
        return this.f678g.mo330c();
    }

    public Drawable getItemBackground() {
        return this.f678g.mo332d();
    }

    public ColorStateList getItemIconTintList() {
        return this.f678g.mo335f();
    }

    public ColorStateList getItemTextColor() {
        return this.f678g.mo334e();
    }

    public Menu getMenu() {
        return this.f677f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = this.f680i;
            }
            super.onMeasure(i, i2);
        }
        i3 = Math.min(View.MeasureSpec.getSize(i), this.f680i);
        i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo1736a());
        this.f677f.mo2873b(savedState.f682a);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f682a = new Bundle();
        this.f677f.mo2884d(savedState.f682a);
        return savedState;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f677f.findItem(i);
        if (findItem != null) {
            this.f678g.mo319a((C0668p) findItem);
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f678g.mo315a(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C1006a.m5394c(getContext(), i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f678g.mo314a(colorStateList);
    }

    public void setItemTextAppearance(int i) {
        this.f678g.mo333d(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f678g.mo327b(colorStateList);
    }

    public void setNavigationItemSelectedListener(C0124a aVar) {
        this.f679h = aVar;
    }
}
