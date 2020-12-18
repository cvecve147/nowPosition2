package com.onesignal;

class OSPermissionChangedInternalObserver {
    OSPermissionChangedInternalObserver() {
    }

    /* renamed from: a */
    static void m16988a(C4450za zaVar) {
        C4223Aa aa = new C4223Aa();
        aa.f12545b = C4306Xa.f12747P;
        aa.f12544a = (C4450za) zaVar.clone();
        if (C4306Xa.m17203r().mo12553c(aa)) {
            C4306Xa.f12747P = (C4450za) zaVar.clone();
            C4306Xa.f12747P.mo12556e();
        }
    }

    /* renamed from: b */
    static void m16989b(C4450za zaVar) {
        if (!zaVar.mo12555d()) {
            C4381j.m17374a(0, C4306Xa.f12759e);
        }
        C4421sb.m17521c(C4306Xa.m17188j());
    }

    /* access modifiers changed from: package-private */
    public void changed(C4450za zaVar) {
        m16989b(zaVar);
        m16988a(zaVar);
    }
}
