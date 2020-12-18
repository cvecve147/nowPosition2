package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import com.google.android.gms.common.C2064k;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Lu */
public final class C2500Lu {

    /* renamed from: a */
    private final Object f7539a = new Object();

    /* renamed from: b */
    private final ConditionVariable f7540b = new ConditionVariable();

    /* renamed from: c */
    private volatile boolean f7541c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public SharedPreferences f7542d = null;

    /* renamed from: e */
    private Context f7543e;

    /* renamed from: a */
    public final <T> T mo8515a(C2271Du<T> du) {
        if (this.f7540b.block(5000)) {
            if (!this.f7541c || this.f7542d == null) {
                synchronized (this.f7539a) {
                    if (this.f7541c) {
                        if (this.f7542d == null) {
                        }
                    }
                    T c = du.mo8017c();
                    return c;
                }
            }
            return C3171if.m12583a(this.f7543e, new C2528Mu(this, du));
        }
        throw new IllegalStateException("Flags.initialize() was not called!");
    }

    /* renamed from: a */
    public final void mo8516a(Context context) {
        if (!this.f7541c) {
            synchronized (this.f7539a) {
                if (!this.f7541c) {
                    this.f7543e = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    try {
                        Context remoteContext = C2064k.getRemoteContext(context);
                        if (remoteContext == null && context != null && (remoteContext = context.getApplicationContext()) == null) {
                            remoteContext = context;
                        }
                        if (remoteContext != null) {
                            C3390pt.m13456d();
                            this.f7542d = remoteContext.getSharedPreferences("google_ads_flags", 0);
                            this.f7541c = true;
                            this.f7540b.open();
                        }
                    } finally {
                        this.f7540b.open();
                    }
                }
            }
        }
    }
}
