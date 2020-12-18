package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.model.C3991d;
import com.google.android.gms.maps.p075a.C3962d;

/* renamed from: com.google.android.gms.maps.g */
public final class C3983g {

    /* renamed from: a */
    private final C3962d f11871a;

    C3983g(C3962d dVar) {
        this.f11871a = dVar;
    }

    /* renamed from: a */
    public final void mo11249a(boolean z) {
        try {
            this.f11871a.mo11233i(z);
        } catch (RemoteException e) {
            throw new C3991d(e);
        }
    }
}
