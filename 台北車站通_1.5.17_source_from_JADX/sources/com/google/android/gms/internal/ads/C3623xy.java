package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.xy */
public final class C3623xy {

    /* renamed from: a */
    private final AtomicInteger f10544a;

    /* renamed from: b */
    private final Set<C2216Bw<?>> f10545b;

    /* renamed from: c */
    private final PriorityBlockingQueue<C2216Bw<?>> f10546c;

    /* renamed from: d */
    private final PriorityBlockingQueue<C2216Bw<?>> f10547d;

    /* renamed from: e */
    private final C2893Zl f10548e;

    /* renamed from: f */
    private final C3305mu f10549f;

    /* renamed from: g */
    private final C2964b f10550g;

    /* renamed from: h */
    private final C2243Cu[] f10551h;

    /* renamed from: i */
    private C2731Tp f10552i;

    /* renamed from: j */
    private final List<C2879Yy> f10553j;

    public C3623xy(C2893Zl zl, C3305mu muVar) {
        this(zl, muVar, 4);
    }

    private C3623xy(C2893Zl zl, C3305mu muVar, int i) {
        this(zl, muVar, 4, new C3474ss(new Handler(Looper.getMainLooper())));
    }

    private C3623xy(C2893Zl zl, C3305mu muVar, int i, C2964b bVar) {
        this.f10544a = new AtomicInteger();
        this.f10545b = new HashSet();
        this.f10546c = new PriorityBlockingQueue<>();
        this.f10547d = new PriorityBlockingQueue<>();
        this.f10553j = new ArrayList();
        this.f10548e = zl;
        this.f10549f = muVar;
        this.f10551h = new C2243Cu[4];
        this.f10550g = bVar;
    }

    /* renamed from: a */
    public final <T> C2216Bw<T> mo10221a(C2216Bw<T> bw) {
        bw.mo7899a(this);
        synchronized (this.f10545b) {
            this.f10545b.add(bw);
        }
        bw.mo7897a(this.f10544a.incrementAndGet());
        bw.mo7906a("add-to-queue");
        (!bw.mo7915o() ? this.f10547d : this.f10546c).add(bw);
        return bw;
    }

    /* renamed from: a */
    public final void mo10222a() {
        C2731Tp tp = this.f10552i;
        if (tp != null) {
            tp.mo8908a();
        }
        for (C2243Cu cu : this.f10551h) {
            if (cu != null) {
                cu.mo7953a();
            }
        }
        this.f10552i = new C2731Tp(this.f10546c, this.f10547d, this.f10548e, this.f10550g);
        this.f10552i.start();
        for (int i = 0; i < this.f10551h.length; i++) {
            C2243Cu cu2 = new C2243Cu(this.f10547d, this.f10549f, this.f10548e, this.f10550g);
            this.f10551h[i] = cu2;
            cu2.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final <T> void mo10223b(C2216Bw<T> bw) {
        synchronized (this.f10545b) {
            this.f10545b.remove(bw);
        }
        synchronized (this.f10553j) {
            for (C2879Yy a : this.f10553j) {
                a.mo9091a(bw);
            }
        }
    }
}
