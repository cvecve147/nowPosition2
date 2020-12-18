package com.onesignal;

import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.json.JSONObject;

/* renamed from: com.onesignal.rb */
class C4416rb {

    /* renamed from: com.onesignal.rb$a */
    static abstract class C4417a {
        C4417a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12377a(int i, String str, Throwable th) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12355a(String str) {
        }
    }

    /* renamed from: a */
    private static int m17497a(int i) {
        return i + BaseImageDownloader.DEFAULT_HTTP_CONNECT_TIMEOUT;
    }

    /* renamed from: a */
    private static Thread m17498a(C4417a aVar, int i, String str, Throwable th) {
        if (aVar == null) {
            return null;
        }
        Thread thread = new Thread(new C4412qb(aVar, i, str, th));
        thread.start();
        return thread;
    }

    /* renamed from: a */
    private static Thread m17499a(C4417a aVar, String str) {
        if (aVar == null) {
            return null;
        }
        Thread thread = new Thread(new C4407pb(aVar, str));
        thread.start();
        return thread;
    }

    /* renamed from: a */
    private static HttpURLConnection m17500a(String str) {
        return (HttpURLConnection) new URL("https://onesignal.com/api/v1/" + str).openConnection();
    }

    /* renamed from: a */
    public static void m17501a(String str, C4417a aVar, String str2) {
        new Thread(new C4401nb(str, aVar, str2)).start();
    }

    /* renamed from: a */
    public static void m17503a(String str, JSONObject jSONObject, C4417a aVar) {
        new Thread(new C4398mb(str, jSONObject, aVar)).start();
    }

    /* renamed from: b */
    public static void m17505b(String str, C4417a aVar, String str2) {
        m17507c(str, (String) null, (JSONObject) null, aVar, 60000, str2);
    }

    /* renamed from: b */
    public static void m17506b(String str, JSONObject jSONObject, C4417a aVar) {
        m17507c(str, HttpPost.METHOD_NAME, jSONObject, aVar, 120000, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m17507c(String str, String str2, JSONObject jSONObject, C4417a aVar, int i, String str3) {
        if (str2 == null || !C4306Xa.m17175e((String) null)) {
            Thread[] threadArr = new Thread[1];
            Thread thread = new Thread(new C4404ob(threadArr, str, str2, jSONObject, aVar, i, str3), "OS_HTTPConnection");
            thread.start();
            try {
                thread.join((long) m17497a(i));
                if (thread.getState() != Thread.State.TERMINATED) {
                    thread.interrupt();
                }
                if (threadArr[0] != null) {
                    threadArr[0].join();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public static void m17508c(String str, JSONObject jSONObject, C4417a aVar) {
        new Thread(new C4395lb(str, jSONObject, aVar)).start();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x024c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x024d, code lost:
        r18 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0250, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0252, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0250 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x0034] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x025e A[Catch:{ all -> 0x02a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02aa  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Thread m17509d(java.lang.String r16, java.lang.String r17, org.json.JSONObject r18, com.onesignal.C4416rb.C4417a r19, int r20, java.lang.String r21) {
        /*
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.String r5 = "OneSignalRestClient: "
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r6 < r7) goto L_0x0017
            r6 = 10000(0x2710, float:1.4013E-41)
            android.net.TrafficStats.setThreadStatsTag(r6)
        L_0x0017:
            r6 = 0
            r7 = -1
            com.onesignal.Xa$j r8 = com.onesignal.C4306Xa.C4316j.DEBUG     // Catch:{ Throwable -> 0x0258, all -> 0x0255 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0258, all -> 0x0255 }
            r9.<init>()     // Catch:{ Throwable -> 0x0258, all -> 0x0255 }
            java.lang.String r10 = "OneSignalRestClient: Making request to: https://onesignal.com/api/v1/"
            r9.append(r10)     // Catch:{ Throwable -> 0x0258, all -> 0x0255 }
            r9.append(r0)     // Catch:{ Throwable -> 0x0258, all -> 0x0255 }
            java.lang.String r9 = r9.toString()     // Catch:{ Throwable -> 0x0258, all -> 0x0255 }
            com.onesignal.C4306Xa.m17135a((com.onesignal.C4306Xa.C4316j) r8, (java.lang.String) r9)     // Catch:{ Throwable -> 0x0258, all -> 0x0255 }
            java.net.HttpURLConnection r8 = m17500a((java.lang.String) r16)     // Catch:{ Throwable -> 0x0258, all -> 0x0255 }
            r9 = 0
            r8.setUseCaches(r9)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r8.setConnectTimeout(r3)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r8.setReadTimeout(r3)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r3 = "SDK-Version"
            java.lang.String r9 = "onesignal/android/031100"
            r8.setRequestProperty(r3, r9)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r3 = 1
            if (r18 == 0) goto L_0x004a
            r8.setDoInput(r3)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
        L_0x004a:
            if (r1 == 0) goto L_0x0059
            java.lang.String r9 = "Content-Type"
            java.lang.String r10 = "application/json; charset=UTF-8"
            r8.setRequestProperty(r9, r10)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r8.setRequestMethod(r1)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r8.setDoOutput(r3)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
        L_0x0059:
            java.lang.String r3 = "UTF-8"
            if (r18 == 0) goto L_0x008c
            java.lang.String r9 = r18.toString()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            com.onesignal.Xa$j r10 = com.onesignal.C4306Xa.C4316j.DEBUG     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r11.<init>()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r11.append(r5)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r11.append(r1)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = " SEND JSON: "
            r11.append(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r11.append(r9)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r11 = r11.toString()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            com.onesignal.C4306Xa.m17135a((com.onesignal.C4306Xa.C4316j) r10, (java.lang.String) r11)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            byte[] r9 = r9.getBytes(r3)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            int r10 = r9.length     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r8.setFixedLengthStreamingMode(r10)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.io.OutputStream r10 = r8.getOutputStream()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r10.write(r9)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
        L_0x008c:
            java.lang.String r9 = "PREFS_OS_ETAG_PREFIX_"
            if (r4 == 0) goto L_0x00c2
            java.lang.String r10 = com.onesignal.C4370gb.f12909a     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r11.<init>()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r11.append(r9)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r11.append(r4)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r11 = r11.toString()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r10 = com.onesignal.C4370gb.m17351a((java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r6)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            if (r10 == 0) goto L_0x00c2
            java.lang.String r11 = "if-none-match"
            r8.setRequestProperty(r11, r10)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            com.onesignal.Xa$j r11 = com.onesignal.C4306Xa.C4316j.DEBUG     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r12.<init>()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r13 = "OneSignalRestClient: Adding header if-none-match: "
            r12.append(r13)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r12.append(r10)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r10 = r12.toString()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            com.onesignal.C4306Xa.m17135a((com.onesignal.C4306Xa.C4316j) r11, (java.lang.String) r10)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
        L_0x00c2:
            int r7 = r8.getResponseCode()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            com.onesignal.Xa$j r10 = com.onesignal.C4306Xa.C4316j.VERBOSE     // Catch:{ Throwable -> 0x024c, all -> 0x0250 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x024c, all -> 0x0250 }
            r11.<init>()     // Catch:{ Throwable -> 0x024c, all -> 0x0250 }
            java.lang.String r12 = "OneSignalRestClient: After con.getResponseCode to: https://onesignal.com/api/v1/"
            r11.append(r12)     // Catch:{ Throwable -> 0x024c, all -> 0x0250 }
            r11.append(r0)     // Catch:{ Throwable -> 0x024c, all -> 0x0250 }
            java.lang.String r11 = r11.toString()     // Catch:{ Throwable -> 0x024c, all -> 0x0250 }
            com.onesignal.C4306Xa.m17135a((com.onesignal.C4306Xa.C4316j) r10, (java.lang.String) r11)     // Catch:{ Throwable -> 0x024c, all -> 0x0250 }
            r10 = 200(0xc8, float:2.8E-43)
            java.lang.String r11 = " RECEIVED JSON: "
            java.lang.String r12 = ""
            java.lang.String r13 = "GET"
            java.lang.String r14 = "\\A"
            java.lang.String r15 = "PREFS_OS_HTTP_CACHE_PREFIX_"
            if (r7 == r10) goto L_0x01a1
            r9 = 304(0x130, float:4.26E-43)
            if (r7 == r9) goto L_0x0166
            com.onesignal.Xa$j r4 = com.onesignal.C4306Xa.C4316j.DEBUG     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r9.<init>()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r10 = "OneSignalRestClient: Failed request to: https://onesignal.com/api/v1/"
            r9.append(r10)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r9.append(r0)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r0 = r9.toString()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            com.onesignal.C4306Xa.m17135a((com.onesignal.C4306Xa.C4316j) r4, (java.lang.String) r0)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.io.InputStream r0 = r8.getErrorStream()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            if (r0 != 0) goto L_0x010e
            java.io.InputStream r0 = r8.getInputStream()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
        L_0x010e:
            if (r0 == 0) goto L_0x0141
            java.util.Scanner r4 = new java.util.Scanner     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r4.<init>(r0, r3)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.util.Scanner r0 = r4.useDelimiter(r14)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            boolean r0 = r0.hasNext()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            if (r0 == 0) goto L_0x0123
            java.lang.String r12 = r4.next()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
        L_0x0123:
            r4.close()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            com.onesignal.Xa$j r0 = com.onesignal.C4306Xa.C4316j.WARN     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r3.<init>()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r3.append(r5)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r3.append(r1)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r3.append(r11)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r3.append(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
        L_0x013d:
            com.onesignal.C4306Xa.m17135a((com.onesignal.C4306Xa.C4316j) r0, (java.lang.String) r3)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            goto L_0x0160
        L_0x0141:
            com.onesignal.Xa$j r0 = com.onesignal.C4306Xa.C4316j.WARN     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r3.<init>()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r3.append(r5)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r3.append(r1)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r4 = " HTTP Code: "
            r3.append(r4)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r3.append(r7)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r4 = " No response body!"
            r3.append(r4)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            goto L_0x013d
        L_0x0160:
            java.lang.Thread r0 = m17498a(r2, r7, r6, r6)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            goto L_0x0242
        L_0x0166:
            java.lang.String r0 = com.onesignal.C4370gb.f12909a     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r3.<init>()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r3.append(r15)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r3.append(r4)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r0 = com.onesignal.C4370gb.m17351a((java.lang.String) r0, (java.lang.String) r3, (java.lang.String) r6)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            com.onesignal.Xa$j r3 = com.onesignal.C4306Xa.C4316j.DEBUG     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r4.<init>()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            if (r1 != 0) goto L_0x0188
            goto L_0x0189
        L_0x0188:
            r13 = r1
        L_0x0189:
            r4.append(r13)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r9 = " - Using Cached response due to 304: "
            r4.append(r9)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r4.append(r0)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            com.onesignal.C4306Xa.m17135a((com.onesignal.C4306Xa.C4316j) r3, (java.lang.String) r4)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.Thread r0 = m17499a(r2, r0)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            goto L_0x0242
        L_0x01a1:
            com.onesignal.Xa$j r10 = com.onesignal.C4306Xa.C4316j.DEBUG     // Catch:{ Throwable -> 0x024c, all -> 0x0250 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x024c, all -> 0x0250 }
            r6.<init>()     // Catch:{ Throwable -> 0x024c, all -> 0x0250 }
            r18 = r7
            java.lang.String r7 = "OneSignalRestClient: Successfully finished request to: https://onesignal.com/api/v1/"
            r6.append(r7)     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            r6.append(r0)     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            java.lang.String r0 = r6.toString()     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            com.onesignal.C4306Xa.m17135a((com.onesignal.C4306Xa.C4316j) r10, (java.lang.String) r0)     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            java.io.InputStream r0 = r8.getInputStream()     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            java.util.Scanner r6 = new java.util.Scanner     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            r6.<init>(r0, r3)     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            java.util.Scanner r0 = r6.useDelimiter(r14)     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            boolean r0 = r0.hasNext()     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            if (r0 == 0) goto L_0x01d0
            java.lang.String r12 = r6.next()     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
        L_0x01d0:
            r6.close()     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            com.onesignal.Xa$j r0 = com.onesignal.C4306Xa.C4316j.DEBUG     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            r3.<init>()     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            r3.append(r5)     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            if (r1 != 0) goto L_0x01e0
            goto L_0x01e1
        L_0x01e0:
            r13 = r1
        L_0x01e1:
            r3.append(r13)     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            r3.append(r11)     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            r3.append(r12)     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            com.onesignal.C4306Xa.m17135a((com.onesignal.C4306Xa.C4316j) r0, (java.lang.String) r3)     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            if (r4 == 0) goto L_0x023e
            java.lang.String r0 = "etag"
            java.lang.String r0 = r8.getHeaderField(r0)     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            if (r0 == 0) goto L_0x023e
            com.onesignal.Xa$j r3 = com.onesignal.C4306Xa.C4316j.DEBUG     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            r6.<init>()     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            java.lang.String r7 = "OneSignalRestClient: Response has etag of "
            r6.append(r7)     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            r6.append(r0)     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            java.lang.String r7 = " so caching the response."
            r6.append(r7)     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            com.onesignal.C4306Xa.m17135a((com.onesignal.C4306Xa.C4316j) r3, (java.lang.String) r6)     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            java.lang.String r3 = com.onesignal.C4370gb.f12909a     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            r6.<init>()     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            r6.append(r9)     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            r6.append(r4)     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            com.onesignal.C4370gb.m17359b((java.lang.String) r3, (java.lang.String) r6, (java.lang.String) r0)     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            java.lang.String r0 = com.onesignal.C4370gb.f12909a     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            r3.<init>()     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            r3.append(r15)     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            r3.append(r4)     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
            com.onesignal.C4370gb.m17359b((java.lang.String) r0, (java.lang.String) r3, (java.lang.String) r12)     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
        L_0x023e:
            java.lang.Thread r0 = m17499a(r2, r12)     // Catch:{ Throwable -> 0x0248, all -> 0x0250 }
        L_0x0242:
            if (r8 == 0) goto L_0x02a5
            r8.disconnect()
            goto L_0x02a5
        L_0x0248:
            r0 = move-exception
            r7 = r18
            goto L_0x0253
        L_0x024c:
            r0 = move-exception
            r18 = r7
            goto L_0x0253
        L_0x0250:
            r0 = move-exception
            goto L_0x02a8
        L_0x0252:
            r0 = move-exception
        L_0x0253:
            r6 = r8
            goto L_0x025a
        L_0x0255:
            r0 = move-exception
            r8 = 0
            goto L_0x02a8
        L_0x0258:
            r0 = move-exception
            r6 = 0
        L_0x025a:
            boolean r3 = r0 instanceof java.net.ConnectException     // Catch:{ all -> 0x02a6 }
            if (r3 != 0) goto L_0x027d
            boolean r3 = r0 instanceof java.net.UnknownHostException     // Catch:{ all -> 0x02a6 }
            if (r3 == 0) goto L_0x0263
            goto L_0x027d
        L_0x0263:
            com.onesignal.Xa$j r3 = com.onesignal.C4306Xa.C4316j.WARN     // Catch:{ all -> 0x02a6 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a6 }
            r4.<init>()     // Catch:{ all -> 0x02a6 }
            r4.append(r5)     // Catch:{ all -> 0x02a6 }
            r4.append(r1)     // Catch:{ all -> 0x02a6 }
            java.lang.String r1 = " Error thrown from network stack. "
            r4.append(r1)     // Catch:{ all -> 0x02a6 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x02a6 }
            com.onesignal.C4306Xa.m17136a((com.onesignal.C4306Xa.C4316j) r3, (java.lang.String) r1, (java.lang.Throwable) r0)     // Catch:{ all -> 0x02a6 }
            goto L_0x029b
        L_0x027d:
            com.onesignal.Xa$j r1 = com.onesignal.C4306Xa.C4316j.INFO     // Catch:{ all -> 0x02a6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a6 }
            r3.<init>()     // Catch:{ all -> 0x02a6 }
            java.lang.String r4 = "OneSignalRestClient: Could not send last request, device is offline. Throwable: "
            r3.append(r4)     // Catch:{ all -> 0x02a6 }
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x02a6 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x02a6 }
            r3.append(r4)     // Catch:{ all -> 0x02a6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02a6 }
            com.onesignal.C4306Xa.m17135a((com.onesignal.C4306Xa.C4316j) r1, (java.lang.String) r3)     // Catch:{ all -> 0x02a6 }
        L_0x029b:
            r1 = 0
            java.lang.Thread r0 = m17498a(r2, r7, r1, r0)     // Catch:{ all -> 0x02a6 }
            if (r6 == 0) goto L_0x02a5
            r6.disconnect()
        L_0x02a5:
            return r0
        L_0x02a6:
            r0 = move-exception
            r8 = r6
        L_0x02a8:
            if (r8 == 0) goto L_0x02ad
            r8.disconnect()
        L_0x02ad:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C4416rb.m17509d(java.lang.String, java.lang.String, org.json.JSONObject, com.onesignal.rb$a, int, java.lang.String):java.lang.Thread");
    }

    /* renamed from: d */
    public static void m17510d(String str, JSONObject jSONObject, C4417a aVar) {
        m17507c(str, HttpPut.METHOD_NAME, jSONObject, aVar, 120000, (String) null);
    }
}
