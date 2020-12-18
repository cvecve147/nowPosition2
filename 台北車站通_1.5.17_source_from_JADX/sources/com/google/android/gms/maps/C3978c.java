package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.maps.model.C3990c;
import com.google.android.gms.maps.model.C3991d;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.p075a.C3960b;
import com.google.android.gms.maps.p075a.C3967i;
import p101d.p129g.p131b.p132a.p137e.p141d.C5516g;

/* renamed from: com.google.android.gms.maps.c */
public final class C3978c {

    /* renamed from: a */
    private final C3960b f11868a;

    /* renamed from: b */
    private C3983g f11869b;

    /* renamed from: com.google.android.gms.maps.c$a */
    public interface C3979a {
        /* renamed from: a */
        boolean mo11247a(C3990c cVar);
    }

    public C3978c(C3960b bVar) {
        C2061y.m9067a(bVar);
        this.f11868a = bVar;
    }

    /* renamed from: a */
    public final C3990c mo11241a(MarkerOptions markerOptions) {
        try {
            C5516g a = this.f11868a.mo11219a(markerOptions);
            if (a != null) {
                return new C3990c(a);
            }
            return null;
        } catch (RemoteException e) {
            throw new C3991d(e);
        }
    }

    /* renamed from: a */
    public final void mo11242a() {
        try {
            this.f11868a.clear();
        } catch (RemoteException e) {
            throw new C3991d(e);
        }
    }

    /* renamed from: a */
    public final void mo11243a(C3958a aVar) {
        try {
            this.f11868a.mo11223m(aVar.mo11216a());
        } catch (RemoteException e) {
            throw new C3991d(e);
        }
    }

    /* renamed from: a */
    public final void mo11244a(C3979a aVar) {
        if (aVar == null) {
            try {
                this.f11868a.mo11220a((C3967i) null);
            } catch (RemoteException e) {
                throw new C3991d(e);
            }
        } else {
            this.f11868a.mo11220a((C3967i) new C3986j(this, aVar));
        }
    }

    /* renamed from: a */
    public final void mo11245a(boolean z) {
        try {
            this.f11868a.mo11222k(z);
        } catch (RemoteException e) {
            throw new C3991d(e);
        }
    }

    /* renamed from: b */
    public final C3983g mo11246b() {
        try {
            if (this.f11869b == null) {
                this.f11869b = new C3983g(this.f11868a.mo11218Ea());
            }
            return this.f11869b;
        } catch (RemoteException e) {
            throw new C3991d(e);
        }
    }
}
