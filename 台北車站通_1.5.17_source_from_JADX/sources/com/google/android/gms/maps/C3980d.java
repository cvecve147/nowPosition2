package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.C1997i;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.maps.model.C3989b;
import com.google.android.gms.maps.model.C3991d;
import com.google.android.gms.maps.p075a.C3972n;
import com.google.android.gms.maps.p075a.C3973o;

/* renamed from: com.google.android.gms.maps.d */
public final class C3980d {

    /* renamed from: a */
    private static boolean f11870a = false;

    /* renamed from: a */
    public static synchronized int m16093a(Context context) {
        synchronized (C3980d.class) {
            C2061y.m9068a(context, (Object) "Context is null");
            if (f11870a) {
                return 0;
            }
            try {
                C3973o a = C3972n.m16061a(context);
                try {
                    C3977b.m16085a(a.mo11237F());
                    C3989b.m16123a(a.mo11238Oa());
                    f11870a = true;
                    return 0;
                } catch (RemoteException e) {
                    throw new C3991d(e);
                }
            } catch (C1997i e2) {
                return e2.f6377a;
            }
        }
    }
}
