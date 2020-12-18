package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Hu */
final class C2386Hu extends C2271Du<Float> {
    C2386Hu(int i, String str, Float f) {
        super(i, str, f, (C2300Eu) null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo8012a(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(mo8014a(), ((Float) mo8017c()).floatValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo8013a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(mo8014a(), (double) ((Float) mo8017c()).floatValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8015a(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(mo8014a(), ((Float) obj).floatValue());
    }
}
