package p101d.p129g.p152e.p154b.p155a;

import java.util.ArrayList;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5594J;
import p101d.p129g.p152e.C5731p;
import p101d.p129g.p152e.p154b.C5705x;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.n */
public final class C5664n extends C5593I<Object> {

    /* renamed from: a */
    public static final C5594J f15685a = new C5662l();

    /* renamed from: b */
    private final C5731p f15686b;

    C5664n(C5731p pVar) {
        this.f15686b = pVar;
    }

    /* renamed from: a */
    public Object mo15096a(C5716b bVar) {
        switch (C5663m.f15684a[bVar.mo15165p().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                bVar.mo15151a();
                while (bVar.mo15157g()) {
                    arrayList.add(mo15096a(bVar));
                }
                bVar.mo15154d();
                return arrayList;
            case 2:
                C5705x xVar = new C5705x();
                bVar.mo15152b();
                while (bVar.mo15157g()) {
                    xVar.put(bVar.mo15162m(), mo15096a(bVar));
                }
                bVar.mo15155e();
                return xVar;
            case 3:
                return bVar.mo15164o();
            case 4:
                return Double.valueOf(bVar.mo15159j());
            case 5:
                return Boolean.valueOf(bVar.mo15158i());
            case 6:
                bVar.mo15163n();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, Object obj) {
        if (obj == null) {
            dVar.mo15186h();
            return;
        }
        C5593I<?> a = this.f15686b.mo15289a(obj.getClass());
        if (a instanceof C5664n) {
            dVar.mo15179b();
            dVar.mo15183d();
            return;
        }
        a.mo15097a(dVar, obj);
    }
}
