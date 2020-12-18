package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import java.util.List;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.Pz */
public interface C2626Pz extends IInterface {
    /* renamed from: B */
    void mo8705B();

    /* renamed from: Ba */
    C2880Yz mo8706Ba();

    /* renamed from: Ja */
    C2965bA mo8707Ja();

    /* renamed from: Ta */
    C3052eA mo8708Ta();

    /* renamed from: Z */
    boolean mo8709Z();

    /* renamed from: a */
    void mo8710a(zzjj zzjj, String str);

    /* renamed from: a */
    void mo8711a(zzjj zzjj, String str, String str2);

    /* renamed from: a */
    void mo8712a(C5464b bVar, C2910_c _cVar, List<String> list);

    /* renamed from: a */
    void mo8713a(C5464b bVar, zzjj zzjj, String str, C2712Sz sz);

    /* renamed from: a */
    void mo8714a(C5464b bVar, zzjj zzjj, String str, C2910_c _cVar, String str2);

    /* renamed from: a */
    void mo8715a(C5464b bVar, zzjj zzjj, String str, String str2, C2712Sz sz);

    /* renamed from: a */
    void mo8716a(C5464b bVar, zzjj zzjj, String str, String str2, C2712Sz sz, zzpl zzpl, List<String> list);

    /* renamed from: a */
    void mo8717a(C5464b bVar, zzjn zzjn, zzjj zzjj, String str, C2712Sz sz);

    /* renamed from: a */
    void mo8718a(C5464b bVar, zzjn zzjn, zzjj zzjj, String str, String str2, C2712Sz sz);

    /* renamed from: a */
    void mo8719a(boolean z);

    void destroy();

    Bundle getInterstitialAdapterInfo();

    C2987bu getVideoController();

    C5464b getView();

    boolean isInitialized();

    /* renamed from: ja */
    C3507tw mo8725ja();

    void pause();

    void showInterstitial();

    void showVideo();

    /* renamed from: u */
    void mo8729u(C5464b bVar);

    /* renamed from: ua */
    Bundle mo8730ua();

    Bundle zzmq();
}
