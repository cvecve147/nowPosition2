package p101d.p119e.p120a.p121a;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.StatusLine;
import org.apache.http.impl.cookie.DateUtils;
import org.apache.http.protocol.HttpRequestExecutor;
import p101d.p119e.p120a.C5267b;
import p101d.p119e.p120a.C5276i;
import p101d.p119e.p120a.C5284q;
import p101d.p119e.p120a.C5292u;
import p101d.p119e.p120a.C5293v;
import p101d.p119e.p120a.C5295x;
import p101d.p119e.p120a.C5296y;

/* renamed from: d.e.a.a.a */
public class C5249a implements C5276i {

    /* renamed from: a */
    protected static final boolean f14867a = C5296y.f14977b;

    /* renamed from: b */
    private static int f14868b = HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE;

    /* renamed from: c */
    private static int f14869c = SVGParser.ENTITY_WATCH_BUFFER_SIZE;

    /* renamed from: d */
    protected final C5259h f14870d;

    /* renamed from: e */
    protected final C5251c f14871e;

    public C5249a(C5259h hVar) {
        this(hVar, new C5251c(f14869c));
    }

    public C5249a(C5259h hVar, C5251c cVar) {
        this.f14870d = hVar;
        this.f14871e = cVar;
    }

    /* renamed from: a */
    protected static Map<String, String> m20327a(Header[] headerArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }

    /* renamed from: a */
    private void m20328a(long j, C5284q<?> qVar, byte[] bArr, StatusLine statusLine) {
        if (f14867a || j > ((long) f14868b)) {
            Object[] objArr = new Object[5];
            objArr[0] = qVar;
            objArr[1] = Long.valueOf(j);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(statusLine.getStatusCode());
            objArr[4] = Integer.valueOf(qVar.mo14644u().mo14609b());
            C5296y.m20469a("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    /* renamed from: a */
    private static void m20329a(String str, C5284q<?> qVar, C5295x xVar) {
        C5292u u = qVar.mo14644u();
        int v = qVar.mo14645v();
        try {
            u.mo14608a(xVar);
            qVar.mo14626a(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(v)}));
        } catch (C5295x e) {
            qVar.mo14626a(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(v)}));
            throw e;
        }
    }

    /* renamed from: a */
    private void m20330a(Map<String, String> map, C5267b.C5268a aVar) {
        if (aVar != null) {
            String str = aVar.f14899b;
            if (str != null) {
                map.put(HttpHeaders.IF_NONE_MATCH, str);
            }
            long j = aVar.f14901d;
            if (j > 0) {
                map.put(HttpHeaders.IF_MODIFIED_SINCE, DateUtils.formatDate(new Date(j)));
            }
        }
    }

    /* renamed from: a */
    private byte[] m20331a(HttpEntity httpEntity) {
        C5264l lVar = new C5264l(this.f14871e, (int) httpEntity.getContentLength());
        byte[] bArr = null;
        try {
            InputStream content = httpEntity.getContent();
            if (content != null) {
                bArr = this.f14871e.mo14575a(1024);
                while (true) {
                    int read = content.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    lVar.write(bArr, 0, read);
                }
                return lVar.toByteArray();
            }
            throw new C5293v();
        } finally {
            try {
                httpEntity.consumeContent();
            } catch (IOException unused) {
                C5296y.m20472c("Error occured when calling consumingContent", new Object[0]);
            }
            this.f14871e.mo14574a(bArr);
            lVar.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0071, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0072, code lost:
        r17 = null;
        r18 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ce, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d1, code lost:
        r23 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d3, code lost:
        r17 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d7, code lost:
        r23 = r5;
        r17 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00db, code lost:
        r18 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00de, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00df, code lost:
        r18 = r1;
        r17 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ec, code lost:
        r1 = r14.getStatusLine().getStatusCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f6, code lost:
        if (r1 == 301) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fb, code lost:
        r3 = new java.lang.Object[]{java.lang.Integer.valueOf(r1), r25.mo14647x()};
        r2 = "Unexpected response code %d for %s";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010c, code lost:
        r3 = new java.lang.Object[]{r25.mo14638n(), r25.mo14647x()};
        r2 = "Request at %s has been redirected to %s";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011c, code lost:
        p101d.p119e.p120a.C5296y.m20471b(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011f, code lost:
        if (r17 != null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0121, code lost:
        r15 = new p101d.p119e.p120a.C5279l(r1, r17, r18, false, android.os.SystemClock.elapsedRealtime() - r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0133, code lost:
        if (r1 == 401) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x013a, code lost:
        if (r1 == 301) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0144, code lost:
        throw new p101d.p119e.p120a.C5293v(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0145, code lost:
        r1 = new p101d.p119e.p120a.C5282o(r15);
        r0 = "redirect";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014d, code lost:
        r1 = new p101d.p119e.p120a.C5248a(r15);
        r0 = "auth";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0154, code lost:
        m20329a(r0, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x015e, code lost:
        throw new p101d.p119e.p120a.C5278k(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0164, code lost:
        throw new p101d.p119e.p120a.C5280m(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0165, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0180, code lost:
        throw new java.lang.RuntimeException("Bad URL " + r25.mo14647x(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0181, code lost:
        r0 = new p101d.p119e.p120a.C5294w();
        r1 = "connection";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0189, code lost:
        r0 = new p101d.p119e.p120a.C5294w();
        r1 = "socket";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0190, code lost:
        m20329a(r1, r8, r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0165 A[ExcHandler: MalformedURLException (r0v3 'e' java.net.MalformedURLException A[CUSTOM_DECLARE]), Splitter:B:2:0x0012] */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[ExcHandler: ConnectTimeoutException (unused org.apache.http.conn.ConnectTimeoutException), SYNTHETIC, Splitter:B:2:0x0012] */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:2:0x0012] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x015f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p101d.p119e.p120a.C5279l mo14571a(p101d.p119e.p120a.C5284q<?> r25) {
        /*
            r24 = this;
            r7 = r24
            r8 = r25
            long r9 = android.os.SystemClock.elapsedRealtime()
        L_0x0008:
            java.util.Map r1 = java.util.Collections.emptyMap()
            r2 = 0
            r11 = 302(0x12e, float:4.23E-43)
            r12 = 0
            r13 = 301(0x12d, float:4.22E-43)
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00e4 }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00e4 }
            d.e.a.b$a r3 = r25.mo14631c()     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00e4 }
            r7.m20330a(r0, r3)     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00e4 }
            d.e.a.a.h r3 = r7.f14870d     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00e4 }
            org.apache.http.HttpResponse r14 = r3.mo14585a(r8, r0)     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00e4 }
            org.apache.http.StatusLine r6 = r14.getStatusLine()     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00de }
            int r0 = r6.getStatusCode()     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00de }
            org.apache.http.Header[] r3 = r14.getAllHeaders()     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00de }
            java.util.Map r5 = m20327a((org.apache.http.Header[]) r3)     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00de }
            r1 = 304(0x130, float:4.26E-43)
            if (r0 != r1) goto L_0x0078
            d.e.a.b$a r0 = r25.mo14631c()     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x0071 }
            if (r0 != 0) goto L_0x0053
            d.e.a.l r0 = new d.e.a.l     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x0071 }
            r16 = 304(0x130, float:4.26E-43)
            r17 = 0
            r19 = 1
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x0071 }
            long r20 = r3 - r9
            r15 = r0
            r18 = r5
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x0071 }
            return r0
        L_0x0053:
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.f14904g     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x0071 }
            r1.putAll(r5)     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x0071 }
            d.e.a.l r1 = new d.e.a.l     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x0071 }
            r16 = 304(0x130, float:4.26E-43)
            byte[] r3 = r0.f14898a     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x0071 }
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f14904g     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x0071 }
            r19 = 1
            long r17 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x0071 }
            long r20 = r17 - r9
            r15 = r1
            r17 = r3
            r18 = r0
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x0071 }
            return r1
        L_0x0071:
            r0 = move-exception
            r17 = r2
            r18 = r5
            goto L_0x00ea
        L_0x0078:
            if (r0 == r13) goto L_0x007c
            if (r0 != r11) goto L_0x0087
        L_0x007c:
            java.lang.String r1 = "Location"
            java.lang.Object r1 = r5.get(r1)     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00d6 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00d6 }
            r8.mo14632c(r1)     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00d6 }
        L_0x0087:
            org.apache.http.HttpEntity r1 = r14.getEntity()     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00d6 }
            if (r1 == 0) goto L_0x0096
            org.apache.http.HttpEntity r1 = r14.getEntity()     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x0071 }
            byte[] r1 = r7.m20331a((org.apache.http.HttpEntity) r1)     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x0071 }
            goto L_0x0098
        L_0x0096:
            byte[] r1 = new byte[r12]     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00d6 }
        L_0x0098:
            r22 = r1
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00d0 }
            long r2 = r1 - r9
            r1 = r24
            r4 = r25
            r23 = r5
            r5 = r22
            r1.m20328a(r2, r4, r5, r6)     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00ce }
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L_0x00c8
            r1 = 299(0x12b, float:4.19E-43)
            if (r0 > r1) goto L_0x00c8
            d.e.a.l r1 = new d.e.a.l     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00ce }
            r19 = 0
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00ce }
            long r20 = r2 - r9
            r15 = r1
            r16 = r0
            r17 = r22
            r18 = r23
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00ce }
            return r1
        L_0x00c8:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00ce }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00ce }
            throw r0     // Catch:{ SocketTimeoutException -> 0x0189, ConnectTimeoutException -> 0x0181, MalformedURLException -> 0x0165, IOException -> 0x00ce }
        L_0x00ce:
            r0 = move-exception
            goto L_0x00d3
        L_0x00d0:
            r0 = move-exception
            r23 = r5
        L_0x00d3:
            r17 = r22
            goto L_0x00db
        L_0x00d6:
            r0 = move-exception
            r23 = r5
            r17 = r2
        L_0x00db:
            r18 = r23
            goto L_0x00ea
        L_0x00de:
            r0 = move-exception
            r18 = r1
            r17 = r2
            goto L_0x00ea
        L_0x00e4:
            r0 = move-exception
            r18 = r1
            r14 = r2
            r17 = r14
        L_0x00ea:
            if (r14 == 0) goto L_0x015f
            org.apache.http.StatusLine r1 = r14.getStatusLine()
            int r1 = r1.getStatusCode()
            r2 = 1
            r3 = 2
            if (r1 == r13) goto L_0x010c
            if (r1 != r11) goto L_0x00fb
            goto L_0x010c
        L_0x00fb:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r3[r12] = r4
            java.lang.String r4 = r25.mo14647x()
            r3[r2] = r4
            java.lang.String r2 = "Unexpected response code %d for %s"
            goto L_0x011c
        L_0x010c:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r25.mo14638n()
            r3[r12] = r4
            java.lang.String r4 = r25.mo14647x()
            r3[r2] = r4
            java.lang.String r2 = "Request at %s has been redirected to %s"
        L_0x011c:
            p101d.p119e.p120a.C5296y.m20471b(r2, r3)
            if (r17 == 0) goto L_0x0159
            d.e.a.l r0 = new d.e.a.l
            r19 = 0
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r20 = r2 - r9
            r15 = r0
            r16 = r1
            r15.<init>(r16, r17, r18, r19, r20)
            r2 = 401(0x191, float:5.62E-43)
            if (r1 == r2) goto L_0x014d
            r2 = 403(0x193, float:5.65E-43)
            if (r1 != r2) goto L_0x013a
            goto L_0x014d
        L_0x013a:
            if (r1 == r13) goto L_0x0145
            if (r1 != r11) goto L_0x013f
            goto L_0x0145
        L_0x013f:
            d.e.a.v r1 = new d.e.a.v
            r1.<init>(r0)
            throw r1
        L_0x0145:
            d.e.a.o r1 = new d.e.a.o
            r1.<init>(r0)
            java.lang.String r0 = "redirect"
            goto L_0x0154
        L_0x014d:
            d.e.a.a r1 = new d.e.a.a
            r1.<init>(r0)
            java.lang.String r0 = "auth"
        L_0x0154:
            m20329a(r0, r8, r1)
            goto L_0x0008
        L_0x0159:
            d.e.a.k r1 = new d.e.a.k
            r1.<init>(r0)
            throw r1
        L_0x015f:
            d.e.a.m r1 = new d.e.a.m
            r1.<init>(r0)
            throw r1
        L_0x0165:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Bad URL "
            r2.append(r3)
            java.lang.String r3 = r25.mo14647x()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0181:
            d.e.a.w r0 = new d.e.a.w
            r0.<init>()
            java.lang.String r1 = "connection"
            goto L_0x0190
        L_0x0189:
            d.e.a.w r0 = new d.e.a.w
            r0.<init>()
            java.lang.String r1 = "socket"
        L_0x0190:
            m20329a(r1, r8, r0)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p119e.p120a.p121a.C5249a.mo14571a(d.e.a.q):d.e.a.l");
    }
}
