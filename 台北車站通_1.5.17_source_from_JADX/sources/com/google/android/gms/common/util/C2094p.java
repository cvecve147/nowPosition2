package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;

/* renamed from: com.google.android.gms.common.util.p */
public class C2094p {

    /* renamed from: a */
    private static String f6561a;

    /* renamed from: b */
    private static int f6562b;

    /* renamed from: a */
    private static BufferedReader m9172a(String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: a */
    public static String m9173a() {
        if (f6561a == null) {
            f6561a = m9174a(m9175b());
        }
        return f6561a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m9174a(int r4) {
        /*
            r0 = 0
            if (r4 > 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0033, all -> 0x002e }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0033, all -> 0x002e }
            java.lang.String r1 = "/proc/"
            r2.append(r1)     // Catch:{ IOException -> 0x0033, all -> 0x002e }
            r2.append(r4)     // Catch:{ IOException -> 0x0033, all -> 0x002e }
            java.lang.String r4 = "/cmdline"
            r2.append(r4)     // Catch:{ IOException -> 0x0033, all -> 0x002e }
            java.lang.String r4 = r2.toString()     // Catch:{ IOException -> 0x0033, all -> 0x002e }
            java.io.BufferedReader r4 = m9172a((java.lang.String) r4)     // Catch:{ IOException -> 0x0033, all -> 0x002e }
            java.lang.String r1 = r4.readLine()     // Catch:{ IOException -> 0x0034, all -> 0x0029 }
            java.lang.String r0 = r1.trim()     // Catch:{ IOException -> 0x0034, all -> 0x0029 }
            goto L_0x0034
        L_0x0029:
            r0 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
            goto L_0x002f
        L_0x002e:
            r4 = move-exception
        L_0x002f:
            com.google.android.gms.common.util.C2090l.m9157a(r0)
            throw r4
        L_0x0033:
            r4 = r0
        L_0x0034:
            com.google.android.gms.common.util.C2090l.m9157a(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.C2094p.m9174a(int):java.lang.String");
    }

    /* renamed from: b */
    private static int m9175b() {
        if (f6562b == 0) {
            f6562b = Process.myPid();
        }
        return f6562b;
    }
}
