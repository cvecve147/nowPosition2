package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import p013b.p018b.p021c.C0942h;
import p013b.p018b.p021c.C0947l;

/* renamed from: com.google.android.gms.internal.ads.Xo */
public final class C2841Xo extends C0947l {

    /* renamed from: a */
    private WeakReference<C2869Yo> f8625a;

    public C2841Xo(C2869Yo yo) {
        this.f8625a = new WeakReference<>(yo);
    }

    /* renamed from: a */
    public final void mo4840a(ComponentName componentName, C0942h hVar) {
        C2869Yo yo = (C2869Yo) this.f8625a.get();
        if (yo != null) {
            yo.mo9076a(hVar);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C2869Yo yo = (C2869Yo) this.f8625a.get();
        if (yo != null) {
            yo.mo9075a();
        }
    }
}
