package p101d.p122f.p123a.p124a;

import android.content.Context;
import java.util.UUID;
import p208e.p209a.p210a.p211a.p212a.p214b.C6084n;
import p208e.p209a.p210a.p211a.p212a.p217d.C6135c;
import p208e.p209a.p210a.p211a.p212a.p217d.C6137d;
import p208e.p209a.p210a.p211a.p212a.p220g.C6167b;

/* renamed from: d.f.a.a.w */
class C5330w extends C6135c<C5301B> {

    /* renamed from: h */
    private C6167b f15081h;

    C5330w(Context context, C5305D d, C6084n nVar, C6137d dVar) {
        super(context, d, nVar, dVar, 100);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14723a(C6167b bVar) {
        this.f15081h = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo14724c() {
        UUID randomUUID = UUID.randomUUID();
        return "sa" + "_" + randomUUID.toString() + "_" + this.f17127c.mo16037a() + ".tap";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo14725e() {
        C6167b bVar = this.f15081h;
        return bVar == null ? super.mo14725e() : bVar.f17187c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo14726f() {
        C6167b bVar = this.f15081h;
        return bVar == null ? super.mo14726f() : bVar.f17189e;
    }
}
