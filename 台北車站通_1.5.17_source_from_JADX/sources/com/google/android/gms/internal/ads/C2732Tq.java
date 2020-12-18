package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Tq */
public final class C2732Tq implements C3644yr {

    /* renamed from: a */
    private final WeakReference<View> f8358a;

    /* renamed from: b */
    private final WeakReference<C2254Dd> f8359b;

    public C2732Tq(View view, C2254Dd dd) {
        this.f8358a = new WeakReference<>(view);
        this.f8359b = new WeakReference<>(dd);
    }

    /* renamed from: a */
    public final boolean mo8695a() {
        return this.f8358a.get() == null || this.f8359b.get() == null;
    }

    /* renamed from: b */
    public final C3644yr mo8696b() {
        return new C2703Sq((View) this.f8358a.get(), (C2254Dd) this.f8359b.get());
    }

    /* renamed from: c */
    public final View mo8697c() {
        return (View) this.f8358a.get();
    }
}
