package com.facebook;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.AccessToken;
import com.facebook.C1343G;
import com.facebook.GraphRequest;
import com.facebook.internal.C1480ba;
import com.facebook.internal.C1484ca;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import p013b.p018b.p028h.p029a.C1020d;

/* renamed from: com.facebook.g */
final class C1425g {

    /* renamed from: a */
    private static volatile C1425g f4992a;

    /* renamed from: b */
    private final C1020d f4993b;

    /* renamed from: c */
    private final C1416b f4994c;

    /* renamed from: d */
    private AccessToken f4995d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AtomicBoolean f4996e = new AtomicBoolean(false);

    /* renamed from: f */
    private Date f4997f = new Date(0);

    /* renamed from: com.facebook.g$a */
    private static class C1426a {

        /* renamed from: a */
        public String f4998a;

        /* renamed from: b */
        public int f4999b;

        private C1426a() {
        }

        /* synthetic */ C1426a(C1420c cVar) {
            this();
        }
    }

    C1425g(C1020d dVar, C1416b bVar) {
        C1484ca.m6976a((Object) dVar, "localBroadcastManager");
        C1484ca.m6976a((Object) bVar, "accessTokenCache");
        this.f4993b = dVar;
        this.f4994c = bVar;
    }

    /* renamed from: a */
    private static GraphRequest m6757a(AccessToken accessToken, GraphRequest.C1347b bVar) {
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", "fb_extend_sso_token");
        return new GraphRequest(accessToken, "oauth/access_token", bundle, C1353I.GET, bVar);
    }

    /* renamed from: a */
    private void m6759a(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f4993b.mo5020a(intent);
    }

    /* renamed from: a */
    private void m6760a(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.f4995d;
        this.f4995d = accessToken;
        this.f4996e.set(false);
        this.f4997f = new Date(0);
        if (z) {
            if (accessToken != null) {
                this.f4994c.mo6084a(accessToken);
            } else {
                this.f4994c.mo6083a();
                C1480ba.m6935a(C1601x.m7386b());
            }
        }
        if (!C1480ba.m6951a(accessToken2, accessToken)) {
            m6759a(accessToken2, accessToken);
        }
    }

    /* renamed from: b */
    private static GraphRequest m6762b(AccessToken accessToken, GraphRequest.C1347b bVar) {
        return new GraphRequest(accessToken, "me/permissions", new Bundle(), C1353I.GET, bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m6763b(AccessToken.C1335a aVar) {
        AccessToken accessToken = this.f4995d;
        if (accessToken == null) {
            if (aVar != null) {
                aVar.mo5901a(new C1574p("No current access token to refresh"));
            }
        } else if (this.f4996e.compareAndSet(false, true)) {
            this.f4997f = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C1426a aVar2 = new C1426a((C1420c) null);
            C1343G g = new C1343G(m6762b(accessToken, new C1422d(this, atomicBoolean, hashSet, hashSet2)), m6757a(accessToken, (GraphRequest.C1347b) new C1423e(this, aVar2)));
            g.mo5929a((C1343G.C1344a) new C1424f(this, accessToken, aVar, atomicBoolean, aVar2, hashSet, hashSet2));
            g.mo5935c();
        } else if (aVar != null) {
            aVar.mo5901a(new C1574p("Refresh already in progress"));
        }
    }

    /* renamed from: c */
    static C1425g m6764c() {
        if (f4992a == null) {
            synchronized (C1425g.class) {
                if (f4992a == null) {
                    f4992a = new C1425g(C1020d.m5430a(C1601x.m7386b()), new C1416b());
                }
            }
        }
        return f4992a;
    }

    /* renamed from: e */
    private boolean m6765e() {
        if (this.f4995d == null) {
            return false;
        }
        Long valueOf = Long.valueOf(new Date().getTime());
        return this.f4995d.mo5893g().mo6097a() && valueOf.longValue() - this.f4997f.getTime() > 3600000 && valueOf.longValue() - this.f4995d.mo5890e().getTime() > 86400000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6092a() {
        if (m6765e()) {
            mo6093a((AccessToken.C1335a) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6093a(AccessToken.C1335a aVar) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            m6763b(aVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new C1420c(this, aVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6094a(AccessToken accessToken) {
        m6760a(accessToken, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public AccessToken mo6095b() {
        return this.f4995d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo6096d() {
        AccessToken b = this.f4994c.mo6085b();
        if (b == null) {
            return false;
        }
        m6760a(b, false);
        return true;
    }
}
