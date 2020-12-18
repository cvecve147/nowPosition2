package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Zu */
public final class C2902Zu {

    /* renamed from: a */
    private final Map<String, C2875Yu> f8719a = new HashMap();

    /* renamed from: b */
    private final C2930_u f8720b;

    public C2902Zu(C2930_u _uVar) {
        this.f8720b = _uVar;
    }

    /* renamed from: a */
    public final C2930_u mo9126a() {
        return this.f8720b;
    }

    /* renamed from: a */
    public final void mo9127a(String str, C2875Yu yu) {
        this.f8719a.put(str, yu);
    }

    /* renamed from: a */
    public final void mo9128a(String str, String str2, long j) {
        C2930_u _uVar = this.f8720b;
        C2875Yu yu = this.f8719a.get(str2);
        String[] strArr = {str};
        if (!(_uVar == null || yu == null)) {
            _uVar.mo9179a(yu, j, strArr);
        }
        Map<String, C2875Yu> map = this.f8719a;
        C2930_u _uVar2 = this.f8720b;
        map.put(str, _uVar2 == null ? null : _uVar2.mo9175a(j));
    }
}
