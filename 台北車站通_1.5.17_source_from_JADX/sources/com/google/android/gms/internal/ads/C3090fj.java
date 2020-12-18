package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.fj */
public final class C3090fj {

    /* renamed from: a */
    private static final CopyOnWriteArrayList<C3062ej> f9141a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public static C3062ej m12329a(String str) {
        Iterator<C3062ej> it = f9141a.iterator();
        while (it.hasNext()) {
            C3062ej next = it.next();
            if (next.mo9393a(str)) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
