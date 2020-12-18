package com.journeyapps.barcodescanner.p077a;

import com.journeyapps.barcodescanner.C4101C;
import java.util.Comparator;

/* renamed from: com.journeyapps.barcodescanner.a.u */
class C4130u implements Comparator<C4101C> {

    /* renamed from: a */
    final /* synthetic */ C4101C f12268a;

    /* renamed from: b */
    final /* synthetic */ C4131v f12269b;

    C4130u(C4131v vVar, C4101C c) {
        this.f12269b = vVar;
        this.f12268a = c;
    }

    /* renamed from: a */
    public int compare(C4101C c, C4101C c2) {
        return Float.compare(this.f12269b.mo11659a(c2, this.f12268a), this.f12269b.mo11659a(c, this.f12268a));
    }
}
