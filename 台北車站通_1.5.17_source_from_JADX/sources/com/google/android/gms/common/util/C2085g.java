package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C2061y;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.common.util.g */
public final class C2085g {

    /* renamed from: a */
    private static final String[] f6547a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: b */
    private static DropBoxManager f6548b = null;

    /* renamed from: c */
    private static boolean f6549c = false;

    /* renamed from: d */
    private static boolean f6550d;

    /* renamed from: e */
    private static boolean f6551e;

    /* renamed from: f */
    private static int f6552f = -1;

    /* renamed from: g */
    private static int f6553g = 0;

    /* renamed from: h */
    private static int f6554h = 0;

    /* JADX WARNING: Can't wrap try/catch for region: R(15:41|42|43|44|45|46|47|48|49|50|51|52|53|(2:54|(1:56)(1:57))|58) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:63|(2:72|73)|74|75) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x014c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0153 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x0189 */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0166 A[Catch:{ IOException -> 0x0171, all -> 0x016e }, LOOP:0: B:54:0x0160->B:56:0x0166, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x016a A[EDGE_INSN: B:57:0x016a->B:58:? ?: BREAK  , SYNTHETIC, Splitter:B:57:0x016a] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0180 A[SYNTHETIC, Splitter:B:69:0x0180] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0186 A[SYNTHETIC, Splitter:B:72:0x0186] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.lang.String m9136a(android.content.Context r7, java.lang.String r8, java.lang.String r9, int r10) {
        /*
            java.lang.Class<com.google.android.gms.common.util.g> r0 = com.google.android.gms.common.util.C2085g.class
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0190 }
            r2 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2)     // Catch:{ all -> 0x0190 }
            java.lang.String r2 = "Process: "
            r1.append(r2)     // Catch:{ all -> 0x0190 }
            java.lang.String r9 = com.google.android.gms.common.util.C2096r.m9178b(r9)     // Catch:{ all -> 0x0190 }
            r1.append(r9)     // Catch:{ all -> 0x0190 }
            java.lang.String r9 = "\n"
            r1.append(r9)     // Catch:{ all -> 0x0190 }
            java.lang.String r9 = "Package: com.google.android.gms"
            r1.append(r9)     // Catch:{ all -> 0x0190 }
            r9 = 12451009(0xbdfcc1, float:1.744758E-38)
            java.lang.String r2 = "12.4.51 (020308-{{cl}})"
            boolean r3 = m9143b()     // Catch:{ all -> 0x0190 }
            r4 = 0
            if (r3 == 0) goto L_0x0049
            com.google.android.gms.common.c.b r3 = com.google.android.gms.common.p072c.C1989c.m8748b(r7)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r5 = r7.getPackageName()     // Catch:{ Exception -> 0x0041 }
            android.content.pm.PackageInfo r3 = r3.mo7521b(r5, r4)     // Catch:{ Exception -> 0x0041 }
            int r9 = r3.versionCode     // Catch:{ Exception -> 0x0041 }
            java.lang.String r5 = r3.versionName     // Catch:{ Exception -> 0x0041 }
            if (r5 == 0) goto L_0x0049
            java.lang.String r2 = r3.versionName     // Catch:{ Exception -> 0x0041 }
            goto L_0x0049
        L_0x0041:
            r3 = move-exception
            java.lang.String r5 = "CrashUtils"
            java.lang.String r6 = "Error while trying to get the package information! Using static version."
            android.util.Log.w(r5, r6, r3)     // Catch:{ all -> 0x0190 }
        L_0x0049:
            java.lang.String r3 = " v"
            r1.append(r3)     // Catch:{ all -> 0x0190 }
            r1.append(r9)     // Catch:{ all -> 0x0190 }
            boolean r9 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0190 }
            if (r9 != 0) goto L_0x0090
            java.lang.String r9 = "("
            boolean r9 = r2.contains(r9)     // Catch:{ all -> 0x0190 }
            if (r9 == 0) goto L_0x0083
            java.lang.String r9 = ")"
            boolean r9 = r2.contains(r9)     // Catch:{ all -> 0x0190 }
            if (r9 != 0) goto L_0x0083
            java.lang.String r9 = "-"
            boolean r9 = r2.endsWith(r9)     // Catch:{ all -> 0x0190 }
            if (r9 == 0) goto L_0x0079
            java.lang.String r9 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0190 }
            java.lang.String r2 = "111111111"
            java.lang.String r2 = r9.concat(r2)     // Catch:{ all -> 0x0190 }
        L_0x0079:
            java.lang.String r9 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0190 }
            java.lang.String r2 = ")"
            java.lang.String r2 = r9.concat(r2)     // Catch:{ all -> 0x0190 }
        L_0x0083:
            java.lang.String r9 = " ("
            r1.append(r9)     // Catch:{ all -> 0x0190 }
            r1.append(r2)     // Catch:{ all -> 0x0190 }
            java.lang.String r9 = ")"
            r1.append(r9)     // Catch:{ all -> 0x0190 }
        L_0x0090:
            java.lang.String r9 = "\n"
            r1.append(r9)     // Catch:{ all -> 0x0190 }
            java.lang.String r9 = "Build: "
            r1.append(r9)     // Catch:{ all -> 0x0190 }
            java.lang.String r9 = android.os.Build.FINGERPRINT     // Catch:{ all -> 0x0190 }
            r1.append(r9)     // Catch:{ all -> 0x0190 }
            java.lang.String r9 = "\n"
            r1.append(r9)     // Catch:{ all -> 0x0190 }
            boolean r9 = android.os.Debug.isDebuggerConnected()     // Catch:{ all -> 0x0190 }
            if (r9 == 0) goto L_0x00af
            java.lang.String r9 = "Debugger: Connected\n"
            r1.append(r9)     // Catch:{ all -> 0x0190 }
        L_0x00af:
            if (r10 == 0) goto L_0x00be
            java.lang.String r9 = "DD-EDD: "
            r1.append(r9)     // Catch:{ all -> 0x0190 }
            r1.append(r10)     // Catch:{ all -> 0x0190 }
            java.lang.String r9 = "\n"
            r1.append(r9)     // Catch:{ all -> 0x0190 }
        L_0x00be:
            java.lang.String r9 = "\n"
            r1.append(r9)     // Catch:{ all -> 0x0190 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0190 }
            if (r9 != 0) goto L_0x00cc
            r1.append(r8)     // Catch:{ all -> 0x0190 }
        L_0x00cc:
            boolean r8 = m9143b()     // Catch:{ all -> 0x0190 }
            if (r8 == 0) goto L_0x00e4
            java.lang.String r8 = "logcat_for_system_app_crash"
            int r9 = f6552f     // Catch:{ all -> 0x0190 }
            if (r9 < 0) goto L_0x00db
            int r7 = f6552f     // Catch:{ all -> 0x0190 }
            goto L_0x00e5
        L_0x00db:
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ all -> 0x0190 }
            int r7 = android.provider.Settings.Secure.getInt(r7, r8, r4)     // Catch:{ all -> 0x0190 }
            goto L_0x00e5
        L_0x00e4:
            r7 = r4
        L_0x00e5:
            if (r7 <= 0) goto L_0x018a
            java.lang.String r8 = "\n"
            r1.append(r8)     // Catch:{ all -> 0x0190 }
            r8 = 0
            java.lang.ProcessBuilder r9 = new java.lang.ProcessBuilder     // Catch:{ IOException -> 0x0176 }
            r10 = 13
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ IOException -> 0x0176 }
            java.lang.String r2 = "/system/bin/logcat"
            r10[r4] = r2     // Catch:{ IOException -> 0x0176 }
            java.lang.String r2 = "-v"
            r3 = 1
            r10[r3] = r2     // Catch:{ IOException -> 0x0176 }
            r2 = 2
            java.lang.String r5 = "time"
            r10[r2] = r5     // Catch:{ IOException -> 0x0176 }
            r2 = 3
            java.lang.String r5 = "-b"
            r10[r2] = r5     // Catch:{ IOException -> 0x0176 }
            r2 = 4
            java.lang.String r5 = "events"
            r10[r2] = r5     // Catch:{ IOException -> 0x0176 }
            r2 = 5
            java.lang.String r5 = "-b"
            r10[r2] = r5     // Catch:{ IOException -> 0x0176 }
            r2 = 6
            java.lang.String r5 = "system"
            r10[r2] = r5     // Catch:{ IOException -> 0x0176 }
            r2 = 7
            java.lang.String r5 = "-b"
            r10[r2] = r5     // Catch:{ IOException -> 0x0176 }
            r2 = 8
            java.lang.String r5 = "main"
            r10[r2] = r5     // Catch:{ IOException -> 0x0176 }
            r2 = 9
            java.lang.String r5 = "-b"
            r10[r2] = r5     // Catch:{ IOException -> 0x0176 }
            r2 = 10
            java.lang.String r5 = "crash"
            r10[r2] = r5     // Catch:{ IOException -> 0x0176 }
            r2 = 11
            java.lang.String r5 = "-t"
            r10[r2] = r5     // Catch:{ IOException -> 0x0176 }
            r2 = 12
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x0176 }
            r10[r2] = r7     // Catch:{ IOException -> 0x0176 }
            r9.<init>(r10)     // Catch:{ IOException -> 0x0176 }
            java.lang.ProcessBuilder r7 = r9.redirectErrorStream(r3)     // Catch:{ IOException -> 0x0176 }
            java.lang.Process r7 = r7.start()     // Catch:{ IOException -> 0x0176 }
            java.io.OutputStream r9 = r7.getOutputStream()     // Catch:{ IOException -> 0x014c }
            r9.close()     // Catch:{ IOException -> 0x014c }
        L_0x014c:
            java.io.InputStream r9 = r7.getErrorStream()     // Catch:{ IOException -> 0x0153 }
            r9.close()     // Catch:{ IOException -> 0x0153 }
        L_0x0153:
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0176 }
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ IOException -> 0x0176 }
            r9.<init>(r7)     // Catch:{ IOException -> 0x0176 }
            r7 = 8192(0x2000, float:1.14794E-41)
            char[] r7 = new char[r7]     // Catch:{ IOException -> 0x0171, all -> 0x016e }
        L_0x0160:
            int r8 = r9.read(r7)     // Catch:{ IOException -> 0x0171, all -> 0x016e }
            if (r8 <= 0) goto L_0x016a
            r1.append(r7, r4, r8)     // Catch:{ IOException -> 0x0171, all -> 0x016e }
            goto L_0x0160
        L_0x016a:
            r9.close()     // Catch:{ IOException -> 0x018a }
            goto L_0x018a
        L_0x016e:
            r7 = move-exception
            r8 = r9
            goto L_0x0184
        L_0x0171:
            r7 = move-exception
            r8 = r9
            goto L_0x0177
        L_0x0174:
            r7 = move-exception
            goto L_0x0184
        L_0x0176:
            r7 = move-exception
        L_0x0177:
            java.lang.String r9 = "CrashUtils"
            java.lang.String r10 = "Error running logcat"
            android.util.Log.e(r9, r10, r7)     // Catch:{ all -> 0x0174 }
            if (r8 == 0) goto L_0x018a
            r8.close()     // Catch:{ IOException -> 0x018a }
            goto L_0x018a
        L_0x0184:
            if (r8 == 0) goto L_0x0189
            r8.close()     // Catch:{ IOException -> 0x0189 }
        L_0x0189:
            throw r7     // Catch:{ all -> 0x0190 }
        L_0x018a:
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x0190 }
            monitor-exit(r0)
            return r7
        L_0x0190:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.C2085g.m9136a(android.content.Context, java.lang.String, java.lang.String, int):java.lang.String");
    }

    /* renamed from: a */
    private static synchronized Throwable m9137a(Throwable th) {
        synchronized (C2085g.class) {
            LinkedList linkedList = new LinkedList();
            while (th != null) {
                linkedList.push(th);
                th = th.getCause();
            }
            Throwable th2 = null;
            boolean z = false;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z2 = z;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    String className = stackTraceElement.getClassName();
                    String fileName = stackTraceElement.getFileName();
                    boolean z3 = !TextUtils.isEmpty(fileName) && fileName.startsWith(":com.google.android.gms");
                    z2 |= z3;
                    if (!z3 && !m9142a(className)) {
                        stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                    }
                    arrayList.add(stackTraceElement);
                }
                th2 = th2 == null ? new Throwable("<filtered>") : new Throwable("<filtered>", th2);
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                z = z2;
            }
            if (!z) {
                return null;
            }
            return th2;
        }
    }

    /* renamed from: a */
    private static boolean m9138a() {
        if (f6549c) {
            return f6550d;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0056, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0058, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized boolean m9139a(android.content.Context r4, java.lang.String r5, java.lang.String r6, int r7, java.lang.Throwable r8) {
        /*
            java.lang.Class<com.google.android.gms.common.util.g> r0 = com.google.android.gms.common.util.C2085g.class
            monitor-enter(r0)
            com.google.android.gms.common.internal.C2061y.m9067a(r4)     // Catch:{ all -> 0x0059 }
            boolean r1 = m9138a()     // Catch:{ all -> 0x0059 }
            r2 = 0
            if (r1 == 0) goto L_0x0057
            boolean r1 = com.google.android.gms.common.util.C2096r.m9177a(r5)     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x0014
            goto L_0x0057
        L_0x0014:
            int r1 = r5.hashCode()     // Catch:{ all -> 0x0059 }
            if (r8 != 0) goto L_0x001d
            int r8 = f6554h     // Catch:{ all -> 0x0059 }
            goto L_0x0021
        L_0x001d:
            int r8 = r8.hashCode()     // Catch:{ all -> 0x0059 }
        L_0x0021:
            int r3 = f6553g     // Catch:{ all -> 0x0059 }
            if (r3 != r1) goto L_0x002b
            int r3 = f6554h     // Catch:{ all -> 0x0059 }
            if (r3 != r8) goto L_0x002b
            monitor-exit(r0)
            return r2
        L_0x002b:
            f6553g = r1     // Catch:{ all -> 0x0059 }
            f6554h = r8     // Catch:{ all -> 0x0059 }
            android.os.DropBoxManager r8 = f6548b     // Catch:{ all -> 0x0059 }
            if (r8 == 0) goto L_0x0036
            android.os.DropBoxManager r8 = f6548b     // Catch:{ all -> 0x0059 }
            goto L_0x003e
        L_0x0036:
            java.lang.String r8 = "dropbox"
            java.lang.Object r8 = r4.getSystemService(r8)     // Catch:{ all -> 0x0059 }
            android.os.DropBoxManager r8 = (android.os.DropBoxManager) r8     // Catch:{ all -> 0x0059 }
        L_0x003e:
            if (r8 == 0) goto L_0x0055
            java.lang.String r1 = "system_app_crash"
            boolean r1 = r8.isTagEnabled(r1)     // Catch:{ all -> 0x0059 }
            if (r1 != 0) goto L_0x0049
            goto L_0x0055
        L_0x0049:
            java.lang.String r4 = m9136a(r4, r5, r6, r7)     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = "system_app_crash"
            r8.addText(r5, r4)     // Catch:{ all -> 0x0059 }
            r4 = 1
            monitor-exit(r0)
            return r4
        L_0x0055:
            monitor-exit(r0)
            return r2
        L_0x0057:
            monitor-exit(r0)
            return r2
        L_0x0059:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.C2085g.m9139a(android.content.Context, java.lang.String, java.lang.String, int, java.lang.Throwable):boolean");
    }

    /* renamed from: a */
    public static boolean m9140a(Context context, Throwable th) {
        return m9141a(context, th, 536870912);
    }

    /* renamed from: a */
    public static boolean m9141a(Context context, Throwable th, int i) {
        boolean z;
        try {
            C2061y.m9067a(context);
            C2061y.m9067a(th);
            if (!m9138a()) {
                return false;
            }
            if (m9143b() || (th = m9137a(th)) != null) {
                return m9139a(context, Log.getStackTraceString(th), C2094p.m9173a(), i, th);
            }
            return false;
        } catch (Exception e) {
            try {
                z = m9143b();
            } catch (Exception e2) {
                Log.e("CrashUtils", "Error determining which process we're running in!", e2);
                z = false;
            }
            if (!z) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e);
                return false;
            }
            throw e;
        }
    }

    /* renamed from: a */
    public static boolean m9142a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String startsWith : f6547a) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m9143b() {
        if (f6549c) {
            return f6551e;
        }
        return false;
    }
}
