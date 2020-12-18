package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Iu */
final class C2414Iu extends C2271Du<String> {
    C2414Iu(int i, String str, String str2) {
        super(i, str, str2, (C2300Eu) null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo8012a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(mo8014a(), (String) mo8017c());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo8013a(JSONObject jSONObject) {
        return jSONObject.optString(mo8014a(), (String) mo8017c());
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8015a(SharedPreferences.Editor editor, Object obj) {
        editor.putString(mo8014a(), (String) obj);
    }
}
