package com.onesignal;

import android.os.Bundle;

/* renamed from: com.onesignal.l */
class C4393l implements C4388k<Bundle> {

    /* renamed from: a */
    private Bundle f12949a;

    C4393l() {
        this.f12949a = new Bundle();
    }

    C4393l(Bundle bundle) {
        this.f12949a = bundle;
    }

    /* renamed from: a */
    public Bundle m17427a() {
        return this.f12949a;
    }

    /* renamed from: a */
    public void mo12510a(String str, Long l) {
        this.f12949a.putLong(str, l.longValue());
    }

    /* renamed from: a */
    public boolean mo12511a(String str) {
        return this.f12949a.containsKey(str);
    }

    public boolean getBoolean(String str, boolean z) {
        return this.f12949a.getBoolean(str, z);
    }

    public Integer getInt(String str) {
        return Integer.valueOf(this.f12949a.getInt(str));
    }

    public Long getLong(String str) {
        return Long.valueOf(this.f12949a.getLong(str));
    }

    public String getString(String str) {
        return this.f12949a.getString(str);
    }

    public void putString(String str, String str2) {
        this.f12949a.putString(str, str2);
    }
}
