package com.onesignal;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.C4306Xa;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.onesignal.gb */
class C4370gb {

    /* renamed from: a */
    public static final String f12909a = C4306Xa.class.getSimpleName();

    /* renamed from: b */
    static HashMap<String, HashMap<String, Object>> f12910b;

    /* renamed from: c */
    public static C4371a f12911c;

    /* renamed from: com.onesignal.gb$a */
    public static class C4371a extends HandlerThread {

        /* renamed from: a */
        public Handler f12912a;

        /* renamed from: b */
        private long f12913b = 0;

        C4371a(String str) {
            super(str);
            start();
            this.f12912a = new Handler(getLooper());
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m17363b() {
            if (C4306Xa.f12759e != null) {
                for (String next : C4370gb.f12910b.keySet()) {
                    SharedPreferences.Editor edit = C4370gb.m17356b(next).edit();
                    HashMap hashMap = C4370gb.f12910b.get(next);
                    synchronized (hashMap) {
                        for (String str : hashMap.keySet()) {
                            Object obj = hashMap.get(str);
                            if (obj instanceof String) {
                                edit.putString(str, (String) obj);
                            } else if (obj instanceof Boolean) {
                                edit.putBoolean(str, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Integer) {
                                edit.putInt(str, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                edit.putLong(str, ((Long) obj).longValue());
                            } else if (obj instanceof Set) {
                                edit.putStringSet(str, (Set) obj);
                            }
                        }
                        hashMap.clear();
                    }
                    edit.apply();
                }
                this.f12913b = System.currentTimeMillis();
            }
        }

        /* renamed from: c */
        private Runnable m17364c() {
            return new C4365fb(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12504a() {
            synchronized (this.f12912a) {
                this.f12912a.removeCallbacksAndMessages((Object) null);
                if (this.f12913b == 0) {
                    this.f12913b = System.currentTimeMillis();
                }
                this.f12912a.postDelayed(m17364c(), (this.f12913b - System.currentTimeMillis()) + 200);
            }
        }
    }

    static {
        m17353a();
    }

    /* renamed from: a */
    static int m17347a(String str, String str2, int i) {
        return ((Integer) m17350a(str, str2, Integer.class, Integer.valueOf(i))).intValue();
    }

    /* renamed from: a */
    static long m17348a(String str, String str2, long j) {
        return ((Long) m17350a(str, str2, Long.class, Long.valueOf(j))).longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        r3 = m17356b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r3 == null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r5.equals(java.lang.String.class) == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        return r3.getString(r4, (java.lang.String) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r5.equals(java.lang.Boolean.class) == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        return java.lang.Boolean.valueOf(r3.getBoolean(r4, ((java.lang.Boolean) r6).booleanValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        if (r5.equals(java.lang.Integer.class) == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006f, code lost:
        return java.lang.Integer.valueOf(r3.getInt(r4, ((java.lang.Integer) r6).intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0076, code lost:
        if (r5.equals(java.lang.Long.class) == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        return java.lang.Long.valueOf(r3.getLong(r4, ((java.lang.Long) r6).longValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008d, code lost:
        if (r5.equals(java.util.Set.class) == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
        return r3.getStringSet(r4, (java.util.Set) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009c, code lost:
        if (r5.equals(java.lang.Object.class) == false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a6, code lost:
        return java.lang.Boolean.valueOf(r3.contains(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a9, code lost:
        return r6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m17350a(java.lang.String r3, java.lang.String r4, java.lang.Class r5, java.lang.Object r6) {
        /*
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Object>> r0 = f12910b
            java.lang.Object r0 = r0.get(r3)
            java.util.HashMap r0 = (java.util.HashMap) r0
            monitor-enter(r0)
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r5.equals(r1)     // Catch:{ all -> 0x00ac }
            if (r1 == 0) goto L_0x001e
            boolean r1 = r0.containsKey(r4)     // Catch:{ all -> 0x00ac }
            if (r1 == 0) goto L_0x001e
            r3 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x00ac }
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            return r3
        L_0x001e:
            java.lang.Object r1 = r0.get(r4)     // Catch:{ all -> 0x00ac }
            if (r1 != 0) goto L_0x00aa
            boolean r2 = r0.containsKey(r4)     // Catch:{ all -> 0x00ac }
            if (r2 == 0) goto L_0x002c
            goto L_0x00aa
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            android.content.SharedPreferences r3 = m17356b(r3)
            if (r3 == 0) goto L_0x00a9
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r3 = r3.getString(r4, r6)
            return r3
        L_0x0042:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0059
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            boolean r3 = r3.getBoolean(r4, r5)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L_0x0059:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0070
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r5 = r6.intValue()
            int r3 = r3.getInt(r4, r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L_0x0070:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0087
            java.lang.Long r6 = (java.lang.Long) r6
            long r5 = r6.longValue()
            long r3 = r3.getLong(r4, r5)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            return r3
        L_0x0087:
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0096
            java.util.Set r6 = (java.util.Set) r6
            java.util.Set r3 = r3.getStringSet(r4, r6)
            return r3
        L_0x0096:
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x00a7
            boolean r3 = r3.contains(r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L_0x00a7:
            r3 = 0
            return r3
        L_0x00a9:
            return r6
        L_0x00aa:
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            return r1
        L_0x00ac:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C4370gb.m17350a(java.lang.String, java.lang.String, java.lang.Class, java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    static String m17351a(String str, String str2, String str3) {
        return (String) m17350a(str, str2, String.class, str3);
    }

    /* renamed from: a */
    public static Set<String> m17352a(String str, String str2, Set<String> set) {
        return (Set) m17350a(str, str2, Set.class, set);
    }

    /* renamed from: a */
    public static void m17353a() {
        f12910b = new HashMap<>();
        f12910b.put(f12909a, new HashMap());
        f12910b.put("GTPlayerPurchases", new HashMap());
        f12910b.put("OneSignalTriggers", new HashMap());
        f12911c = new C4371a("OSH_WritePrefs");
    }

    /* renamed from: a */
    private static void m17354a(String str, String str2, Object obj) {
        HashMap hashMap = f12910b.get(str);
        synchronized (hashMap) {
            hashMap.put(str2, obj);
        }
        m17357b();
    }

    /* renamed from: a */
    static boolean m17355a(String str, String str2, boolean z) {
        return ((Boolean) m17350a(str, str2, Boolean.class, Boolean.valueOf(z))).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static synchronized SharedPreferences m17356b(String str) {
        synchronized (C4370gb.class) {
            if (C4306Xa.f12759e == null) {
                C4306Xa.m17136a(C4306Xa.C4316j.WARN, "OneSignal.appContext null, could not read " + str + " from getSharedPreferences.", new Throwable());
                return null;
            }
            SharedPreferences sharedPreferences = C4306Xa.f12759e.getSharedPreferences(str, 0);
            return sharedPreferences;
        }
    }

    /* renamed from: b */
    public static void m17357b() {
        f12911c.mo12504a();
    }

    /* renamed from: b */
    public static void m17358b(String str, String str2, long j) {
        m17354a(str, str2, (Object) Long.valueOf(j));
    }

    /* renamed from: b */
    public static void m17359b(String str, String str2, String str3) {
        m17354a(str, str2, (Object) str3);
    }

    /* renamed from: b */
    public static void m17360b(String str, String str2, Set<String> set) {
        m17354a(str, str2, (Object) set);
    }

    /* renamed from: b */
    public static void m17361b(String str, String str2, boolean z) {
        m17354a(str, str2, (Object) Boolean.valueOf(z));
    }
}
