package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.C1763m;

/* renamed from: com.google.android.gms.internal.ads.Wx */
final class C2822Wx {

    /* renamed from: a */
    C1763m f8576a;

    /* renamed from: b */
    zzjj f8577b;

    /* renamed from: c */
    C3394px f8578c;

    /* renamed from: d */
    long f8579d;

    /* renamed from: e */
    boolean f8580e;

    /* renamed from: f */
    boolean f8581f;

    /* renamed from: g */
    private final /* synthetic */ C2795Vx f8582g;

    C2822Wx(C2795Vx vx, C3365ox oxVar) {
        this.f8582g = vx;
        this.f8576a = oxVar.mo9844b(vx.f8476c);
        this.f8578c = new C3394px();
        C3394px pxVar = this.f8578c;
        C1763m mVar = this.f8576a;
        mVar.mo6811b((C3562vt) new C3422qx(pxVar));
        mVar.mo6804a((C2620Pt) new C3679zx(pxVar));
        mVar.mo6745a((C3131gv) new C2217Bx(pxVar));
        mVar.mo6805a((C3475st) new C2274Dx(pxVar));
        mVar.mo6802a((C2253Dc) new C2331Fx(pxVar));
    }

    C2822Wx(C2795Vx vx, C3365ox oxVar, zzjj zzjj) {
        this(vx, oxVar);
        this.f8577b = zzjj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo9011a() {
        if (this.f8580e) {
            return false;
        }
        zzjj zzjj = this.f8577b;
        if (zzjj == null) {
            zzjj = this.f8582g.f8475b;
        }
        this.f8581f = this.f8576a.mo6812b(C2739Tx.m11311b(zzjj));
        this.f8580e = true;
        this.f8579d = C1697X.m7705l().mo7725a();
        return true;
    }
}
