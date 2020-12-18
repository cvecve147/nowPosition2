package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.px */
final class C3394px {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<C2624Px> f10052a = new ArrayList();

    C3394px() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9916a(C2652Qx qx) {
        Handler handler = C3114ge.f9351a;
        for (C2624Px ox : this.f10052a) {
            handler.post(new C2593Ox(this, ox, qx));
        }
        this.f10052a.clear();
    }
}
