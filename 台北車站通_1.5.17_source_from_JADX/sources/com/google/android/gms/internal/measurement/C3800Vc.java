package com.google.android.gms.internal.measurement;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.Vc */
final class C3800Vc extends C3781Qc<Integer> {
    C3800Vc(C3819_c _cVar, String str, Integer num) {
        super(_cVar, str, num, (C3796Uc) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Integer mo10532a(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            String str2 = this.f11287g;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 28 + String.valueOf(str).length());
            sb.append("Invalid integer value for ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
