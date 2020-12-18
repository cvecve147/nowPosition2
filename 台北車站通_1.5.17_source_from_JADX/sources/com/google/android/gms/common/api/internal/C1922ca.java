package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C1925e;
import com.google.android.gms.common.internal.C2040q;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.ca */
final class C1922ca implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f6213a;

    /* renamed from: b */
    private final /* synthetic */ C1925e.C1928c f6214b;

    C1922ca(C1925e.C1928c cVar, ConnectionResult connectionResult) {
        this.f6214b = cVar;
        this.f6213a = connectionResult;
    }

    public final void run() {
        if (this.f6213a.mo7218f()) {
            boolean unused = this.f6214b.f6252e = true;
            if (this.f6214b.f6248a.mo7301j()) {
                this.f6214b.m8573a();
            } else {
                this.f6214b.f6248a.mo7291a((C2040q) null, Collections.emptySet());
            }
        } else {
            ((C1925e.C1926a) C1925e.this.f6228m.get(this.f6214b.f6249b)).mo7263a(this.f6213a);
        }
    }
}
