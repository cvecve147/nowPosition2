package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Rp */
public final class C2674Rp extends C2924_o<Integer, Long> {

    /* renamed from: b */
    public Long f8215b;

    /* renamed from: c */
    public Long f8216c;

    public C2674Rp(String str) {
        mo8793b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo8092a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f8215b);
        hashMap.put(1, this.f8216c);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo8793b(String str) {
        HashMap a = C2924_o.m11865a(str);
        if (a != null) {
            this.f8215b = (Long) a.get(0);
            this.f8216c = (Long) a.get(1);
        }
    }
}
