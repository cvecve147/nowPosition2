package com.google.android.gms.internal.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.vision.barcode.Barcode;
import java.nio.ByteBuffer;
import p101d.p129g.p131b.p132a.p134b.C5468d;

/* renamed from: com.google.android.gms.internal.vision.d */
public final class C3927d extends C3932i<C3928e> {

    /* renamed from: f */
    private final zzc f11796f;

    public C3927d(Context context, zzc zzc) {
        super(context, "BarcodeNativeHandle");
        this.f11796f = zzc;
        mo11130d();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo11120a(com.google.android.gms.dynamite.DynamiteModule r4, android.content.Context r5) {
        /*
            r3 = this;
            java.lang.String r0 = "com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator"
            android.os.IBinder r4 = r4.mo7730a((java.lang.String) r0)
            r0 = 0
            if (r4 != 0) goto L_0x000b
            r4 = r0
            goto L_0x001f
        L_0x000b:
            java.lang.String r1 = "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.vision.C3930g
            if (r2 == 0) goto L_0x0019
            r4 = r1
            com.google.android.gms.internal.vision.g r4 = (com.google.android.gms.internal.vision.C3930g) r4
            goto L_0x001f
        L_0x0019:
            com.google.android.gms.internal.vision.h r1 = new com.google.android.gms.internal.vision.h
            r1.<init>(r4)
            r4 = r1
        L_0x001f:
            if (r4 != 0) goto L_0x0022
            return r0
        L_0x0022:
            d.g.b.a.b.b r5 = p101d.p129g.p131b.p132a.p134b.C5468d.m20961a(r5)
            com.google.android.gms.internal.vision.zzc r0 = r3.f11796f
            com.google.android.gms.internal.vision.e r4 = r4.mo11127a(r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C3927d.mo11120a(com.google.android.gms.dynamite.DynamiteModule, android.content.Context):java.lang.Object");
    }

    /* renamed from: a */
    public final Barcode[] mo11121a(Bitmap bitmap, zzk zzk) {
        if (!mo11128a()) {
            return new Barcode[0];
        }
        try {
            return ((C3928e) mo11130d()).mo11125b(C5468d.m20961a(bitmap), zzk);
        } catch (RemoteException e) {
            Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
            return new Barcode[0];
        }
    }

    /* renamed from: a */
    public final Barcode[] mo11122a(ByteBuffer byteBuffer, zzk zzk) {
        if (!mo11128a()) {
            return new Barcode[0];
        }
        try {
            return ((C3928e) mo11130d()).mo11124a(C5468d.m20961a(byteBuffer), zzk);
        } catch (RemoteException e) {
            Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
            return new Barcode[0];
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo11123b() {
        if (mo11128a()) {
            ((C3928e) mo11130d()).mo11126sa();
        }
    }
}
