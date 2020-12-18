package com.facebook.p060a;

import android.content.Context;
import android.util.Log;
import com.facebook.C1601x;
import com.facebook.internal.C1480ba;
import com.facebook.p060a.C1387b;
import com.facebook.p060a.C1392f;
import com.facebook.p060a.p061a.C1378g;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

/* renamed from: com.facebook.a.o */
class C1403o {

    /* renamed from: a */
    private static final String f4931a = "com.facebook.a.o";

    /* renamed from: com.facebook.a.o$a */
    private static class C1404a extends ObjectInputStream {
        public C1404a(InputStream inputStream) {
            super(inputStream);
        }

        /* access modifiers changed from: protected */
        public ObjectStreamClass readClassDescriptor() {
            Class cls;
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                cls = C1387b.C1388a.class;
            } else if (!readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1")) {
                return readClassDescriptor;
            } else {
                cls = C1392f.C1393a.class;
            }
            return ObjectStreamClass.lookup(cls);
        }
    }

    C1403o() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.facebook.a.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.facebook.a.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.facebook.a.o$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: com.facebook.a.v} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x008a A[Catch:{ Exception -> 0x002e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.facebook.p060a.C1412v m6705a() {
        /*
            java.lang.Class<com.facebook.a.o> r0 = com.facebook.p060a.C1403o.class
            monitor-enter(r0)
            com.facebook.p060a.p061a.C1378g.m6644b()     // Catch:{ all -> 0x0091 }
            android.content.Context r1 = com.facebook.C1601x.m7386b()     // Catch:{ all -> 0x0091 }
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003c, all -> 0x003a }
            com.facebook.a.o$a r4 = new com.facebook.a.o$a     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003c, all -> 0x003a }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003c, all -> 0x003a }
            r5.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003c, all -> 0x003a }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003c, all -> 0x003a }
            java.lang.Object r3 = r4.readObject()     // Catch:{ FileNotFoundException -> 0x0075, Exception -> 0x0038 }
            com.facebook.a.v r3 = (com.facebook.p060a.C1412v) r3     // Catch:{ FileNotFoundException -> 0x0075, Exception -> 0x0038 }
            com.facebook.internal.C1480ba.m6940a((java.io.Closeable) r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch:{ Exception -> 0x002e }
            r1.delete()     // Catch:{ Exception -> 0x002e }
            goto L_0x0036
        L_0x002e:
            r1 = move-exception
            java.lang.String r2 = f4931a     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch:{ all -> 0x0091 }
        L_0x0036:
            r2 = r3
            goto L_0x0088
        L_0x0038:
            r3 = move-exception
            goto L_0x003e
        L_0x003a:
            r3 = move-exception
            goto L_0x005e
        L_0x003c:
            r3 = move-exception
            r4 = r2
        L_0x003e:
            java.lang.String r5 = f4931a     // Catch:{ all -> 0x005b }
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch:{ all -> 0x005b }
            com.facebook.internal.C1480ba.m6940a((java.io.Closeable) r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0052 }
            r1.delete()     // Catch:{ Exception -> 0x0052 }
            goto L_0x0088
        L_0x0052:
            r1 = move-exception
            java.lang.String r3 = f4931a     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
        L_0x0057:
            android.util.Log.w(r3, r4, r1)     // Catch:{ all -> 0x0091 }
            goto L_0x0088
        L_0x005b:
            r2 = move-exception
            r3 = r2
            r2 = r4
        L_0x005e:
            com.facebook.internal.C1480ba.m6940a((java.io.Closeable) r2)     // Catch:{ all -> 0x0091 }
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch:{ Exception -> 0x006b }
            r1.delete()     // Catch:{ Exception -> 0x006b }
            goto L_0x0073
        L_0x006b:
            r1 = move-exception
            java.lang.String r2 = f4931a     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch:{ all -> 0x0091 }
        L_0x0073:
            throw r3     // Catch:{ all -> 0x0091 }
        L_0x0074:
            r4 = r2
        L_0x0075:
            com.facebook.internal.C1480ba.m6940a((java.io.Closeable) r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0082 }
            r1.delete()     // Catch:{ Exception -> 0x0082 }
            goto L_0x0088
        L_0x0082:
            r1 = move-exception
            java.lang.String r3 = f4931a     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L_0x0057
        L_0x0088:
            if (r2 != 0) goto L_0x008f
            com.facebook.a.v r2 = new com.facebook.a.v     // Catch:{ all -> 0x0091 }
            r2.<init>()     // Catch:{ all -> 0x0091 }
        L_0x008f:
            monitor-exit(r0)
            return r2
        L_0x0091:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p060a.C1403o.m6705a():com.facebook.a.v");
    }

    /* renamed from: a */
    public static synchronized void m6706a(C1387b bVar, C1414w wVar) {
        synchronized (C1403o.class) {
            C1378g.m6644b();
            C1412v a = m6705a();
            if (a.mo6073a(bVar)) {
                a.mo6074b(bVar).addAll(wVar.mo6079b());
            } else {
                a.mo6072a(bVar, wVar.mo6079b());
            }
            m6708a(a);
        }
    }

    /* renamed from: a */
    public static synchronized void m6707a(C1395g gVar) {
        synchronized (C1403o.class) {
            C1378g.m6644b();
            C1412v a = m6705a();
            for (C1387b next : gVar.mo6059b()) {
                a.mo6072a(next, gVar.mo6056a(next).mo6079b());
            }
            m6708a(a);
        }
    }

    /* renamed from: a */
    private static void m6708a(C1412v vVar) {
        Context b = C1601x.m7386b();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(b.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream2.writeObject(vVar);
                C1480ba.m6940a((Closeable) objectOutputStream2);
            } catch (Exception e) {
                e = e;
                objectOutputStream = objectOutputStream2;
                try {
                    Log.w(f4931a, "Got unexpected exception while persisting events: ", e);
                    try {
                        b.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception unused) {
                    }
                    C1480ba.m6940a((Closeable) objectOutputStream);
                } catch (Throwable th) {
                    th = th;
                    C1480ba.m6940a((Closeable) objectOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
                C1480ba.m6940a((Closeable) objectOutputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            Log.w(f4931a, "Got unexpected exception while persisting events: ", e);
            b.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            C1480ba.m6940a((Closeable) objectOutputStream);
        }
    }
}
