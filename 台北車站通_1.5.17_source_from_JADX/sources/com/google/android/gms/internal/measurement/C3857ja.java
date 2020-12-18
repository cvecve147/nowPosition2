package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C2061y;

/* renamed from: com.google.android.gms.internal.measurement.ja */
public final class C3857ja {

    /* renamed from: a */
    private final String f11511a;

    /* renamed from: b */
    private final boolean f11512b = true;

    /* renamed from: c */
    private boolean f11513c;

    /* renamed from: d */
    private boolean f11514d;

    /* renamed from: e */
    private final /* synthetic */ C3849ha f11515e;

    public C3857ja(C3849ha haVar, String str, boolean z) {
        this.f11515e = haVar;
        C2061y.m9076b(str);
        this.f11511a = str;
    }

    /* renamed from: a */
    public final void mo10760a(boolean z) {
        SharedPreferences.Editor edit = this.f11515e.m15462F().edit();
        edit.putBoolean(this.f11511a, z);
        edit.apply();
        this.f11514d = z;
    }

    /* renamed from: a */
    public final boolean mo10761a() {
        if (!this.f11513c) {
            this.f11513c = true;
            this.f11514d = this.f11515e.m15462F().getBoolean(this.f11511a, this.f11512b);
        }
        return this.f11514d;
    }
}
