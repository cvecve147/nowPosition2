package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p101d.p129g.p131b.p132a.p144g.C5536g;
import p101d.p129g.p131b.p132a.p144g.C5537h;
import p101d.p129g.p149d.C5574a;

/* renamed from: com.google.firebase.iid.B */
final class C4053B implements C4056E {

    /* renamed from: a */
    private final C5574a f12033a;

    /* renamed from: b */
    private final FirebaseInstanceId f12034b;

    /* renamed from: c */
    private final C4074e f12035c;

    /* renamed from: d */
    private final C4081l f12036d;

    /* renamed from: e */
    private final ScheduledThreadPoolExecutor f12037e = new ScheduledThreadPoolExecutor(1);

    C4053B(C5574a aVar, FirebaseInstanceId firebaseInstanceId, C4074e eVar) {
        this.f12033a = aVar;
        this.f12034b = firebaseInstanceId;
        this.f12035c = eVar;
        this.f12036d = new C4081l(aVar.mo15063a(), eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String m16221a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                this.f12034b.mo11474i();
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: b */
    private final Bundle m16223b(String str, String str2, Bundle bundle) {
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("appid", FirebaseInstanceId.m16249d());
        bundle.putString("gmp_app_id", this.f12033a.mo15066d().mo15073a());
        bundle.putString("gmsv", Integer.toString(this.f12035c.mo11504a()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f12035c.mo11506c());
        bundle.putString("app_ver_name", this.f12035c.mo11507d());
        bundle.putString("cliv", "fiid-12451000");
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo11457a(String str, String str2, Bundle bundle) {
        m16223b(str, str2, bundle);
        return m16221a(this.f12036d.mo11510a(bundle));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo11458a(Bundle bundle, C5537h hVar) {
        try {
            hVar.mo14998a(this.f12036d.mo11510a(bundle));
        } catch (IOException e) {
            hVar.mo14997a((Exception) e);
        }
    }

    /* renamed from: b */
    public final C5536g<String> mo11459b(String str, String str2) {
        Bundle bundle = new Bundle();
        m16223b(str, str2, bundle);
        C5537h hVar = new C5537h();
        this.f12037e.execute(new C4054C(this, bundle, hVar));
        return hVar.mo14996a().mo14985a((Executor) this.f12037e, new C4055D(this));
    }
}
