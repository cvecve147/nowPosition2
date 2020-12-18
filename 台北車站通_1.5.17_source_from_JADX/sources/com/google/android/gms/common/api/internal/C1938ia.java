package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.p073a.C2078c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.internal.ia */
public final class C1938ia {

    /* renamed from: a */
    private static final ExecutorService f6267a = new ThreadPoolExecutor(0, 4, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C2078c("GAC_Transform"));

    /* renamed from: a */
    public static ExecutorService m8595a() {
        return f6267a;
    }
}
