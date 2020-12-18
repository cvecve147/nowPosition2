package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C1718E;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qy */
final /* synthetic */ class C3423qy implements Runnable {

    /* renamed from: a */
    private final C3395py f10097a;

    /* renamed from: b */
    private final C1718E f10098b;

    /* renamed from: c */
    private final Map f10099c;

    C3423qy(C3395py pyVar, C1718E e, Map map) {
        this.f10097a = pyVar;
        this.f10098b = e;
        this.f10099c = map;
    }

    public final void run() {
        C3395py pyVar = this.f10097a;
        this.f10098b.zza(pyVar.mo9299k(), this.f10099c);
    }
}
