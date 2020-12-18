package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Qp */
public final class C2644Qp extends C2924_o<Integer, Object> {

    /* renamed from: b */
    public Long f8156b;

    /* renamed from: c */
    public Boolean f8157c;

    /* renamed from: d */
    public Boolean f8158d;

    public C2644Qp(String str) {
        mo8750b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Object> mo8092a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f8156b);
        hashMap.put(1, this.f8157c);
        hashMap.put(2, this.f8158d);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo8750b(String str) {
        HashMap a = C2924_o.m11865a(str);
        if (a != null) {
            this.f8156b = (Long) a.get(0);
            this.f8157c = (Boolean) a.get(1);
            this.f8158d = (Boolean) a.get(2);
        }
    }
}
