package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C1697X;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.cc */
final class C2997cc implements Callable<C2909_b> {

    /* renamed from: a */
    private final /* synthetic */ Context f8989a;

    /* renamed from: b */
    private final /* synthetic */ C2968bc f8990b;

    C2997cc(C2968bc bcVar, Context context) {
        this.f8990b = bcVar;
        this.f8989a = context;
    }

    public final /* synthetic */ Object call() {
        C2909_b _bVar;
        C3025dc dcVar = (C3025dc) this.f8990b.f8935a.get(this.f8989a);
        if (dcVar != null) {
            if (!(dcVar.f9058a + ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7830Vb)).longValue() < C1697X.m7705l().mo7725a())) {
                if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7825Ub)).booleanValue()) {
                    _bVar = new C2940ac(this.f8989a, dcVar.f9059b).mo9188a();
                    this.f8990b.f8935a.put(this.f8989a, new C3025dc(this.f8990b, _bVar));
                    return _bVar;
                }
            }
        }
        _bVar = new C2940ac(this.f8989a).mo9188a();
        this.f8990b.f8935a.put(this.f8989a, new C3025dc(this.f8990b, _bVar));
        return _bVar;
    }
}
