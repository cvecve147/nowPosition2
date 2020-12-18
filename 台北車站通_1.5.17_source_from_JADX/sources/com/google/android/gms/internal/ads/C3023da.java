package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.da */
final class C3023da implements C2371Hf<List<C3420qv>, C3306mv> {

    /* renamed from: a */
    private final /* synthetic */ String f9048a;

    /* renamed from: b */
    private final /* synthetic */ Integer f9049b;

    /* renamed from: c */
    private final /* synthetic */ Integer f9050c;

    /* renamed from: d */
    private final /* synthetic */ int f9051d;

    /* renamed from: e */
    private final /* synthetic */ int f9052e;

    /* renamed from: f */
    private final /* synthetic */ int f9053f;

    /* renamed from: g */
    private final /* synthetic */ int f9054g;

    /* renamed from: h */
    private final /* synthetic */ boolean f9055h;

    C3023da(C2825X x, String str, Integer num, Integer num2, int i, int i2, int i3, int i4, boolean z) {
        this.f9048a = str;
        this.f9049b = num;
        this.f9050c = num2;
        this.f9051d = i;
        this.f9052e = i2;
        this.f9053f = i3;
        this.f9054g = i4;
        this.f9055h = z;
    }

    public final /* synthetic */ Object apply(Object obj) {
        List list = (List) obj;
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String str = this.f9048a;
        Integer num2 = this.f9049b;
        Integer num3 = this.f9050c;
        int i = this.f9051d;
        if (i > 0) {
            num = Integer.valueOf(i);
        }
        return new C3306mv(str, list, num2, num3, num, this.f9052e + this.f9053f, this.f9054g, this.f9055h);
    }
}
