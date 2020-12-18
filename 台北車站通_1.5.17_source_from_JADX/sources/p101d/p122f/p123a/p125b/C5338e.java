package p101d.p122f.p123a.p125b;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6208m;
import p208e.p209a.p210a.p211a.C6211p;
import p208e.p209a.p210a.p211a.p212a.p213a.C6062b;
import p208e.p209a.p210a.p211a.p212a.p214b.C6065A;
import p208e.p209a.p210a.p211a.p212a.p214b.C6080l;
import p208e.p209a.p210a.p211a.p212a.p214b.C6086p;
import p208e.p209a.p210a.p211a.p212a.p214b.C6091u;
import p208e.p209a.p210a.p211a.p212a.p218e.C6146c;
import p208e.p209a.p210a.p211a.p212a.p219f.C6164d;
import p208e.p209a.p210a.p211a.p212a.p220g.C6172g;
import p208e.p209a.p210a.p211a.p212a.p220g.C6184s;
import p208e.p209a.p210a.p211a.p212a.p220g.C6188v;

/* renamed from: d.f.a.b.e */
public class C5338e extends C6208m<Boolean> implements C6086p {

    /* renamed from: g */
    private final C6062b<String> f15103g = new C6062b<>();

    /* renamed from: h */
    private final C5343j f15104h = new C5343j();

    /* renamed from: i */
    private C5345l f15105i;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: d.f.a.b.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: d.f.a.b.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: d.f.a.b.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: d.f.a.b.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: d.f.a.b.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.io.InputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081 A[SYNTHETIC, Splitter:B:27:0x0081] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p101d.p122f.p123a.p125b.C5339f m20586a(android.content.Context r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Error closing Beta build properties asset"
            java.lang.String r1 = "Beta"
            r2 = 0
            android.content.res.AssetManager r8 = r8.getAssets()     // Catch:{ Exception -> 0x0065 }
            java.lang.String r3 = "crashlytics-build.properties"
            java.io.InputStream r8 = r8.open(r3)     // Catch:{ Exception -> 0x0065 }
            if (r8 == 0) goto L_0x0050
            d.f.a.b.f r2 = p101d.p122f.p123a.p125b.C5339f.m20598a((java.io.InputStream) r8)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            e.a.a.a.p r3 = p208e.p209a.p210a.p211a.C6199f.m23420f()     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            r4.<init>()     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            java.lang.String r5 = r2.f15109d     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            r4.append(r5)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            java.lang.String r5 = " build properties: "
            r4.append(r5)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            java.lang.String r5 = r2.f15107b     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            r4.append(r5)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            java.lang.String r5 = " ("
            r4.append(r5)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            java.lang.String r5 = r2.f15106a     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            r4.append(r5)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            java.lang.String r5 = ") - "
            r4.append(r5)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            java.lang.String r5 = r2.f15108c     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            r4.append(r5)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            r3.mo16269d(r1, r4)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            goto L_0x0050
        L_0x0049:
            r2 = move-exception
            goto L_0x007f
        L_0x004b:
            r3 = move-exception
            r6 = r2
            r2 = r8
            r8 = r6
            goto L_0x0067
        L_0x0050:
            if (r8 == 0) goto L_0x005e
            r8.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x005e
        L_0x0056:
            r8 = move-exception
            e.a.a.a.p r3 = p208e.p209a.p210a.p211a.C6199f.m23420f()
            r3.mo16266b(r1, r0, r8)
        L_0x005e:
            r8 = r2
            goto L_0x007e
        L_0x0060:
            r8 = move-exception
            r6 = r2
            r2 = r8
            r8 = r6
            goto L_0x007f
        L_0x0065:
            r3 = move-exception
            r8 = r2
        L_0x0067:
            e.a.a.a.p r4 = p208e.p209a.p210a.p211a.C6199f.m23420f()     // Catch:{ all -> 0x0060 }
            java.lang.String r5 = "Error reading Beta build properties"
            r4.mo16266b(r1, r5, r3)     // Catch:{ all -> 0x0060 }
            if (r2 == 0) goto L_0x007e
            r2.close()     // Catch:{ IOException -> 0x0076 }
            goto L_0x007e
        L_0x0076:
            r2 = move-exception
            e.a.a.a.p r3 = p208e.p209a.p210a.p211a.C6199f.m23420f()
            r3.mo16266b(r1, r0, r2)
        L_0x007e:
            return r8
        L_0x007f:
            if (r8 == 0) goto L_0x008d
            r8.close()     // Catch:{ IOException -> 0x0085 }
            goto L_0x008d
        L_0x0085:
            r8 = move-exception
            e.a.a.a.p r3 = p208e.p209a.p210a.p211a.C6199f.m23420f()
            r3.mo16266b(r1, r0, r8)
        L_0x008d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p122f.p123a.p125b.C5338e.m20586a(android.content.Context):d.f.a.b.f");
    }

    /* renamed from: a */
    private String m20587a(Context context, String str) {
        String str2 = null;
        try {
            String a = this.f15103g.mo16035a(context, this.f15104h);
            if (!"".equals(a)) {
                str2 = a;
            }
        } catch (Exception e) {
            C6199f.m23420f().mo16266b("Beta", "Failed to load the Beta device token", e);
        }
        C6211p f = C6199f.m23420f();
        StringBuilder sb = new StringBuilder();
        sb.append("Beta device token present: ");
        sb.append(!TextUtils.isEmpty(str2));
        f.mo16269d("Beta", sb.toString());
        return str2;
    }

    /* renamed from: v */
    private C6172g m20588v() {
        C6188v a = C6184s.m23368b().mo16254a();
        if (a != null) {
            return a.f17260f;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @TargetApi(14)
    /* renamed from: a */
    public C5345l mo14741a(int i, Application application) {
        return i >= 14 ? new C5337d(mo16307m().mo16275a(), mo16307m().mo16281c()) : new C5344k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo14742a(C6172g gVar, C5339f fVar) {
        return (gVar == null || TextUtils.isEmpty(gVar.f17214a) || fVar == null) ? false : true;
    }

    /* renamed from: b */
    public Map<C6091u.C6092a, String> mo14743b() {
        String a = m20587a(mo16305k(), mo16308n().mo16078i());
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(a)) {
            hashMap.put(C6091u.C6092a.FONT_TOKEN, a);
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Boolean m20593c() {
        boolean z;
        C6199f.m23420f().mo16269d("Beta", "Beta kit initializing...");
        Context k = mo16305k();
        C6091u n = mo16308n();
        if (TextUtils.isEmpty(m20587a(k, n.mo16078i()))) {
            C6199f.m23420f().mo16269d("Beta", "A Beta device token was not found for this app");
            z = false;
        } else {
            C6199f.m23420f().mo16269d("Beta", "Beta device token is present, checking for app updates.");
            C6172g v = m20588v();
            C5339f a = m20586a(k);
            if (mo14742a(v, a)) {
                this.f15105i.mo14736a(k, this, n, v, a, new C6164d(this), new C6065A(), new C6146c(C6199f.m23420f()));
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: o */
    public String mo14663o() {
        return "com.crashlytics.sdk.android:beta";
    }

    /* renamed from: q */
    public String mo14664q() {
        return "1.2.5.dev";
    }

    /* access modifiers changed from: protected */
    @TargetApi(14)
    /* renamed from: t */
    public boolean mo14675t() {
        this.f15105i = mo14741a(Build.VERSION.SDK_INT, (Application) mo16305k().getApplicationContext());
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public String mo14744u() {
        return C6080l.m23048b(mo16305k(), "com.crashlytics.ApiEndpoint");
    }
}
