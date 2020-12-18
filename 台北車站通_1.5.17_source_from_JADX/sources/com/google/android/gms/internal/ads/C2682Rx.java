package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C1697X;
import java.util.Random;

/* renamed from: com.google.android.gms.internal.ads.Rx */
final class C2682Rx extends C3590wt {

    /* renamed from: a */
    private final C3562vt f8226a;

    C2682Rx(C3562vt vtVar) {
        this.f8226a = vtVar;
    }

    /* renamed from: M */
    public final void mo8798M() {
        this.f8226a.mo8798M();
    }

    /* renamed from: N */
    public final void mo8799N() {
        this.f8226a.mo8799N();
    }

    /* renamed from: P */
    public final void mo8800P() {
        this.f8226a.mo8800P();
    }

    /* renamed from: S */
    public final void mo8801S() {
        this.f8226a.mo8801S();
    }

    /* renamed from: U */
    public final void mo8802U() {
        if (C2962ay.m11949a()) {
            int intValue = ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7736Fb)).intValue();
            int intValue2 = ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7742Gb)).intValue();
            if (intValue <= 0 || intValue2 < 0) {
                C1697X.m7711r().mo8915a();
            } else {
                C3114ge.f9351a.postDelayed(C2710Sx.f8321a, (long) (intValue + new Random().nextInt(intValue2 + 1)));
            }
        }
        this.f8226a.mo8802U();
    }

    /* renamed from: c */
    public final void mo8803c(int i) {
        this.f8226a.mo8803c(i);
    }

    /* renamed from: f */
    public final void mo8804f() {
        this.f8226a.mo8804f();
    }
}
