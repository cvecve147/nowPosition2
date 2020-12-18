package com.google.android.gms.common.util.p073a;

import com.google.android.gms.common.internal.C2061y;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.util.a.c */
public class C2078c implements ThreadFactory {

    /* renamed from: a */
    private final String f6541a;

    /* renamed from: b */
    private final int f6542b;

    /* renamed from: c */
    private final AtomicInteger f6543c;

    /* renamed from: d */
    private final ThreadFactory f6544d;

    public C2078c(String str) {
        this(str, 0);
    }

    public C2078c(String str, int i) {
        this.f6543c = new AtomicInteger();
        this.f6544d = Executors.defaultThreadFactory();
        C2061y.m9068a(str, (Object) "Name must not be null");
        this.f6541a = str;
        this.f6542b = i;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f6544d.newThread(new C2079d(runnable, this.f6542b));
        String str = this.f6541a;
        int andIncrement = this.f6543c.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
