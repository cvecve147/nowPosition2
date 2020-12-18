package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C2061y;

/* renamed from: com.google.android.gms.internal.measurement.ka */
public final class C3861ka {

    /* renamed from: a */
    private final String f11518a;

    /* renamed from: b */
    private final long f11519b;

    /* renamed from: c */
    private boolean f11520c;

    /* renamed from: d */
    private long f11521d;

    /* renamed from: e */
    private final /* synthetic */ C3849ha f11522e;

    public C3861ka(C3849ha haVar, String str, long j) {
        this.f11522e = haVar;
        C2061y.m9076b(str);
        this.f11518a = str;
        this.f11519b = j;
    }

    /* renamed from: a */
    public final long mo10763a() {
        if (!this.f11520c) {
            this.f11520c = true;
            this.f11521d = this.f11522e.m15462F().getLong(this.f11518a, this.f11519b);
        }
        return this.f11521d;
    }

    /* renamed from: a */
    public final void mo10764a(long j) {
        SharedPreferences.Editor edit = this.f11522e.m15462F().edit();
        edit.putLong(this.f11518a, j);
        edit.apply();
        this.f11521d = j;
    }
}
