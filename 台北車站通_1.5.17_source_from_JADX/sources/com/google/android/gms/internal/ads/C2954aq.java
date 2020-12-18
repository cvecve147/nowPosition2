package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.aq */
public final class C2954aq extends C2924_o<Integer, Long> {

    /* renamed from: b */
    public Long f8917b;

    /* renamed from: c */
    public Long f8918c;

    /* renamed from: d */
    public Long f8919d;

    public C2954aq(String str) {
        mo9194b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo8092a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f8917b);
        hashMap.put(1, this.f8918c);
        hashMap.put(2, this.f8919d);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9194b(String str) {
        HashMap a = C2924_o.m11865a(str);
        if (a != null) {
            this.f8917b = (Long) a.get(0);
            this.f8918c = (Long) a.get(1);
            this.f8919d = (Long) a.get(2);
        }
    }
}
