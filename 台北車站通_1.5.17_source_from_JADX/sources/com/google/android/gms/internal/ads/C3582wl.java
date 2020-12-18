package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C3610xl;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.ads.wl */
public final class C3582wl<T_WRAPPER extends C3610xl<T_ENGINE>, T_ENGINE> {

    /* renamed from: a */
    private static final Logger f10441a = Logger.getLogger(C3582wl.class.getName());

    /* renamed from: b */
    private static final List<Provider> f10442b;

    /* renamed from: c */
    public static final C3582wl<C3667zl, Cipher> f10443c = new C3582wl<>(new C3667zl());

    /* renamed from: d */
    public static final C3582wl<C2262Dl, Mac> f10444d = new C3582wl<>(new C2262Dl());

    /* renamed from: e */
    private static final C3582wl<C2319Fl, Signature> f10445e = new C3582wl<>(new C2319Fl());

    /* renamed from: f */
    private static final C3582wl<C2291El, MessageDigest> f10446f = new C3582wl<>(new C2291El());

    /* renamed from: g */
    public static final C3582wl<C2177Al, KeyAgreement> f10447g = new C3582wl<>(new C2177Al());

    /* renamed from: h */
    public static final C3582wl<C2234Cl, KeyPairGenerator> f10448h = new C3582wl<>(new C2234Cl());

    /* renamed from: i */
    public static final C3582wl<C2205Bl, KeyFactory> f10449i = new C3582wl<>(new C2205Bl());

    /* renamed from: j */
    private T_WRAPPER f10450j;

    /* renamed from: k */
    private List<Provider> f10451k = f10442b;

    /* renamed from: l */
    private boolean f10452l = true;

    static {
        if (C2576Ol.m10795a()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f10441a.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
                }
            }
            f10442b = arrayList;
        } else {
            f10442b = new ArrayList();
        }
    }

    private C3582wl(T_WRAPPER t_wrapper) {
        this.f10450j = t_wrapper;
    }

    /* renamed from: a */
    private final boolean m14336a(String str, Provider provider) {
        try {
            this.f10450j.mo7828a(str, provider);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final T_ENGINE mo10164a(String str) {
        T_WRAPPER t_wrapper;
        Provider provider;
        Iterator<Provider> it = this.f10451k.iterator();
        while (true) {
            if (it.hasNext()) {
                provider = it.next();
                if (m14336a(str, provider)) {
                    t_wrapper = this.f10450j;
                    break;
                }
            } else if (this.f10452l) {
                t_wrapper = this.f10450j;
                provider = null;
            } else {
                throw new GeneralSecurityException("No good Provider found.");
            }
        }
        return t_wrapper.mo7828a(str, provider);
    }
}
