package com.google.android.gms.internal.ads;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.protocol.HTTP;

/* renamed from: com.google.android.gms.internal.ads.Zh */
public final class C2889Zh extends C2828Xc {

    /* renamed from: a */
    private final C3664zi f8687a;

    /* renamed from: b */
    private final SSLSocketFactory f8688b;

    public C2889Zh() {
        this((C3664zi) null);
    }

    private C2889Zh(C3664zi ziVar) {
        this((C3664zi) null, (SSLSocketFactory) null);
    }

    private C2889Zh(C3664zi ziVar, SSLSocketFactory sSLSocketFactory) {
        this.f8687a = null;
        this.f8688b = null;
    }

    /* renamed from: a */
    private static InputStream m11690a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    /* renamed from: a */
    private static List<C2589Ot> m11691a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            if (next.getKey() != null) {
                for (String ot : (List) next.getValue()) {
                    arrayList.add(new C2589Ot((String) next.getKey(), ot));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m11692a(HttpURLConnection httpURLConnection, C2216Bw<?> bw) {
        byte[] n = bw.mo7914n();
        if (n != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", HTTP.UTF_8.length() != 0 ? "application/x-www-form-urlencoded; charset=".concat(HTTP.UTF_8) : new String("application/x-www-form-urlencoded; charset="));
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(n);
            dataOutputStream.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a9, code lost:
        r8.setRequestMethod(r0);
        m11692a(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b2, code lost:
        r8.setRequestMethod(r0);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C2860Yg mo9022b(com.google.android.gms.internal.ads.C2216Bw<?> r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            r6 = this;
            java.lang.String r0 = r7.mo7909c()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Map r2 = r7.mo7901a()
            r1.putAll(r2)
            r1.putAll(r8)
            com.google.android.gms.internal.ads.zi r8 = r6.f8687a
            if (r8 == 0) goto L_0x003a
            java.lang.String r8 = r8.mo10267a(r0)
            if (r8 != 0) goto L_0x003b
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "URL blocked by rewriter: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0030
            java.lang.String r8 = r8.concat(r0)
            goto L_0x0036
        L_0x0030:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r8)
            r8 = r0
        L_0x0036:
            r7.<init>(r8)
            throw r7
        L_0x003a:
            r8 = r0
        L_0x003b:
            java.net.URL r0 = new java.net.URL
            r0.<init>(r8)
            java.net.URLConnection r8 = r0.openConnection()
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8
            boolean r2 = java.net.HttpURLConnection.getFollowRedirects()
            r8.setInstanceFollowRedirects(r2)
            int r2 = r7.mo7916p()
            r8.setConnectTimeout(r2)
            r8.setReadTimeout(r2)
            r2 = 0
            r8.setUseCaches(r2)
            r3 = 1
            r8.setDoInput(r3)
            java.lang.String r0 = r0.getProtocol()
            java.lang.String r4 = "https"
            r4.equals(r0)
            java.util.Set r0 = r1.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0070:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            r8.addRequestProperty(r4, r5)
            goto L_0x0070
        L_0x0086:
            int r0 = r7.mo7907b()
            switch(r0) {
                case -1: goto L_0x00b5;
                case 0: goto L_0x00b0;
                case 1: goto L_0x00a7;
                case 2: goto L_0x00a4;
                case 3: goto L_0x00a1;
                case 4: goto L_0x009e;
                case 5: goto L_0x009b;
                case 6: goto L_0x0098;
                case 7: goto L_0x0095;
                default: goto L_0x008d;
            }
        L_0x008d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Unknown method type."
            r7.<init>(r8)
            throw r7
        L_0x0095:
            java.lang.String r0 = "PATCH"
            goto L_0x00a9
        L_0x0098:
            java.lang.String r0 = "TRACE"
            goto L_0x00b2
        L_0x009b:
            java.lang.String r0 = "OPTIONS"
            goto L_0x00b2
        L_0x009e:
            java.lang.String r0 = "HEAD"
            goto L_0x00b2
        L_0x00a1:
            java.lang.String r0 = "DELETE"
            goto L_0x00b2
        L_0x00a4:
            java.lang.String r0 = "PUT"
            goto L_0x00a9
        L_0x00a7:
            java.lang.String r0 = "POST"
        L_0x00a9:
            r8.setRequestMethod(r0)
            m11692a(r8, r7)
            goto L_0x00b5
        L_0x00b0:
            java.lang.String r0 = "GET"
        L_0x00b2:
            r8.setRequestMethod(r0)
        L_0x00b5:
            int r0 = r8.getResponseCode()
            r1 = -1
            if (r0 == r1) goto L_0x00fa
            int r7 = r7.mo7907b()
            r1 = 4
            if (r7 == r1) goto L_0x00d4
            r7 = 100
            if (r7 > r0) goto L_0x00cb
            r7 = 200(0xc8, float:2.8E-43)
            if (r0 < r7) goto L_0x00d4
        L_0x00cb:
            r7 = 204(0xcc, float:2.86E-43)
            if (r0 == r7) goto L_0x00d4
            r7 = 304(0x130, float:4.26E-43)
            if (r0 == r7) goto L_0x00d4
            r2 = r3
        L_0x00d4:
            if (r2 != 0) goto L_0x00e4
            com.google.android.gms.internal.ads.Yg r7 = new com.google.android.gms.internal.ads.Yg
            java.util.Map r8 = r8.getHeaderFields()
            java.util.List r8 = m11691a((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r8)
            r7.<init>(r0, r8)
            return r7
        L_0x00e4:
            com.google.android.gms.internal.ads.Yg r7 = new com.google.android.gms.internal.ads.Yg
            java.util.Map r1 = r8.getHeaderFields()
            java.util.List r1 = m11691a((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r1)
            int r2 = r8.getContentLength()
            java.io.InputStream r8 = m11690a((java.net.HttpURLConnection) r8)
            r7.<init>(r0, r1, r2, r8)
            return r7
        L_0x00fa:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Could not retrieve response code from HttpUrlConnection."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2889Zh.mo9022b(com.google.android.gms.internal.ads.Bw, java.util.Map):com.google.android.gms.internal.ads.Yg");
    }
}
