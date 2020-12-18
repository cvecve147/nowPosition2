package com.google.android.gms.maps.p075a;

import android.os.Parcel;
import p101d.p129g.p131b.p132a.p137e.p141d.C5511b;
import p101d.p129g.p131b.p132a.p137e.p141d.C5512c;
import p101d.p129g.p131b.p132a.p137e.p141d.C5517h;

/* renamed from: com.google.android.gms.maps.a.j */
public abstract class C3968j extends C5511b implements C3967i {
    public C3968j() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11235a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        boolean a = mo11236a(C5517h.m21027a(parcel.readStrongBinder()));
        parcel2.writeNoException();
        C5512c.m21020a(parcel2, a);
        return true;
    }
}
