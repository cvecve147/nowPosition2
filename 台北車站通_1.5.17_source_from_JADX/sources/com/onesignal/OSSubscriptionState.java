package com.onesignal;

import org.json.JSONObject;

public class OSSubscriptionState implements Cloneable {

    /* renamed from: a */
    C4447ya<Object, OSSubscriptionState> f12684a = new C4447ya<>("changed", false);

    /* renamed from: b */
    private boolean f12685b;

    /* renamed from: c */
    private boolean f12686c;

    /* renamed from: d */
    private String f12687d;

    /* renamed from: e */
    private String f12688e;

    OSSubscriptionState(boolean z, boolean z2) {
        if (z) {
            this.f12686c = C4370gb.m17355a(C4370gb.f12909a, "ONESIGNAL_SUBSCRIPTION_LAST", false);
            this.f12687d = C4370gb.m17351a(C4370gb.f12909a, "ONESIGNAL_PLAYER_ID_LAST", (String) null);
            this.f12688e = C4370gb.m17351a(C4370gb.f12909a, "ONESIGNAL_PUSH_TOKEN_LAST", (String) null);
            this.f12685b = C4370gb.m17355a(C4370gb.f12909a, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", false);
            return;
        }
        this.f12686c = C4421sb.m17525f();
        this.f12687d = C4306Xa.m17208v();
        this.f12688e = C4421sb.m17520c();
        this.f12685b = z2;
    }

    /* renamed from: a */
    private void m16991a(boolean z) {
        boolean d = mo12372d();
        this.f12685b = z;
        if (d != mo12372d()) {
            this.f12684a.mo12553c(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12367a(String str) {
        if (str != null) {
            boolean z = !str.equals(this.f12688e);
            this.f12688e = str;
            if (z) {
                this.f12684a.mo12553c(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo12368a(OSSubscriptionState oSSubscriptionState) {
        if (this.f12686c == oSSubscriptionState.f12686c) {
            String str = this.f12687d;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            String str3 = oSSubscriptionState.f12687d;
            if (str3 == null) {
                str3 = str2;
            }
            if (str.equals(str3)) {
                String str4 = this.f12688e;
                if (str4 == null) {
                    str4 = str2;
                }
                String str5 = oSSubscriptionState.f12688e;
                if (str5 != null) {
                    str2 = str5;
                }
                return !str4.equals(str2) || this.f12685b != oSSubscriptionState.f12685b;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12369b(String str) {
        boolean z = !str.equals(this.f12687d);
        this.f12687d = str;
        if (z) {
            this.f12684a.mo12553c(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void changed(C4450za zaVar) {
        m16991a(zaVar.mo12555d());
    }

    /* access modifiers changed from: protected */
    public Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public boolean mo12372d() {
        return this.f12687d != null && this.f12688e != null && this.f12686c && this.f12685b;
    }

    /* renamed from: e */
    public String mo12373e() {
        return this.f12687d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo12374f() {
        C4370gb.m17361b(C4370gb.f12909a, "ONESIGNAL_SUBSCRIPTION_LAST", this.f12686c);
        C4370gb.m17359b(C4370gb.f12909a, "ONESIGNAL_PLAYER_ID_LAST", this.f12687d);
        C4370gb.m17359b(C4370gb.f12909a, "ONESIGNAL_PUSH_TOKEN_LAST", this.f12688e);
        C4370gb.m17361b(C4370gb.f12909a, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", this.f12685b);
    }

    /* renamed from: g */
    public JSONObject mo12375g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", this.f12687d != null ? this.f12687d : JSONObject.NULL);
            jSONObject.put("pushToken", this.f12688e != null ? this.f12688e : JSONObject.NULL);
            jSONObject.put("userSubscriptionSetting", this.f12686c);
            jSONObject.put("subscribed", mo12372d());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return mo12375g().toString();
    }
}
