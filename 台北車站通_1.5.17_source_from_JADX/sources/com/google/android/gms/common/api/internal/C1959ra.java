package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.C1874i;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.ra */
public final class C1959ra {

    /* renamed from: a */
    public static final Status f6300a = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: b */
    private static final BasePendingResult<?>[] f6301b = new BasePendingResult[0];

    /* renamed from: c */
    final Set<BasePendingResult<?>> f6302c = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: d */
    private final C1965ua f6303d = new C1961sa(this);

    /* renamed from: e */
    private final Map<C1850a.C1853c<?>, C1850a.C1861f> f6304e;

    public C1959ra(Map<C1850a.C1853c<?>, C1850a.C1861f> map) {
        this.f6304e = map;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.common.api.internal.sa, com.google.android.gms.common.api.j, com.google.android.gms.common.api.internal.ua, com.google.android.gms.common.api.o] */
    /* renamed from: a */
    public final void mo7482a() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f6302c.toArray(f6301b)) {
            ? r5 = 0;
            basePendingResult.mo7330a((C1965ua) r5);
            if (basePendingResult.mo7335d() != null) {
                basePendingResult.mo7331a(r5);
                IBinder k = this.f6304e.get(((C1921c) basePendingResult).mo7414h()).mo7302k();
                if (basePendingResult.mo7334c()) {
                    basePendingResult.mo7330a((C1965ua) new C1963ta(basePendingResult, r5, k, r5));
                } else {
                    if (k == null || !k.isBinderAlive()) {
                        basePendingResult.mo7330a((C1965ua) r5);
                    } else {
                        C1963ta taVar = new C1963ta(basePendingResult, r5, k, r5);
                        basePendingResult.mo7330a((C1965ua) taVar);
                        try {
                            k.linkToDeath(taVar, 0);
                        } catch (RemoteException unused) {
                        }
                    }
                    basePendingResult.mo7327a();
                    r5.mo7500a(basePendingResult.mo7335d().intValue());
                }
            } else if (!basePendingResult.mo7336e()) {
            }
            this.f6302c.remove(basePendingResult);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7483a(BasePendingResult<? extends C1874i> basePendingResult) {
        this.f6302c.add(basePendingResult);
        basePendingResult.mo7330a(this.f6303d);
    }

    /* renamed from: b */
    public final void mo7484b() {
        for (BasePendingResult b : (BasePendingResult[]) this.f6302c.toArray(f6301b)) {
            b.mo7332b(f6300a);
        }
    }
}
