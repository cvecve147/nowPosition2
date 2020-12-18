package p208e.p209a.p210a.p211a.p212a.p214b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6211p;
import p208e.p209a.p210a.p211a.p212a.p219f.C6163c;
import p208e.p209a.p210a.p211a.p212a.p219f.C6164d;

/* renamed from: e.a.a.a.a.b.d */
class C6070d {

    /* renamed from: a */
    private final Context f16990a;

    /* renamed from: b */
    private final C6163c f16991b;

    public C6070d(Context context) {
        this.f16990a = context.getApplicationContext();
        this.f16991b = new C6164d(context, "TwitterAdvertisingInfoPreferences");
    }

    /* renamed from: a */
    private boolean m23001a(C6068b bVar) {
        return bVar != null && !TextUtils.isEmpty(bVar.f16986a);
    }

    /* renamed from: b */
    private void m23002b(C6068b bVar) {
        new Thread(new C6069c(this, bVar)).start();
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: c */
    public void m23003c(C6068b bVar) {
        if (m23001a(bVar)) {
            C6163c cVar = this.f16991b;
            cVar.mo16235a(cVar.edit().putString("advertising_id", bVar.f16986a).putBoolean("limit_ad_tracking_enabled", bVar.f16987b));
            return;
        }
        C6163c cVar2 = this.f16991b;
        cVar2.mo16235a(cVar2.edit().remove("advertising_id").remove("limit_ad_tracking_enabled"));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C6068b m23004e() {
        String str;
        C6211p pVar;
        C6068b a = mo16047c().mo16049a();
        if (!m23001a(a)) {
            a = mo16048d().mo16049a();
            if (!m23001a(a)) {
                pVar = C6199f.m23420f();
                str = "AdvertisingInfo not present";
            } else {
                pVar = C6199f.m23420f();
                str = "Using AdvertisingInfo from Service Provider";
            }
        } else {
            pVar = C6199f.m23420f();
            str = "Using AdvertisingInfo from Reflection Provider";
        }
        pVar.mo16269d("Fabric", str);
        return a;
    }

    /* renamed from: a */
    public C6068b mo16045a() {
        C6068b b = mo16046b();
        if (m23001a(b)) {
            C6199f.m23420f().mo16269d("Fabric", "Using AdvertisingInfo from Preference Store");
            m23002b(b);
            return b;
        }
        C6068b e = m23004e();
        m23003c(e);
        return e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C6068b mo16046b() {
        return new C6068b(this.f16991b.get().getString("advertising_id", ""), this.f16991b.get().getBoolean("limit_ad_tracking_enabled", false));
    }

    /* renamed from: c */
    public C6076h mo16047c() {
        return new C6071e(this.f16990a);
    }

    /* renamed from: d */
    public C6076h mo16048d() {
        return new C6073g(this.f16990a);
    }
}
