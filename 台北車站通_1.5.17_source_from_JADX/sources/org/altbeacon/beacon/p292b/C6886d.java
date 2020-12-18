package org.altbeacon.beacon.p292b;

/* renamed from: org.altbeacon.beacon.b.d */
public class C6886d {

    /* renamed from: a */
    protected String f18971a;

    /* renamed from: b */
    protected Exception f18972b;

    /* renamed from: c */
    private int f18973c = -1;

    /* renamed from: d */
    private String f18974d;

    /* renamed from: e */
    private String f18975e;

    public C6886d(String str, String str2) {
        this.f18974d = str;
        this.f18975e = str2;
    }

    /* renamed from: a */
    public Exception mo18729a() {
        return this.f18972b;
    }

    /* renamed from: b */
    public int mo18730b() {
        return this.f18973c;
    }

    /* renamed from: c */
    public String mo18731c() {
        return this.f18971a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a9 A[EDGE_INSN: B:49:0x00a9->B:38:0x00a9 ?: BREAK  
    EDGE_INSN: B:50:0x00a9->B:38:0x00a9 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x000e A[LOOP:0: B:1:0x000e->B:48:0x000e, LOOP_END, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18732d() {
        /*
            r11 = this;
            r0 = 0
            r11.f18971a = r0
            java.lang.String r1 = r11.f18974d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            r4 = r0
            r5 = r1
            r1 = r3
        L_0x000e:
            r6 = 1
            java.lang.String r7 = "DistanceConfigFetcher"
            if (r1 == 0) goto L_0x002b
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r8 = r11.f18974d
            r5[r3] = r8
            java.lang.String r8 = "Location"
            java.lang.String r9 = r4.getHeaderField(r8)
            r5[r6] = r9
            java.lang.String r9 = "Following redirect from %s to %s"
            org.altbeacon.beacon.p293c.C6895d.m26021a(r7, r9, r5)
            java.lang.String r5 = r4.getHeaderField(r8)
        L_0x002b:
            int r1 = r1 + 1
            r8 = -1
            r11.f18973c = r8
            java.net.URL r8 = new java.net.URL     // Catch:{ Exception -> 0x0036 }
            r8.<init>(r5)     // Catch:{ Exception -> 0x0036 }
            goto L_0x0045
        L_0x0036:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.String r10 = r11.f18974d
            r9[r3] = r10
            java.lang.String r10 = "Can't construct URL from: %s"
            org.altbeacon.beacon.p293c.C6895d.m26024b(r7, r10, r9)
            r11.f18972b = r8
            r8 = r0
        L_0x0045:
            if (r8 != 0) goto L_0x004f
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r8 = "URL is null.  Cannot make request"
            org.altbeacon.beacon.p293c.C6895d.m26021a(r7, r8, r6)
            goto L_0x0097
        L_0x004f:
            java.net.URLConnection r8 = r8.openConnection()     // Catch:{ SecurityException -> 0x008a, FileNotFoundException -> 0x0082, IOException -> 0x007a }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ SecurityException -> 0x008a, FileNotFoundException -> 0x0082, IOException -> 0x007a }
            java.lang.String r4 = "User-Agent"
            java.lang.String r9 = r11.f18975e     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            r8.addRequestProperty(r4, r9)     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            int r4 = r8.getResponseCode()     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            r11.f18973c = r4     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            java.lang.String r4 = "response code is %s"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            int r9 = r8.getResponseCode()     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            r6[r3] = r9     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            org.altbeacon.beacon.p293c.C6895d.m26021a(r7, r4, r6)     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            goto L_0x0096
        L_0x0074:
            r4 = move-exception
            goto L_0x007d
        L_0x0076:
            r4 = move-exception
            goto L_0x0085
        L_0x0078:
            r4 = move-exception
            goto L_0x008d
        L_0x007a:
            r6 = move-exception
            r8 = r4
            r4 = r6
        L_0x007d:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r9 = "Can't reach server"
            goto L_0x0091
        L_0x0082:
            r6 = move-exception
            r8 = r4
            r4 = r6
        L_0x0085:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r9 = "No data exists at \"+urlString"
            goto L_0x0091
        L_0x008a:
            r6 = move-exception
            r8 = r4
            r4 = r6
        L_0x008d:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r9 = "Can't reach sever.  Have you added android.permission.INTERNET to your manifest?"
        L_0x0091:
            org.altbeacon.beacon.p293c.C6895d.m26025b(r4, r7, r9, r6)
            r11.f18972b = r4
        L_0x0096:
            r4 = r8
        L_0x0097:
            r6 = 10
            if (r1 >= r6) goto L_0x00a9
            int r6 = r11.f18973c
            r8 = 302(0x12e, float:4.23E-43)
            if (r6 == r8) goto L_0x000e
            r8 = 301(0x12d, float:4.22E-43)
            if (r6 == r8) goto L_0x000e
            r8 = 303(0x12f, float:4.25E-43)
            if (r6 == r8) goto L_0x000e
        L_0x00a9:
            java.lang.Exception r0 = r11.f18972b
            if (r0 != 0) goto L_0x00d9
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00cf }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00cf }
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ Exception -> 0x00cf }
            r1.<init>(r4)     // Catch:{ Exception -> 0x00cf }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00cf }
        L_0x00bb:
            java.lang.String r1 = r0.readLine()     // Catch:{ Exception -> 0x00cf }
            if (r1 == 0) goto L_0x00c5
            r2.append(r1)     // Catch:{ Exception -> 0x00cf }
            goto L_0x00bb
        L_0x00c5:
            r0.close()     // Catch:{ Exception -> 0x00cf }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x00cf }
            r11.f18971a = r0     // Catch:{ Exception -> 0x00cf }
            goto L_0x00d9
        L_0x00cf:
            r0 = move-exception
            r11.f18972b = r0
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "error reading beacon data"
            org.altbeacon.beacon.p293c.C6895d.m26025b(r0, r7, r2, r1)
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.p292b.C6886d.mo18732d():void");
    }
}
