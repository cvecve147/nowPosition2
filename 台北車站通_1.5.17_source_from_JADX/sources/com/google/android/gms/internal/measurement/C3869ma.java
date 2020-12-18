package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C2061y;

/* renamed from: com.google.android.gms.internal.measurement.ma */
public final class C3869ma {

    /* renamed from: a */
    private final String f11547a;

    /* renamed from: b */
    private final String f11548b = null;

    /* renamed from: c */
    private boolean f11549c;

    /* renamed from: d */
    private String f11550d;

    /* renamed from: e */
    private final /* synthetic */ C3849ha f11551e;

    public C3869ma(C3849ha haVar, String str, String str2) {
        this.f11551e = haVar;
        C2061y.m9076b(str);
        this.f11547a = str;
    }

    /* renamed from: a */
    public final String mo10773a() {
        if (!this.f11549c) {
            this.f11549c = true;
            this.f11550d = this.f11551e.m15462F().getString(this.f11547a, (String) null);
        }
        return this.f11550d;
    }

    /* renamed from: a */
    public final void mo10774a(String str) {
        if (!C3871mc.m15529c(str, this.f11550d)) {
            SharedPreferences.Editor edit = this.f11551e.m15462F().edit();
            edit.putString(this.f11547a, str);
            edit.apply();
            this.f11550d = str;
        }
    }
}
