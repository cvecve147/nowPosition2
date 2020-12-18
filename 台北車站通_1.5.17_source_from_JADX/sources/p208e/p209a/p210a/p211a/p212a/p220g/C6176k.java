package p208e.p209a.p210a.p211a.p212a.p220g;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import org.json.JSONObject;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6208m;
import p208e.p209a.p210a.p211a.C6211p;
import p208e.p209a.p210a.p211a.p212a.p214b.C6080l;
import p208e.p209a.p210a.p211a.p212a.p214b.C6084n;
import p208e.p209a.p210a.p211a.p212a.p219f.C6163c;
import p208e.p209a.p210a.p211a.p212a.p219f.C6164d;

/* renamed from: e.a.a.a.a.g.k */
class C6176k implements C6187u {

    /* renamed from: a */
    private final C6191y f17217a;

    /* renamed from: b */
    private final C6190x f17218b;

    /* renamed from: c */
    private final C6084n f17219c;

    /* renamed from: d */
    private final C6173h f17220d;

    /* renamed from: e */
    private final C6192z f17221e;

    /* renamed from: f */
    private final C6208m f17222f;

    /* renamed from: g */
    private final C6163c f17223g = new C6164d(this.f17222f);

    public C6176k(C6208m mVar, C6191y yVar, C6084n nVar, C6190x xVar, C6173h hVar, C6192z zVar) {
        this.f17222f = mVar;
        this.f17217a = yVar;
        this.f17219c = nVar;
        this.f17218b = xVar;
        this.f17220d = hVar;
        this.f17221e = zVar;
    }

    /* renamed from: a */
    private void m23342a(JSONObject jSONObject, String str) {
        C6211p f = C6199f.m23420f();
        f.mo16269d("Fabric", str + jSONObject.toString());
    }

    /* renamed from: b */
    private C6188v m23343b(C6186t tVar) {
        C6211p f;
        String str;
        C6188v vVar = null;
        try {
            if (C6186t.SKIP_CACHE_LOOKUP.equals(tVar)) {
                return null;
            }
            JSONObject a = this.f17220d.mo16241a();
            if (a != null) {
                C6188v a2 = this.f17218b.mo16249a(this.f17219c, a);
                if (a2 != null) {
                    m23342a(a, "Loaded cached settings: ");
                    long a3 = this.f17219c.mo16037a();
                    if (!C6186t.IGNORE_CACHE_EXPIRATION.equals(tVar)) {
                        if (a2.mo16257a(a3)) {
                            f = C6199f.m23420f();
                            str = "Cached settings have expired.";
                        }
                    }
                    try {
                        C6199f.m23420f().mo16269d("Fabric", "Returning cached settings.");
                        return a2;
                    } catch (Exception e) {
                        e = e;
                        vVar = a2;
                        C6199f.m23420f().mo16266b("Fabric", "Failed to get cached settings", e);
                        return vVar;
                    }
                } else {
                    C6199f.m23420f().mo16266b("Fabric", "Failed to transform cached settings data.", (Throwable) null);
                    return null;
                }
            } else {
                f = C6199f.m23420f();
                str = "No cached settings data found.";
            }
            f.mo16269d("Fabric", str);
            return null;
        } catch (Exception e2) {
            e = e2;
            C6199f.m23420f().mo16266b("Fabric", "Failed to get cached settings", e);
            return vVar;
        }
    }

    /* renamed from: a */
    public C6188v mo16243a() {
        return mo16244a(C6186t.USE_CACHE);
    }

    /* renamed from: a */
    public C6188v mo16244a(C6186t tVar) {
        JSONObject a;
        C6188v vVar = null;
        try {
            if (!C6199f.m23421h() && !mo16246b()) {
                vVar = m23343b(tVar);
            }
            if (vVar == null && (a = this.f17221e.mo16251a(this.f17217a)) != null) {
                vVar = this.f17218b.mo16249a(this.f17219c, a);
                this.f17220d.mo16242a(vVar.f17261g, a);
                m23342a(a, "Loaded settings: ");
                mo16245a(mo16247c());
            }
            return vVar == null ? m23343b(C6186t.IGNORE_CACHE_EXPIRATION) : vVar;
        } catch (Exception e) {
            C6199f.m23420f().mo16266b("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    public boolean mo16245a(String str) {
        SharedPreferences.Editor edit = this.f17223g.edit();
        edit.putString("existing_instance_identifier", str);
        return this.f17223g.mo16235a(edit);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo16246b() {
        return !mo16248d().equals(mo16247c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo16247c() {
        return C6080l.m23038a(C6080l.m23066n(this.f17222f.mo16305k()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo16248d() {
        return this.f17223g.get().getString("existing_instance_identifier", "");
    }
}
