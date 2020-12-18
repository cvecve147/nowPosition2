package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p101d.p129g.p131b.p132a.p144g.C5536g;

/* renamed from: com.google.firebase.iid.I */
public final class C4060I {

    /* renamed from: a */
    private static C4060I f12055a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f12056b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ScheduledExecutorService f12057c;

    /* renamed from: d */
    private C4062K f12058d = new C4062K(this);

    /* renamed from: e */
    private int f12059e = 1;

    private C4060I(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f12057c = scheduledExecutorService;
        this.f12056b = context.getApplicationContext();
    }

    /* renamed from: a */
    private final synchronized int m16280a() {
        int i;
        i = this.f12059e;
        this.f12059e = i + 1;
        return i;
    }

    /* renamed from: a */
    public static synchronized C4060I m16282a(Context context) {
        C4060I i;
        synchronized (C4060I.class) {
            if (f12055a == null) {
                f12055a = new C4060I(context, Executors.newSingleThreadScheduledExecutor());
            }
            i = f12055a;
        }
        return i;
    }

    /* renamed from: a */
    private final synchronized <T> C5536g<T> m16283a(C4071b<T> bVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(bVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f12058d.mo11489a((C4071b) bVar)) {
            this.f12058d = new C4062K(this);
            this.f12058d.mo11489a((C4071b) bVar);
        }
        return bVar.f12075b.mo14996a();
    }

    /* renamed from: a */
    public final C5536g<Bundle> mo11484a(int i, Bundle bundle) {
        return m16283a(new C4073d(m16280a(), 1, bundle));
    }
}
