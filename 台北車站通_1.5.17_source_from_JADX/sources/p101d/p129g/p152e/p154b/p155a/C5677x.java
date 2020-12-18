package p101d.p129g.p152e.p154b.p155a;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p101d.p129g.p152e.C5588D;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.x */
class C5677x extends C5593I<AtomicIntegerArray> {
    C5677x() {
    }

    /* renamed from: a */
    public AtomicIntegerArray m21483a(C5716b bVar) {
        ArrayList arrayList = new ArrayList();
        bVar.mo15151a();
        while (bVar.mo15157g()) {
            try {
                arrayList.add(Integer.valueOf(bVar.mo15160k()));
            } catch (NumberFormatException e) {
                throw new C5588D((Throwable) e);
            }
        }
        bVar.mo15154d();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, AtomicIntegerArray atomicIntegerArray) {
        dVar.mo15174a();
        int length = atomicIntegerArray.length();
        for (int i = 0; i < length; i++) {
            dVar.mo15175a((long) atomicIntegerArray.get(i));
        }
        dVar.mo15180c();
    }
}
