package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Ho */
public final class C2380Ho extends IOException {
    public C2380Ho(String str) {
        super(str);
    }

    /* renamed from: a */
    static C2380Ho m10167a() {
        return new C2380Ho("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static C2380Ho m10168b() {
        return new C2380Ho("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static C2380Ho m10169c() {
        return new C2380Ho("CodedInputStream encountered a malformed varint.");
    }
}
