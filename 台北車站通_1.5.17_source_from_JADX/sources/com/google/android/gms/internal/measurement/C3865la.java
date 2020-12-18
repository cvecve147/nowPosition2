package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.C2061y;

/* renamed from: com.google.android.gms.internal.measurement.la */
public final class C3865la {

    /* renamed from: a */
    private final String f11527a;

    /* renamed from: b */
    private final String f11528b;

    /* renamed from: c */
    private final String f11529c;

    /* renamed from: d */
    private final long f11530d;

    /* renamed from: e */
    private final /* synthetic */ C3849ha f11531e;

    private C3865la(C3849ha haVar, String str, long j) {
        this.f11531e = haVar;
        C2061y.m9076b(str);
        C2061y.m9073a(j > 0);
        this.f11527a = String.valueOf(str).concat(":start");
        this.f11528b = String.valueOf(str).concat(":count");
        this.f11529c = String.valueOf(str).concat(":value");
        this.f11530d = j;
    }

    /* renamed from: b */
    private final void m15501b() {
        this.f11531e.mo10451d();
        long a = this.f11531e.mo10382a().mo7725a();
        SharedPreferences.Editor edit = this.f11531e.m15462F().edit();
        edit.remove(this.f11528b);
        edit.remove(this.f11529c);
        edit.putLong(this.f11527a, a);
        edit.apply();
    }

    /* renamed from: c */
    private final long m15502c() {
        return this.f11531e.m15462F().getLong(this.f11527a, 0);
    }

    /* renamed from: a */
    public final Pair<String, Long> mo10770a() {
        long j;
        this.f11531e.mo10451d();
        this.f11531e.mo10451d();
        long c = m15502c();
        if (c == 0) {
            m15501b();
            j = 0;
        } else {
            j = Math.abs(c - this.f11531e.mo10382a().mo7725a());
        }
        long j2 = this.f11530d;
        if (j < j2) {
            return null;
        }
        if (j > (j2 << 1)) {
            m15501b();
            return null;
        }
        String string = this.f11531e.m15462F().getString(this.f11529c, (String) null);
        long j3 = this.f11531e.m15462F().getLong(this.f11528b, 0);
        m15501b();
        return (string == null || j3 <= 0) ? C3849ha.f11469c : new Pair<>(string, Long.valueOf(j3));
    }

    /* renamed from: a */
    public final void mo10771a(String str, long j) {
        this.f11531e.mo10451d();
        if (m15502c() == 0) {
            m15501b();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f11531e.m15462F().getLong(this.f11528b, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f11531e.m15462F().edit();
            edit.putString(this.f11529c, str);
            edit.putLong(this.f11528b, 1);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.f11531e.mo10454o().mo10805z().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        SharedPreferences.Editor edit2 = this.f11531e.m15462F().edit();
        if (z) {
            edit2.putString(this.f11529c, str);
        }
        edit2.putLong(this.f11528b, j3);
        edit2.apply();
    }
}
