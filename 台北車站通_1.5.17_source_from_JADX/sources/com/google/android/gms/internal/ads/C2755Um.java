package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Um */
public class C2755Um extends IOException {

    /* renamed from: a */
    private C3498tn f8390a = null;

    public C2755Um(String str) {
        super(str);
    }

    /* renamed from: a */
    static C2755Um m11347a() {
        return new C2755Um("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static C2755Um m11348b() {
        return new C2755Um("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static C2755Um m11349c() {
        return new C2755Um("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static C2755Um m11350d() {
        return new C2755Um("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    static C2755Um m11351e() {
        return new C2755Um("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: f */
    static C2784Vm m11352f() {
        return new C2784Vm("Protocol message tag had invalid wire type.");
    }

    /* renamed from: g */
    static C2755Um m11353g() {
        return new C2755Um("Failed to parse the message.");
    }

    /* renamed from: h */
    static C2755Um m11354h() {
        return new C2755Um("Protocol message had invalid UTF-8.");
    }

    /* renamed from: a */
    public final C2755Um mo8932a(C3498tn tnVar) {
        this.f8390a = tnVar;
        return this;
    }
}
