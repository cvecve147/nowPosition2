package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import p101d.p129g.p131b.p132a.p137e.p140c.C5501a;
import p101d.p129g.p131b.p132a.p137e.p140c.C5502b;

/* renamed from: com.google.android.gms.iid.q */
public final class C2153q extends C5501a implements C2152p {
    C2153q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.iid.IMessengerCompat");
    }

    /* renamed from: a */
    public final void mo7775a(Message message) {
        Parcel Xa = mo14948Xa();
        C5502b.m21006a(Xa, message);
        mo14949a(1, Xa);
    }
}
