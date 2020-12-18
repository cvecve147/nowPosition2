package com.google.android.gms.flags.impl.p074a;

import android.os.StrictMode;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.a.a */
public class C2126a {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static <T> T m9223a(Callable<T> callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            T call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
