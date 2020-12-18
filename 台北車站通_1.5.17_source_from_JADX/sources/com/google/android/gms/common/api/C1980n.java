package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

/* renamed from: com.google.android.gms.common.api.n */
public final class C1980n extends UnsupportedOperationException {

    /* renamed from: a */
    private final Feature f6348a;

    public C1980n(Feature feature) {
        this.f6348a = feature;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f6348a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
