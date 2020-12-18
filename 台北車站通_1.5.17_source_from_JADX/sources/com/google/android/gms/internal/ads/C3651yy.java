package com.google.android.gms.internal.ads;

import org.apache.http.protocol.HTTP;

/* renamed from: com.google.android.gms.internal.ads.yy */
final class C3651yy implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f10630a;

    /* renamed from: b */
    private final /* synthetic */ C3509ty f10631b;

    C3651yy(C3509ty tyVar, String str) {
        this.f10631b = tyVar;
        this.f10630a = str;
    }

    public final void run() {
        this.f10631b.f10288a.loadData(this.f10630a, "text/html", HTTP.UTF_8);
    }
}
