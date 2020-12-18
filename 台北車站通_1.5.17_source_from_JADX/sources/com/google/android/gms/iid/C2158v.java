package com.google.android.gms.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p101d.p129g.p131b.p132a.p144g.C5536g;

/* renamed from: com.google.android.gms.iid.v */
public final class C2158v {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f6645a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ScheduledExecutorService f6646b;

    /* renamed from: c */
    private C2160x f6647c;

    /* renamed from: d */
    private int f6648d;

    public C2158v(Context context) {
        this(context, Executors.newSingleThreadScheduledExecutor());
    }

    private C2158v(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f6647c = new C2160x(this);
        this.f6648d = 1;
        this.f6645a = context.getApplicationContext();
        this.f6646b = scheduledExecutorService;
    }

    /* renamed from: a */
    private final synchronized int m9292a() {
        int i;
        i = this.f6648d;
        this.f6648d = i + 1;
        return i;
    }

    /* renamed from: a */
    private final synchronized <T> C5536g<T> m9294a(C2136D<T> d) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(d);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f6647c.mo7788a((C2136D) d)) {
            this.f6647c = new C2160x(this);
            this.f6647c.mo7788a((C2136D) d);
        }
        return d.f6609b.mo14996a();
    }

    /* renamed from: a */
    public final C5536g<Bundle> mo7783a(int i, Bundle bundle) {
        return m9294a(new C2140d(m9292a(), 1, bundle));
    }
}
