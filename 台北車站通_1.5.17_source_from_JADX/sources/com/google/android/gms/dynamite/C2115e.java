package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.e */
final class C2115e implements DynamiteModule.C2102b {
    C2115e() {
    }

    /* renamed from: a */
    public final DynamiteModule.C2102b.C2104b mo7731a(Context context, String str, DynamiteModule.C2102b.C2103a aVar) {
        DynamiteModule.C2102b.C2104b bVar = new DynamiteModule.C2102b.C2104b();
        bVar.f6581a = aVar.mo7732a(context, str);
        if (bVar.f6581a != 0) {
            bVar.f6583c = -1;
        } else {
            bVar.f6582b = aVar.mo7733a(context, str, true);
            if (bVar.f6582b != 0) {
                bVar.f6583c = 1;
            }
        }
        return bVar;
    }
}
