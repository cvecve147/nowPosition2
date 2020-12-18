package com.google.android.gms.ads.internal.gmsg;

import android.os.Bundle;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2478La;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.gmsg.a */
public final class C1727a implements C1718E<Object> {

    /* renamed from: a */
    private final C1737k f5690a;

    public C1727a(C1737k kVar) {
        this.f5690a = kVar;
    }

    /* renamed from: a */
    private static Bundle m7864a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            Bundle bundle = new Bundle();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj != null) {
                    if (obj instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(next, ((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        bundle.putString(next, (String) obj);
                    } else {
                        String valueOf = String.valueOf(next);
                        C2227Cf.m9536d(valueOf.length() != 0 ? "Unsupported type for key:".concat(valueOf) : new String("Unsupported type for key:"));
                    }
                }
            }
            return bundle;
        } catch (JSONException e) {
            C2227Cf.m9533b("Failed to convert ad metadata to JSON.", e);
            return null;
        }
    }

    public final void zza(Object obj, Map<String, String> map) {
        if (this.f5690a != null) {
            String str = map.get("name");
            if (str == null) {
                C2227Cf.m9534c("Ad metadata with no name parameter.");
                str = "";
            }
            Bundle a = m7864a(map.get("info"));
            if (a == null) {
                C2227Cf.m9529a("Failed to convert ad metadata to Bundle.");
            } else {
                this.f5690a.mo6872d(str, a);
            }
        }
    }
}
