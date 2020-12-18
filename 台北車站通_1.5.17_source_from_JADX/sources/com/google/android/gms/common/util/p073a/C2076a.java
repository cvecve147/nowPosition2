package com.google.android.gms.common.util.p073a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.util.a.a */
public class C2076a implements Executor {

    /* renamed from: a */
    private final Handler f6537a;

    public C2076a(Looper looper) {
        this.f6537a = new Handler(looper);
    }

    public void execute(Runnable runnable) {
        this.f6537a.post(runnable);
    }
}
