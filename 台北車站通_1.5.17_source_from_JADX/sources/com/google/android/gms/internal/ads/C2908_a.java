package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.C2087i;

/* renamed from: com.google.android.gms.internal.ads._a */
final class C2908_a implements C2967bb {

    /* renamed from: a */
    private final /* synthetic */ Context f8729a;

    C2908_a(Context context) {
        this.f8729a = context;
    }

    /* renamed from: a */
    public final boolean mo9133a(zzang zzang) {
        C3390pt.m13453a();
        boolean c = C3432rf.m13611c(this.f8729a);
        boolean z = ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7934me)).booleanValue() && zzang.f10858d;
        if (C2882Za.m11684b(this.f8729a, zzang.f10858d) && c && !z) {
            if (C2087i.m9150b(this.f8729a)) {
                if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7858aa)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
