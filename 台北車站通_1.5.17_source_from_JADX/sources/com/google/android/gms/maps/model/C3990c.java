package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C2061y;
import p101d.p129g.p131b.p132a.p137e.p141d.C5516g;

/* renamed from: com.google.android.gms.maps.model.c */
public final class C3990c {

    /* renamed from: a */
    private final C5516g f11902a;

    public C3990c(C5516g gVar) {
        C2061y.m9067a(gVar);
        this.f11902a = gVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3990c)) {
            return false;
        }
        try {
            return this.f11902a.mo14962b(((C3990c) obj).f11902a);
        } catch (RemoteException e) {
            throw new C3991d(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f11902a.mo14963la();
        } catch (RemoteException e) {
            throw new C3991d(e);
        }
    }
}
