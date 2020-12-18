package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2608Pk;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.kj */
public final class C3237kj {

    /* renamed from: a */
    private static final Logger f9693a = Logger.getLogger(C3237kj.class.getName());

    /* renamed from: b */
    private static final ConcurrentMap<String, C3004cj> f9694b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final ConcurrentMap<String, Boolean> f9695c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final ConcurrentMap<String, C2834Xi> f9696d = new ConcurrentHashMap();

    /* renamed from: a */
    public static <P> C2346Gk m12880a(C2489Lk lk) {
        C3004cj b = m12889b(lk.mo8493l());
        if (((Boolean) f9695c.get(lk.mo8493l())).booleanValue()) {
            return b.mo8276a(lk.mo8494m());
        }
        String valueOf = String.valueOf(lk.mo8493l());
        throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
    }

    /* renamed from: a */
    public static <P> C2834Xi<P> m12881a(String str) {
        String str2;
        String str3;
        if (str != null) {
            C2834Xi<P> xi = (C2834Xi) f9696d.get(str.toLowerCase());
            if (xi != null) {
                return xi;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase().startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.init().");
            }
            if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call DeterministicAeadConfig.init().";
            } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call StreamingAeadConfig.init().";
            } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call HybridConfig.init().";
            } else if (str.toLowerCase().startsWith("tinkmac")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call MacConfig.init().";
            } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call SignatureConfig.init().";
            } else {
                if (str.toLowerCase().startsWith("tink")) {
                    str2 = String.valueOf(format);
                    str3 = "Maybe call TinkConfig.init().";
                }
                throw new GeneralSecurityException(format);
            }
            format = str2.concat(str3);
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    /* renamed from: a */
    public static <P> C3175ij<P> m12882a(C3032dj djVar, C3004cj<P> cjVar) {
        C3265lj.m12978b(djVar.mo9313a());
        C3175ij<P> ijVar = new C3175ij<>();
        for (C2608Pk.C2610b next : djVar.mo9313a().mo8680m()) {
            if (next.mo8684n() == C2432Jk.ENABLED) {
                C3204jj<P> a = ijVar.mo9550a(m12884a(next.mo8683m().mo8212l(), next.mo8683m().mo8213m()), next);
                if (next.mo8685o() == djVar.mo9313a().mo8679l()) {
                    ijVar.mo9551a(a);
                }
            }
        }
        return ijVar;
    }

    /* renamed from: a */
    public static <P> C3498tn m12883a(String str, C3498tn tnVar) {
        C3004cj b = m12889b(str);
        if (((Boolean) f9695c.get(str)).booleanValue()) {
            return b.mo8277a(tnVar);
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
    }

    /* renamed from: a */
    private static <P> P m12884a(String str, C3150hm hmVar) {
        return m12889b(str).mo8280c(hmVar);
    }

    /* renamed from: a */
    public static <P> P m12885a(String str, byte[] bArr) {
        return m12884a(str, C3150hm.m12537a(bArr));
    }

    /* renamed from: a */
    public static synchronized <P> void m12886a(String str, C2834Xi<P> xi) {
        synchronized (C3237kj.class) {
            if (!f9696d.containsKey(str.toLowerCase()) || xi.getClass().equals(((C2834Xi) f9696d.get(str.toLowerCase())).getClass())) {
                f9696d.put(str.toLowerCase(), xi);
            } else {
                Logger logger = f9693a;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(str);
                logger.logp(level, "com.google.crypto.tink.Registry", "addCatalogue", valueOf.length() != 0 ? "Attempted overwrite of a catalogueName catalogue for name ".concat(valueOf) : new String("Attempted overwrite of a catalogueName catalogue for name "));
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
                sb.append("catalogue for name ");
                sb.append(str);
                sb.append(" has been already registered");
                throw new GeneralSecurityException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public static <P> void m12887a(String str, C3004cj<P> cjVar) {
        m12888a(str, cjVar, true);
    }

    /* renamed from: a */
    public static synchronized <P> void m12888a(String str, C3004cj<P> cjVar, boolean z) {
        synchronized (C3237kj.class) {
            if (cjVar != null) {
                if (f9694b.containsKey(str)) {
                    C3004cj b = m12889b(str);
                    boolean booleanValue = ((Boolean) f9695c.get(str)).booleanValue();
                    if (!cjVar.getClass().equals(b.getClass()) || (!booleanValue && z)) {
                        Logger logger = f9693a;
                        Level level = Level.WARNING;
                        String valueOf = String.valueOf(str);
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerKeyManager", valueOf.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(valueOf) : new String("Attempted overwrite of a registered key manager for key type "));
                        throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{str, b.getClass().getName(), cjVar.getClass().getName()}));
                    }
                }
                f9694b.put(str, cjVar);
                f9695c.put(str, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    /* renamed from: b */
    private static <P> C3004cj<P> m12889b(String str) {
        C3004cj<P> cjVar = (C3004cj) f9694b.get(str);
        if (cjVar != null) {
            return cjVar;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
        sb.append("No key manager found for key type: ");
        sb.append(str);
        sb.append(".  Check the configuration of the registry.");
        throw new GeneralSecurityException(sb.toString());
    }

    /* renamed from: b */
    public static <P> C3498tn m12890b(C2489Lk lk) {
        C3004cj b = m12889b(lk.mo8493l());
        if (((Boolean) f9695c.get(lk.mo8493l())).booleanValue()) {
            return b.mo8278b(lk.mo8494m());
        }
        String valueOf = String.valueOf(lk.mo8493l());
        throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
    }

    /* renamed from: b */
    public static <P> P m12891b(String str, C3498tn tnVar) {
        return m12889b(str).mo8279b(tnVar);
    }
}
