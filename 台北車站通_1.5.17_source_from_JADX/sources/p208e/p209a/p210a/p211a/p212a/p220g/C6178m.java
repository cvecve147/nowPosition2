package p208e.p209a.p210a.p211a.p212a.p220g;

import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpHeaders;
import org.json.JSONObject;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6208m;
import p208e.p209a.p210a.p211a.C6211p;
import p208e.p209a.p210a.p211a.p212a.p214b.C6067a;
import p208e.p209a.p210a.p211a.p212a.p214b.C6080l;
import p208e.p209a.p210a.p211a.p212a.p218e.C6147d;
import p208e.p209a.p210a.p211a.p212a.p218e.C6149f;
import p208e.p209a.p210a.p211a.p212a.p218e.C6156h;

/* renamed from: e.a.a.a.a.g.m */
class C6178m extends C6067a implements C6192z {
    public C6178m(C6208m mVar, String str, String str2, C6156h hVar) {
        this(mVar, str, str2, hVar, C6147d.GET);
    }

    C6178m(C6208m mVar, String str, String str2, C6156h hVar, C6147d dVar) {
        super(mVar, str, str2, hVar, dVar);
    }

    /* renamed from: a */
    private C6149f m23359a(C6149f fVar, C6191y yVar) {
        m23360a(fVar, "X-CRASHLYTICS-API-KEY", yVar.f17265a);
        m23360a(fVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m23360a(fVar, "X-CRASHLYTICS-API-CLIENT-VERSION", this.f16985f.mo14664q());
        m23360a(fVar, HttpHeaders.ACCEPT, "application/json");
        m23360a(fVar, "X-CRASHLYTICS-DEVICE-MODEL", yVar.f17266b);
        m23360a(fVar, "X-CRASHLYTICS-OS-BUILD-VERSION", yVar.f17267c);
        m23360a(fVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", yVar.f17268d);
        m23360a(fVar, "X-CRASHLYTICS-ADVERTISING-TOKEN", yVar.f17269e);
        m23360a(fVar, "X-CRASHLYTICS-INSTALLATION-ID", yVar.f17270f);
        m23360a(fVar, "X-CRASHLYTICS-ANDROID-ID", yVar.f17271g);
        return fVar;
    }

    /* renamed from: a */
    private void m23360a(C6149f fVar, String str, String str2) {
        if (str2 != null) {
            fVar.mo16200c(str, str2);
        }
    }

    /* renamed from: b */
    private Map<String, String> m23361b(C6191y yVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", yVar.f17274j);
        hashMap.put("display_version", yVar.f17273i);
        hashMap.put("source", Integer.toString(yVar.f17275k));
        String str = yVar.f17276l;
        if (str != null) {
            hashMap.put("icon_hash", str);
        }
        String str2 = yVar.f17272h;
        if (!C6080l.m23051b(str2)) {
            hashMap.put("instance", str2);
        }
        return hashMap;
    }

    /* renamed from: b */
    private JSONObject m23362b(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            C6211p f = C6199f.m23420f();
            f.mo16268c("Fabric", "Failed to parse settings JSON from " + mo16042b(), e);
            C6211p f2 = C6199f.m23420f();
            f2.mo16269d("Fabric", "Settings response " + str);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo16250a(C6149f fVar) {
        int g = fVar.mo16211g();
        C6211p f = C6199f.m23420f();
        f.mo16269d("Fabric", "Settings result was: " + g);
        if (mo16252a(g)) {
            return m23362b(fVar.mo16194a());
        }
        C6211p f2 = C6199f.m23420f();
        f2.mo16265b("Fabric", "Failed to retrieve settings from " + mo16042b());
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo16251a(p208e.p209a.p210a.p211a.p212a.p220g.C6191y r9) {
        /*
            r8 = this;
            java.lang.String r0 = "X-REQUEST-ID"
            java.lang.String r1 = "Settings request ID: "
            java.lang.String r2 = "Fabric"
            r3 = 0
            java.util.Map r4 = r8.m23361b((p208e.p209a.p210a.p211a.p212a.p220g.C6191y) r9)     // Catch:{ c -> 0x006c, all -> 0x0069 }
            e.a.a.a.a.e.f r5 = r8.mo16041a((java.util.Map<java.lang.String, java.lang.String>) r4)     // Catch:{ c -> 0x006c, all -> 0x0069 }
            r8.m23359a(r5, r9)     // Catch:{ c -> 0x0067 }
            e.a.a.a.p r9 = p208e.p209a.p210a.p211a.C6199f.m23420f()     // Catch:{ c -> 0x0067 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ c -> 0x0067 }
            r6.<init>()     // Catch:{ c -> 0x0067 }
            java.lang.String r7 = "Requesting settings from "
            r6.append(r7)     // Catch:{ c -> 0x0067 }
            java.lang.String r7 = r8.mo16042b()     // Catch:{ c -> 0x0067 }
            r6.append(r7)     // Catch:{ c -> 0x0067 }
            java.lang.String r6 = r6.toString()     // Catch:{ c -> 0x0067 }
            r9.mo16269d(r2, r6)     // Catch:{ c -> 0x0067 }
            e.a.a.a.p r9 = p208e.p209a.p210a.p211a.C6199f.m23420f()     // Catch:{ c -> 0x0067 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ c -> 0x0067 }
            r6.<init>()     // Catch:{ c -> 0x0067 }
            java.lang.String r7 = "Settings query params were: "
            r6.append(r7)     // Catch:{ c -> 0x0067 }
            r6.append(r4)     // Catch:{ c -> 0x0067 }
            java.lang.String r4 = r6.toString()     // Catch:{ c -> 0x0067 }
            r9.mo16269d(r2, r4)     // Catch:{ c -> 0x0067 }
            org.json.JSONObject r3 = r8.mo16250a((p208e.p209a.p210a.p211a.p212a.p218e.C6149f) r5)     // Catch:{ c -> 0x0067 }
            if (r5 == 0) goto L_0x0083
            e.a.a.a.p r9 = p208e.p209a.p210a.p211a.C6199f.m23420f()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x0055:
            r4.append(r1)
            java.lang.String r0 = r5.mo16203d((java.lang.String) r0)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r9.mo16269d(r2, r0)
            goto L_0x0083
        L_0x0067:
            r9 = move-exception
            goto L_0x006e
        L_0x0069:
            r9 = move-exception
            r5 = r3
            goto L_0x0085
        L_0x006c:
            r9 = move-exception
            r5 = r3
        L_0x006e:
            e.a.a.a.p r4 = p208e.p209a.p210a.p211a.C6199f.m23420f()     // Catch:{ all -> 0x0084 }
            java.lang.String r6 = "Settings request failed."
            r4.mo16266b(r2, r6, r9)     // Catch:{ all -> 0x0084 }
            if (r5 == 0) goto L_0x0083
            e.a.a.a.p r9 = p208e.p209a.p210a.p211a.C6199f.m23420f()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x0055
        L_0x0083:
            return r3
        L_0x0084:
            r9 = move-exception
        L_0x0085:
            if (r5 == 0) goto L_0x00a1
            e.a.a.a.p r3 = p208e.p209a.p210a.p211a.C6199f.m23420f()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r0 = r5.mo16203d((java.lang.String) r0)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.mo16269d(r2, r0)
        L_0x00a1:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p208e.p209a.p210a.p211a.p212a.p220g.C6178m.mo16251a(e.a.a.a.a.g.y):org.json.JSONObject");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo16252a(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }
}
