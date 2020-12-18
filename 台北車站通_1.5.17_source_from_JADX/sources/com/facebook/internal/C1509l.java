package com.facebook.internal;

import android.os.Bundle;
import com.facebook.internal.C1510m;
import java.util.ArrayList;
import org.json.JSONArray;

/* renamed from: com.facebook.internal.l */
class C1509l implements C1510m.C1511a {
    C1509l() {
    }

    /* renamed from: a */
    public void mo6192a(Bundle bundle, String str, Object obj) {
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList();
        if (jSONArray.length() == 0) {
            bundle.putStringArrayList(str, arrayList);
            return;
        }
        int i = 0;
        while (i < jSONArray.length()) {
            Object obj2 = jSONArray.get(i);
            if (obj2 instanceof String) {
                arrayList.add((String) obj2);
                i++;
            } else {
                throw new IllegalArgumentException("Unexpected type in an array: " + obj2.getClass());
            }
        }
        bundle.putStringArrayList(str, arrayList);
    }
}
