package com.google.android.gms.ads.internal.gmsg;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C3114ge;
import com.google.android.gms.internal.ads.C3520uh;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.v */
final class C1748v implements C1718E<C3520uh> {
    C1748v() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C3520uh uhVar = (C3520uh) obj;
        C1697X.m7698e();
        DisplayMetrics a = C3114ge.m12395a((WindowManager) uhVar.getContext().getSystemService("window"));
        int i = a.widthPixels;
        int i2 = a.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) uhVar).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        uhVar.mo8149a("locationReady", (Map<String, ?>) hashMap);
        C2227Cf.m9536d("GET LOCATION COMPILED");
    }
}
