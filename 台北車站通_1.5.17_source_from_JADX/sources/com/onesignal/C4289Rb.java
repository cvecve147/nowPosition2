package com.onesignal;

import org.json.JSONException;

/* renamed from: com.onesignal.Rb */
class C4289Rb extends C4280Ob {
    C4289Rb(String str, boolean z) {
        super(str, z);
    }

    /* renamed from: d */
    private int m17041d() {
        int optInt = this.f12693e.optInt("subscribableStatus", 1);
        if (optInt < -2) {
            return optInt;
        }
        if (!this.f12693e.optBoolean("androidPermission", true)) {
            return 0;
        }
        return !this.f12693e.optBoolean("userSubscribePref", true) ? -2 : 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12380a() {
        try {
            this.f12694f.put("notification_types", m17041d());
        } catch (JSONException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C4280Ob mo12383b(String str) {
        return new C4289Rb(str, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo12385b() {
        return m17041d() > 0;
    }
}
