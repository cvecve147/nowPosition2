package com.facebook.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.internal.C1506ka;
import java.io.Closeable;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.internal.H */
public class C1444H {

    /* renamed from: a */
    private static Handler f5044a;

    /* renamed from: b */
    private static C1506ka f5045b = new C1506ka(8);

    /* renamed from: c */
    private static C1506ka f5046c = new C1506ka(2);

    /* renamed from: d */
    private static final Map<C1448d, C1447c> f5047d = new HashMap();

    /* renamed from: com.facebook.internal.H$a */
    private static class C1445a implements Runnable {

        /* renamed from: a */
        private Context f5048a;

        /* renamed from: b */
        private C1448d f5049b;

        /* renamed from: c */
        private boolean f5050c;

        C1445a(Context context, C1448d dVar, boolean z) {
            this.f5048a = context;
            this.f5049b = dVar;
            this.f5050c = z;
        }

        public void run() {
            C1444H.m6815b(this.f5049b, this.f5048a, this.f5050c);
        }
    }

    /* renamed from: com.facebook.internal.H$b */
    private static class C1446b implements Runnable {

        /* renamed from: a */
        private Context f5051a;

        /* renamed from: b */
        private C1448d f5052b;

        C1446b(Context context, C1448d dVar) {
            this.f5051a = context;
            this.f5052b = dVar;
        }

        public void run() {
            C1444H.m6814b(this.f5052b, this.f5051a);
        }
    }

    /* renamed from: com.facebook.internal.H$c */
    private static class C1447c {

        /* renamed from: a */
        C1506ka.C1507a f5053a;

        /* renamed from: b */
        C1450J f5054b;

        /* renamed from: c */
        boolean f5055c;

        private C1447c() {
        }

        /* synthetic */ C1447c(C1443G g) {
            this();
        }
    }

    /* renamed from: com.facebook.internal.H$d */
    private static class C1448d {

        /* renamed from: a */
        Uri f5056a;

        /* renamed from: b */
        Object f5057b;

        C1448d(Uri uri, Object obj) {
            this.f5056a = uri;
            this.f5057b = obj;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C1448d)) {
                return false;
            }
            C1448d dVar = (C1448d) obj;
            return dVar.f5056a == this.f5056a && dVar.f5057b == this.f5057b;
        }

        public int hashCode() {
            return ((1073 + this.f5056a.hashCode()) * 37) + this.f5057b.hashCode();
        }
    }

    /* renamed from: a */
    private static synchronized Handler m6805a() {
        Handler handler;
        synchronized (C1444H.class) {
            if (f5044a == null) {
                f5044a = new Handler(Looper.getMainLooper());
            }
            handler = f5044a;
        }
        return handler;
    }

    /* renamed from: a */
    private static C1447c m6806a(C1448d dVar) {
        C1447c remove;
        synchronized (f5047d) {
            remove = f5047d.remove(dVar);
        }
        return remove;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r2 = r7.f5054b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m6809a(com.facebook.internal.C1444H.C1448d r7, java.lang.Exception r8, android.graphics.Bitmap r9, boolean r10) {
        /*
            com.facebook.internal.H$c r7 = m6806a((com.facebook.internal.C1444H.C1448d) r7)
            if (r7 == 0) goto L_0x0022
            boolean r0 = r7.f5055c
            if (r0 != 0) goto L_0x0022
            com.facebook.internal.J r2 = r7.f5054b
            com.facebook.internal.J$b r6 = r2.mo6142a()
            if (r6 == 0) goto L_0x0022
            android.os.Handler r7 = m6805a()
            com.facebook.internal.G r0 = new com.facebook.internal.G
            r1 = r0
            r3 = r8
            r4 = r10
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.post(r0)
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C1444H.m6809a(com.facebook.internal.H$d, java.lang.Exception, android.graphics.Bitmap, boolean):void");
    }

    /* renamed from: a */
    public static void m6810a(C1450J j) {
        if (j != null) {
            C1448d dVar = new C1448d(j.mo6145d(), j.mo6143b());
            synchronized (f5047d) {
                C1447c cVar = f5047d.get(dVar);
                if (cVar != null) {
                    cVar.f5054b = j;
                    cVar.f5055c = false;
                    cVar.f5053a.mo6232a();
                } else {
                    m6813a(j, dVar, j.mo6146e());
                }
            }
        }
    }

    /* renamed from: a */
    private static void m6811a(C1450J j, C1448d dVar) {
        m6812a(j, dVar, f5045b, (Runnable) new C1446b(j.mo6144c(), dVar));
    }

    /* renamed from: a */
    private static void m6812a(C1450J j, C1448d dVar, C1506ka kaVar, Runnable runnable) {
        synchronized (f5047d) {
            C1447c cVar = new C1447c((C1443G) null);
            cVar.f5054b = j;
            f5047d.put(dVar, cVar);
            cVar.f5053a = kaVar.mo6230a(runnable);
        }
    }

    /* renamed from: a */
    private static void m6813a(C1450J j, C1448d dVar, boolean z) {
        m6812a(j, dVar, f5046c, (Runnable) new C1445a(j.mo6144c(), dVar, z));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b4, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b6, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b7, code lost:
        r4 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b4 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0014] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m6814b(com.facebook.internal.C1444H.C1448d r9, android.content.Context r10) {
        /*
            r0 = 0
            r1 = 0
            r2 = 1
            java.net.URL r3 = new java.net.URL     // Catch:{ IOException -> 0x00c2, all -> 0x00b9 }
            android.net.Uri r4 = r9.f5056a     // Catch:{ IOException -> 0x00c2, all -> 0x00b9 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x00c2, all -> 0x00b9 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00c2, all -> 0x00b9 }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ IOException -> 0x00c2, all -> 0x00b9 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x00c2, all -> 0x00b9 }
            r3.setInstanceFollowRedirects(r1)     // Catch:{ IOException -> 0x00b6, all -> 0x00b4 }
            int r4 = r3.getResponseCode()     // Catch:{ IOException -> 0x00b6, all -> 0x00b4 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 == r5) goto L_0x009b
            r5 = 301(0x12d, float:4.22E-43)
            if (r4 == r5) goto L_0x0068
            r5 = 302(0x12e, float:4.23E-43)
            if (r4 == r5) goto L_0x0068
            java.io.InputStream r4 = r3.getErrorStream()     // Catch:{ IOException -> 0x00b6, all -> 0x00b4 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0065, all -> 0x0061 }
            r5.<init>()     // Catch:{ IOException -> 0x0065, all -> 0x0061 }
            if (r4 == 0) goto L_0x004a
            java.io.InputStreamReader r10 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0065, all -> 0x0061 }
            r10.<init>(r4)     // Catch:{ IOException -> 0x0065, all -> 0x0061 }
            r6 = 128(0x80, float:1.794E-43)
            char[] r6 = new char[r6]     // Catch:{ IOException -> 0x0065, all -> 0x0061 }
        L_0x003b:
            int r7 = r6.length     // Catch:{ IOException -> 0x0065, all -> 0x0061 }
            int r7 = r10.read(r6, r1, r7)     // Catch:{ IOException -> 0x0065, all -> 0x0061 }
            if (r7 <= 0) goto L_0x0046
            r5.append(r6, r1, r7)     // Catch:{ IOException -> 0x0065, all -> 0x0061 }
            goto L_0x003b
        L_0x0046:
            com.facebook.internal.C1480ba.m6940a((java.io.Closeable) r10)     // Catch:{ IOException -> 0x0065, all -> 0x0061 }
            goto L_0x0053
        L_0x004a:
            int r6 = com.facebook.C1366W.com_facebook_image_download_unknown_error     // Catch:{ IOException -> 0x0065, all -> 0x0061 }
            java.lang.String r10 = r10.getString(r6)     // Catch:{ IOException -> 0x0065, all -> 0x0061 }
            r5.append(r10)     // Catch:{ IOException -> 0x0065, all -> 0x0061 }
        L_0x0053:
            com.facebook.p r10 = new com.facebook.p     // Catch:{ IOException -> 0x0065, all -> 0x0061 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0065, all -> 0x0061 }
            r10.<init>((java.lang.String) r5)     // Catch:{ IOException -> 0x0065, all -> 0x0061 }
            r8 = r0
            r0 = r10
            r10 = r4
            r4 = r8
            goto L_0x00a3
        L_0x0061:
            r9 = move-exception
            r0 = r4
            goto L_0x00bb
        L_0x0065:
            r10 = move-exception
            goto L_0x00c5
        L_0x0068:
            java.lang.String r10 = "location"
            java.lang.String r10 = r3.getHeaderField(r10)     // Catch:{ IOException -> 0x0097, all -> 0x00b4 }
            boolean r2 = com.facebook.internal.C1480ba.m6958b((java.lang.String) r10)     // Catch:{ IOException -> 0x0097, all -> 0x00b4 }
            if (r2 != 0) goto L_0x0093
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch:{ IOException -> 0x0097, all -> 0x00b4 }
            android.net.Uri r2 = r9.f5056a     // Catch:{ IOException -> 0x0097, all -> 0x00b4 }
            com.facebook.internal.C1474Y.m6913a(r2, r10)     // Catch:{ IOException -> 0x0097, all -> 0x00b4 }
            com.facebook.internal.H$c r2 = m6806a((com.facebook.internal.C1444H.C1448d) r9)     // Catch:{ IOException -> 0x0097, all -> 0x00b4 }
            if (r2 == 0) goto L_0x0093
            boolean r4 = r2.f5055c     // Catch:{ IOException -> 0x0097, all -> 0x00b4 }
            if (r4 != 0) goto L_0x0093
            com.facebook.internal.J r2 = r2.f5054b     // Catch:{ IOException -> 0x0097, all -> 0x00b4 }
            com.facebook.internal.H$d r4 = new com.facebook.internal.H$d     // Catch:{ IOException -> 0x0097, all -> 0x00b4 }
            java.lang.Object r5 = r9.f5057b     // Catch:{ IOException -> 0x0097, all -> 0x00b4 }
            r4.<init>(r10, r5)     // Catch:{ IOException -> 0x0097, all -> 0x00b4 }
            m6813a((com.facebook.internal.C1450J) r2, (com.facebook.internal.C1444H.C1448d) r4, (boolean) r1)     // Catch:{ IOException -> 0x0097, all -> 0x00b4 }
        L_0x0093:
            r10 = r0
            r4 = r10
            r2 = r1
            goto L_0x00a3
        L_0x0097:
            r10 = move-exception
            r4 = r0
            r2 = r1
            goto L_0x00c5
        L_0x009b:
            java.io.InputStream r10 = com.facebook.internal.C1454L.m6831a((android.content.Context) r10, (java.net.HttpURLConnection) r3)     // Catch:{ IOException -> 0x00b6, all -> 0x00b4 }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r10)     // Catch:{ IOException -> 0x00af, all -> 0x00ac }
        L_0x00a3:
            com.facebook.internal.C1480ba.m6940a((java.io.Closeable) r10)
            com.facebook.internal.C1480ba.m6945a((java.net.URLConnection) r3)
            r10 = r0
            r0 = r4
            goto L_0x00cb
        L_0x00ac:
            r9 = move-exception
            r0 = r10
            goto L_0x00bb
        L_0x00af:
            r4 = move-exception
            r8 = r4
            r4 = r10
            r10 = r8
            goto L_0x00c5
        L_0x00b4:
            r9 = move-exception
            goto L_0x00bb
        L_0x00b6:
            r10 = move-exception
            r4 = r0
            goto L_0x00c5
        L_0x00b9:
            r9 = move-exception
            r3 = r0
        L_0x00bb:
            com.facebook.internal.C1480ba.m6940a((java.io.Closeable) r0)
            com.facebook.internal.C1480ba.m6945a((java.net.URLConnection) r3)
            throw r9
        L_0x00c2:
            r10 = move-exception
            r3 = r0
            r4 = r3
        L_0x00c5:
            com.facebook.internal.C1480ba.m6940a((java.io.Closeable) r4)
            com.facebook.internal.C1480ba.m6945a((java.net.URLConnection) r3)
        L_0x00cb:
            if (r2 == 0) goto L_0x00d0
            m6809a((com.facebook.internal.C1444H.C1448d) r9, (java.lang.Exception) r10, (android.graphics.Bitmap) r0, (boolean) r1)
        L_0x00d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C1444H.m6814b(com.facebook.internal.H$d, android.content.Context):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m6815b(C1448d dVar, Context context, boolean z) {
        InputStream inputStream;
        Uri a;
        boolean z2 = false;
        if (!z || (a = C1474Y.m6911a(dVar.f5056a)) == null) {
            inputStream = null;
        } else {
            inputStream = C1454L.m6832a(a, context);
            if (inputStream != null) {
                z2 = true;
            }
        }
        if (!z2) {
            inputStream = C1454L.m6832a(dVar.f5056a, context);
        }
        if (inputStream != null) {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
            C1480ba.m6940a((Closeable) inputStream);
            m6809a(dVar, (Exception) null, decodeStream, z2);
            return;
        }
        C1447c a2 = m6806a(dVar);
        if (a2 != null && !a2.f5055c) {
            m6811a(a2.f5054b, dVar);
        }
    }
}
