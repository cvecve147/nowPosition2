package com.onesignal;

import org.json.JSONObject;

/* renamed from: com.onesignal.za */
public class C4450za implements Cloneable {

    /* renamed from: a */
    C4447ya<Object, C4450za> f13112a = new C4447ya<>("changed", false);

    /* renamed from: b */
    private boolean f13113b;

    C4450za(boolean z) {
        if (z) {
            this.f13113b = C4370gb.m17355a(C4370gb.f12909a, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", false);
        } else {
            mo12557f();
        }
    }

    /* renamed from: a */
    private void m17653a(boolean z) {
        boolean z2 = this.f13113b != z;
        this.f13113b = z;
        if (z2) {
            this.f13112a.mo12553c(this);
        }
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
    public boolean mo12555d() {
        return this.f13113b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo12556e() {
        C4370gb.m17361b(C4370gb.f12909a, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", this.f13113b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo12557f() {
        m17653a(C4252Ia.m16869a(C4306Xa.f12759e));
    }

    /* renamed from: g */
    public JSONObject mo12558g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enabled", this.f13113b);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return mo12558g().toString();
    }
}
