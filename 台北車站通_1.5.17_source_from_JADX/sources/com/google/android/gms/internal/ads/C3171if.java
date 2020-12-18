package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;
import java.util.concurrent.Callable;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.if */
public final class C3171if {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static <T> T m12583a(Context context, Callable<T> callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            T call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static <T> T m12584a(Callable<T> callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            T call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
