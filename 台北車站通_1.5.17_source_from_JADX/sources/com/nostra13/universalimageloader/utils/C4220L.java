package com.nostra13.universalimageloader.utils;

import android.util.Log;
import com.nostra13.universalimageloader.core.ImageLoader;

/* renamed from: com.nostra13.universalimageloader.utils.L */
public final class C4220L {
    private static final String LOG_FORMAT = "%1$s\n%2$s";
    private static volatile boolean writeDebugLogs = false;
    private static volatile boolean writeLogs = true;

    private C4220L() {
    }

    /* renamed from: d */
    public static void m16763d(String str, Object... objArr) {
        if (writeDebugLogs) {
            log(3, (Throwable) null, str, objArr);
        }
    }

    @Deprecated
    public static void disableLogging() {
        writeLogs(false);
    }

    /* renamed from: e */
    public static void m16764e(String str, Object... objArr) {
        log(6, (Throwable) null, str, objArr);
    }

    /* renamed from: e */
    public static void m16765e(Throwable th) {
        log(6, th, (String) null, new Object[0]);
    }

    /* renamed from: e */
    public static void m16766e(Throwable th, String str, Object... objArr) {
        log(6, th, str, objArr);
    }

    @Deprecated
    public static void enableLogging() {
        writeLogs(true);
    }

    /* renamed from: i */
    public static void m16767i(String str, Object... objArr) {
        log(4, (Throwable) null, str, objArr);
    }

    private static void log(int i, Throwable th, String str, Object... objArr) {
        if (writeLogs) {
            if (objArr.length > 0) {
                str = String.format(str, objArr);
            }
            if (th != null) {
                if (str == null) {
                    str = th.getMessage();
                }
                str = String.format(LOG_FORMAT, new Object[]{str, Log.getStackTraceString(th)});
            }
            Log.println(i, ImageLoader.TAG, str);
        }
    }

    /* renamed from: w */
    public static void m16768w(String str, Object... objArr) {
        log(5, (Throwable) null, str, objArr);
    }

    public static void writeDebugLogs(boolean z) {
        writeDebugLogs = z;
    }

    public static void writeLogs(boolean z) {
        writeLogs = z;
    }
}
