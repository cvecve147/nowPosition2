package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.C1819b;
import com.google.android.gms.ads.mediation.C1837j;
import com.google.android.gms.ads.p068d.C1643a;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.iu */
public final class C3187iu {

    /* renamed from: a */
    private final Date f9515a;

    /* renamed from: b */
    private final String f9516b;

    /* renamed from: c */
    private final int f9517c;

    /* renamed from: d */
    private final Set<String> f9518d;

    /* renamed from: e */
    private final Location f9519e;

    /* renamed from: f */
    private final boolean f9520f;

    /* renamed from: g */
    private final Bundle f9521g;

    /* renamed from: h */
    private final Map<Class<? extends C1837j>, C1837j> f9522h;

    /* renamed from: i */
    private final String f9523i;

    /* renamed from: j */
    private final String f9524j;

    /* renamed from: k */
    private final C1643a f9525k;

    /* renamed from: l */
    private final int f9526l;

    /* renamed from: m */
    private final Set<String> f9527m;

    /* renamed from: n */
    private final Bundle f9528n;

    /* renamed from: o */
    private final Set<String> f9529o;

    /* renamed from: p */
    private final boolean f9530p;

    public C3187iu(C3220ju juVar) {
        this(juVar, (C1643a) null);
    }

    public C3187iu(C3220ju juVar, C1643a aVar) {
        this.f9515a = juVar.f9667g;
        this.f9516b = juVar.f9668h;
        this.f9517c = juVar.f9669i;
        this.f9518d = Collections.unmodifiableSet(juVar.f9661a);
        this.f9519e = juVar.f9670j;
        this.f9520f = juVar.f9671k;
        this.f9521g = juVar.f9662b;
        this.f9522h = Collections.unmodifiableMap(juVar.f9663c);
        this.f9523i = juVar.f9672l;
        this.f9524j = juVar.f9673m;
        this.f9525k = aVar;
        this.f9526l = juVar.f9674n;
        this.f9527m = Collections.unmodifiableSet(juVar.f9664d);
        this.f9528n = juVar.f9665e;
        this.f9529o = Collections.unmodifiableSet(juVar.f9666f);
        this.f9530p = juVar.f9675o;
    }

    /* renamed from: a */
    public final Bundle mo9572a(Class<? extends C1819b> cls) {
        return this.f9521g.getBundle(cls.getName());
    }

    /* renamed from: a */
    public final Date mo9573a() {
        return this.f9515a;
    }

    /* renamed from: a */
    public final boolean mo9574a(Context context) {
        Set<String> set = this.f9527m;
        C3390pt.m13453a();
        return set.contains(C3432rf.m13597a(context));
    }

    /* renamed from: b */
    public final String mo9575b() {
        return this.f9516b;
    }

    /* renamed from: c */
    public final Bundle mo9576c() {
        return this.f9528n;
    }

    /* renamed from: d */
    public final int mo9577d() {
        return this.f9517c;
    }

    /* renamed from: e */
    public final Set<String> mo9578e() {
        return this.f9518d;
    }

    /* renamed from: f */
    public final Location mo9579f() {
        return this.f9519e;
    }

    /* renamed from: g */
    public final boolean mo9580g() {
        return this.f9520f;
    }

    /* renamed from: h */
    public final String mo9581h() {
        return this.f9523i;
    }

    /* renamed from: i */
    public final boolean mo9582i() {
        return this.f9530p;
    }

    /* renamed from: j */
    public final String mo9583j() {
        return this.f9524j;
    }

    /* renamed from: k */
    public final C1643a mo9584k() {
        return this.f9525k;
    }

    /* renamed from: l */
    public final Map<Class<? extends C1837j>, C1837j> mo9585l() {
        return this.f9522h;
    }

    /* renamed from: m */
    public final Bundle mo9586m() {
        return this.f9521g;
    }

    /* renamed from: n */
    public final int mo9587n() {
        return this.f9526l;
    }

    /* renamed from: o */
    public final Set<String> mo9588o() {
        return this.f9529o;
    }
}
