package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2329Fv;
import com.google.android.gms.internal.ads.C3449rv;
import com.google.android.gms.internal.ads.C3506tv;
import com.google.android.gms.internal.ads.C3648yv;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.G */
final class C1681G implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2329Fv f5520a;

    /* renamed from: b */
    private final /* synthetic */ int f5521b;

    /* renamed from: c */
    private final /* synthetic */ List f5522c;

    /* renamed from: d */
    private final /* synthetic */ C1678D f5523d;

    C1681G(C1678D d, C2329Fv fv, int i, List list) {
        this.f5523d = d;
        this.f5520a = fv;
        this.f5521b = i;
        this.f5522c = list;
    }

    public final void run() {
        try {
            boolean z = false;
            if ((this.f5520a instanceof C3506tv) && this.f5523d.f5648f.f5633t != null) {
                C1678D d = this.f5523d;
                if (this.f5521b != this.f5522c.size() - 1) {
                    z = true;
                }
                d.f5646d = z;
                C3648yv a = C1678D.m7584b(this.f5520a);
                this.f5523d.f5648f.f5633t.mo8600a(a);
                this.f5523d.mo6771z(a.mo8876x());
            } else if ((this.f5520a instanceof C3506tv) && this.f5523d.f5648f.f5632s != null) {
                C1678D d2 = this.f5523d;
                if (this.f5521b != this.f5522c.size() - 1) {
                    z = true;
                }
                d2.f5646d = z;
                C3506tv tvVar = (C3506tv) this.f5520a;
                this.f5523d.f5648f.f5632s.mo7853a(tvVar);
                this.f5523d.mo6771z(tvVar.mo9914x());
            } else if ((this.f5520a instanceof C3449rv) && this.f5523d.f5648f.f5633t != null) {
                C1678D d3 = this.f5523d;
                if (this.f5521b != this.f5522c.size() - 1) {
                    z = true;
                }
                d3.f5646d = z;
                C3648yv a2 = C1678D.m7584b(this.f5520a);
                this.f5523d.f5648f.f5633t.mo8600a(a2);
                this.f5523d.mo6771z(a2.mo8876x());
            } else if (!(this.f5520a instanceof C3449rv) || this.f5523d.f5648f.f5631r == null) {
                C1678D d4 = this.f5523d;
                if (this.f5521b != this.f5522c.size() - 1) {
                    z = true;
                }
                d4.mo6754d(3, z);
            } else {
                C1678D d5 = this.f5523d;
                if (this.f5521b != this.f5522c.size() - 1) {
                    z = true;
                }
                d5.f5646d = z;
                C3449rv rvVar = (C3449rv) this.f5520a;
                this.f5523d.f5648f.f5631r.mo9080a(rvVar);
                this.f5523d.mo6771z(rvVar.mo9703x());
            }
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }
}
