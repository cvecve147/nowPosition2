package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Eu */
final class C2300Eu extends C2271Du<Boolean> {
    C2300Eu(int i, String str, Boolean bool) {
        super(i, str, bool, (C2300Eu) null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo8012a(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(mo8014a(), ((Boolean) mo8017c()).booleanValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo8013a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(mo8014a(), ((Boolean) mo8017c()).booleanValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8015a(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(mo8014a(), ((Boolean) obj).booleanValue());
    }
}
