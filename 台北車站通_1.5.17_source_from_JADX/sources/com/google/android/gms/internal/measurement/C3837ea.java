package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C2061y;
import java.net.URL;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ea */
final class C3837ea implements Runnable {

    /* renamed from: a */
    private final URL f11417a;

    /* renamed from: b */
    private final byte[] f11418b;

    /* renamed from: c */
    private final C3829ca f11419c;

    /* renamed from: d */
    private final String f11420d;

    /* renamed from: e */
    private final Map<String, String> f11421e;

    /* renamed from: f */
    private final /* synthetic */ C3821aa f11422f;

    public C3837ea(C3821aa aaVar, String str, URL url, byte[] bArr, Map<String, String> map, C3829ca caVar) {
        this.f11422f = aaVar;
        C2061y.m9076b(str);
        C2061y.m9067a(url);
        C2061y.m9067a(caVar);
        this.f11417a = url;
        this.f11418b = bArr;
        this.f11419c = caVar;
        this.f11420d = str;
        this.f11421e = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c7 A[SYNTHETIC, Splitter:B:44:0x00c7] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0102 A[SYNTHETIC, Splitter:B:57:0x0102] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.internal.measurement.aa r1 = r13.f11422f
            r1.mo10565f()
            r1 = 0
            r2 = 0
            com.google.android.gms.internal.measurement.aa r3 = r13.f11422f     // Catch:{ IOException -> 0x00fb, all -> 0x00c1 }
            java.net.URL r4 = r13.f11417a     // Catch:{ IOException -> 0x00fb, all -> 0x00c1 }
            java.net.HttpURLConnection r3 = r3.mo10655a((java.net.URL) r4)     // Catch:{ IOException -> 0x00fb, all -> 0x00c1 }
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.f11421e     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            if (r4 == 0) goto L_0x003b
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.f11421e     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
        L_0x001f:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            if (r5 == 0) goto L_0x003b
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            java.lang.Object r6 = r5.getKey()     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            java.lang.Object r5 = r5.getValue()     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            r3.addRequestProperty(r6, r5)     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            goto L_0x001f
        L_0x003b:
            byte[] r4 = r13.f11418b     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            if (r4 == 0) goto L_0x0088
            com.google.android.gms.internal.measurement.aa r4 = r13.f11422f     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            com.google.android.gms.internal.measurement.mc r4 = r4.mo10454o()     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            byte[] r5 = r13.f11418b     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            byte[] r4 = r4.mo10792a((byte[]) r5)     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            com.google.android.gms.internal.measurement.aa r5 = r13.f11422f     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            com.google.android.gms.internal.measurement.W r5 = r5.mo10385b()     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10580F()     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            java.lang.String r6 = "Uploading data. size"
            int r7 = r4.length     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            r5.mo10593a(r6, r7)     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            r5 = 1
            r3.setDoOutput(r5)     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r3.addRequestProperty(r5, r6)     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            int r5 = r4.length     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            r3.setFixedLengthStreamingMode(r5)     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            r3.connect()     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            r5.write(r4)     // Catch:{ IOException -> 0x0081, all -> 0x007c }
            r5.close()     // Catch:{ IOException -> 0x0081, all -> 0x007c }
            goto L_0x0088
        L_0x007c:
            r4 = move-exception
            r11 = r1
            r8 = r2
            r1 = r5
            goto L_0x00c5
        L_0x0081:
            r4 = move-exception
            r11 = r1
            r8 = r2
            r9 = r4
            r1 = r5
            goto L_0x0100
        L_0x0088:
            int r8 = r3.getResponseCode()     // Catch:{ IOException -> 0x00be, all -> 0x00bb }
            java.util.Map r11 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00b8, all -> 0x00b5 }
            com.google.android.gms.internal.measurement.aa r2 = r13.f11422f     // Catch:{ IOException -> 0x00b3, all -> 0x00b1 }
            byte[] r10 = com.google.android.gms.internal.measurement.C3821aa.m15308a((java.net.HttpURLConnection) r3)     // Catch:{ IOException -> 0x00b3, all -> 0x00b1 }
            if (r3 == 0) goto L_0x009b
            r3.disconnect()
        L_0x009b:
            com.google.android.gms.internal.measurement.aa r0 = r13.f11422f
            com.google.android.gms.internal.measurement.wa r0 = r0.mo10386c()
            com.google.android.gms.internal.measurement.da r1 = new com.google.android.gms.internal.measurement.da
            java.lang.String r6 = r13.f11420d
            com.google.android.gms.internal.measurement.ca r7 = r13.f11419c
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x00ad:
            r0.mo11020a((java.lang.Runnable) r1)
            return
        L_0x00b1:
            r4 = move-exception
            goto L_0x00c5
        L_0x00b3:
            r4 = move-exception
            goto L_0x00ff
        L_0x00b5:
            r4 = move-exception
            r11 = r1
            goto L_0x00c5
        L_0x00b8:
            r4 = move-exception
            r11 = r1
            goto L_0x00ff
        L_0x00bb:
            r4 = move-exception
            r11 = r1
            goto L_0x00c4
        L_0x00be:
            r4 = move-exception
            r11 = r1
            goto L_0x00fe
        L_0x00c1:
            r4 = move-exception
            r3 = r1
            r11 = r3
        L_0x00c4:
            r8 = r2
        L_0x00c5:
            if (r1 == 0) goto L_0x00df
            r1.close()     // Catch:{ IOException -> 0x00cb }
            goto L_0x00df
        L_0x00cb:
            r1 = move-exception
            com.google.android.gms.internal.measurement.aa r2 = r13.f11422f
            com.google.android.gms.internal.measurement.W r2 = r2.mo10385b()
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10585y()
            java.lang.String r5 = r13.f11420d
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r5)
            r2.mo10594a(r0, r5, r1)
        L_0x00df:
            if (r3 == 0) goto L_0x00e4
            r3.disconnect()
        L_0x00e4:
            com.google.android.gms.internal.measurement.aa r0 = r13.f11422f
            com.google.android.gms.internal.measurement.wa r0 = r0.mo10386c()
            com.google.android.gms.internal.measurement.da r1 = new com.google.android.gms.internal.measurement.da
            java.lang.String r6 = r13.f11420d
            com.google.android.gms.internal.measurement.ca r7 = r13.f11419c
            r9 = 0
            r10 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.mo11020a((java.lang.Runnable) r1)
            throw r4
        L_0x00fb:
            r4 = move-exception
            r3 = r1
            r11 = r3
        L_0x00fe:
            r8 = r2
        L_0x00ff:
            r9 = r4
        L_0x0100:
            if (r1 == 0) goto L_0x011a
            r1.close()     // Catch:{ IOException -> 0x0106 }
            goto L_0x011a
        L_0x0106:
            r1 = move-exception
            com.google.android.gms.internal.measurement.aa r2 = r13.f11422f
            com.google.android.gms.internal.measurement.W r2 = r2.mo10385b()
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10585y()
            java.lang.String r4 = r13.f11420d
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r4)
            r2.mo10594a(r0, r4, r1)
        L_0x011a:
            if (r3 == 0) goto L_0x011f
            r3.disconnect()
        L_0x011f:
            com.google.android.gms.internal.measurement.aa r0 = r13.f11422f
            com.google.android.gms.internal.measurement.wa r0 = r0.mo10386c()
            com.google.android.gms.internal.measurement.da r1 = new com.google.android.gms.internal.measurement.da
            java.lang.String r6 = r13.f11420d
            com.google.android.gms.internal.measurement.ca r7 = r13.f11419c
            r10 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3837ea.run():void");
    }
}
