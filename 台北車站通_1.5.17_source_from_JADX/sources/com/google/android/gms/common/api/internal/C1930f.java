package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.gms.common.api.internal.f */
public final class C1930f extends BroadcastReceiver {

    /* renamed from: a */
    private Context f6254a;

    /* renamed from: b */
    private final C1931a f6255b;

    /* renamed from: com.google.android.gms.common.api.internal.f$a */
    public static abstract class C1931a {
        /* renamed from: a */
        public abstract void mo7380a();
    }

    public C1930f(C1931a aVar) {
        this.f6255b = aVar;
    }

    /* renamed from: a */
    public final synchronized void mo7447a() {
        if (this.f6254a != null) {
            this.f6254a.unregisterReceiver(this);
        }
        this.f6254a = null;
    }

    /* renamed from: a */
    public final void mo7448a(Context context) {
        this.f6254a = context;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f6255b.mo7380a();
            mo7447a();
        }
    }
}
