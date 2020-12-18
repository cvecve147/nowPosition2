package p208e.p209a.p210a.p211a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import p208e.p209a.p210a.p211a.p212a.p214b.C6077i;
import p208e.p209a.p210a.p211a.p212a.p214b.C6080l;
import p208e.p209a.p210a.p211a.p212a.p214b.C6085o;
import p208e.p209a.p210a.p211a.p212a.p218e.C6146c;
import p208e.p209a.p210a.p211a.p212a.p218e.C6156h;
import p208e.p209a.p210a.p211a.p212a.p220g.C6165A;
import p208e.p209a.p210a.p211a.p212a.p220g.C6169d;
import p208e.p209a.p210a.p211a.p212a.p220g.C6170e;
import p208e.p209a.p210a.p211a.p212a.p220g.C6174i;
import p208e.p209a.p210a.p211a.p212a.p220g.C6180o;
import p208e.p209a.p210a.p211a.p212a.p220g.C6184s;
import p208e.p209a.p210a.p211a.p212a.p220g.C6188v;

/* renamed from: e.a.a.a.q */
class C6212q extends C6208m<Boolean> {

    /* renamed from: g */
    private final C6156h f17323g = new C6146c();

    /* renamed from: h */
    private PackageManager f17324h;

    /* renamed from: i */
    private String f17325i;

    /* renamed from: j */
    private PackageInfo f17326j;

    /* renamed from: k */
    private String f17327k;

    /* renamed from: l */
    private String f17328l;

    /* renamed from: m */
    private String f17329m;

    /* renamed from: n */
    private String f17330n;

    /* renamed from: o */
    private String f17331o;

    /* renamed from: p */
    private final Future<Map<String, C6210o>> f17332p;

    /* renamed from: q */
    private final Collection<C6208m> f17333q;

    public C6212q(Future<Map<String, C6210o>> future, Collection<C6208m> collection) {
        this.f17332p = future;
        this.f17333q = collection;
    }

    /* renamed from: a */
    private C6169d m23482a(C6180o oVar, Collection<C6210o> collection) {
        Context k = mo16305k();
        return new C6169d(new C6077i().mo16060c(k), mo16308n().mo16074e(), this.f17328l, this.f17327k, C6080l.m23038a(C6080l.m23066n(k)), this.f17330n, C6085o.m23071a(this.f17329m).getId(), this.f17331o, "0", oVar, collection);
    }

    /* renamed from: a */
    private boolean m23483a(C6170e eVar, C6180o oVar, Collection<C6210o> collection) {
        return new C6165A(this, mo16316u(), eVar.f17210c, this.f17323g).mo16238a(m23482a(oVar, collection));
    }

    /* renamed from: a */
    private boolean m23484a(String str, C6170e eVar, Collection<C6210o> collection) {
        if ("new".equals(eVar.f17209b)) {
            if (!m23485b(str, eVar, collection)) {
                C6199f.m23420f().mo16266b("Fabric", "Failed to create app with Crashlytics service.", (Throwable) null);
                return false;
            }
        } else if (!"configured".equals(eVar.f17209b)) {
            if (eVar.f17212e) {
                C6199f.m23420f().mo16269d("Fabric", "Server says an update is required - forcing a full App update.");
                m23486c(str, eVar, collection);
            }
            return true;
        }
        return C6184s.m23368b().mo16256d();
    }

    /* renamed from: b */
    private boolean m23485b(String str, C6170e eVar, Collection<C6210o> collection) {
        return new C6174i(this, mo16316u(), eVar.f17210c, this.f17323g).mo16238a(m23482a(C6180o.m23366a(mo16305k(), str), collection));
    }

    /* renamed from: c */
    private boolean m23486c(String str, C6170e eVar, Collection<C6210o> collection) {
        return m23483a(eVar, C6180o.m23366a(mo16305k(), str), collection);
    }

    /* renamed from: v */
    private C6188v m23487v() {
        try {
            C6184s b = C6184s.m23368b();
            b.mo16253a(this, this.f17318e, this.f17323g, this.f17327k, this.f17328l, mo16316u());
            b.mo16255c();
            return C6184s.m23368b().mo16254a();
        } catch (Exception e) {
            C6199f.m23420f().mo16266b("Fabric", "Error dealing with settings", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<String, C6210o> mo16315a(Map<String, C6210o> map, Collection<C6208m> collection) {
        for (C6208m next : collection) {
            if (!map.containsKey(next.mo14663o())) {
                map.put(next.mo14663o(), new C6210o(next.mo14663o(), next.mo14664q(), "binary"));
            }
        }
        return map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Boolean m23490c() {
        boolean z;
        String c = C6080l.m23052c(mo16305k());
        C6188v v = m23487v();
        if (v != null) {
            try {
                Map hashMap = this.f17332p != null ? this.f17332p.get() : new HashMap();
                mo16315a((Map<String, C6210o>) hashMap, this.f17333q);
                z = m23484a(c, v.f17255a, (Collection<C6210o>) hashMap.values());
            } catch (Exception e) {
                C6199f.m23420f().mo16266b("Fabric", "Error performing auto configuration.", e);
            }
            return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }

    /* renamed from: o */
    public String mo14663o() {
        return "io.fabric.sdk.android:fabric";
    }

    /* renamed from: q */
    public String mo14664q() {
        return "1.3.17.dev";
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo14675t() {
        try {
            this.f17329m = mo16308n().mo16078i();
            this.f17324h = mo16305k().getPackageManager();
            this.f17325i = mo16305k().getPackageName();
            this.f17326j = this.f17324h.getPackageInfo(this.f17325i, 0);
            this.f17327k = Integer.toString(this.f17326j.versionCode);
            this.f17328l = this.f17326j.versionName == null ? "0.0" : this.f17326j.versionName;
            this.f17330n = this.f17324h.getApplicationLabel(mo16305k().getApplicationInfo()).toString();
            this.f17331o = Integer.toString(mo16305k().getApplicationInfo().targetSdkVersion);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            C6199f.m23420f().mo16266b("Fabric", "Failed init", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public String mo16316u() {
        return C6080l.m23048b(mo16305k(), "com.crashlytics.ApiEndpoint");
    }
}
