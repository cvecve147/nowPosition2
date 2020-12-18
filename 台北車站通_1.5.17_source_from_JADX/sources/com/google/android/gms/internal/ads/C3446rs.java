package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.rs */
public final class C3446rs {

    /* renamed from: a */
    private final byte[] f10149a;

    /* renamed from: b */
    private int f10150b;

    /* renamed from: c */
    private int f10151c;

    /* renamed from: d */
    private final /* synthetic */ C3389ps f10152d;

    private C3446rs(C3389ps psVar, byte[] bArr) {
        this.f10152d = psVar;
        this.f10149a = bArr;
    }

    /* renamed from: a */
    public final C3446rs mo9988a(int i) {
        this.f10150b = i;
        return this;
    }

    /* renamed from: a */
    public final synchronized void mo9989a() {
        try {
            if (this.f10152d.f10040b) {
                this.f10152d.f10039a.mo8298a(this.f10149a);
                this.f10152d.f10039a.mo8301g(this.f10150b);
                this.f10152d.f10039a.mo8302h(this.f10151c);
                this.f10152d.f10039a.mo8299a((int[]) null);
                this.f10152d.f10039a.mo8296Sa();
            }
        } catch (RemoteException e) {
            C2227Cf.m9530a("Clearcut log failed", e);
        }
    }

    /* renamed from: b */
    public final C3446rs mo9990b(int i) {
        this.f10151c = i;
        return this;
    }
}
