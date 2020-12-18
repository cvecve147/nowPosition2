package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.jn */
final class C3209jn implements C2521Mn {

    /* renamed from: a */
    private static final C3469sn f9610a = new C3241kn();

    /* renamed from: b */
    private final C3469sn f9611b;

    public C3209jn() {
        this(new C3270ln(C2550Nm.m10681a(), m12722a()));
    }

    private C3209jn(C3469sn snVar) {
        C2641Qm.m10989a(snVar, "messageInfoFactory");
        this.f9611b = snVar;
    }

    /* renamed from: a */
    private static C3469sn m12722a() {
        try {
            return (C3469sn) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f9610a;
        }
    }

    /* renamed from: a */
    private static boolean m12723a(C3441rn rnVar) {
        return rnVar.mo8283a() == C2577Om.C2582e.f8055i;
    }

    /* renamed from: a */
    public final <T> C2493Ln<T> mo8547a(Class<T> cls) {
        C2551Nn.m10699a((Class<?>) cls);
        C3441rn b = this.f9611b.mo8582b(cls);
        if (b.mo8284b()) {
            return C2577Om.class.isAssignableFrom(cls) ? C3669zn.m14699a(C2551Nn.m10712c(), C2320Fm.m9787a(), b.mo8285c()) : C3669zn.m14699a(C2551Nn.m10689a(), C2320Fm.m9788b(), b.mo8285c());
        }
        if (C2577Om.class.isAssignableFrom(cls)) {
            if (m12723a(b)) {
                return C3612xn.m14445a(cls, b, C2264Dn.m9639b(), C3066en.m12285b(), C2551Nn.m10712c(), C2320Fm.m9787a(), C3412qn.m13566b());
            }
            return C3612xn.m14445a(cls, b, C2264Dn.m9639b(), C3066en.m12285b(), C2551Nn.m10712c(), (C2263Dm<?>) null, C3412qn.m13566b());
        } else if (m12723a(b)) {
            return C3612xn.m14445a(cls, b, C2264Dn.m9638a(), C3066en.m12284a(), C2551Nn.m10689a(), C2320Fm.m9788b(), C3412qn.m13565a());
        } else {
            return C3612xn.m14445a(cls, b, C2264Dn.m9638a(), C3066en.m12284a(), C2551Nn.m10706b(), (C2263Dm<?>) null, C3412qn.m13565a());
        }
    }
}
