package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.measurement.Lc */
public class C3761Lc {

    /* renamed from: a */
    private static final Uri f11226a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    private static final Uri f11227b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f11228c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f11229d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final AtomicBoolean f11230e = new AtomicBoolean();

    /* renamed from: f */
    private static HashMap<String, String> f11231f;

    /* renamed from: g */
    private static final HashMap<String, Boolean> f11232g = new HashMap<>();

    /* renamed from: h */
    private static final HashMap<String, Integer> f11233h = new HashMap<>();

    /* renamed from: i */
    private static final HashMap<String, Long> f11234i = new HashMap<>();

    /* renamed from: j */
    private static final HashMap<String, Float> f11235j = new HashMap<>();

    /* renamed from: k */
    private static Object f11236k;

    /* renamed from: l */
    private static boolean f11237l;

    /* renamed from: m */
    private static String[] f11238m = new String[0];

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> T m14960a(java.util.HashMap<java.lang.String, T> r2, java.lang.String r3, T r4) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.Lc> r0 = com.google.android.gms.internal.measurement.C3761Lc.class
            monitor-enter(r0)
            boolean r1 = r2.containsKey(r3)     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0013
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0016 }
            if (r2 == 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r2 = r4
        L_0x0011:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return r2
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            r2 = 0
            return r2
        L_0x0016:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3761Lc.m14960a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        r13 = r13.query(f11226a, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r14}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        if (r13 == null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        if (r13.moveToFirst() != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007b, code lost:
        r15 = r13.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007f, code lost:
        if (r15 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0085, code lost:
        if (r15.equals((java.lang.Object) null) == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0087, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
        m14965a(r0, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008b, code lost:
        if (r15 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008e, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0094, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        m14965a(r0, r14, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0098, code lost:
        if (r13 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009a, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009e, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x009f, code lost:
        if (r13 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a1, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a4, code lost:
        throw r14;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m14961a(android.content.ContentResolver r13, java.lang.String r14, java.lang.String r15) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.Lc> r15 = com.google.android.gms.internal.measurement.C3761Lc.class
            monitor-enter(r15)
            m14964a(r13)     // Catch:{ all -> 0x00a5 }
            java.lang.Object r0 = f11236k     // Catch:{ all -> 0x00a5 }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f11231f     // Catch:{ all -> 0x00a5 }
            boolean r1 = r1.containsKey(r14)     // Catch:{ all -> 0x00a5 }
            r2 = 0
            if (r1 == 0) goto L_0x001f
            java.util.HashMap<java.lang.String, java.lang.String> r13 = f11231f     // Catch:{ all -> 0x00a5 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x00a5 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00a5 }
            if (r13 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r13 = r2
        L_0x001d:
            monitor-exit(r15)     // Catch:{ all -> 0x00a5 }
            return r13
        L_0x001f:
            java.lang.String[] r1 = f11238m     // Catch:{ all -> 0x00a5 }
            int r3 = r1.length     // Catch:{ all -> 0x00a5 }
            r4 = 0
            r5 = r4
        L_0x0024:
            r6 = 1
            if (r5 >= r3) goto L_0x0063
            r7 = r1[r5]     // Catch:{ all -> 0x00a5 }
            boolean r7 = r14.startsWith(r7)     // Catch:{ all -> 0x00a5 }
            if (r7 == 0) goto L_0x0060
            boolean r0 = f11237l     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x003b
            java.util.HashMap<java.lang.String, java.lang.String> r0 = f11231f     // Catch:{ all -> 0x00a5 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x005e
        L_0x003b:
            java.lang.String[] r0 = f11238m     // Catch:{ all -> 0x00a5 }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f11231f     // Catch:{ all -> 0x00a5 }
            java.util.Map r13 = m14962a(r13, r0)     // Catch:{ all -> 0x00a5 }
            r1.putAll(r13)     // Catch:{ all -> 0x00a5 }
            f11237l = r6     // Catch:{ all -> 0x00a5 }
            java.util.HashMap<java.lang.String, java.lang.String> r13 = f11231f     // Catch:{ all -> 0x00a5 }
            boolean r13 = r13.containsKey(r14)     // Catch:{ all -> 0x00a5 }
            if (r13 == 0) goto L_0x005e
            java.util.HashMap<java.lang.String, java.lang.String> r13 = f11231f     // Catch:{ all -> 0x00a5 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x00a5 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00a5 }
            if (r13 == 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r13 = r2
        L_0x005c:
            monitor-exit(r15)     // Catch:{ all -> 0x00a5 }
            return r13
        L_0x005e:
            monitor-exit(r15)     // Catch:{ all -> 0x00a5 }
            return r2
        L_0x0060:
            int r5 = r5 + 1
            goto L_0x0024
        L_0x0063:
            monitor-exit(r15)     // Catch:{ all -> 0x00a5 }
            android.net.Uri r8 = f11226a
            r9 = 0
            r10 = 0
            java.lang.String[] r11 = new java.lang.String[r6]
            r11[r4] = r14
            r12 = 0
            r7 = r13
            android.database.Cursor r13 = r7.query(r8, r9, r10, r11, r12)
            if (r13 == 0) goto L_0x0095
            boolean r15 = r13.moveToFirst()     // Catch:{ all -> 0x009e }
            if (r15 != 0) goto L_0x007b
            goto L_0x0095
        L_0x007b:
            java.lang.String r15 = r13.getString(r6)     // Catch:{ all -> 0x009e }
            if (r15 == 0) goto L_0x0088
            boolean r1 = r15.equals(r2)     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x0088
            r15 = r2
        L_0x0088:
            m14965a((java.lang.Object) r0, (java.lang.String) r14, (java.lang.String) r15)     // Catch:{ all -> 0x009e }
            if (r15 == 0) goto L_0x008e
            goto L_0x008f
        L_0x008e:
            r15 = r2
        L_0x008f:
            if (r13 == 0) goto L_0x0094
            r13.close()
        L_0x0094:
            return r15
        L_0x0095:
            m14965a((java.lang.Object) r0, (java.lang.String) r14, (java.lang.String) r2)     // Catch:{ all -> 0x009e }
            if (r13 == 0) goto L_0x009d
            r13.close()
        L_0x009d:
            return r2
        L_0x009e:
            r14 = move-exception
            if (r13 == 0) goto L_0x00a4
            r13.close()
        L_0x00a4:
            throw r14
        L_0x00a5:
            r13 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00a5 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3761Lc.m14961a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static Map<String, String> m14962a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f11227b, (String[]) null, (String) null, strArr, (String) null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    /* renamed from: a */
    private static void m14964a(ContentResolver contentResolver) {
        if (f11231f == null) {
            f11230e.set(false);
            f11231f = new HashMap<>();
            f11236k = new Object();
            f11237l = false;
            contentResolver.registerContentObserver(f11226a, true, new C3765Mc((Handler) null));
        } else if (f11230e.getAndSet(false)) {
            f11231f.clear();
            f11232g.clear();
            f11233h.clear();
            f11234i.clear();
            f11235j.clear();
            f11236k = new Object();
            f11237l = false;
        }
    }

    /* renamed from: a */
    private static void m14965a(Object obj, String str, String str2) {
        synchronized (C3761Lc.class) {
            if (obj == f11236k) {
                f11231f.put(str, str2);
            }
        }
    }

    /* renamed from: a */
    public static boolean m14966a(ContentResolver contentResolver, String str, boolean z) {
        Object b = m14967b(contentResolver);
        Boolean bool = (Boolean) m14960a(f11232g, str, Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        String a = m14961a(contentResolver, str, (String) null);
        if (a != null && !a.equals("")) {
            if (f11228c.matcher(a).matches()) {
                bool = true;
                z = true;
            } else if (f11229d.matcher(a).matches()) {
                bool = false;
                z = false;
            } else {
                Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + a + "\") as boolean");
            }
        }
        HashMap<String, Boolean> hashMap = f11232g;
        synchronized (C3761Lc.class) {
            if (b == f11236k) {
                hashMap.put(str, bool);
                f11231f.remove(str);
            }
        }
        return z;
    }

    /* renamed from: b */
    private static Object m14967b(ContentResolver contentResolver) {
        Object obj;
        synchronized (C3761Lc.class) {
            m14964a(contentResolver);
            obj = f11236k;
        }
        return obj;
    }
}
