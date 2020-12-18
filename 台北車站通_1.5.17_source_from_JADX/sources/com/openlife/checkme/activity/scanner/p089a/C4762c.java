package com.openlife.checkme.activity.scanner.p089a;

import android.util.SparseArray;
import com.google.android.gms.vision.barcode.Barcode;
import p101d.p129g.p131b.p132a.p145h.C5563b;

/* renamed from: com.openlife.checkme.activity.scanner.a.c */
class C4762c implements C5563b.C5565b<Barcode> {

    /* renamed from: a */
    final /* synthetic */ C4763d f13738a;

    C4762c(C4763d dVar) {
        this.f13738a = dVar;
    }

    /* renamed from: a */
    public void mo13193a() {
    }

    /* renamed from: a */
    public void mo13194a(C5563b.C5564a<Barcode> aVar) {
        SparseArray<Barcode> a = aVar.mo15035a();
        if (a.size() != 0 && this.f13738a.f13743e != null) {
            this.f13738a.f13743e.mo13206a(a.valueAt(0).f11927c);
        }
    }
}
