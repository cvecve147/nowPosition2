package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* renamed from: com.google.android.gms.internal.ads.Ir */
final class C2411Ir implements ValueCallback<String> {

    /* renamed from: a */
    private final /* synthetic */ C2383Hr f7297a;

    C2411Ir(C2383Hr hr) {
        this.f7297a = hr;
    }

    public final /* synthetic */ void onReceiveValue(Object obj) {
        C2383Hr hr = this.f7297a;
        hr.f7194e.mo8096a(hr.f7191b, hr.f7192c, (String) obj, hr.f7193d);
    }
}
