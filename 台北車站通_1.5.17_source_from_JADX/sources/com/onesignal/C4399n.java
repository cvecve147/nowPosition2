package com.onesignal;

import android.os.PersistableBundle;

/* renamed from: com.onesignal.n */
class C4399n implements C4388k<PersistableBundle> {

    /* renamed from: a */
    private PersistableBundle f12961a;

    C4399n() {
        this.f12961a = new PersistableBundle();
    }

    C4399n(PersistableBundle persistableBundle) {
        this.f12961a = persistableBundle;
    }

    /* renamed from: a */
    public PersistableBundle m17434a() {
        return this.f12961a;
    }

    /* renamed from: a */
    public void mo12510a(String str, Long l) {
        this.f12961a.putLong(str, l.longValue());
    }

    /* renamed from: a */
    public boolean mo12511a(String str) {
        return this.f12961a.containsKey(str);
    }

    public boolean getBoolean(String str, boolean z) {
        return this.f12961a.getBoolean(str, z);
    }

    public Integer getInt(String str) {
        return Integer.valueOf(this.f12961a.getInt(str));
    }

    public Long getLong(String str) {
        return Long.valueOf(this.f12961a.getLong(str));
    }

    public String getString(String str) {
        return this.f12961a.getString(str);
    }

    public void putString(String str, String str2) {
        this.f12961a.putString(str, str2);
    }
}
