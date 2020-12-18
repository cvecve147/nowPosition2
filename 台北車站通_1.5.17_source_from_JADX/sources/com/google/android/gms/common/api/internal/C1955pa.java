package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1874i;
import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: com.google.android.gms.common.api.internal.pa */
final class C1955pa implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C1874i f6294a;

    /* renamed from: b */
    private final /* synthetic */ C1953oa f6295b;

    C1955pa(C1953oa oaVar, C1874i iVar) {
        this.f6295b = oaVar;
        this.f6294a = iVar;
    }

    public final void run() {
        try {
            BasePendingResult.f6080a.set(true);
            this.f6295b.f6293g.sendMessage(this.f6295b.f6293g.obtainMessage(0, this.f6295b.f6287a.mo7498a(this.f6294a)));
            BasePendingResult.f6080a.set(false);
            C1953oa.m8633b(this.f6294a);
            GoogleApiClient googleApiClient = (GoogleApiClient) this.f6295b.f6292f.get();
            if (googleApiClient != null) {
                googleApiClient.mo7249a(this.f6295b);
            }
        } catch (RuntimeException e) {
            this.f6295b.f6293g.sendMessage(this.f6295b.f6293g.obtainMessage(1, e));
            BasePendingResult.f6080a.set(false);
            C1953oa.m8633b(this.f6294a);
            GoogleApiClient googleApiClient2 = (GoogleApiClient) this.f6295b.f6292f.get();
            if (googleApiClient2 != null) {
                googleApiClient2.mo7249a(this.f6295b);
            }
        } catch (Throwable th) {
            BasePendingResult.f6080a.set(false);
            C1953oa.m8633b(this.f6294a);
            GoogleApiClient googleApiClient3 = (GoogleApiClient) this.f6295b.f6292f.get();
            if (googleApiClient3 != null) {
                googleApiClient3.mo7249a(this.f6295b);
            }
            throw th;
        }
    }
}
