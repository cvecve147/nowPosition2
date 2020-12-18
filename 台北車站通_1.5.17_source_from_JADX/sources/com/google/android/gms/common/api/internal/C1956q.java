package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1866b;
import com.google.android.gms.common.api.C1870f;
import com.google.android.gms.common.api.C1874i;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p101d.p129g.p131b.p132a.p144g.C5537h;

/* renamed from: com.google.android.gms.common.api.internal.q */
public final class C1956q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f6296a = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<C5537h<?>, Boolean> f6297b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: a */
    private final void m8640a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f6296a) {
            hashMap = new HashMap(this.f6296a);
        }
        synchronized (this.f6297b) {
            hashMap2 = new HashMap(this.f6297b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo7332b(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C5537h) entry2.getKey()).mo14999b((Exception) new C1866b(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7477a(BasePendingResult<? extends C1874i> basePendingResult, boolean z) {
        this.f6296a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo7328a((C1870f.C1871a) new C1958r(this, basePendingResult));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <TResult> void mo7478a(C5537h<TResult> hVar, boolean z) {
        this.f6297b.put(hVar, Boolean.valueOf(z));
        hVar.mo14996a().mo14984a(new C1960s(this, hVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo7479a() {
        return !this.f6296a.isEmpty() || !this.f6297b.isEmpty();
    }

    /* renamed from: b */
    public final void mo7480b() {
        m8640a(false, C1925e.f6216a);
    }

    /* renamed from: c */
    public final void mo7481c() {
        m8640a(true, C1959ra.f6300a);
    }
}
