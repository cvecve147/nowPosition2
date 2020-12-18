package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1867c;
import java.util.Collections;
import java.util.Map;
import p013b.p018b.p028h.p039h.C1080b;
import p101d.p129g.p131b.p132a.p144g.C5532c;
import p101d.p129g.p131b.p132a.p144g.C5536g;

/* renamed from: com.google.android.gms.common.api.internal.Ma */
final class C1902Ma implements C5532c<Map<C1973ya<?>, String>> {

    /* renamed from: a */
    private final /* synthetic */ C1898Ka f6177a;

    private C1902Ma(C1898Ka ka) {
        this.f6177a = ka;
    }

    /* renamed from: a */
    public final void mo7373a(C5536g<Map<C1973ya<?>, String>> gVar) {
        C1898Ka ka;
        ConnectionResult connectionResult;
        Map d;
        this.f6177a.f6138f.lock();
        try {
            if (this.f6177a.f6146n) {
                if (gVar.mo14995e()) {
                    Map unused = this.f6177a.f6147o = new C1080b(this.f6177a.f6133a.size());
                    for (C1896Ja e : this.f6177a.f6133a.values()) {
                        this.f6177a.f6147o.put(e.mo7317e(), ConnectionResult.f6007a);
                    }
                } else {
                    if (gVar.mo14990a() instanceof C1867c) {
                        C1867c cVar = (C1867c) gVar.mo14990a();
                        if (this.f6177a.f6144l) {
                            Map unused2 = this.f6177a.f6147o = new C1080b(this.f6177a.f6133a.size());
                            for (C1896Ja ja : this.f6177a.f6133a.values()) {
                                C1973ya e2 = ja.mo7317e();
                                ConnectionResult a = cVar.mo7308a(ja);
                                if (this.f6177a.m8404a((C1896Ja<?>) ja, a)) {
                                    d = this.f6177a.f6147o;
                                    a = new ConnectionResult(16);
                                } else {
                                    d = this.f6177a.f6147o;
                                }
                                d.put(e2, a);
                            }
                        } else {
                            Map unused3 = this.f6177a.f6147o = cVar.mo7307a();
                        }
                        ka = this.f6177a;
                        connectionResult = this.f6177a.m8413e();
                    } else {
                        Log.e("ConnectionlessGAC", "Unexpected availability exception", gVar.mo14990a());
                        Map unused4 = this.f6177a.f6147o = Collections.emptyMap();
                        ka = this.f6177a;
                        connectionResult = new ConnectionResult(8);
                    }
                    ConnectionResult unused5 = ka.f6150r = connectionResult;
                }
                if (this.f6177a.f6148p != null) {
                    this.f6177a.f6147o.putAll(this.f6177a.f6148p);
                    ConnectionResult unused6 = this.f6177a.f6150r = this.f6177a.m8413e();
                }
                if (this.f6177a.f6150r == null) {
                    this.f6177a.m8410c();
                    this.f6177a.m8412d();
                } else {
                    boolean unused7 = this.f6177a.f6146n = false;
                    this.f6177a.f6137e.mo7355a(this.f6177a.f6150r);
                }
                this.f6177a.f6141i.signalAll();
            }
        } finally {
            this.f6177a.f6138f.unlock();
        }
    }
}
