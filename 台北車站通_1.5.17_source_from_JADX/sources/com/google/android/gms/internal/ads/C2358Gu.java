package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Gu */
final class C2358Gu extends C2271Du<Long> {
    C2358Gu(int i, String str, Long l) {
        super(i, str, l, (C2300Eu) null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo8012a(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(mo8014a(), ((Long) mo8017c()).longValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo8013a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(mo8014a(), ((Long) mo8017c()).longValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8015a(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(mo8014a(), ((Long) obj).longValue());
    }
}
