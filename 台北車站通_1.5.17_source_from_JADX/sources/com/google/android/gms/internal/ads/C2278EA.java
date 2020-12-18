package com.google.android.gms.internal.ads;

import android.os.RemoteException;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.EA */
public class C2278EA {
    /* renamed from: a */
    public static C2164AA m9685a(String str) {
        try {
            return new C2307FA((C2344Gi) Class.forName(str, false, C2278EA.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }
}
