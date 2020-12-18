package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Fu */
final class C2328Fu extends C2271Du<Integer> {
    C2328Fu(int i, String str, Integer num) {
        super(i, str, num, (C2300Eu) null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo8012a(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(mo8014a(), ((Integer) mo8017c()).intValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo8013a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(mo8014a(), ((Integer) mo8017c()).intValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8015a(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(mo8014a(), ((Integer) obj).intValue());
    }
}
