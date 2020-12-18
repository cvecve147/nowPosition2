package com.google.android.gms.internal.measurement;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.Uc */
final class C3796Uc extends C3781Qc<Long> {
    C3796Uc(C3819_c _cVar, String str, Long l) {
        super(_cVar, str, l, (C3796Uc) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Long mo10532a(String str) {
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            String str2 = this.f11287g;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 25 + String.valueOf(str).length());
            sb.append("Invalid long value for ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
