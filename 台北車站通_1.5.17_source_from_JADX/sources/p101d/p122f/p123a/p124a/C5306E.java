package p101d.p122f.p123a.p124a;

import android.content.Context;
import java.util.Map;
import java.util.UUID;
import p208e.p209a.p210a.p211a.p212a.p214b.C6080l;
import p208e.p209a.p210a.p211a.p212a.p214b.C6091u;

/* renamed from: d.f.a.a.E */
class C5306E {

    /* renamed from: a */
    private final Context f15026a;

    /* renamed from: b */
    private final C6091u f15027b;

    /* renamed from: c */
    private final String f15028c;

    /* renamed from: d */
    private final String f15029d;

    public C5306E(Context context, C6091u uVar, String str, String str2) {
        this.f15026a = context;
        this.f15027b = uVar;
        this.f15028c = str;
        this.f15029d = str2;
    }

    /* renamed from: a */
    public C5304C mo14673a() {
        Map<C6091u.C6092a, String> g = this.f15027b.mo16076g();
        String n = C6080l.m23066n(this.f15026a);
        String m = this.f15027b.mo16082m();
        String j = this.f15027b.mo16079j();
        return new C5304C(this.f15027b.mo16074e(), UUID.randomUUID().toString(), this.f15027b.mo16075f(), g.get(C6091u.C6092a.ANDROID_ID), g.get(C6091u.C6092a.ANDROID_ADVERTISING_ID), this.f15027b.mo16083n(), g.get(C6091u.C6092a.FONT_TOKEN), n, m, j, this.f15028c, this.f15029d);
    }
}
