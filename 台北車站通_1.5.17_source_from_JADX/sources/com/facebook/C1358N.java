package com.facebook;

import android.content.SharedPreferences;
import com.facebook.internal.C1484ca;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.N */
final class C1358N {

    /* renamed from: a */
    private final SharedPreferences f4838a = C1601x.m7386b().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);

    C1358N() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5996a() {
        this.f4838a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5997a(Profile profile) {
        C1484ca.m6976a((Object) profile, "profile");
        JSONObject c = profile.mo6009c();
        if (c != null) {
            this.f4838a.edit().putString("com.facebook.ProfileManager.CachedProfile", c.toString()).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Profile mo5998b() {
        String string = this.f4838a.getString("com.facebook.ProfileManager.CachedProfile", (String) null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
