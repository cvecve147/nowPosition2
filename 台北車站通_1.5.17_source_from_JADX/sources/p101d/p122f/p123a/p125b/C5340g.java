package p101d.p122f.p123a.p125b;

import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpHeaders;
import p208e.p209a.p210a.p211a.C6208m;
import p208e.p209a.p210a.p211a.p212a.p214b.C6067a;
import p208e.p209a.p210a.p211a.p212a.p218e.C6147d;
import p208e.p209a.p210a.p211a.p212a.p218e.C6149f;
import p208e.p209a.p210a.p211a.p212a.p218e.C6156h;

/* renamed from: d.f.a.b.g */
class C5340g extends C6067a {

    /* renamed from: g */
    private final C5342i f15110g;

    public C5340g(C6208m mVar, String str, String str2, C6156h hVar, C5342i iVar) {
        super(mVar, str, str2, hVar, C6147d.GET);
        this.f15110g = iVar;
    }

    /* renamed from: a */
    private C6149f m20600a(C6149f fVar, String str, String str2) {
        fVar.mo16200c(HttpHeaders.ACCEPT, "application/json");
        fVar.mo16200c("User-Agent", "Crashlytics Android SDK/" + this.f16985f.mo14664q());
        fVar.mo16200c("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
        fVar.mo16200c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        fVar.mo16200c("X-CRASHLYTICS-API-CLIENT-VERSION", this.f16985f.mo14664q());
        fVar.mo16200c("X-CRASHLYTICS-API-KEY", str);
        fVar.mo16200c("X-CRASHLYTICS-BETA-TOKEN", m20601a(str2));
        return fVar;
    }

    /* renamed from: a */
    static String m20601a(String str) {
        return "3:" + str;
    }

    /* renamed from: a */
    private Map<String, String> m20602a(C5339f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", fVar.f15106a);
        hashMap.put("display_version", fVar.f15107b);
        hashMap.put("instance", fVar.f15108c);
        hashMap.put("source", "3");
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p101d.p122f.p123a.p125b.C5341h mo14745a(java.lang.String r8, java.lang.String r9, p101d.p122f.p123a.p125b.C5339f r10) {
        /*
            r7 = this;
            java.lang.String r0 = "Checking for updates request ID: "
            java.lang.String r1 = "Fabric"
            java.lang.String r2 = "X-REQUEST-ID"
            java.lang.String r3 = "Beta"
            r4 = 0
            java.util.Map r10 = r7.m20602a((p101d.p122f.p123a.p125b.C5339f) r10)     // Catch:{ Exception -> 0x00b4, all -> 0x00b1 }
            e.a.a.a.a.e.f r5 = r7.mo16041a((java.util.Map<java.lang.String, java.lang.String>) r10)     // Catch:{ Exception -> 0x00b4, all -> 0x00b1 }
            r7.m20600a((p208e.p209a.p210a.p211a.p212a.p218e.C6149f) r5, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ Exception -> 0x00af }
            e.a.a.a.p r8 = p208e.p209a.p210a.p211a.C6199f.m23420f()     // Catch:{ Exception -> 0x00af }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00af }
            r9.<init>()     // Catch:{ Exception -> 0x00af }
            java.lang.String r6 = "Checking for updates from "
            r9.append(r6)     // Catch:{ Exception -> 0x00af }
            java.lang.String r6 = r7.mo16042b()     // Catch:{ Exception -> 0x00af }
            r9.append(r6)     // Catch:{ Exception -> 0x00af }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00af }
            r8.mo16269d(r3, r9)     // Catch:{ Exception -> 0x00af }
            e.a.a.a.p r8 = p208e.p209a.p210a.p211a.C6199f.m23420f()     // Catch:{ Exception -> 0x00af }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00af }
            r9.<init>()     // Catch:{ Exception -> 0x00af }
            java.lang.String r6 = "Checking for updates query params are: "
            r9.append(r6)     // Catch:{ Exception -> 0x00af }
            r9.append(r10)     // Catch:{ Exception -> 0x00af }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00af }
            r8.mo16269d(r3, r9)     // Catch:{ Exception -> 0x00af }
            boolean r8 = r5.mo16216l()     // Catch:{ Exception -> 0x00af }
            if (r8 == 0) goto L_0x0083
            e.a.a.a.p r8 = p208e.p209a.p210a.p211a.C6199f.m23420f()     // Catch:{ Exception -> 0x00af }
            java.lang.String r9 = "Checking for updates was successful"
            r8.mo16269d(r3, r9)     // Catch:{ Exception -> 0x00af }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x00af }
            java.lang.String r9 = r5.mo16194a()     // Catch:{ Exception -> 0x00af }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00af }
            d.f.a.b.i r9 = r7.f15110g     // Catch:{ Exception -> 0x00af }
            d.f.a.b.h r8 = r9.mo14746a(r8)     // Catch:{ Exception -> 0x00af }
            if (r5 == 0) goto L_0x0082
            java.lang.String r9 = r5.mo16203d((java.lang.String) r2)
            e.a.a.a.p r10 = p208e.p209a.p210a.p211a.C6199f.m23420f()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r10.mo16269d(r1, r9)
        L_0x0082:
            return r8
        L_0x0083:
            e.a.a.a.p r8 = p208e.p209a.p210a.p211a.C6199f.m23420f()     // Catch:{ Exception -> 0x00af }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00af }
            r9.<init>()     // Catch:{ Exception -> 0x00af }
            java.lang.String r10 = "Checking for updates failed. Response code: "
            r9.append(r10)     // Catch:{ Exception -> 0x00af }
            int r10 = r5.mo16211g()     // Catch:{ Exception -> 0x00af }
            r9.append(r10)     // Catch:{ Exception -> 0x00af }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00af }
            r8.mo16265b(r3, r9)     // Catch:{ Exception -> 0x00af }
            if (r5 == 0) goto L_0x00ee
            java.lang.String r8 = r5.mo16203d((java.lang.String) r2)
            e.a.a.a.p r9 = p208e.p209a.p210a.p211a.C6199f.m23420f()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            goto L_0x00e1
        L_0x00af:
            r8 = move-exception
            goto L_0x00b6
        L_0x00b1:
            r8 = move-exception
            r5 = r4
            goto L_0x00f0
        L_0x00b4:
            r8 = move-exception
            r5 = r4
        L_0x00b6:
            e.a.a.a.p r9 = p208e.p209a.p210a.p211a.C6199f.m23420f()     // Catch:{ all -> 0x00ef }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ef }
            r10.<init>()     // Catch:{ all -> 0x00ef }
            java.lang.String r6 = "Error while checking for updates from "
            r10.append(r6)     // Catch:{ all -> 0x00ef }
            java.lang.String r6 = r7.mo16042b()     // Catch:{ all -> 0x00ef }
            r10.append(r6)     // Catch:{ all -> 0x00ef }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00ef }
            r9.mo16266b(r3, r10, r8)     // Catch:{ all -> 0x00ef }
            if (r5 == 0) goto L_0x00ee
            java.lang.String r8 = r5.mo16203d((java.lang.String) r2)
            e.a.a.a.p r9 = p208e.p209a.p210a.p211a.C6199f.m23420f()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
        L_0x00e1:
            r10.append(r0)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.mo16269d(r1, r8)
        L_0x00ee:
            return r4
        L_0x00ef:
            r8 = move-exception
        L_0x00f0:
            if (r5 == 0) goto L_0x010c
            java.lang.String r9 = r5.mo16203d((java.lang.String) r2)
            e.a.a.a.p r10 = p208e.p209a.p210a.p211a.C6199f.m23420f()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r10.mo16269d(r1, r9)
        L_0x010c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p122f.p123a.p125b.C5340g.mo14745a(java.lang.String, java.lang.String, d.f.a.b.f):d.f.a.b.h");
    }
}
