package com.google.android.gms.vision.barcode;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.C3927d;
import com.google.android.gms.internal.vision.zzc;
import com.google.android.gms.internal.vision.zzk;
import p101d.p129g.p131b.p132a.p145h.C5563b;
import p101d.p129g.p131b.p132a.p145h.C5566c;

/* renamed from: com.google.android.gms.vision.barcode.a */
public final class C4011a extends C5563b<Barcode> {

    /* renamed from: c */
    private final C3927d f11999c;

    /* renamed from: com.google.android.gms.vision.barcode.a$a */
    public static class C4012a {

        /* renamed from: a */
        private Context f12000a;

        /* renamed from: b */
        private zzc f12001b = new zzc();

        public C4012a(Context context) {
            this.f12000a = context;
        }

        /* renamed from: a */
        public C4012a mo11387a(int i) {
            this.f12001b.f11802a = i;
            return this;
        }

        /* renamed from: a */
        public C4011a mo11388a() {
            return new C4011a(new C3927d(this.f12000a, this.f12001b));
        }
    }

    private C4011a(C3927d dVar) {
        this.f11999c = dVar;
    }

    /* renamed from: a */
    public final SparseArray<Barcode> mo11384a(C5566c cVar) {
        Barcode[] barcodeArr;
        if (cVar != null) {
            zzk a = zzk.m15975a(cVar);
            if (cVar.mo15036a() != null) {
                barcodeArr = this.f11999c.mo11121a(cVar.mo15036a(), a);
                if (barcodeArr == null) {
                    throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
                }
            } else {
                barcodeArr = this.f11999c.mo11122a(cVar.mo15037b(), a);
            }
            SparseArray<Barcode> sparseArray = new SparseArray<>(barcodeArr.length);
            for (Barcode barcode : barcodeArr) {
                sparseArray.append(barcode.f11926b.hashCode(), barcode);
            }
            return sparseArray;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }

    /* renamed from: a */
    public final boolean mo11385a() {
        return this.f11999c.mo11128a();
    }

    /* renamed from: b */
    public final void mo11386b() {
        super.mo11386b();
        this.f11999c.mo11129c();
    }
}
