package com.google.android.gms.common.util.p073a;

import com.google.android.gms.common.internal.C2061y;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.common.util.a.b */
public class C2077b implements ThreadFactory {

    /* renamed from: a */
    private final String f6538a;

    /* renamed from: b */
    private final int f6539b;

    /* renamed from: c */
    private final ThreadFactory f6540c;

    public C2077b(String str) {
        this(str, 0);
    }

    public C2077b(String str, int i) {
        this.f6540c = Executors.defaultThreadFactory();
        C2061y.m9068a(str, (Object) "Name must not be null");
        this.f6538a = str;
        this.f6539b = i;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f6540c.newThread(new C2079d(runnable, this.f6539b));
        newThread.setName(this.f6538a);
        return newThread;
    }
}
