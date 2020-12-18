package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Gd */
final class C2339Gd {

    /* renamed from: a */
    private long f7045a = -1;

    /* renamed from: b */
    private long f7046b = -1;

    /* renamed from: a */
    public final Bundle mo8113a() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f7045a);
        bundle.putLong("tclose", this.f7046b);
        return bundle;
    }

    /* renamed from: b */
    public final long mo8114b() {
        return this.f7046b;
    }

    /* renamed from: c */
    public final void mo8115c() {
        this.f7046b = SystemClock.elapsedRealtime();
    }

    /* renamed from: d */
    public final void mo8116d() {
        this.f7045a = SystemClock.elapsedRealtime();
    }
}
