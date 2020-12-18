package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Fp */
public final class C2323Fp extends C2924_o<Integer, Long> {

    /* renamed from: b */
    public long f7007b;

    /* renamed from: c */
    public long f7008c;

    public C2323Fp() {
        this.f7007b = -1;
        this.f7008c = -1;
    }

    public C2323Fp(String str) {
        this();
        mo8093b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo8092a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.f7007b));
        hashMap.put(1, Long.valueOf(this.f7008c));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo8093b(String str) {
        HashMap a = C2924_o.m11865a(str);
        if (a != null) {
            this.f7007b = ((Long) a.get(0)).longValue();
            this.f7008c = ((Long) a.get(1)).longValue();
        }
    }
}
