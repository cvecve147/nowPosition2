package p208e.p209a.p210a.p211a.p212a.p214b;

import android.content.Context;
import p208e.p209a.p210a.p211a.C6199f;

/* renamed from: e.a.a.a.a.b.e */
class C6071e implements C6076h {

    /* renamed from: a */
    private final Context f16992a;

    public C6071e(Context context) {
        this.f16992a = context.getApplicationContext();
    }

    /* renamed from: b */
    private String m23009b() {
        try {
            return (String) Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("getId", new Class[0]).invoke(m23010c(), new Object[0]);
        } catch (Exception unused) {
            C6199f.m23420f().mo16262a("Fabric", "Could not call getId on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return null;
        }
    }

    /* renamed from: c */
    private Object m23010c() {
        try {
            return Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke((Object) null, new Object[]{this.f16992a});
        } catch (Exception unused) {
            C6199f.m23420f().mo16262a("Fabric", "Could not call getAdvertisingIdInfo on com.google.android.gms.ads.identifier.AdvertisingIdClient");
            return null;
        }
    }

    /* renamed from: d */
    private boolean m23011d() {
        try {
            return ((Boolean) Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(m23010c(), new Object[0])).booleanValue();
        } catch (Exception unused) {
            C6199f.m23420f().mo16262a("Fabric", "Could not call isLimitAdTrackingEnabled on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return false;
        }
    }

    /* renamed from: a */
    public C6068b mo16049a() {
        if (mo16050a(this.f16992a)) {
            return new C6068b(m23009b(), m23011d());
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo16050a(Context context) {
        try {
            return ((Integer) Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", new Class[]{Context.class}).invoke((Object) null, new Object[]{context})).intValue() == 0;
        } catch (Exception unused) {
            return false;
        }
    }
}
