package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2558Nu;
import com.google.android.gms.internal.ads.C3390pt;
import com.google.android.gms.internal.ads.zzaig;
import java.util.Map;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.gmsg.i */
public final class C1735i implements C1718E<Object> {

    /* renamed from: a */
    private final C1736j f5713a;

    public C1735i(C1736j jVar) {
        this.f5713a = jVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("action");
        if ("grant".equals(str)) {
            zzaig zzaig = null;
            try {
                int parseInt = Integer.parseInt(map.get("amount"));
                String str2 = map.get(SVGParser.XML_STYLESHEET_ATTR_TYPE);
                if (!TextUtils.isEmpty(str2)) {
                    zzaig = new zzaig(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                C2227Cf.m9535c("Unable to parse reward amount.", e);
            }
            this.f5713a.mo6942b(zzaig);
        } else if ("video_start".equals(str)) {
            this.f5713a.mo6941ac();
        } else if ("video_complete".equals(str)) {
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7829Va)).booleanValue()) {
                if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7829Va)).booleanValue()) {
                    this.f5713a.mo6940Ub();
                }
            }
        }
    }
}
