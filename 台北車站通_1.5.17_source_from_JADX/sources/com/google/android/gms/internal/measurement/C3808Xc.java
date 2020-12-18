package com.google.android.gms.internal.measurement;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.Xc */
final class C3808Xc extends C3781Qc<Double> {
    C3808Xc(C3819_c _cVar, String str, Double d) {
        super(_cVar, str, d, (C3796Uc) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Double mo10532a(String str) {
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            String str2 = this.f11287g;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 27 + String.valueOf(str).length());
            sb.append("Invalid double value for ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
