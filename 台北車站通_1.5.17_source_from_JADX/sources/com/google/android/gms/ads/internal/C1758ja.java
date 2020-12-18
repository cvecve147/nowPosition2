package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2282Ed;
import com.google.android.gms.internal.ads.C2315Fh;
import com.google.android.gms.internal.ads.C2506M;
import com.google.android.gms.internal.ads.C2930_u;
import com.google.android.gms.internal.ads.C2959av;
import com.google.android.gms.internal.ads.C3114ge;
import com.google.android.gms.internal.ads.C3345od;
import com.google.android.gms.internal.ads.C3520uh;
import com.google.android.gms.internal.ads.zzaej;

/* renamed from: com.google.android.gms.ads.internal.ja */
final class C1758ja implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2282Ed f5768a;

    /* renamed from: b */
    final /* synthetic */ C3345od f5769b;

    /* renamed from: c */
    private final /* synthetic */ C2930_u f5770c;

    /* renamed from: d */
    final /* synthetic */ C1713ga f5771d;

    C1758ja(C1713ga gaVar, C2282Ed ed, C3345od odVar, C2930_u _uVar) {
        this.f5771d = gaVar;
        this.f5768a = ed;
        this.f5769b = odVar;
        this.f5770c = _uVar;
    }

    public final void run() {
        zzaej zzaej = this.f5768a.f6943b;
        if (zzaej.f10821t && this.f5771d.f5648f.f5598B != null) {
            String str = null;
            if (zzaej.f10804c != null) {
                C1697X.m7698e();
                str = C3114ge.m12403a(this.f5768a.f6943b.f10804c);
            }
            C2959av avVar = new C2959av(this.f5771d, str, this.f5768a.f6943b.f10805d);
            C1713ga gaVar = this.f5771d;
            C1698Y y = gaVar.f5648f;
            y.f5605I = 1;
            try {
                gaVar.f5646d = false;
                y.f5598B.mo7922a(avVar);
                return;
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
                this.f5771d.f5646d = true;
            }
        }
        C1806va vaVar = new C1806va(this.f5771d.f5648f.f5616c, this.f5769b, this.f5768a.f6943b.f10785H);
        try {
            C3520uh a = this.f5771d.mo6910a(this.f5768a, vaVar, this.f5769b);
            a.setOnTouchListener(new C1762la(this, vaVar));
            a.setOnClickListener(new C1764ma(this, vaVar));
            C1698Y y2 = this.f5771d.f5648f;
            y2.f5605I = 0;
            C1697X.m7697d();
            C1713ga gaVar2 = this.f5771d;
            C1698Y y3 = gaVar2.f5648f;
            y2.f5621h = C2506M.m10576a(y3.f5616c, gaVar2, this.f5768a, y3.f5617d, a, gaVar2.f5658m, gaVar2, this.f5770c);
        } catch (C2315Fh e2) {
            C2227Cf.m9533b("Could not obtain webview.", e2);
            C3114ge.f9351a.post(new C1760ka(this));
        }
    }
}
