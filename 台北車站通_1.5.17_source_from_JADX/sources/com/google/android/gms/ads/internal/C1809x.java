package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.C1718E;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2880Yz;
import com.google.android.gms.internal.ads.C2965bA;
import com.google.android.gms.internal.ads.C3520uh;
import java.util.Map;
import p101d.p129g.p131b.p132a.p134b.C5468d;

/* renamed from: com.google.android.gms.ads.internal.x */
final class C1809x implements C1718E<C3520uh> {

    /* renamed from: a */
    private final /* synthetic */ C2880Yz f5910a;

    /* renamed from: b */
    private final /* synthetic */ C1706d f5911b;

    /* renamed from: c */
    private final /* synthetic */ C2965bA f5912c;

    C1809x(C2880Yz yz, C1706d dVar, C2965bA bAVar) {
        this.f5910a = yz;
        this.f5911b = dVar;
        this.f5912c = bAVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C3520uh uhVar = (C3520uh) obj;
        View view = uhVar.getView();
        if (view != null) {
            try {
                if (this.f5910a != null) {
                    if (!this.f5910a.mo9094H()) {
                        this.f5910a.mo9097a(C5468d.m20961a(view));
                        this.f5911b.f5662a.mo6490f();
                        return;
                    }
                    C1799s.m8046b(uhVar);
                } else if (this.f5912c == null) {
                } else {
                    if (!this.f5912c.mo9208H()) {
                        this.f5912c.mo9212a(C5468d.m20961a(view));
                        this.f5911b.f5662a.mo6490f();
                        return;
                    }
                    C1799s.m8046b(uhVar);
                }
            } catch (RemoteException e) {
                C2227Cf.m9535c("Unable to call handleClick on mapper", e);
            }
        }
    }
}
