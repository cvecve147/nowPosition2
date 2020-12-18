package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import android.support.annotation.Keep;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2991by;
import com.google.android.gms.internal.ads.C3057ee;
import com.google.android.gms.internal.ads.zzang;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
@C2478La
@KeepName
public class HttpClient implements C1718E<C2991by> {
    private final Context mContext;
    private final zzang zzyf;

    @C2478La
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$a */
    static class C1722a {

        /* renamed from: a */
        private final String f5677a;

        /* renamed from: b */
        private final String f5678b;

        public C1722a(String str, String str2) {
            this.f5677a = str;
            this.f5678b = str2;
        }

        /* renamed from: a */
        public final String mo6919a() {
            return this.f5677a;
        }

        /* renamed from: b */
        public final String mo6920b() {
            return this.f5678b;
        }
    }

    @C2478La
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$b */
    static class C1723b {

        /* renamed from: a */
        private final String f5679a;

        /* renamed from: b */
        private final URL f5680b;

        /* renamed from: c */
        private final ArrayList<C1722a> f5681c;

        /* renamed from: d */
        private final String f5682d;

        C1723b(String str, URL url, ArrayList<C1722a> arrayList, String str2) {
            this.f5679a = str;
            this.f5680b = url;
            this.f5681c = arrayList;
            this.f5682d = str2;
        }

        /* renamed from: a */
        public final String mo6921a() {
            return this.f5679a;
        }

        /* renamed from: b */
        public final URL mo6922b() {
            return this.f5680b;
        }

        /* renamed from: c */
        public final ArrayList<C1722a> mo6923c() {
            return this.f5681c;
        }

        /* renamed from: d */
        public final String mo6924d() {
            return this.f5682d;
        }
    }

    @C2478La
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$c */
    class C1724c {

        /* renamed from: a */
        private final C1725d f5683a;

        /* renamed from: b */
        private final boolean f5684b;

        /* renamed from: c */
        private final String f5685c;

        public C1724c(HttpClient httpClient, boolean z, C1725d dVar, String str) {
            this.f5684b = z;
            this.f5683a = dVar;
            this.f5685c = str;
        }

        /* renamed from: a */
        public final String mo6925a() {
            return this.f5685c;
        }

        /* renamed from: b */
        public final boolean mo6926b() {
            return this.f5684b;
        }

        /* renamed from: c */
        public final C1725d mo6927c() {
            return this.f5683a;
        }
    }

    @C2478La
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$d */
    static class C1725d {

        /* renamed from: a */
        private final String f5686a;

        /* renamed from: b */
        private final int f5687b;

        /* renamed from: c */
        private final List<C1722a> f5688c;

        /* renamed from: d */
        private final String f5689d;

        C1725d(String str, int i, List<C1722a> list, String str2) {
            this.f5686a = str;
            this.f5687b = i;
            this.f5688c = list;
            this.f5689d = str2;
        }

        /* renamed from: a */
        public final String mo6928a() {
            return this.f5689d;
        }

        /* renamed from: b */
        public final int mo6929b() {
            return this.f5687b;
        }

        /* renamed from: c */
        public final String mo6930c() {
            return this.f5686a;
        }

        /* renamed from: d */
        public final Iterable<C1722a> mo6931d() {
            return this.f5688c;
        }
    }

    public HttpClient(Context context, zzang zzang) {
        this.mContext = context;
        this.zzyf = zzang;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.ads.internal.gmsg.HttpClient.C1724c zza(com.google.android.gms.ads.internal.gmsg.HttpClient.C1723b r13) {
        /*
            r12 = this;
            r0 = 0
            r1 = 0
            java.net.URL r2 = r13.mo6922b()     // Catch:{ Exception -> 0x00ee, all -> 0x00eb }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ Exception -> 0x00ee, all -> 0x00eb }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x00ee, all -> 0x00eb }
            com.google.android.gms.internal.ads.ge r3 = com.google.android.gms.ads.internal.C1697X.m7698e()     // Catch:{ Exception -> 0x00e9 }
            android.content.Context r4 = r12.mContext     // Catch:{ Exception -> 0x00e9 }
            com.google.android.gms.internal.ads.zzang r5 = r12.zzyf     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r5 = r5.f10855a     // Catch:{ Exception -> 0x00e9 }
            r3.mo9450a((android.content.Context) r4, (java.lang.String) r5, (boolean) r0, (java.net.HttpURLConnection) r2)     // Catch:{ Exception -> 0x00e9 }
            java.util.ArrayList r3 = r13.mo6923c()     // Catch:{ Exception -> 0x00e9 }
            int r4 = r3.size()     // Catch:{ Exception -> 0x00e9 }
            r5 = r0
        L_0x0022:
            if (r5 >= r4) goto L_0x0038
            java.lang.Object r6 = r3.get(r5)     // Catch:{ Exception -> 0x00e9 }
            int r5 = r5 + 1
            com.google.android.gms.ads.internal.gmsg.HttpClient$a r6 = (com.google.android.gms.ads.internal.gmsg.HttpClient.C1722a) r6     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r7 = r6.mo6919a()     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r6 = r6.mo6920b()     // Catch:{ Exception -> 0x00e9 }
            r2.addRequestProperty(r7, r6)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x0022
        L_0x0038:
            java.lang.String r3 = r13.mo6924d()     // Catch:{ Exception -> 0x00e9 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00e9 }
            r4 = 1
            if (r3 != 0) goto L_0x0062
            r2.setDoOutput(r4)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r3 = r13.mo6924d()     // Catch:{ Exception -> 0x00e9 }
            byte[] r3 = r3.getBytes()     // Catch:{ Exception -> 0x00e9 }
            int r5 = r3.length     // Catch:{ Exception -> 0x00e9 }
            r2.setFixedLengthStreamingMode(r5)     // Catch:{ Exception -> 0x00e9 }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00e9 }
            java.io.OutputStream r6 = r2.getOutputStream()     // Catch:{ Exception -> 0x00e9 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00e9 }
            r5.write(r3)     // Catch:{ Exception -> 0x00e9 }
            r5.close()     // Catch:{ Exception -> 0x00e9 }
            goto L_0x0063
        L_0x0062:
            r3 = r1
        L_0x0063:
            com.google.android.gms.internal.ads.vf r5 = new com.google.android.gms.internal.ads.vf     // Catch:{ Exception -> 0x00e9 }
            r5.<init>()     // Catch:{ Exception -> 0x00e9 }
            r5.mo10125a((java.net.HttpURLConnection) r2, (byte[]) r3)     // Catch:{ Exception -> 0x00e9 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00e9 }
            r3.<init>()     // Catch:{ Exception -> 0x00e9 }
            java.util.Map r6 = r2.getHeaderFields()     // Catch:{ Exception -> 0x00e9 }
            if (r6 == 0) goto L_0x00b3
            java.util.Map r6 = r2.getHeaderFields()     // Catch:{ Exception -> 0x00e9 }
            java.util.Set r6 = r6.entrySet()     // Catch:{ Exception -> 0x00e9 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x00e9 }
        L_0x0082:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x00e9 }
            if (r7 == 0) goto L_0x00b3
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x00e9 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ Exception -> 0x00e9 }
            java.lang.Object r8 = r7.getValue()     // Catch:{ Exception -> 0x00e9 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ Exception -> 0x00e9 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x00e9 }
        L_0x0098:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x00e9 }
            if (r9 == 0) goto L_0x0082
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x00e9 }
            com.google.android.gms.ads.internal.gmsg.HttpClient$a r10 = new com.google.android.gms.ads.internal.gmsg.HttpClient$a     // Catch:{ Exception -> 0x00e9 }
            java.lang.Object r11 = r7.getKey()     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x00e9 }
            r10.<init>(r11, r9)     // Catch:{ Exception -> 0x00e9 }
            r3.add(r10)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x0098
        L_0x00b3:
            com.google.android.gms.ads.internal.gmsg.HttpClient$d r6 = new com.google.android.gms.ads.internal.gmsg.HttpClient$d     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r13 = r13.mo6921a()     // Catch:{ Exception -> 0x00e9 }
            int r7 = r2.getResponseCode()     // Catch:{ Exception -> 0x00e9 }
            com.google.android.gms.ads.internal.C1697X.m7698e()     // Catch:{ Exception -> 0x00e9 }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00e9 }
            java.io.InputStream r9 = r2.getInputStream()     // Catch:{ Exception -> 0x00e9 }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r8 = com.google.android.gms.internal.ads.C3114ge.m12402a((java.io.InputStreamReader) r8)     // Catch:{ Exception -> 0x00e9 }
            r6.<init>(r13, r7, r3, r8)     // Catch:{ Exception -> 0x00e9 }
            int r13 = r6.mo6929b()     // Catch:{ Exception -> 0x00e9 }
            r5.mo10124a((java.net.HttpURLConnection) r2, (int) r13)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r13 = r6.mo6928a()     // Catch:{ Exception -> 0x00e9 }
            r5.mo10122a((java.lang.String) r13)     // Catch:{ Exception -> 0x00e9 }
            com.google.android.gms.ads.internal.gmsg.HttpClient$c r13 = new com.google.android.gms.ads.internal.gmsg.HttpClient$c     // Catch:{ Exception -> 0x00e9 }
            r13.<init>(r12, r4, r6, r1)     // Catch:{ Exception -> 0x00e9 }
            if (r2 == 0) goto L_0x00e8
            r2.disconnect()
        L_0x00e8:
            return r13
        L_0x00e9:
            r13 = move-exception
            goto L_0x00f0
        L_0x00eb:
            r13 = move-exception
            r2 = r1
            goto L_0x0100
        L_0x00ee:
            r13 = move-exception
            r2 = r1
        L_0x00f0:
            com.google.android.gms.ads.internal.gmsg.HttpClient$c r3 = new com.google.android.gms.ads.internal.gmsg.HttpClient$c     // Catch:{ all -> 0x00ff }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x00ff }
            r3.<init>(r12, r0, r1, r13)     // Catch:{ all -> 0x00ff }
            if (r2 == 0) goto L_0x00fe
            r2.disconnect()
        L_0x00fe:
            return r3
        L_0x00ff:
            r13 = move-exception
        L_0x0100:
            if (r2 == 0) goto L_0x0105
            r2.disconnect()
        L_0x0105:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.gmsg.HttpClient.zza(com.google.android.gms.ads.internal.gmsg.HttpClient$b):com.google.android.gms.ads.internal.gmsg.HttpClient$c");
    }

    private static JSONObject zza(C1725d dVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_request_id", dVar.mo6930c());
            if (dVar.mo6928a() != null) {
                jSONObject.put("body", dVar.mo6928a());
            }
            JSONArray jSONArray = new JSONArray();
            for (C1722a next : dVar.mo6931d()) {
                jSONArray.put(new JSONObject().put("key", next.mo6919a()).put("value", next.mo6920b()));
            }
            jSONObject.put("headers", jSONArray);
            jSONObject.put("response_code", dVar.mo6929b());
        } catch (JSONException e) {
            C2227Cf.m9533b("Error constructing JSON for http response.", e);
        }
        return jSONObject;
    }

    private static C1723b zzc(JSONObject jSONObject) {
        String optString = jSONObject.optString("http_request_id");
        String optString2 = jSONObject.optString("url");
        URL url = null;
        String optString3 = jSONObject.optString("post_body", (String) null);
        try {
            url = new URL(optString2);
        } catch (MalformedURLException e) {
            C2227Cf.m9533b("Error constructing http request.", e);
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("headers");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(new C1722a(optJSONObject.optString("key"), optJSONObject.optString("value")));
            }
        }
        return new C1723b(optString, url, arrayList, optString3);
    }

    @Keep
    @KeepName
    public JSONObject send(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            String optString = jSONObject.optString("http_request_id");
            C1724c zza = zza(zzc(jSONObject));
            if (zza.mo6926b()) {
                jSONObject2.put("response", zza(zza.mo6927c()));
                jSONObject2.put("success", true);
            } else {
                jSONObject2.put("response", new JSONObject().put("http_request_id", optString));
                jSONObject2.put("success", false);
                jSONObject2.put("reason", zza.mo6925a());
            }
        } catch (Exception e) {
            C2227Cf.m9533b("Error executing http request.", e);
            try {
                jSONObject2.put("response", new JSONObject().put("http_request_id", ""));
                jSONObject2.put("success", false);
                jSONObject2.put("reason", e.toString());
            } catch (JSONException e2) {
                C2227Cf.m9533b("Error executing http request.", e2);
            }
        }
        return jSONObject2;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C3057ee.m12269a((Runnable) new C1719F(this, map, (C2991by) obj));
    }
}
