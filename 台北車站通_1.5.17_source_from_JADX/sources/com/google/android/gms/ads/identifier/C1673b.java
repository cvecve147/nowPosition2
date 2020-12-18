package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.C2064k;

/* renamed from: com.google.android.gms.ads.identifier.b */
public final class C1673b {

    /* renamed from: a */
    private SharedPreferences f5498a;

    public C1673b(Context context) {
        try {
            Context remoteContext = C2064k.getRemoteContext(context);
            this.f5498a = remoteContext == null ? null : remoteContext.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f5498a = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final float mo6718a(String str, float f) {
        try {
            if (this.f5498a == null) {
                return 0.0f;
            }
            return this.f5498a.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo6719a(String str, String str2) {
        try {
            return this.f5498a == null ? str2 : this.f5498a.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }

    /* renamed from: a */
    public final boolean mo6720a(String str, boolean z) {
        try {
            if (this.f5498a == null) {
                return false;
            }
            return this.f5498a.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }
}
