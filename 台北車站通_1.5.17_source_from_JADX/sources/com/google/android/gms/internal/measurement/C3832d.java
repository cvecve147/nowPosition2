package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C3832d;

/* renamed from: com.google.android.gms.internal.measurement.d */
public abstract class C3832d<M extends C3832d<M>> extends C3856j {

    /* renamed from: b */
    protected C3840f f11405b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo10403a() {
        if (this.f11405b == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f11405b.mo10724e(); i2++) {
            i += this.f11405b.mo10721b(i2).mo10734d();
        }
        return i;
    }

    /* renamed from: a */
    public void mo10405a(C3824b bVar) {
        if (this.f11405b != null) {
            for (int i = 0; i < this.f11405b.mo10724e(); i++) {
                this.f11405b.mo10721b(i).mo10731a(bVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo10679a(C3820a aVar, int i) {
        int a = aVar.mo10638a();
        if (!aVar.mo10646c(i)) {
            return false;
        }
        int i2 = i >>> 3;
        C3864l lVar = new C3864l(i, aVar.mo10641a(a, aVar.mo10638a() - a));
        C3844g gVar = null;
        C3840f fVar = this.f11405b;
        if (fVar == null) {
            this.f11405b = new C3840f();
        } else {
            gVar = fVar.mo10719a(i2);
        }
        if (gVar == null) {
            gVar = new C3844g();
            this.f11405b.mo10720a(i2, gVar);
        }
        gVar.mo10732a(lVar);
        return true;
    }

    /* renamed from: b */
    public final /* synthetic */ C3856j mo10680b() {
        return (C3832d) clone();
    }

    public /* synthetic */ Object clone() {
        C3832d dVar = (C3832d) super.clone();
        C3848h.m15459a(this, dVar);
        return dVar;
    }
}
