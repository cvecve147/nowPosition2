package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.barcode.Barcode;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.vision.f */
public final class C3929f extends C3924a implements C3928e {
    C3929f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    /* renamed from: a */
    public final Barcode[] mo11124a(C5464b bVar, zzk zzk) {
        Parcel Xa = mo11114Xa();
        C3925b.m15956a(Xa, (IInterface) bVar);
        C3925b.m15957a(Xa, (Parcelable) zzk);
        Parcel a = mo11115a(1, Xa);
        Barcode[] barcodeArr = (Barcode[]) a.createTypedArray(Barcode.CREATOR);
        a.recycle();
        return barcodeArr;
    }

    /* renamed from: b */
    public final Barcode[] mo11125b(C5464b bVar, zzk zzk) {
        Parcel Xa = mo11114Xa();
        C3925b.m15956a(Xa, (IInterface) bVar);
        C3925b.m15957a(Xa, (Parcelable) zzk);
        Parcel a = mo11115a(2, Xa);
        Barcode[] barcodeArr = (Barcode[]) a.createTypedArray(Barcode.CREATOR);
        a.recycle();
        return barcodeArr;
    }

    /* renamed from: sa */
    public final void mo11126sa() {
        mo11117b(3, mo11114Xa());
    }
}
