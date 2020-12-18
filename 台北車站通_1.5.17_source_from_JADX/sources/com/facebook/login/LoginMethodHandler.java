package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C1427h;
import com.facebook.C1574p;
import com.facebook.internal.C1480ba;
import com.facebook.login.LoginClient;
import com.facebook.p060a.C1406q;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.protocol.HTTP;
import org.json.JSONException;
import org.json.JSONObject;

abstract class LoginMethodHandler implements Parcelable {

    /* renamed from: a */
    Map<String, String> f5301a;

    /* renamed from: b */
    protected LoginClient f5302b;

    LoginMethodHandler(Parcel parcel) {
        this.f5301a = C1480ba.m6933a(parcel);
    }

    LoginMethodHandler(LoginClient loginClient) {
        this.f5302b = loginClient;
    }

    /* renamed from: a */
    static AccessToken m7243a(Bundle bundle, C1427h hVar, String str) {
        Date a = C1480ba.m6930a(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (C1480ba.m6958b(string)) {
            return null;
        }
        return new AccessToken(string, str, bundle.getString("com.facebook.platform.extra.USER_ID"), stringArrayList, (Collection<String>) null, hVar, a, new Date());
    }

    /* renamed from: a */
    public static AccessToken m7244a(Collection<String> collection, Bundle bundle, C1427h hVar, String str) {
        Date a = C1480ba.m6930a(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        String string2 = bundle.getString("granted_scopes");
        if (!C1480ba.m6958b(string2)) {
            collection = new ArrayList<>(Arrays.asList(string2.split(",")));
        }
        Collection<String> collection2 = collection;
        String string3 = bundle.getString("denied_scopes");
        ArrayList arrayList = !C1480ba.m6958b(string3) ? new ArrayList(Arrays.asList(string3.split(","))) : null;
        if (C1480ba.m6958b(string)) {
            return null;
        }
        return new AccessToken(string, str, m7245c(bundle.getString("signed_request")), collection2, arrayList, hVar, a, new Date());
    }

    /* renamed from: c */
    private static String m7245c(String str) {
        if (str == null || str.isEmpty()) {
            throw new C1574p("Authorization response does not contain the signed_request");
        }
        try {
            String[] split = str.split("\\.");
            if (split.length == 2) {
                return new JSONObject(new String(Base64.decode(split[1], 0), HTTP.UTF_8)).getString("user_id");
            }
        } catch (UnsupportedEncodingException | JSONException unused) {
        }
        throw new C1574p("Failed to retrieve user_id from signed_request");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo6347a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", mo6265b());
            mo6262a(jSONObject);
        } catch (JSONException e) {
            Log.w("LoginMethodHandler", "Error creating client state json: " + e.getMessage());
        }
        return jSONObject.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6297a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6348a(LoginClient loginClient) {
        if (this.f5302b == null) {
            this.f5302b = loginClient;
            return;
        }
        throw new C1574p("Can't set LoginClient if it is already set.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6349a(String str, Object obj) {
        if (this.f5301a == null) {
            this.f5301a = new HashMap();
        }
        this.f5301a.put(str, obj == null ? null : obj.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6262a(JSONObject jSONObject) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6263a(int i, int i2, Intent intent) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo6264a(LoginClient.Request request);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract String mo6265b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6350b(String str) {
        String a = this.f5302b.mo6323i().mo6329a();
        C1406q a2 = C1406q.m6709a((Context) this.f5302b.mo6316c(), a);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", a);
        a2.mo6070a("fb_dialogs_web_login_dialog_complete", (Double) null, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo6351c() {
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1480ba.m6939a(parcel, this.f5301a);
    }
}
