package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Mq */
public final class C2524Mq implements C2788Vq {

    /* renamed from: a */
    private final Object f7610a = new Object();

    /* renamed from: b */
    private final WeakHashMap<C2254Dd, C2554Nq> f7611b = new WeakHashMap<>();

    /* renamed from: c */
    private final ArrayList<C2554Nq> f7612c = new ArrayList<>();

    /* renamed from: d */
    private final Context f7613d;

    /* renamed from: e */
    private final zzang f7614e;

    /* renamed from: f */
    private final C2275Dy f7615f;

    public C2524Mq(Context context, zzang zzang) {
        this.f7613d = context.getApplicationContext();
        this.f7614e = zzang;
        this.f7615f = new C2275Dy(context.getApplicationContext(), zzang, (String) C3390pt.m13458f().mo8515a(C2558Nu.f7863b));
    }

    /* renamed from: e */
    private final boolean m10613e(C2254Dd dd) {
        boolean z;
        synchronized (this.f7610a) {
            C2554Nq nq = this.f7611b.get(dd);
            z = nq != null && nq.mo8596f();
        }
        return z;
    }

    /* renamed from: a */
    public final void mo8548a(C2254Dd dd) {
        synchronized (this.f7610a) {
            C2554Nq nq = this.f7611b.get(dd);
            if (nq != null) {
                nq.mo8595e();
            }
        }
    }

    /* renamed from: a */
    public final void mo8549a(C2554Nq nq) {
        synchronized (this.f7610a) {
            if (!nq.mo8596f()) {
                this.f7612c.remove(nq);
                Iterator<Map.Entry<C2254Dd, C2554Nq>> it = this.f7611b.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue() == nq) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo8550a(zzjn zzjn, C2254Dd dd) {
        mo8551a(zzjn, dd, dd.f6863b.getView());
    }

    /* renamed from: a */
    public final void mo8551a(zzjn zzjn, C2254Dd dd, View view) {
        mo8553a(zzjn, dd, (C3644yr) new C2732Tq(view, dd), (C3520uh) null);
    }

    /* renamed from: a */
    public final void mo8552a(zzjn zzjn, C2254Dd dd, View view, C3520uh uhVar) {
        mo8553a(zzjn, dd, (C3644yr) new C2732Tq(view, dd), uhVar);
    }

    /* renamed from: a */
    public final void mo8553a(zzjn zzjn, C2254Dd dd, C3644yr yrVar, C3520uh uhVar) {
        C2554Nq nq;
        synchronized (this.f7610a) {
            if (m10613e(dd)) {
                nq = this.f7611b.get(dd);
            } else {
                C2554Nq nq2 = new C2554Nq(this.f7613d, zzjn, dd, this.f7614e, yrVar);
                nq2.mo8585a((C2788Vq) this);
                this.f7611b.put(dd, nq2);
                this.f7612c.add(nq2);
                nq = nq2;
            }
            nq.mo8586a(uhVar != null ? new C2815Wq(nq, uhVar) : new C2926_q(nq, this.f7615f, this.f7613d));
        }
    }

    /* renamed from: b */
    public final void mo8554b(C2254Dd dd) {
        synchronized (this.f7610a) {
            C2554Nq nq = this.f7611b.get(dd);
            if (nq != null) {
                nq.mo8592c();
            }
        }
    }

    /* renamed from: c */
    public final void mo8555c(C2254Dd dd) {
        synchronized (this.f7610a) {
            C2554Nq nq = this.f7611b.get(dd);
            if (nq != null) {
                nq.mo8583a();
            }
        }
    }

    /* renamed from: d */
    public final void mo8556d(C2254Dd dd) {
        synchronized (this.f7610a) {
            C2554Nq nq = this.f7611b.get(dd);
            if (nq != null) {
                nq.mo8589b();
            }
        }
    }
}
