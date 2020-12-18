package com.google.android.gms.internal.measurement;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.Wc */
final class C3804Wc extends C3781Qc<Boolean> {
    C3804Wc(C3819_c _cVar, String str, Boolean bool) {
        super(_cVar, str, bool, (C3796Uc) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo10532a(String str) {
        if (C3761Lc.f11228c.matcher(str).matches()) {
            return true;
        }
        if (C3761Lc.f11229d.matcher(str).matches()) {
            return false;
        }
        String str2 = this.f11287g;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 28 + String.valueOf(str).length());
        sb.append("Invalid boolean value for ");
        sb.append(str2);
        sb.append(": ");
        sb.append(str);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
