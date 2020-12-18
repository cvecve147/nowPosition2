package p101d.p191i.p192a.p200e;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.http.client.methods.HttpGet;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: d.i.a.e.b */
public class C6016b extends Thread {

    /* renamed from: a */
    private String f16820a = "HttpRequest";

    /* renamed from: b */
    private Context f16821b;

    /* renamed from: c */
    private URL f16822c;

    /* renamed from: d */
    private String f16823d = HttpGet.METHOD_NAME;

    /* renamed from: e */
    private int f16824e = 0;

    /* renamed from: f */
    private C6018b f16825f = C6018b.HTTP;

    /* renamed from: g */
    private HashMap f16826g = new HashMap();

    /* renamed from: h */
    private List<C6017a> f16827h = new ArrayList();

    /* renamed from: i */
    private String f16828i;

    /* renamed from: d.i.a.e.b$a */
    public interface C6017a {
        /* renamed from: a */
        void mo15792a(int i, String str, long j);

        /* renamed from: a */
        void mo15793a(int i, JSONObject jSONObject, long j);
    }

    /* renamed from: d.i.a.e.b$b */
    public enum C6018b {
        HTTP
    }

    public C6016b(Context context, String str) {
        this.f16821b = context;
        try {
            this.f16822c = new URL(str);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private String m22828a(InputStream inputStream) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String str = "";
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    str = str + readLine;
                } else {
                    inputStreamReader.close();
                    return str;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r8.f16823d == org.apache.http.client.methods.HttpPut.METHOD_NAME) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0089, code lost:
        if (r8.f16826g.get("Content-Type") != "application/json") goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        if (r8.f16826g.get("Content-Type") != "application/json") goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0094, code lost:
        r3 = "{\"Status\": 503, \"Msg\":\"Service Unavailable\"}";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0097, code lost:
        r3 = "Service Unavailable";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        m22830a((int) org.apache.http.HttpStatus.SC_SERVICE_UNAVAILABLE, r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22829a() {
        /*
            r8 = this;
            java.lang.String r0 = "application/json"
            java.lang.String r1 = "Content-Type"
        L_0x0004:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            boolean r2 = r2.isInterrupted()
            if (r2 != 0) goto L_0x00a1
            r2 = 503(0x1f7, float:7.05E-43)
            java.net.URL r3 = r8.f16822c     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            java.lang.String r4 = r8.f16823d     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            r3.setRequestMethod(r4)     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            java.util.HashMap r4 = r8.f16826g     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            java.util.Set r4 = r4.keySet()     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
        L_0x0027:
            boolean r5 = r4.hasNext()     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            if (r5 == 0) goto L_0x0040
            java.lang.Object r5 = r4.next()     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            java.util.HashMap r7 = r8.f16826g     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            java.lang.Object r5 = r7.get(r5)     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            r3.setRequestProperty(r6, r5)     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            goto L_0x0027
        L_0x0040:
            java.lang.String r4 = r8.f16823d     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            java.lang.String r5 = "POST"
            if (r4 == r5) goto L_0x004c
            java.lang.String r4 = r8.f16823d     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            java.lang.String r5 = "PUT"
            if (r4 != r5) goto L_0x0062
        L_0x004c:
            java.io.BufferedWriter r4 = new java.io.BufferedWriter     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            java.io.OutputStream r6 = r3.getOutputStream()     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            r5.<init>(r6)     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            r4.<init>(r5)     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            java.lang.String r5 = r8.f16828i     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            r4.write(r5)     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            r4.close()     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
        L_0x0062:
            int r4 = r3.getResponseCode()     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L_0x006f
            java.io.InputStream r5 = r3.getInputStream()     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            goto L_0x0073
        L_0x006f:
            java.io.InputStream r5 = r3.getErrorStream()     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
        L_0x0073:
            java.lang.String r5 = r8.m22828a((java.io.InputStream) r5)     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            r8.m22830a((int) r4, (java.lang.String) r5)     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            r3.disconnect()     // Catch:{ UnknownHostException -> 0x008c, ConnectException -> 0x0083, IOException -> 0x007e }
            goto L_0x009c
        L_0x007e:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x009c
        L_0x0083:
            java.util.HashMap r3 = r8.f16826g
            java.lang.Object r3 = r3.get(r1)
            if (r3 != r0) goto L_0x0097
            goto L_0x0094
        L_0x008c:
            java.util.HashMap r3 = r8.f16826g
            java.lang.Object r3 = r3.get(r1)
            if (r3 != r0) goto L_0x0097
        L_0x0094:
            java.lang.String r3 = "{\"Status\": 503, \"Msg\":\"Service Unavailable\"}"
            goto L_0x0099
        L_0x0097:
            java.lang.String r3 = "Service Unavailable"
        L_0x0099:
            r8.m22830a((int) r2, (java.lang.String) r3)
        L_0x009c:
            r8.m22833b()
            goto L_0x0004
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p191i.p192a.p200e.C6016b.m22829a():void");
    }

    /* renamed from: a */
    private void m22830a(int i, String str) {
        boolean z = true;
        boolean z2 = this.f16826g.get("Content-Type") == "application/json";
        if (str == null) {
            z = false;
        }
        if (z2 && z) {
            try {
                m22832a(i, new JSONObject(str), getId());
                return;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        m22831a(i, str, getId());
    }

    /* renamed from: a */
    private void m22831a(int i, String str, long j) {
        for (int i2 = 0; i2 < this.f16827h.size(); i2++) {
            this.f16827h.get(i2).mo15792a(i, str, j);
        }
    }

    /* renamed from: a */
    private void m22832a(int i, JSONObject jSONObject, long j) {
        for (int i2 = 0; i2 < this.f16827h.size(); i2++) {
            this.f16827h.get(i2).mo15793a(i, jSONObject, j);
        }
    }

    /* renamed from: b */
    private void m22833b() {
        int i = this.f16824e;
        if (i != 0) {
            try {
                Thread.sleep((long) i);
                return;
            } catch (InterruptedException unused) {
            }
        }
        interrupt();
    }

    /* renamed from: a */
    public void mo15910a(C6017a aVar) {
        this.f16827h.add(aVar);
    }

    /* renamed from: a */
    public void mo15911a(String str, String str2) {
        this.f16826g.put(str, str2);
    }

    public void run() {
        if (C6015a.f16819a[this.f16825f.ordinal()] == 1) {
            m22829a();
        }
    }
}
