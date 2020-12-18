package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.C1697X;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Qd */
public final class C2631Qd {

    /* renamed from: a */
    private final Object f8132a;

    /* renamed from: b */
    private int f8133b;

    /* renamed from: c */
    private int f8134c;

    /* renamed from: d */
    private final C2658Rd f8135d;

    /* renamed from: e */
    private final String f8136e;

    private C2631Qd(C2658Rd rd, String str) {
        this.f8132a = new Object();
        this.f8135d = rd;
        this.f8136e = str;
    }

    public C2631Qd(String str) {
        this(C1697X.m7703j(), str);
    }

    /* renamed from: a */
    public final Bundle mo8735a() {
        Bundle bundle;
        synchronized (this.f8132a) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.f8133b);
            bundle.putInt("pmnll", this.f8134c);
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo8736a(int i, int i2) {
        synchronized (this.f8132a) {
            this.f8133b = i;
            this.f8134c = i2;
            this.f8135d.mo8774a(this);
        }
    }

    /* renamed from: b */
    public final String mo8737b() {
        return this.f8136e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2631Qd.class == obj.getClass()) {
            C2631Qd qd = (C2631Qd) obj;
            String str = this.f8136e;
            if (str != null) {
                return str.equals(qd.f8136e);
            }
            if (qd.f8136e == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8136e;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
