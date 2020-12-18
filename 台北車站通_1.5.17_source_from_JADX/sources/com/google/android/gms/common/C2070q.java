package com.google.android.gms.common;

import com.google.android.gms.common.C1994g;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.q */
abstract class C2070q extends C1994g.C1995a {

    /* renamed from: b */
    private static final WeakReference<byte[]> f6530b = new WeakReference<>((Object) null);

    /* renamed from: c */
    private WeakReference<byte[]> f6531c = f6530b;

    C2070q(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Xa */
    public final byte[] mo7547Xa() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f6531c.get();
            if (bArr == null) {
                bArr = mo7718sa();
                this.f6531c = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: sa */
    public abstract byte[] mo7718sa();
}
