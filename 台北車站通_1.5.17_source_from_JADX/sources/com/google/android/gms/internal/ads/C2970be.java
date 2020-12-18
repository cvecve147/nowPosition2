package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.be */
final class C2970be extends C2999ce {

    /* renamed from: d */
    private final /* synthetic */ Bundle f8936d;

    /* renamed from: e */
    private final /* synthetic */ C2911_d f8937e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2970be(C2911_d _dVar, Bundle bundle) {
        super((C2942ae) null);
        this.f8937e = _dVar;
        this.f8936d = bundle;
    }

    /* renamed from: d */
    public final void mo7016d() {
        Iterator it = this.f8937e.f8760c.iterator();
        while (it.hasNext()) {
            ((C3027de) it.next()).mo8317a(this.f8936d);
        }
    }
}
