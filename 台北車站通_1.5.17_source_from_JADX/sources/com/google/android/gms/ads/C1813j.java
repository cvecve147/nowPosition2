package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2987bu;
import com.google.android.gms.internal.ads.C3591wu;

@C2478La
/* renamed from: com.google.android.gms.ads.j */
public final class C1813j {

    /* renamed from: a */
    private final Object f5932a = new Object();

    /* renamed from: b */
    private C2987bu f5933b;

    /* renamed from: c */
    private C1814a f5934c;

    /* renamed from: com.google.android.gms.ads.j$a */
    public static abstract class C1814a {
        /* renamed from: a */
        public void mo7052a() {
            throw null;
        }

        /* renamed from: a */
        public void mo7053a(boolean z) {
            throw null;
        }

        /* renamed from: b */
        public void mo7054b() {
            throw null;
        }

        /* renamed from: c */
        public void mo7055c() {
            throw null;
        }

        /* renamed from: d */
        public void mo7056d() {
            throw null;
        }
    }

    /* renamed from: a */
    public final C2987bu mo7049a() {
        C2987bu buVar;
        synchronized (this.f5932a) {
            buVar = this.f5933b;
        }
        return buVar;
    }

    /* renamed from: a */
    public final void mo7050a(C1814a aVar) {
        C2061y.m9068a(aVar, (Object) "VideoLifecycleCallbacks may not be null.");
        synchronized (this.f5932a) {
            this.f5934c = aVar;
            if (this.f5933b != null) {
                try {
                    this.f5933b.mo8405a(new C3591wu(aVar));
                } catch (RemoteException e) {
                    C2227Cf.m9533b("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo7051a(C2987bu buVar) {
        synchronized (this.f5932a) {
            this.f5933b = buVar;
            if (this.f5934c != null) {
                mo7050a(this.f5934c);
            }
        }
    }
}
