package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.fe */
final class C3085fe implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f9133a = new AtomicInteger(1);

    /* renamed from: b */
    private final /* synthetic */ String f9134b;

    C3085fe(String str) {
        this.f9134b = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f9134b;
        int andIncrement = this.f9133a.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
