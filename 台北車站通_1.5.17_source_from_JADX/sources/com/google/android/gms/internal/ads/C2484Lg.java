package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.C2061y;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Lg */
public final class C2484Lg {

    /* renamed from: a */
    private final Context f7507a;

    /* renamed from: b */
    private final C2749Ug f7508b;

    /* renamed from: c */
    private final ViewGroup f7509c;

    /* renamed from: d */
    private C2342Gg f7510d;

    private C2484Lg(Context context, ViewGroup viewGroup, C2749Ug ug, C2342Gg gg) {
        this.f7507a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f7509c = viewGroup;
        this.f7508b = ug;
        this.f7510d = null;
    }

    public C2484Lg(Context context, ViewGroup viewGroup, C3520uh uhVar) {
        this(context, viewGroup, uhVar, (C2342Gg) null);
    }

    /* renamed from: a */
    public final void mo8475a() {
        C2061y.m9072a("onDestroy must be called from the UI thread.");
        C2342Gg gg = this.f7510d;
        if (gg != null) {
            gg.mo8124h();
            this.f7509c.removeView(this.f7510d);
            this.f7510d = null;
        }
    }

    /* renamed from: a */
    public final void mo8476a(int i, int i2, int i3, int i4) {
        C2061y.m9072a("The underlay may only be modified from the UI thread.");
        C2342Gg gg = this.f7510d;
        if (gg != null) {
            gg.mo8120a(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public final void mo8477a(int i, int i2, int i3, int i4, int i5, boolean z, C2720Tg tg) {
        if (this.f7510d == null) {
            C2736Tu.m11306a(this.f7508b.mo8138Za().mo9126a(), this.f7508b.mo8204xb(), "vpr2");
            Context context = this.f7507a;
            C2749Ug ug = this.f7508b;
            this.f7510d = new C2342Gg(context, ug, i5, z, ug.mo8138Za().mo9126a(), tg);
            this.f7509c.addView(this.f7510d, 0, new ViewGroup.LayoutParams(-1, -1));
            int i6 = i;
            int i7 = i2;
            int i8 = i3;
            int i9 = i4;
            this.f7510d.mo8120a(i, i2, i3, i4);
            this.f7508b.mo8151a(false);
        }
    }

    /* renamed from: b */
    public final void mo8478b() {
        C2061y.m9072a("onPause must be called from the UI thread.");
        C2342Gg gg = this.f7510d;
        if (gg != null) {
            gg.mo8125i();
        }
    }

    /* renamed from: c */
    public final C2342Gg mo8479c() {
        C2061y.m9072a("getAdVideoUnderlay must be called from the UI thread.");
        return this.f7510d;
    }
}
