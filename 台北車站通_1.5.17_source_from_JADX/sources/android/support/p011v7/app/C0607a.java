package android.support.p011v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p013b.p018b.p040i.p041a.C1112j;
import p013b.p018b.p040i.p050h.C1136b;

/* renamed from: android.support.v7.app.a */
public abstract class C0607a {

    /* renamed from: android.support.v7.app.a$a */
    public static class C0608a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f2315a;

        public C0608a(int i, int i2) {
            super(i, i2);
            this.f2315a = 0;
            this.f2315a = 8388627;
        }

        public C0608a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2315a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1112j.ActionBarLayout);
            this.f2315a = obtainStyledAttributes.getInt(C1112j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0608a(C0608a aVar) {
            super(aVar);
            this.f2315a = 0;
            this.f2315a = aVar.f2315a;
        }

        public C0608a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2315a = 0;
        }
    }

    /* renamed from: android.support.v7.app.a$b */
    public interface C0609b {
        void onMenuVisibilityChanged(boolean z);
    }

    @Deprecated
    /* renamed from: android.support.v7.app.a$c */
    public static abstract class C0610c {
        /* renamed from: a */
        public abstract CharSequence mo2577a();

        /* renamed from: b */
        public abstract View mo2578b();

        /* renamed from: c */
        public abstract Drawable mo2579c();

        /* renamed from: d */
        public abstract CharSequence mo2580d();

        /* renamed from: e */
        public abstract void mo2581e();
    }

    /* renamed from: a */
    public C1136b mo2543a(C1136b.C1137a aVar) {
        return null;
    }

    /* renamed from: a */
    public abstract void mo2514a(int i);

    /* renamed from: a */
    public void mo2516a(Configuration configuration) {
    }

    /* renamed from: a */
    public abstract void mo2519a(CharSequence charSequence);

    /* renamed from: a */
    public abstract boolean mo2520a(int i, KeyEvent keyEvent);

    /* renamed from: a */
    public boolean mo2521a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo2522b(int i);

    /* renamed from: b */
    public abstract void mo2523b(boolean z);

    /* renamed from: c */
    public abstract void mo2524c(boolean z);

    /* renamed from: d */
    public abstract void mo2525d(boolean z);

    /* renamed from: e */
    public abstract void mo2526e(boolean z);

    /* renamed from: e */
    public boolean mo2527e() {
        return false;
    }

    /* renamed from: f */
    public abstract void mo2528f(boolean z);

    /* renamed from: f */
    public abstract boolean mo2529f();

    /* renamed from: g */
    public abstract int mo2530g();

    /* renamed from: h */
    public abstract Context mo2531h();

    /* renamed from: i */
    public abstract void mo2532i();

    /* renamed from: j */
    public boolean mo2533j() {
        return false;
    }

    /* renamed from: k */
    public abstract boolean mo2534k();

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo2535l() {
    }

    /* renamed from: m */
    public boolean mo2536m() {
        return false;
    }
}
