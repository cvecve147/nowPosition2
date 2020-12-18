package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.i */
final class C2119i implements DynamiteModule.C2102b {
    C2119i() {
    }

    /* renamed from: a */
    public final DynamiteModule.C2102b.C2104b mo7731a(Context context, String str, DynamiteModule.C2102b.C2103a aVar) {
        DynamiteModule.C2102b.C2104b bVar = new DynamiteModule.C2102b.C2104b();
        bVar.f6581a = aVar.mo7732a(context, str);
        bVar.f6582b = bVar.f6581a != 0 ? aVar.mo7733a(context, str, false) : aVar.mo7733a(context, str, true);
        if (bVar.f6581a == 0 && bVar.f6582b == 0) {
            bVar.f6583c = 0;
        } else if (bVar.f6582b >= bVar.f6581a) {
            bVar.f6583c = 1;
        } else {
            bVar.f6583c = -1;
        }
        return bVar;
    }
}
