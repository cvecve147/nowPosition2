package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.C1612b;
import com.google.ads.mediation.C1622e;
import com.google.ads.mediation.C1625f;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.C1819b;
import com.google.android.gms.ads.mediation.C1837j;
import com.google.android.gms.ads.mediation.customevent.C1825a;
import com.google.android.gms.ads.mediation.customevent.C1827c;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import java.util.Map;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Lz */
public final class C2505Lz extends C2563Nz {

    /* renamed from: a */
    private static final C2278EA f7548a = new C2278EA();

    /* renamed from: b */
    private Map<Class<? extends C1837j>, C1837j> f7549b;

    /* renamed from: q */
    private final <NetworkExtrasT extends C1625f, ServerParametersT extends C1622e> C2626Pz m10570q(String str) {
        try {
            Class<?> cls = Class.forName(str, false, C2505Lz.class.getClassLoader());
            if (C1612b.class.isAssignableFrom(cls)) {
                C1612b bVar = (C1612b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new C3341oA(bVar, (C1625f) this.f7549b.get(bVar.getAdditionalParametersType()));
            } else if (C1819b.class.isAssignableFrom(cls)) {
                return new C3194jA((C1819b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                C2227Cf.m9536d(sb.toString());
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            return m10571r(str);
        }
    }

    /* renamed from: r */
    private final C2626Pz m10571r(String str) {
        try {
            C2227Cf.m9532b("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new C3194jA(new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                return new C3194jA(new AdUrlAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new C3194jA(new CustomEventAdapter());
            }
            if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
                return new C3341oA(customEventAdapter, (C1827c) this.f7549b.get(customEventAdapter.getAdditionalParametersType()));
            }
            throw new RemoteException();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(". ");
            C2227Cf.m9535c(sb.toString(), th);
        }
    }

    /* renamed from: a */
    public final void mo8518a(Map<Class<? extends C1837j>, C1837j> map) {
        this.f7549b = map;
    }

    /* renamed from: f */
    public final C2164AA mo8519f(String str) {
        return C2278EA.m9685a(str);
    }

    /* renamed from: g */
    public final C2626Pz mo8520g(String str) {
        return m10570q(str);
    }

    /* renamed from: i */
    public final boolean mo8521i(String str) {
        try {
            return C1825a.class.isAssignableFrom(Class.forName(str, false, C2505Lz.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", assuming old implementation.");
            C2227Cf.m9536d(sb.toString());
            return false;
        }
    }
}
