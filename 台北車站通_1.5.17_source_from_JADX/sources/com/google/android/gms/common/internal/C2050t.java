package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p101d.p129g.p131b.p132a.p137e.p142e.C5520b;
import p101d.p129g.p131b.p132a.p137e.p142e.C5521c;

/* renamed from: com.google.android.gms.common.internal.t */
public interface C2050t extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.t$a */
    public static abstract class C2051a extends C5520b implements C2050t {
        public C2051a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo7706a(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                mo7648a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C5521c.m21035a(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                mo7650c(parcel.readInt(), (Bundle) C5521c.m21035a(parcel, Bundle.CREATOR));
            } else if (i != 3) {
                return false;
            } else {
                mo7649a(parcel.readInt(), parcel.readStrongBinder(), (ConnectionInfo) C5521c.m21035a(parcel, ConnectionInfo.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: a */
    void mo7648a(int i, IBinder iBinder, Bundle bundle);

    /* renamed from: a */
    void mo7649a(int i, IBinder iBinder, ConnectionInfo connectionInfo);

    /* renamed from: c */
    void mo7650c(int i, Bundle bundle);
}
