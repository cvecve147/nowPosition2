package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.i */
public final class C3852i extends IOException {
    public C3852i(String str) {
        super(str);
    }

    /* renamed from: a */
    static C3852i m15481a() {
        return new C3852i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static C3852i m15482b() {
        return new C3852i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static C3852i m15483c() {
        return new C3852i("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static C3852i m15484d() {
        return new C3852i("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
