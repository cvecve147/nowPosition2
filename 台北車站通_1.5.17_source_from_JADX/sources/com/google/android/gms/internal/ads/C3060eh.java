package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C1697X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.eh */
public final class C3060eh implements Iterable<C3002ch> {

    /* renamed from: a */
    private final List<C3002ch> f9102a = new ArrayList();

    /* renamed from: a */
    public static boolean m12276a(C2749Ug ug) {
        C3002ch b = m12277b(ug);
        if (b == null) {
            return false;
        }
        b.f8994e.mo9424b();
        return true;
    }

    /* renamed from: b */
    static C3002ch m12277b(C2749Ug ug) {
        Iterator<C3002ch> it = C1697X.m7719z().iterator();
        while (it.hasNext()) {
            C3002ch next = it.next();
            if (next.f8993d == ug) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final int mo9389a() {
        return this.f9102a.size();
    }

    /* renamed from: a */
    public final void mo9390a(C3002ch chVar) {
        this.f9102a.add(chVar);
    }

    /* renamed from: b */
    public final void mo9391b(C3002ch chVar) {
        this.f9102a.remove(chVar);
    }

    public final Iterator<C3002ch> iterator() {
        return this.f9102a.iterator();
    }
}
