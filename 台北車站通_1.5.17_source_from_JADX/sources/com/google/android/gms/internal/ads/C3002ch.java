package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C1697X;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ch */
public final class C3002ch extends C2717Td {

    /* renamed from: d */
    final C2749Ug f8993d;

    /* renamed from: e */
    final C3088fh f8994e;

    /* renamed from: f */
    private final String f8995f;

    C3002ch(C2749Ug ug, C3088fh fhVar, String str) {
        this.f8993d = ug;
        this.f8994e = fhVar;
        this.f8995f = str;
        C1697X.m7719z().mo9390a(this);
    }

    /* renamed from: c */
    public final void mo7015c() {
        this.f8994e.mo9424b();
    }

    /* renamed from: d */
    public final void mo7016d() {
        try {
            this.f8994e.mo9423a(this.f8995f);
        } finally {
            C3114ge.f9351a.post(new C3030dh(this));
        }
    }
}
