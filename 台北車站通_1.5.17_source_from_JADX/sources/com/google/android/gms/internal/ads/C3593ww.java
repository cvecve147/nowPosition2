package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.C1813j;
import com.google.android.gms.ads.formats.C1648b;
import com.google.android.gms.ads.formats.C1660i;
import java.util.WeakHashMap;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ww */
public final class C3593ww implements C1660i {

    /* renamed from: a */
    private static WeakHashMap<IBinder, C3593ww> f10474a = new WeakHashMap<>();

    /* renamed from: b */
    private final C3507tw f10475b;

    /* renamed from: c */
    private final C1648b f10476c;

    /* renamed from: d */
    private final C1813j f10477d = new C1813j();

    private C3593ww(C3507tw twVar) {
        Context context;
        this.f10475b = twVar;
        C1648b bVar = null;
        try {
            context = (Context) C5468d.m20962z(twVar.mo10056Ha());
        } catch (RemoteException | NullPointerException e) {
            C2227Cf.m9533b("", e);
            context = null;
        }
        if (context != null) {
            C1648b bVar2 = new C1648b(context);
            try {
                if (this.f10475b.mo10063l(C5468d.m20961a(bVar2))) {
                    bVar = bVar2;
                }
            } catch (RemoteException e2) {
                C2227Cf.m9533b("", e2);
            }
        }
        this.f10476c = bVar;
    }

    /* renamed from: a */
    public static C3593ww m14396a(C3507tw twVar) {
        synchronized (f10474a) {
            C3593ww wwVar = f10474a.get(twVar.asBinder());
            if (wwVar != null) {
                return wwVar;
            }
            C3593ww wwVar2 = new C3593ww(twVar);
            f10474a.put(twVar.asBinder(), wwVar2);
            return wwVar2;
        }
    }

    /* renamed from: a */
    public final C3507tw mo10206a() {
        return this.f10475b;
    }

    /* renamed from: l */
    public final String mo6655l() {
        try {
            return this.f10475b.mo10061l();
        } catch (RemoteException e) {
            C2227Cf.m9533b("", e);
            return null;
        }
    }
}
