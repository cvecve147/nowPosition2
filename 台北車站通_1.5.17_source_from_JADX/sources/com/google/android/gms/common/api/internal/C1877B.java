package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.internal.C2011d;
import com.google.android.gms.common.internal.C2061y;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.B */
final class C1877B implements C2011d.C2015d {

    /* renamed from: a */
    private final WeakReference<C1974z> f6077a;

    /* renamed from: b */
    private final C1850a<?> f6078b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final boolean f6079c;

    public C1877B(C1974z zVar, C1850a<?> aVar, boolean z) {
        this.f6077a = new WeakReference<>(zVar);
        this.f6078b = aVar;
        this.f6079c = z;
    }

    /* renamed from: a */
    public final void mo7324a(ConnectionResult connectionResult) {
        C1974z zVar = (C1974z) this.f6077a.get();
        if (zVar != null) {
            C2061y.m9078b(Looper.myLooper() == zVar.f6327a.f6194n.mo7244a(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            zVar.f6328b.lock();
            try {
                if (zVar.m8695a(0)) {
                    if (!connectionResult.mo7218f()) {
                        zVar.m8701b(connectionResult, this.f6078b, this.f6079c);
                    }
                    if (zVar.m8704c()) {
                        zVar.m8706d();
                    }
                }
            } finally {
                zVar.f6328b.unlock();
            }
        }
    }
}
