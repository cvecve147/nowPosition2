package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.C1484ca;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.b */
class C1416b {

    /* renamed from: a */
    private final SharedPreferences f4971a;

    /* renamed from: b */
    private final C1417a f4972b;

    /* renamed from: c */
    private C1354J f4973c;

    /* renamed from: com.facebook.b$a */
    static class C1417a {
        C1417a() {
        }

        /* renamed from: a */
        public C1354J mo6086a() {
            return new C1354J(C1601x.m7386b());
        }
    }

    public C1416b() {
        this(C1601x.m7386b().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new C1417a());
    }

    C1416b(SharedPreferences sharedPreferences, C1417a aVar) {
        this.f4971a = sharedPreferences;
        this.f4972b = aVar;
    }

    /* renamed from: c */
    private AccessToken m6739c() {
        String string = this.f4971a.getString("com.facebook.AccessTokenManager.CachedAccessToken", (String) null);
        if (string != null) {
            try {
                return AccessToken.m6456a(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    private AccessToken m6740d() {
        Bundle b = m6741e().mo5991b();
        if (b == null || !C1354J.m6598d(b)) {
            return null;
        }
        return AccessToken.m6455a(b);
    }

    /* renamed from: e */
    private C1354J m6741e() {
        if (this.f4973c == null) {
            synchronized (this) {
                if (this.f4973c == null) {
                    this.f4973c = this.f4972b.mo6086a();
                }
            }
        }
        return this.f4973c;
    }

    /* renamed from: f */
    private boolean m6742f() {
        return this.f4971a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    /* renamed from: g */
    private boolean m6743g() {
        return C1601x.m7403p();
    }

    /* renamed from: a */
    public void mo6083a() {
        this.f4971a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (m6743g()) {
            m6741e().mo5990a();
        }
    }

    /* renamed from: a */
    public void mo6084a(AccessToken accessToken) {
        C1484ca.m6976a((Object) accessToken, "accessToken");
        try {
            this.f4971a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.mo5897j().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b */
    public AccessToken mo6085b() {
        if (m6742f()) {
            return m6739c();
        }
        if (!m6743g()) {
            return null;
        }
        AccessToken d = m6740d();
        if (d == null) {
            return d;
        }
        mo6084a(d);
        m6741e().mo5990a();
        return d;
    }
}
