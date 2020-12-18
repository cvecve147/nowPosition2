package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Za */
public final class C2882Za {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m11684b(Context context, boolean z) {
        if (!z) {
            return true;
        }
        int b = DynamiteModule.m9191b(context, ModuleDescriptor.MODULE_ID);
        return b != 0 && b <= DynamiteModule.m9183a(context, ModuleDescriptor.MODULE_ID);
    }
}
