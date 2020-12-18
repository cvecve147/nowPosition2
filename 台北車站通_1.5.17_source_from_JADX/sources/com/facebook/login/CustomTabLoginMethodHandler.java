package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.app.C0344n;
import com.facebook.C1427h;
import com.facebook.C1576r;
import com.facebook.C1601x;
import com.facebook.CustomTabMainActivity;
import com.facebook.internal.C1430A;
import com.facebook.internal.C1480ba;
import com.facebook.internal.C1484ca;
import com.facebook.internal.C1525y;
import com.facebook.login.LoginClient;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new C1545a();

    /* renamed from: a */
    private static final String[] f5243a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    /* renamed from: b */
    private String f5244b;

    /* renamed from: c */
    private String f5245c;

    CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f5245c = parcel.readString();
    }

    CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f5245c = C1480ba.m6923a(20);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7100a(java.lang.String r7, com.facebook.login.LoginClient.Request r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x00ad
            java.lang.String r0 = com.facebook.CustomTabMainActivity.m6474a()
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x00ad
            android.net.Uri r7 = android.net.Uri.parse(r7)
            java.lang.String r0 = r7.getQuery()
            android.os.Bundle r0 = com.facebook.internal.C1480ba.m6963d((java.lang.String) r0)
            java.lang.String r7 = r7.getFragment()
            android.os.Bundle r7 = com.facebook.internal.C1480ba.m6963d((java.lang.String) r7)
            r0.putAll(r7)
            boolean r7 = r6.m7101a((android.os.Bundle) r0)
            r1 = 0
            if (r7 != 0) goto L_0x0035
            com.facebook.p r7 = new com.facebook.p
            java.lang.String r0 = "Invalid state parameter"
            r7.<init>((java.lang.String) r0)
            super.mo6354a(r8, r1, r7)
            return
        L_0x0035:
            java.lang.String r7 = "error"
            java.lang.String r7 = r0.getString(r7)
            if (r7 != 0) goto L_0x0043
            java.lang.String r7 = "error_type"
            java.lang.String r7 = r0.getString(r7)
        L_0x0043:
            java.lang.String r2 = "error_msg"
            java.lang.String r2 = r0.getString(r2)
            if (r2 != 0) goto L_0x0051
            java.lang.String r2 = "error_message"
            java.lang.String r2 = r0.getString(r2)
        L_0x0051:
            if (r2 != 0) goto L_0x0059
            java.lang.String r2 = "error_description"
            java.lang.String r2 = r0.getString(r2)
        L_0x0059:
            java.lang.String r3 = "error_code"
            java.lang.String r3 = r0.getString(r3)
            boolean r4 = com.facebook.internal.C1480ba.m6958b((java.lang.String) r3)
            r5 = -1
            if (r4 != 0) goto L_0x006b
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x006b }
            goto L_0x006c
        L_0x006b:
            r3 = r5
        L_0x006c:
            boolean r4 = com.facebook.internal.C1480ba.m6958b((java.lang.String) r7)
            if (r4 == 0) goto L_0x007e
            boolean r4 = com.facebook.internal.C1480ba.m6958b((java.lang.String) r2)
            if (r4 == 0) goto L_0x007e
            if (r3 != r5) goto L_0x007e
            super.mo6354a(r8, r0, r1)
            goto L_0x00ad
        L_0x007e:
            if (r7 == 0) goto L_0x0096
            java.lang.String r0 = "access_denied"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0090
            java.lang.String r0 = "OAuthAccessDeniedException"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0096
        L_0x0090:
            com.facebook.r r7 = new com.facebook.r
            r7.<init>()
            goto L_0x00aa
        L_0x0096:
            r0 = 4201(0x1069, float:5.887E-42)
            if (r3 != r0) goto L_0x00a0
            com.facebook.r r7 = new com.facebook.r
            r7.<init>()
            goto L_0x00aa
        L_0x00a0:
            com.facebook.FacebookRequestError r0 = new com.facebook.FacebookRequestError
            r0.<init>(r3, r7, r2)
            com.facebook.z r7 = new com.facebook.z
            r7.<init>(r0, r2)
        L_0x00aa:
            super.mo6354a(r8, r1, r7)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.CustomTabLoginMethodHandler.m7100a(java.lang.String, com.facebook.login.LoginClient$Request):void");
    }

    /* renamed from: a */
    private boolean m7101a(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return new JSONObject(string).getString("7_challenge").equals(this.f5245c);
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: f */
    private String m7102f() {
        String str = this.f5244b;
        if (str != null) {
            return str;
        }
        C0344n c = this.f5302b.mo6316c();
        List<ResolveInfo> queryIntentServices = c.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices == null) {
            return null;
        }
        HashSet hashSet = new HashSet(Arrays.asList(f5243a));
        for (ResolveInfo resolveInfo : queryIntentServices) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                this.f5244b = serviceInfo.packageName;
                return this.f5244b;
            }
        }
        return null;
    }

    /* renamed from: g */
    private boolean m7103g() {
        return m7104h() && m7102f() != null && C1484ca.m6979a(C1601x.m7386b());
    }

    /* renamed from: h */
    private boolean m7104h() {
        C1525y b = C1430A.m6778b(C1480ba.m6960c((Context) this.f5302b.mo6316c()));
        return b != null && b.mo6247b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6262a(JSONObject jSONObject) {
        jSONObject.put("7_challenge", this.f5245c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6263a(int i, int i2, Intent intent) {
        if (i != 1) {
            return super.mo6263a(i, i2, intent);
        }
        LoginClient.Request i3 = this.f5302b.mo6323i();
        if (i2 == -1) {
            m7100a(intent.getStringExtra(CustomTabMainActivity.f4749c), i3);
            return true;
        }
        super.mo6354a(i3, (Bundle) null, new C1576r());
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6264a(LoginClient.Request request) {
        if (!m7103g()) {
            return false;
        }
        Bundle b = mo6355b(request);
        mo6353a(b, request);
        Intent intent = new Intent(this.f5302b.mo6316c(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f4747a, b);
        intent.putExtra(CustomTabMainActivity.f4748b, m7102f());
        this.f5302b.mo6321f().mo1351a(intent, 1);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo6265b() {
        return "custom_tab";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo6266d() {
        return "chrome_custom_tab";
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C1427h mo6268e() {
        return C1427h.CHROME_CUSTOM_TAB;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f5245c);
    }
}
