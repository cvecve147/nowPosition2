package p101d.p201j.p203b;

import android.os.AsyncTask;
import android.util.Log;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.apache.http.protocol.HTTP;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: d.j.b.b */
public class C6046b {

    /* renamed from: a */
    private static String f16931a = "2019.12.16.r0";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f16932b = false;

    /* renamed from: c */
    private static boolean f16933c = true;

    /* renamed from: d */
    private static final Integer f16934d = 5;

    /* renamed from: e */
    private static String f16935e = "";

    /* renamed from: f */
    private static String f16936f = "";

    /* renamed from: g */
    private static String f16937g = "";

    /* renamed from: h */
    private static String f16938h = "";

    /* renamed from: i */
    private static String f16939i = "";

    /* renamed from: j */
    private static String f16940j = "";

    /* renamed from: k */
    private final String f16941k = "STOMAPServerManager";

    /* renamed from: l */
    private Integer f16942l;

    /* renamed from: m */
    private String f16943m;

    /* renamed from: n */
    private ArrayList<Integer> f16944n = new ArrayList<>();

    /* renamed from: o */
    private String f16945o;

    /* renamed from: p */
    private String f16946p;

    /* renamed from: q */
    private String f16947q;

    /* renamed from: r */
    private String f16948r;

    /* renamed from: s */
    private Integer f16949s;

    /* renamed from: d.j.b.b$a */
    private class C6047a extends AsyncTask<String, Void, String> {
        private C6047a() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x014d  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0153  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r7) {
            /*
                r6 = this;
                java.lang.String r0 = ""
                r1 = 0
                java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x0147 }
                r3 = 0
                r3 = r7[r3]     // Catch:{ Exception -> 0x0147 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0147 }
                java.net.URLConnection r2 = r2.openConnection()     // Catch:{ Exception -> 0x0147 }
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x0147 }
                java.lang.String r1 = "POST"
                r2.setRequestMethod(r1)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r1 = "Content-Type"
                java.lang.String r3 = "application/json;charset=UTF-8"
                r2.setRequestProperty(r1, r3)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r1 = "Accept"
                java.lang.String r3 = "application/json"
                r2.setRequestProperty(r1, r3)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r1 = 1
                r2.setDoOutput(r1)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r2.setDoInput(r1)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.io.OutputStream r4 = r2.getOutputStream()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r3.<init>(r4)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r7 = r7[r1]     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r3.writeBytes(r7)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r3.flush()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r3.close()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                int r7 = r2.getResponseCode()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                int r7 = r7 / 100
                r1 = 3
                java.lang.String r3 = "STOMAPServerManager"
                if (r7 != r1) goto L_0x006e
                boolean r7 = p101d.p201j.p203b.C6046b.f16932b     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                if (r7 == 0) goto L_0x0068
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r7.<init>()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r1 = "Redirection "
                r7.append(r1)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                int r1 = r2.getResponseCode()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r7.append(r1)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                android.util.Log.i(r3, r7)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
            L_0x0068:
                if (r2 == 0) goto L_0x006d
                r2.disconnect()
            L_0x006d:
                return r0
            L_0x006e:
                int r7 = r2.getResponseCode()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                int r7 = r7 / 100
                r1 = 4
                if (r7 != r1) goto L_0x009b
                boolean r7 = p101d.p201j.p203b.C6046b.f16932b     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                if (r7 == 0) goto L_0x0095
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r7.<init>()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r1 = "Client Error "
                r7.append(r1)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                int r1 = r2.getResponseCode()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r7.append(r1)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                android.util.Log.i(r3, r7)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
            L_0x0095:
                if (r2 == 0) goto L_0x009a
                r2.disconnect()
            L_0x009a:
                return r0
            L_0x009b:
                int r7 = r2.getResponseCode()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                int r7 = r7 / 100
                r1 = 5
                if (r7 != r1) goto L_0x00c8
                boolean r7 = p101d.p201j.p203b.C6046b.f16932b     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                if (r7 == 0) goto L_0x00c2
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r7.<init>()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r1 = "Server Error "
                r7.append(r1)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                int r1 = r2.getResponseCode()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r7.append(r1)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                android.util.Log.i(r3, r7)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
            L_0x00c2:
                if (r2 == 0) goto L_0x00c7
                r2.disconnect()
            L_0x00c7:
                return r0
            L_0x00c8:
                int r7 = r2.getResponseCode()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r1 = 200(0xc8, float:2.8E-43)
                if (r7 == r1) goto L_0x00f4
                boolean r7 = p101d.p201j.p203b.C6046b.f16932b     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                if (r7 == 0) goto L_0x00ee
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r7.<init>()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r1 = "Unknown Error "
                r7.append(r1)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                int r1 = r2.getResponseCode()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r7.append(r1)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                android.util.Log.i(r3, r7)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
            L_0x00ee:
                if (r2 == 0) goto L_0x00f3
                r2.disconnect()
            L_0x00f3:
                return r0
            L_0x00f4:
                java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.io.InputStream r1 = r2.getInputStream()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r7.<init>(r1)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r1.<init>(r7)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                int r7 = r1.read()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
            L_0x0106:
                r4 = -1
                if (r7 == r4) goto L_0x011f
                char r7 = (char) r7     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                int r4 = r1.read()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r5.<init>()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r5.append(r0)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r5.append(r7)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r7 = r4
                goto L_0x0106
            L_0x011f:
                boolean r7 = p101d.p201j.p203b.C6046b.f16932b     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                if (r7 == 0) goto L_0x0139
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r7.<init>()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r1 = "HttpPostRequest result:"
                r7.append(r1)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r7.append(r0)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                android.util.Log.i(r3, r7)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
            L_0x0139:
                if (r2 == 0) goto L_0x0150
                r2.disconnect()
                goto L_0x0150
            L_0x013f:
                r7 = move-exception
                goto L_0x0151
            L_0x0141:
                r7 = move-exception
                r1 = r2
                goto L_0x0148
            L_0x0144:
                r7 = move-exception
                r2 = r1
                goto L_0x0151
            L_0x0147:
                r7 = move-exception
            L_0x0148:
                r7.printStackTrace()     // Catch:{ all -> 0x0144 }
                if (r1 == 0) goto L_0x0150
                r1.disconnect()
            L_0x0150:
                return r0
            L_0x0151:
                if (r2 == 0) goto L_0x0156
                r2.disconnect()
            L_0x0156:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p101d.p201j.p203b.C6046b.C6047a.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
        }
    }

    public C6046b(String str, String str2, String str3, Integer num) {
        if (f16932b) {
            Log.i("STOMAPServerManager", "STOMAPServerManager");
        }
        Log.i("STOMAPServerManager", "STOMAPServerManager SDK Version Code: " + f16931a);
        this.f16945o = str;
        this.f16946p = str2;
        this.f16947q = str3;
        this.f16949s = num;
    }

    /* renamed from: a */
    public Boolean mo15984a(JSONObject jSONObject) {
        if (f16932b) {
            Log.i("STOMAPServerManager", "STOMAPServerManager::sendToButterflyCloud");
        }
        C6047a aVar = new C6047a();
        jSONObject.put("apikey", this.f16945o);
        jSONObject.put("STO_user_id", this.f16943m);
        jSONObject.put("device", 2);
        jSONObject.put("history", new JSONArray(this.f16944n));
        if (f16933c) {
            jSONObject.put("debugMode", 1);
        }
        String str = (String) aVar.execute(new String[]{"http://" + f16938h + f16937g, jSONObject.toString()}).get();
        if (f16932b) {
            Log.i("STOMAPServerManager", "http://" + f16938h + f16937g);
            Log.i("STOMAPServerManager", jSONObject.toString() + " Rtn:" + str);
        }
        if (str == "" || !new JSONObject(str).getString("status").equals("Success")) {
            this.f16944n.add(-1);
            this.f16944n.remove(0);
            this.f16948r = "NA";
            return false;
        }
        int i = new JSONObject(str).getInt("data");
        this.f16944n.add(Integer.valueOf(i));
        this.f16944n.remove(0);
        if (!f16933c || i == 0) {
            this.f16948r = "NA";
        } else {
            this.f16948r = new JSONObject(str).getString("poiN");
        }
        return true;
    }

    /* renamed from: b */
    public Boolean mo15985b() {
        if (f16932b) {
            Log.i("STOMAPServerManager", "STOMAPServerManager::authentication");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("apikey", this.f16945o);
        jSONObject.put("AAID", this.f16946p);
        jSONObject.put("user_id_type", this.f16949s);
        jSONObject.put("business_user_id", this.f16947q);
        C6047a aVar = new C6047a();
        String str = (String) aVar.execute(new String[]{"http://" + f16936f + f16935e, jSONObject.toString()}).get();
        if (f16932b) {
            Log.i("STOMAPServerManager", "http://" + f16936f + f16935e);
            Log.i("STOMAPServerManager", jSONObject.toString() + " Rtn:" + str);
        }
        if (str == "") {
            return false;
        }
        JSONObject jSONObject2 = new JSONObject(str);
        this.f16943m = (String) jSONObject2.get("STO_user_id");
        this.f16942l = Integer.valueOf(((Integer) jSONObject2.get("frequency")).intValue() * 1000);
        return true;
    }

    /* renamed from: c */
    public Integer mo15986c() {
        return this.f16942l;
    }

    /* renamed from: d */
    public Boolean mo15987d() {
        if (f16932b) {
            Log.i("STOMAPServerManager", "STOMAPServerManager::initialize");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("apikey", this.f16945o);
        C6047a aVar = new C6047a();
        String str = (String) aVar.execute(new String[]{"http://" + "distributor.sto-tek.com:3001" + "/api/ips/top_distributor", jSONObject.toString()}).get();
        if (f16932b) {
            Log.i("STOMAPServerManager", "http://" + "distributor.sto-tek.com:3001" + "/api/ips/top_distributor");
            StringBuilder sb = new StringBuilder();
            sb.append("Rtn:");
            sb.append(str);
            Log.i("STOMAPServerManager", sb.toString());
        }
        if (str == "") {
            return false;
        }
        JSONObject jSONObject2 = new JSONObject(str);
        f16935e = (String) jSONObject2.get("URL_BUTTERFLY_AUTH_POSTFIX");
        f16936f = (String) jSONObject2.get("URL_BUTTERFLY_AUTH_IP");
        f16937g = (String) jSONObject2.get("URL_BUTTERFLY_CLOUD_POSTFIX");
        f16938h = (String) jSONObject2.get("URL_BUTTERFLY_CLOUD_IP");
        f16939i = (String) jSONObject2.get("URL_BUTTERFLY_FEEDBACK_POSTFIX");
        f16940j = (String) jSONObject2.get("URL_BUTTERFLY_FEEDBACK_IP");
        for (int i = 0; i < f16934d.intValue(); i++) {
            this.f16944n.add(-1);
        }
        return true;
    }

    /* renamed from: e */
    public Boolean mo15988e() {
        if (f16932b) {
            Log.i("STOMAPServerManager", "STOMAPServerManager::sendToFeedback");
        }
        if (f16933c && !f16940j.equals("")) {
            C6047a aVar = new C6047a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Feedback", this.f16945o);
            jSONObject.put("ID", this.f16943m);
            String str = this.f16948r;
            try {
                str = URLEncoder.encode(str, HTTP.UTF_8);
            } catch (Exception e) {
                e.printStackTrace();
            }
            jSONObject.put("POI", str);
            String str2 = (String) aVar.execute(new String[]{"http://" + f16940j + f16939i, jSONObject.toString()}).get();
            if (f16932b) {
                Log.i("STOMAPServerManager", "http://" + f16940j + f16939i);
                Log.i("STOMAPServerManager", jSONObject.toString() + " Rtn:" + str2);
            }
        }
        return true;
    }
}
