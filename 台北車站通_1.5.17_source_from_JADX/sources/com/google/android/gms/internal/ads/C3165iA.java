package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.C1818a;
import java.util.Date;
import java.util.Set;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.iA */
public final class C3165iA implements C1818a {

    /* renamed from: a */
    private final Date f9448a;

    /* renamed from: b */
    private final int f9449b;

    /* renamed from: c */
    private final Set<String> f9450c;

    /* renamed from: d */
    private final boolean f9451d;

    /* renamed from: e */
    private final Location f9452e;

    /* renamed from: f */
    private final int f9453f;

    /* renamed from: g */
    private final boolean f9454g;

    public C3165iA(Date date, int i, Set<String> set, Location location, boolean z, int i2, boolean z2) {
        this.f9448a = date;
        this.f9449b = i;
        this.f9450c = set;
        this.f9452e = location;
        this.f9451d = z;
        this.f9453f = i2;
        this.f9454g = z2;
    }

    /* renamed from: a */
    public final int mo7060a() {
        return this.f9453f;
    }

    /* renamed from: c */
    public final boolean mo7061c() {
        return this.f9454g;
    }

    /* renamed from: f */
    public final Date mo7062f() {
        return this.f9448a;
    }

    /* renamed from: g */
    public final boolean mo7063g() {
        return this.f9451d;
    }

    public final Location getLocation() {
        return this.f9452e;
    }

    /* renamed from: h */
    public final Set<String> mo7065h() {
        return this.f9450c;
    }

    /* renamed from: l */
    public final int mo7066l() {
        return this.f9449b;
    }
}
