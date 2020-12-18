package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2930_u;
import com.google.android.gms.internal.ads.C3520uh;
import java.util.Map;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.gmsg.n */
public final class C1740n implements C1718E<C3520uh> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        C3520uh uhVar = (C3520uh) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                C2227Cf.m9536d("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                C2227Cf.m9536d("No timestamp given for CSI tick.");
            } else {
                try {
                    long b = C1697X.m7705l().mo7726b() + (Long.parseLong(str4) - C1697X.m7705l().mo7725a());
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    uhVar.mo8138Za().mo9128a(str2, str3, b);
                } catch (NumberFormatException e) {
                    C2227Cf.m9535c("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                C2227Cf.m9536d("No value given for CSI experiment.");
                return;
            }
            C2930_u a = uhVar.mo8138Za().mo9126a();
            if (a == null) {
                C2227Cf.m9536d("No ticker for WebView, dropping experiment ID.");
            } else {
                a.mo9178a("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                C2227Cf.m9536d("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                C2227Cf.m9536d("No name given for CSI extra.");
            } else {
                C2930_u a2 = uhVar.mo8138Za().mo9126a();
                if (a2 == null) {
                    C2227Cf.m9536d("No ticker for WebView, dropping extra parameter.");
                } else {
                    a2.mo9178a(str6, str7);
                }
            }
        }
    }
}
