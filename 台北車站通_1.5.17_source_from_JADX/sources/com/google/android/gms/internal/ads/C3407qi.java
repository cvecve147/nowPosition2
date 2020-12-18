package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.C1718E;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qi */
final class C3407qi implements C1718E<C3520uh> {

    /* renamed from: a */
    private final /* synthetic */ C3378pi f10079a;

    C3407qi(C3378pi piVar) {
        this.f10079a = piVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f10079a) {
                        if (this.f10079a.f10000C != parseInt) {
                            int unused = this.f10079a.f10000C = parseInt;
                            this.f10079a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    C2227Cf.m9535c("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
