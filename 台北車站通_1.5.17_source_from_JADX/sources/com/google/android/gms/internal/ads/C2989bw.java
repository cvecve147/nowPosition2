package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.C1649c;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.bw */
public final class C2989bw extends C1649c.C1651b {

    /* renamed from: a */
    private final C2903Zv f8978a;

    /* renamed from: b */
    private final Drawable f8979b;

    /* renamed from: c */
    private final Uri f8980c;

    /* renamed from: d */
    private final double f8981d;

    public C2989bw(C2903Zv zv) {
        Drawable drawable;
        this.f8978a = zv;
        Uri uri = null;
        try {
            C5464b na = this.f8978a.mo9130na();
            if (na != null) {
                drawable = (Drawable) C5468d.m20962z(na);
                this.f8979b = drawable;
                uri = this.f8978a.getUri();
                this.f8980c = uri;
                double d = 1.0d;
                d = this.f8978a.mo9131za();
                this.f8981d = d;
            }
        } catch (RemoteException e) {
            C2227Cf.m9533b("", e);
        }
        drawable = null;
        this.f8979b = drawable;
        try {
            uri = this.f8978a.getUri();
        } catch (RemoteException e2) {
            C2227Cf.m9533b("", e2);
        }
        this.f8980c = uri;
        double d2 = 1.0d;
        try {
            d2 = this.f8978a.mo9131za();
        } catch (RemoteException e3) {
            C2227Cf.m9533b("", e3);
        }
        this.f8981d = d2;
    }

    /* renamed from: a */
    public final Drawable mo6613a() {
        return this.f8979b;
    }

    /* renamed from: b */
    public final double mo6614b() {
        return this.f8981d;
    }

    /* renamed from: c */
    public final Uri mo6615c() {
        return this.f8980c;
    }
}
