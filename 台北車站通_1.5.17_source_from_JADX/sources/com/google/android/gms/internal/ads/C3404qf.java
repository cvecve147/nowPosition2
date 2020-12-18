package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.ads.internal.C1697X;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.qf */
public final class C3404qf {

    /* renamed from: a */
    private final View f10070a;

    /* renamed from: b */
    private Activity f10071b;

    /* renamed from: c */
    private boolean f10072c;

    /* renamed from: d */
    private boolean f10073d;

    /* renamed from: e */
    private boolean f10074e;

    /* renamed from: f */
    private ViewTreeObserver.OnGlobalLayoutListener f10075f;

    /* renamed from: g */
    private ViewTreeObserver.OnScrollChangedListener f10076g;

    public C3404qf(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f10071b = activity;
        this.f10070a = view;
        this.f10075f = onGlobalLayoutListener;
        this.f10076g = onScrollChangedListener;
    }

    /* renamed from: b */
    private static ViewTreeObserver m13520b(Activity activity) {
        Window window;
        View decorView;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    /* renamed from: e */
    private final void m13521e() {
        ViewTreeObserver b;
        ViewTreeObserver b2;
        if (!this.f10072c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f10075f;
            if (onGlobalLayoutListener != null) {
                Activity activity = this.f10071b;
                if (!(activity == null || (b2 = m13520b(activity)) == null)) {
                    b2.addOnGlobalLayoutListener(onGlobalLayoutListener);
                }
                C1697X.m7688A();
                C3348og.m13242a(this.f10070a, this.f10075f);
            }
            ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.f10076g;
            if (onScrollChangedListener != null) {
                Activity activity2 = this.f10071b;
                if (!(activity2 == null || (b = m13520b(activity2)) == null)) {
                    b.addOnScrollChangedListener(onScrollChangedListener);
                }
                C1697X.m7688A();
                C3348og.m13243a(this.f10070a, this.f10076g);
            }
            this.f10072c = true;
        }
    }

    /* renamed from: f */
    private final void m13522f() {
        ViewTreeObserver b;
        ViewTreeObserver b2;
        Activity activity = this.f10071b;
        if (activity != null && this.f10072c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f10075f;
            if (!(onGlobalLayoutListener == null || (b2 = m13520b(activity)) == null)) {
                C1697X.m7700g().mo9720a(b2, onGlobalLayoutListener);
            }
            ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.f10076g;
            if (!(onScrollChangedListener == null || (b = m13520b(this.f10071b)) == null)) {
                b.removeOnScrollChangedListener(onScrollChangedListener);
            }
            this.f10072c = false;
        }
    }

    /* renamed from: a */
    public final void mo9929a() {
        this.f10073d = true;
        if (this.f10074e) {
            m13521e();
        }
    }

    /* renamed from: a */
    public final void mo9930a(Activity activity) {
        this.f10071b = activity;
    }

    /* renamed from: b */
    public final void mo9931b() {
        this.f10073d = false;
        m13522f();
    }

    /* renamed from: c */
    public final void mo9932c() {
        this.f10074e = true;
        if (this.f10073d) {
            m13521e();
        }
    }

    /* renamed from: d */
    public final void mo9933d() {
        this.f10074e = false;
        m13522f();
    }
}
