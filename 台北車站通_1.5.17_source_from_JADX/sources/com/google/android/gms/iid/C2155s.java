package com.google.android.gms.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.C2059x;
import java.security.KeyPair;

/* renamed from: com.google.android.gms.iid.s */
final class C2155s {

    /* renamed from: a */
    private final KeyPair f6643a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f6644b;

    C2155s(KeyPair keyPair, long j) {
        this.f6643a = keyPair;
        this.f6644b = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String m9287b() {
        return Base64.encodeToString(this.f6643a.getPublic().getEncoded(), 11);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final String m9290c() {
        return Base64.encodeToString(this.f6643a.getPrivate().getEncoded(), 11);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final KeyPair mo7778a() {
        return this.f6643a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2155s)) {
            return false;
        }
        C2155s sVar = (C2155s) obj;
        return this.f6644b == sVar.f6644b && this.f6643a.getPublic().equals(sVar.f6643a.getPublic()) && this.f6643a.getPrivate().equals(sVar.f6643a.getPrivate());
    }

    public final int hashCode() {
        return C2059x.m9062a(this.f6643a.getPublic(), this.f6643a.getPrivate(), Long.valueOf(this.f6644b));
    }
}
