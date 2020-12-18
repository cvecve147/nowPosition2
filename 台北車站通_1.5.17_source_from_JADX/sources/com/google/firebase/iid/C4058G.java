package com.google.firebase.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.C2059x;
import java.security.KeyPair;

/* renamed from: com.google.firebase.iid.G */
final class C4058G {

    /* renamed from: a */
    private final KeyPair f12053a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f12054b;

    C4058G(KeyPair keyPair, long j) {
        this.f12053a = keyPair;
        this.f12054b = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String m16275b() {
        return Base64.encodeToString(this.f12053a.getPublic().getEncoded(), 11);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final String m16278c() {
        return Base64.encodeToString(this.f12053a.getPrivate().getEncoded(), 11);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final KeyPair mo11481a() {
        return this.f12053a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4058G)) {
            return false;
        }
        C4058G g = (C4058G) obj;
        return this.f12054b == g.f12054b && this.f12053a.getPublic().equals(g.f12053a.getPublic()) && this.f12053a.getPrivate().equals(g.f12053a.getPrivate());
    }

    public final int hashCode() {
        return C2059x.m9062a(this.f12053a.getPublic(), this.f12053a.getPrivate(), Long.valueOf(this.f12054b));
    }
}
