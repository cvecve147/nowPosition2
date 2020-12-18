package com.google.android.gms.internal.ads;

import org.apache.http.protocol.HTTP;

/* renamed from: com.google.android.gms.internal.ads.zy */
final class C3680zy implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f10718a;

    /* renamed from: b */
    private final /* synthetic */ C3509ty f10719b;

    C3680zy(C3509ty tyVar, String str) {
        this.f10719b = tyVar;
        this.f10718a = str;
    }

    public final void run() {
        this.f10719b.f10288a.loadData(this.f10718a, "text/html", HTTP.UTF_8);
    }
}
