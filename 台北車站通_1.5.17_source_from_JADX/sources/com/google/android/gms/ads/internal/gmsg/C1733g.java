package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2857Yd;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.gmsg.g */
public final class C1733g implements C1718E<Object> {

    /* renamed from: a */
    private final Object f5711a = new Object();

    /* renamed from: b */
    private final Map<String, C1734h> f5712b = new HashMap();

    /* renamed from: a */
    public final void mo6937a(String str, C1734h hVar) {
        synchronized (this.f5711a) {
            this.f5712b.put(str, hVar);
        }
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str;
        String str2 = map.get("id");
        String str3 = map.get("fail");
        String str4 = map.get("fail_reason");
        String str5 = map.get("fail_stack");
        String str6 = map.get("result");
        if (TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = "";
        } else {
            String valueOf = String.valueOf(str5);
            str = valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n");
        }
        synchronized (this.f5711a) {
            C1734h remove = this.f5712b.remove(str2);
            if (remove == null) {
                String valueOf2 = String.valueOf(str2);
                C2227Cf.m9536d(valueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(valueOf2) : new String("Received result for unexpected method invocation: "));
            } else if (!TextUtils.isEmpty(str3)) {
                String valueOf3 = String.valueOf(str4);
                String valueOf4 = String.valueOf(str);
                remove.mo6938a(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else if (str6 == null) {
                remove.mo6939a((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (C2857Yd.m11614a()) {
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        C2857Yd.m11615f(valueOf5.length() != 0 ? "Result GMSG: ".concat(valueOf5) : new String("Result GMSG: "));
                    }
                    remove.mo6939a(jSONObject);
                } catch (JSONException e) {
                    remove.mo6938a(e.getMessage());
                }
            }
        }
    }
}
