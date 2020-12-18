package com.google.android.gms.iid;

import android.content.Context;
import android.content.Intent;

@Deprecated
/* renamed from: com.google.android.gms.iid.b */
public class C2138b extends C2151o {
    /* renamed from: a */
    static void m9238a(Context context, C2149m mVar) {
        mVar.mo7774b();
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra("CMD", "RST");
        intent.setClassName(context, "com.google.android.gms.gcm.GcmReceiver");
        context.sendBroadcast(intent);
    }
}
