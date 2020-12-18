package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.p067c.C1639a;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Gc */
public final class C2338Gc implements C1639a {

    /* renamed from: a */
    private final C3486tc f7044a;

    public C2338Gc(C3486tc tcVar) {
        this.f7044a = tcVar;
    }

    /* renamed from: D */
    public final int mo6576D() {
        C3486tc tcVar = this.f7044a;
        if (tcVar == null) {
            return 0;
        }
        try {
            return tcVar.mo9820D();
        } catch (RemoteException e) {
            C2227Cf.m9535c("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }

    public final String getType() {
        C3486tc tcVar = this.f7044a;
        if (tcVar == null) {
            return null;
        }
        try {
            return tcVar.getType();
        } catch (RemoteException e) {
            C2227Cf.m9535c("Could not forward getType to RewardItem", e);
            return null;
        }
    }
}
