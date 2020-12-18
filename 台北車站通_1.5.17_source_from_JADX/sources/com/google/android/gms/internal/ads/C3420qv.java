package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.qv */
public final class C3420qv extends C2931_v {

    /* renamed from: a */
    private final Drawable f10093a;

    /* renamed from: b */
    private final Uri f10094b;

    /* renamed from: c */
    private final double f10095c;

    public C3420qv(Drawable drawable, Uri uri, double d) {
        this.f10093a = drawable;
        this.f10094b = uri;
        this.f10095c = d;
    }

    public final Uri getUri() {
        return this.f10094b;
    }

    /* renamed from: na */
    public final C5464b mo9130na() {
        return C5468d.m20961a(this.f10093a);
    }

    /* renamed from: za */
    public final double mo9131za() {
        return this.f10095c;
    }
}
