package p101d.p191i.p192a;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p101d.p119e.p120a.C5284q;
import p101d.p119e.p120a.C5286r;
import p101d.p119e.p120a.p121a.C5266n;
import p101d.p191i.p192a.p200e.C6021e;

/* renamed from: d.i.a.a */
public class C5931a {

    /* renamed from: A */
    public String f16395A = "A014402";

    /* renamed from: B */
    private String f16396B = "http://app.youparking.com.tw/carstatus.aspx?gotexitmsg=LICENCE&Cid=CID";

    /* renamed from: C */
    private String f16397C = "https://tms.sto-tek.com/api/registerCarLicense?carLicense=LICENCE&Cid=CID&deviceID=TOKEN&deviceTypeID=1";

    /* renamed from: D */
    public String f16398D = "lpr";

    /* renamed from: E */
    public String f16399E = "pnr";

    /* renamed from: F */
    public String f16400F = "0";

    /* renamed from: G */
    public String f16401G = "1";

    /* renamed from: H */
    private String f16402H = "https://tms.sto-tek.com/api/floorAlert?building=BUILDINGID&floor=FLOORID&x=POS_X&y=POS_Y&deviceID=DEVICEID";

    /* renamed from: I */
    public JSONArray f16403I = new JSONArray();

    /* renamed from: J */
    private C5932a f16404J = new C5932a();

    /* renamed from: a */
    public C6021e f16405a;

    /* renamed from: b */
    public String f16406b = "";

    /* renamed from: c */
    public String f16407c = "5fba51d1f036aa4c7a1a808eb98482f9";

    /* renamed from: d */
    private String f16408d = "NULL_DEVICE_ID";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f16409e;

    /* renamed from: f */
    public String f16410f = "https://tms.sto-tek.com/";

    /* renamed from: g */
    public String f16411g = (this.f16410f + "resource");

    /* renamed from: h */
    private String f16412h = (this.f16410f + "api/updateResource?apiKey=APIKEY&code=VERSIONCODE");

    /* renamed from: i */
    private String f16413i = (this.f16410f + "api/pois?building=BUILDINGID&floor=FLOOR&apiKey=APIKEY");

    /* renamed from: j */
    private String f16414j = (this.f16410f + "");

    /* renamed from: k */
    private String f16415k = (this.f16410f + "");

    /* renamed from: l */
    private String f16416l = (this.f16410f + "api/getBuilding?apiKey=APIKEY");

    /* renamed from: m */
    private String f16417m = (this.f16410f + "");

    /* renamed from: n */
    private String f16418n = "http://tmstc.sto-tek.com:8090/api-building/";

    /* renamed from: o */
    private String f16419o = (this.f16418n + "FreeAmount");

    /* renamed from: p */
    private String f16420p = (this.f16418n + "parkinginfo?searchstring=SEARCHING&mode=MODE&precision=PRECISION&lpr_sim_min=70");

    /* renamed from: q */
    private String f16421q = (this.f16418n + "FreeParkingSpaceInFloor?FloorName=FLOOR_NAME");

    /* renamed from: r */
    private String f16422r = "http://app.youparking.com.tw/SendGet.aspx?searchstring=KEYWORD&Cid=A014402&language=LANG";

    /* renamed from: s */
    private String f16423s = "http://erp-park.chiefpos.com:7080/sendGet.aspx?notifyexit=KEYWORD";

    /* renamed from: t */
    private String f16424t = "http:/tmsgc.sto-tek.com:8090/api-building/";

    /* renamed from: u */
    private String f16425u = (this.f16424t + "FreeAmount");

    /* renamed from: v */
    private String f16426v = (this.f16424t + "parkinginfo?searchstring=SEARCHING&mode=MODE&precision=PRECISION&lpr_sim_min=70");

    /* renamed from: w */
    private String f16427w = (this.f16424t + "FreeParkingSpaceInFloor?FloorName=FLOOR_NAME");

    /* renamed from: x */
    private String f16428x = "http://app.youparking.com.tw/SendGet.aspx?searchstring=KEYWORD&Cid=A014401&language=LANG";

    /* renamed from: y */
    private String f16429y = "";

    /* renamed from: z */
    public String f16430z = "A014401";

    /* renamed from: d.i.a.a$a */
    public class C5932a {

        /* renamed from: a */
        private final Object f16431a = C5932a.class.getSimpleName();

        /* renamed from: b */
        private C5286r f16432b;

        public C5932a() {
        }

        /* renamed from: a */
        public C5286r mo15733a() {
            if (this.f16432b == null) {
                this.f16432b = C5266n.m20389a(C5931a.this.f16409e);
            }
            return this.f16432b;
        }

        /* renamed from: a */
        public <T> void mo15734a(C5284q<T> qVar) {
            qVar.mo14628b(this.f16431a);
            mo15733a().mo14651a(qVar);
        }
    }

    public C5931a(Context context) {
        this.f16409e = context;
        this.f16405a = C6021e.m22848a();
        this.f16405a.mo15926a(context);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("65", "B1");
            jSONObject.put("66", "B2");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("buildingID", "tms_parking_tc");
            jSONObject3.put("floorList", jSONObject);
            this.f16403I.put(jSONObject3);
            jSONObject2.put("63", "B1");
            jSONObject2.put("64", "B2");
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("buildingID", "tms_parking_gc");
            jSONObject4.put("floorList", jSONObject2);
            this.f16403I.put(jSONObject4);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static float m22440a(float f, Context context) {
        return f * m22441a(context);
    }

    /* renamed from: a */
    public static float m22441a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public C5932a mo15714a() {
        return this.f16404J;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo15715a(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            r1 = 1
            r2 = -1041218808(0xffffffffc1f04308, float:-30.03273)
            if (r0 == r2) goto L_0x001a
            r2 = -1041218405(0xffffffffc1f0449b, float:-30.033499)
            if (r0 == r2) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "tms_parking_tc"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 0
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "tms_parking_gc"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = r1
            goto L_0x0025
        L_0x0024:
            r4 = -1
        L_0x0025:
            if (r4 == 0) goto L_0x002f
            if (r4 == r1) goto L_0x002c
            java.lang.String r4 = ""
            return r4
        L_0x002c:
            java.lang.String r4 = r3.f16425u
            return r4
        L_0x002f:
            java.lang.String r4 = r3.f16419o
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p191i.p192a.C5931a.mo15715a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo15716a(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            r1 = 1
            r2 = -1041218808(0xffffffffc1f04308, float:-30.03273)
            if (r0 == r2) goto L_0x001a
            r2 = -1041218405(0xffffffffc1f0449b, float:-30.033499)
            if (r0 == r2) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "tms_parking_tc"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 0
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "tms_parking_gc"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = r1
            goto L_0x0025
        L_0x0024:
            r4 = -1
        L_0x0025:
            java.lang.String r0 = "FLOOR_NAME"
            if (r4 == 0) goto L_0x0035
            if (r4 == r1) goto L_0x002e
            java.lang.String r4 = ""
            return r4
        L_0x002e:
            java.lang.String r4 = r3.f16427w
        L_0x0030:
            java.lang.String r4 = r4.replace(r0, r5)
            return r4
        L_0x0035:
            java.lang.String r4 = r3.f16421q
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p191i.p192a.C5931a.mo15716a(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo15717a(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            java.lang.String r1 = "tms_parking_tc"
            r2 = 1
            java.lang.String r3 = "tms_parking_gc"
            r4 = -1041218808(0xffffffffc1f04308, float:-30.03273)
            if (r0 == r4) goto L_0x001c
            r4 = -1041218405(0xffffffffc1f0449b, float:-30.033499)
            if (r0 == r4) goto L_0x0014
            goto L_0x0024
        L_0x0014:
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0024
            r6 = 0
            goto L_0x0025
        L_0x001c:
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x0024
            r6 = r2
            goto L_0x0025
        L_0x0024:
            r6 = -1
        L_0x0025:
            if (r6 == 0) goto L_0x0033
            if (r6 == r2) goto L_0x002c
            java.lang.String r6 = ""
            return r6
        L_0x002c:
            java.lang.String r6 = r5.f16400F
            java.lang.String r6 = r5.mo15718a(r3, r7, r8, r6)
            return r6
        L_0x0033:
            java.lang.String r6 = r5.f16400F
            java.lang.String r6 = r5.mo15718a(r1, r7, r8, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p191i.p192a.C5931a.mo15717a(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo15718a(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = 1
            r2 = -1041218808(0xffffffffc1f04308, float:-30.03273)
            if (r0 == r2) goto L_0x001a
            r2 = -1041218405(0xffffffffc1f0449b, float:-30.033499)
            if (r0 == r2) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "tms_parking_tc"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0024
            r5 = 0
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "tms_parking_gc"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0024
            r5 = r1
            goto L_0x0025
        L_0x0024:
            r5 = -1
        L_0x0025:
            java.lang.String r0 = "PRECISION"
            java.lang.String r2 = "MODE"
            java.lang.String r3 = "SEARCHING"
            if (r5 == 0) goto L_0x0041
            if (r5 == r1) goto L_0x0032
            java.lang.String r5 = ""
            return r5
        L_0x0032:
            java.lang.String r5 = r4.f16426v
        L_0x0034:
            java.lang.String r5 = r5.replace(r3, r6)
            java.lang.String r5 = r5.replace(r2, r7)
            java.lang.String r5 = r5.replace(r0, r8)
            return r5
        L_0x0041:
            java.lang.String r5 = r4.f16420p
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p191i.p192a.C5931a.mo15718a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public String mo15719a(String str, String str2, String str3, String str4, String str5) {
        if (str4 == null) {
            str4 = "B1";
        }
        return this.f16402H.replace("BUILDINGID", str).replace("FLOORID", str4).replace("POS_X", str2).replace("POS_Y", str3).replace("DEVICEID", str5);
    }

    /* renamed from: b */
    public C6021e mo15720b() {
        return this.f16405a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo15721b(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = 1
            r2 = 0
            r3 = -1041218808(0xffffffffc1f04308, float:-30.03273)
            if (r0 == r3) goto L_0x001b
            r3 = -1041218405(0xffffffffc1f0449b, float:-30.033499)
            if (r0 == r3) goto L_0x0011
            goto L_0x0025
        L_0x0011:
            java.lang.String r0 = "tms_parking_tc"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0025
            r5 = r2
            goto L_0x0026
        L_0x001b:
            java.lang.String r0 = "tms_parking_gc"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0025
            r5 = r1
            goto L_0x0026
        L_0x0025:
            r5 = -1
        L_0x0026:
            if (r5 == 0) goto L_0x003a
            if (r5 == r1) goto L_0x002d
            java.lang.String r5 = ""
            return r5
        L_0x002d:
            java.lang.String r5 = r4.f16424t
        L_0x002f:
            int r0 = r5.length()
            int r0 = r0 + -14
            java.lang.String r5 = r5.substring(r2, r0)
            return r5
        L_0x003a:
            java.lang.String r5 = r4.f16418n
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p191i.p192a.C5931a.mo15721b(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public String mo15722b(String str, String str2) {
        return this.f16412h.replace("VERSIONCODE", str2).replace("APIKEY", str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo15723b(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            r1 = 1
            r2 = -1041218808(0xffffffffc1f04308, float:-30.03273)
            if (r0 == r2) goto L_0x001a
            r2 = -1041218405(0xffffffffc1f0449b, float:-30.033499)
            if (r0 == r2) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "tms_parking_tc"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 0
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "tms_parking_gc"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = r1
            goto L_0x0025
        L_0x0024:
            r4 = -1
        L_0x0025:
            java.lang.String r0 = "LANG"
            java.lang.String r2 = "KEYWORD"
            if (r4 == 0) goto L_0x003b
            if (r4 == r1) goto L_0x0030
            java.lang.String r4 = ""
            return r4
        L_0x0030:
            java.lang.String r4 = r3.f16428x
        L_0x0032:
            java.lang.String r4 = r4.replace(r2, r5)
            java.lang.String r4 = r4.replace(r0, r6)
            return r4
        L_0x003b:
            java.lang.String r4 = r3.f16422r
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p191i.p192a.C5931a.mo15723b(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public String mo15724b(String str, String str2, String str3, String str4) {
        return mo15719a(str, str2, str3, str4, this.f16408d);
    }

    /* renamed from: c */
    public String mo15725c(String str) {
        return mo15722b(this.f16407c, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo15726c(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            int r0 = r5.hashCode()
            r1 = 1
            r2 = -1041218808(0xffffffffc1f04308, float:-30.03273)
            if (r0 == r2) goto L_0x001a
            r2 = -1041218405(0xffffffffc1f0449b, float:-30.033499)
            if (r0 == r2) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "tms_parking_tc"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0024
            r5 = 0
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "tms_parking_gc"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0024
            r5 = r1
            goto L_0x0025
        L_0x0024:
            r5 = -1
        L_0x0025:
            java.lang.String r0 = "CID"
            java.lang.String r2 = "LICENCE"
            if (r5 == 0) goto L_0x003d
            if (r5 == r1) goto L_0x0030
            java.lang.String r4 = ""
            return r4
        L_0x0030:
            java.lang.String r5 = r3.f16396B
            java.lang.String r4 = r5.replace(r2, r4)
            java.lang.String r5 = r3.f16430z
        L_0x0038:
            java.lang.String r4 = r4.replace(r0, r5)
            return r4
        L_0x003d:
            java.lang.String r5 = r3.f16396B
            java.lang.String r4 = r5.replace(r2, r4)
            java.lang.String r5 = r3.f16395A
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p191i.p192a.C5931a.mo15726c(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public String mo15727c(String str, String str2, String str3) {
        return this.f16413i.replace("APIKEY", str).replace("BUILDINGID", str2).replace("FLOOR", str3);
    }

    /* renamed from: c */
    public JSONArray mo15728c() {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < this.f16403I.length(); i++) {
            try {
                jSONArray.put(this.f16403I.getJSONObject(i).getString("buildingID"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray;
    }

    /* renamed from: d */
    public String mo15729d(String str) {
        return this.f16411g + str + "?apiKey=" + this.f16407c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo15730d(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = com.sto.stolibrary.customActivities.C5061F.f14361b
            int r1 = r7.hashCode()
            r2 = 1
            r3 = -1041218808(0xffffffffc1f04308, float:-30.03273)
            if (r1 == r3) goto L_0x001c
            r3 = -1041218405(0xffffffffc1f0449b, float:-30.033499)
            if (r1 == r3) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            java.lang.String r1 = "tms_parking_tc"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0026
            r7 = 0
            goto L_0x0027
        L_0x001c:
            java.lang.String r1 = "tms_parking_gc"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0026
            r7 = r2
            goto L_0x0027
        L_0x0026:
            r7 = -1
        L_0x0027:
            java.lang.String r1 = "TOKEN"
            java.lang.String r3 = "CID"
            java.lang.String r4 = "LICENCE"
            if (r7 == 0) goto L_0x0045
            if (r7 == r2) goto L_0x0034
            java.lang.String r6 = ""
            return r6
        L_0x0034:
            java.lang.String r7 = r5.f16397C
            java.lang.String r6 = r7.replace(r4, r6)
            java.lang.String r7 = r5.f16430z
        L_0x003c:
            java.lang.String r6 = r6.replace(r3, r7)
            java.lang.String r6 = r6.replace(r1, r0)
            return r6
        L_0x0045:
            java.lang.String r7 = r5.f16397C
            java.lang.String r6 = r7.replace(r4, r6)
            java.lang.String r7 = r5.f16395A
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p191i.p192a.C5931a.mo15730d(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: e */
    public String mo15731e(String str) {
        return mo15727c(this.f16407c, str, SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL);
    }

    /* renamed from: f */
    public JSONObject mo15732f(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        while (i < this.f16403I.length()) {
            try {
                if (this.f16403I.getJSONObject(i).getString("buildingID").compareTo(str) == 0) {
                    return this.f16403I.getJSONObject(i).getJSONObject("floorList");
                }
                i++;
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
