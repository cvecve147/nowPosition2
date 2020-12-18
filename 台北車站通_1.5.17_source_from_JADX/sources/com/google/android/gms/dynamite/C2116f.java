package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.f */
final class C2116f implements DynamiteModule.C2102b {
    C2116f() {
    }

    /* renamed from: a */
    public final DynamiteModule.C2102b.C2104b mo7731a(Context context, String str, DynamiteModule.C2102b.C2103a aVar) {
        int i;
        DynamiteModule.C2102b.C2104b bVar = new DynamiteModule.C2102b.C2104b();
        bVar.f6581a = aVar.mo7732a(context, str);
        bVar.f6582b = aVar.mo7733a(context, str, true);
        if (bVar.f6581a == 0 && bVar.f6582b == 0) {
            i = 0;
        } else if (bVar.f6581a >= bVar.f6582b) {
            i = -1;
        } else {
            bVar.f6583c = 1;
            return bVar;
        }
        bVar.f6583c = i;
        return bVar;
    }
}
