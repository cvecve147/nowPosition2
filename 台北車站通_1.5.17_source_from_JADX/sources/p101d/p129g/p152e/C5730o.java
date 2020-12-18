package p101d.p129g.p152e;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.o */
class C5730o extends C5593I<AtomicLongArray> {

    /* renamed from: a */
    final /* synthetic */ C5593I f15838a;

    C5730o(C5593I i) {
        this.f15838a = i;
    }

    /* renamed from: a */
    public AtomicLongArray m21656a(C5716b bVar) {
        ArrayList arrayList = new ArrayList();
        bVar.mo15151a();
        while (bVar.mo15157g()) {
            arrayList.add(Long.valueOf(((Number) this.f15838a.mo15096a(bVar)).longValue()));
        }
        bVar.mo15154d();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, AtomicLongArray atomicLongArray) {
        dVar.mo15174a();
        int length = atomicLongArray.length();
        for (int i = 0; i < length; i++) {
            this.f15838a.mo15097a(dVar, Long.valueOf(atomicLongArray.get(i)));
        }
        dVar.mo15180c();
    }
}
