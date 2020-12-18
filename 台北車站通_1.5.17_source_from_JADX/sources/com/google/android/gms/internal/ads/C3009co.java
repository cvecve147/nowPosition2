package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.co */
public final class C3009co extends RuntimeException {

    /* renamed from: a */
    private final List<String> f9002a = null;

    public C3009co(C3498tn tnVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: a */
    public final C2755Um mo9286a() {
        return new C2755Um(getMessage());
    }
}
