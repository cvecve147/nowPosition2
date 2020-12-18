package com.facebook.p060a;

import com.facebook.AccessToken;
import com.facebook.C1601x;
import com.facebook.internal.C1480ba;
import java.io.Serializable;

/* renamed from: com.facebook.a.b */
class C1387b implements Serializable {

    /* renamed from: a */
    private final String f4898a;

    /* renamed from: b */
    private final String f4899b;

    /* renamed from: com.facebook.a.b$a */
    static class C1388a implements Serializable {

        /* renamed from: a */
        private final String f4900a;

        /* renamed from: b */
        private final String f4901b;

        private C1388a(String str, String str2) {
            this.f4900a = str;
            this.f4901b = str2;
        }

        private Object readResolve() {
            return new C1387b(this.f4900a, this.f4901b);
        }
    }

    public C1387b(AccessToken accessToken) {
        this(accessToken.mo5894h(), C1601x.m7389c());
    }

    public C1387b(String str, String str2) {
        this.f4898a = C1480ba.m6958b(str) ? null : str;
        this.f4899b = str2;
    }

    private Object writeReplace() {
        return new C1388a(this.f4898a, this.f4899b);
    }

    /* renamed from: a */
    public String mo6045a() {
        return this.f4898a;
    }

    /* renamed from: b */
    public String mo6046b() {
        return this.f4899b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1387b)) {
            return false;
        }
        C1387b bVar = (C1387b) obj;
        return C1480ba.m6951a(bVar.f4898a, this.f4898a) && C1480ba.m6951a(bVar.f4899b, this.f4899b);
    }

    public int hashCode() {
        String str = this.f4898a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f4899b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }
}
