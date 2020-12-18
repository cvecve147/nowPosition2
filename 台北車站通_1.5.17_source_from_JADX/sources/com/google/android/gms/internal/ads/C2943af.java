package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.af */
public final class C2943af {

    /* renamed from: a */
    private static final C3000cf<Map<String, ?>> f8910a = new C2971bf();

    /* renamed from: a */
    public static List<String> m11928a(JSONArray jSONArray, List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }
}
