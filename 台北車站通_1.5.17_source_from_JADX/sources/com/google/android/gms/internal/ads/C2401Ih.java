package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.C1718E;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ih */
final class C2401Ih implements C1718E<C3520uh> {

    /* renamed from: a */
    private final /* synthetic */ C2373Hh f7254a;

    C2401Ih(C2373Hh hh) {
        this.f7254a = hh;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f7254a) {
                        if (this.f7254a.f7135B != parseInt) {
                            int unused = this.f7254a.f7135B = parseInt;
                            this.f7254a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    C2227Cf.m9535c("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
