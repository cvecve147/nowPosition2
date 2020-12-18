package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import com.google.android.gms.internal.ads.C2635Qh;
import com.google.android.gms.internal.ads.C2861Yh;
import com.google.android.gms.internal.ads.C2946ai;

@TargetApi(17)
@C2478La
/* renamed from: com.google.android.gms.internal.ads.Nh */
public final class C2543Nh<WebViewT extends C2635Qh & C2861Yh & C2946ai> {

    /* renamed from: a */
    private final C2604Ph f7651a;

    /* renamed from: b */
    private final WebViewT f7652b;

    private C2543Nh(WebViewT webviewt, C2604Ph ph) {
        this.f7651a = ph;
        this.f7652b = webviewt;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.Ph, com.google.android.gms.internal.ads.Oh] */
    /* renamed from: a */
    public static C2543Nh<C3520uh> m10645a(C3520uh uhVar) {
        return new C2543Nh<>(uhVar, new C2572Oh(uhVar));
    }
}
