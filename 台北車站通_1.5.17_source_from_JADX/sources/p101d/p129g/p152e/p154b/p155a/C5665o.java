package p101d.p129g.p152e.p154b.p155a;

import java.lang.reflect.Field;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5731p;
import p101d.p129g.p152e.p154b.p155a.C5666p;
import p101d.p129g.p152e.p157c.C5713a;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.o */
class C5665o extends C5666p.C5668b {

    /* renamed from: d */
    final /* synthetic */ Field f15687d;

    /* renamed from: e */
    final /* synthetic */ boolean f15688e;

    /* renamed from: f */
    final /* synthetic */ C5593I f15689f;

    /* renamed from: g */
    final /* synthetic */ C5731p f15690g;

    /* renamed from: h */
    final /* synthetic */ C5713a f15691h;

    /* renamed from: i */
    final /* synthetic */ boolean f15692i;

    /* renamed from: j */
    final /* synthetic */ C5666p f15693j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5665o(C5666p pVar, String str, boolean z, boolean z2, Field field, boolean z3, C5593I i, C5731p pVar2, C5713a aVar, boolean z4) {
        super(str, z, z2);
        this.f15693j = pVar;
        this.f15687d = field;
        this.f15688e = z3;
        this.f15689f = i;
        this.f15690g = pVar2;
        this.f15691h = aVar;
        this.f15692i = z4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15190a(C5716b bVar, Object obj) {
        Object a = this.f15689f.mo15096a(bVar);
        if (a != null || !this.f15692i) {
            this.f15687d.set(obj, a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15191a(C5718d dVar, Object obj) {
        (this.f15688e ? this.f15689f : new C5676w(this.f15690g, this.f15689f, this.f15691h.mo15268b())).mo15097a(dVar, this.f15687d.get(obj));
    }

    /* renamed from: a */
    public boolean mo15192a(Object obj) {
        return this.f15701b && this.f15687d.get(obj) != obj;
    }
}
