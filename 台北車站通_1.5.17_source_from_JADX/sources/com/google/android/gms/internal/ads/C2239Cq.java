package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.Cq */
public abstract class C2239Cq implements Callable {

    /* renamed from: a */
    private final String f6813a = getClass().getSimpleName();

    /* renamed from: b */
    protected final C2701Sp f6814b;

    /* renamed from: c */
    private final String f6815c;

    /* renamed from: d */
    private final String f6816d;

    /* renamed from: e */
    protected final C2921_l f6817e;

    /* renamed from: f */
    protected Method f6818f;

    /* renamed from: g */
    private final int f6819g;

    /* renamed from: h */
    private final int f6820h;

    public C2239Cq(C2701Sp sp, String str, String str2, C2921_l _lVar, int i, int i2) {
        this.f6814b = sp;
        this.f6815c = str;
        this.f6816d = str2;
        this.f6817e = _lVar;
        this.f6819g = i;
        this.f6820h = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7939a();

    /* renamed from: b */
    public Void call() {
        try {
            long nanoTime = System.nanoTime();
            this.f6818f = this.f6814b.mo8833a(this.f6815c, this.f6816d);
            if (this.f6818f == null) {
                return null;
            }
            mo7939a();
            C3558vp h = this.f6814b.mo8843h();
            if (!(h == null || this.f6819g == Integer.MIN_VALUE)) {
                h.mo10151a(this.f6820h, this.f6819g, (System.nanoTime() - nanoTime) / 1000);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
