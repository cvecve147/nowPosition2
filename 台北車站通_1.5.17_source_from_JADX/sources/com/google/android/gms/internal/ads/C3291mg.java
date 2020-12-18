package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.mg */
public class C3291mg<T> implements C3172ig<T> {

    /* renamed from: a */
    private final Object f9788a = new Object();

    /* renamed from: b */
    private int f9789b = 0;

    /* renamed from: c */
    private final BlockingQueue<C3319ng> f9790c = new LinkedBlockingQueue();

    /* renamed from: d */
    private T f9791d;

    /* renamed from: a */
    public final int mo9734a() {
        return this.f9789b;
    }

    /* renamed from: a */
    public final void mo9535a(C3262lg<T> lgVar, C3201jg jgVar) {
        synchronized (this.f9788a) {
            if (this.f9789b == 1) {
                lgVar.mo7969a(this.f9791d);
            } else if (this.f9789b == -1) {
                jgVar.run();
            } else if (this.f9789b == 0) {
                this.f9790c.add(new C3319ng(this, lgVar, jgVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo9536a(T t) {
        synchronized (this.f9788a) {
            if (this.f9789b == 0) {
                this.f9791d = t;
                this.f9789b = 1;
                for (C3319ng ngVar : this.f9790c) {
                    ngVar.f9866a.mo7969a(t);
                }
                this.f9790c.clear();
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }

    /* renamed from: b */
    public final void mo9735b() {
        synchronized (this.f9788a) {
            if (this.f9789b == 0) {
                this.f9789b = -1;
                for (C3319ng ngVar : this.f9790c) {
                    ngVar.f9867b.run();
                }
                this.f9790c.clear();
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }
}
