package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.p073a.C2078c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.gms.common.api.internal.V */
public final class C1911V {

    /* renamed from: a */
    private static final ExecutorService f6198a = Executors.newFixedThreadPool(2, new C2078c("GAC_Executor"));

    /* renamed from: a */
    public static ExecutorService m8485a() {
        return f6198a;
    }
}
