package p101d.p191i.p192a.p194b.p195a;

import java.util.ArrayList;
import p101d.p191i.p192a.p199d.C6010a;

/* renamed from: d.i.a.b.a.a */
class C5983a extends ArrayList<C6010a> {

    /* renamed from: a */
    final /* synthetic */ C5986d f16613a;

    C5983a(C5986d dVar) {
        this.f16613a = dVar;
    }

    /* renamed from: a */
    public boolean add(C6010a aVar) {
        synchronized (this) {
            if (size() != 0) {
                if (aVar.f16756a < ((C6010a) get(size() - 1)).f16756a) {
                    int i = 0;
                    while (true) {
                        if (i >= size()) {
                            break;
                        } else if (aVar.f16756a <= ((C6010a) get(i)).f16756a) {
                            super.add(i, aVar);
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            super.add(aVar);
        }
        return true;
    }

    public void clear() {
        super.clear();
        C5989f unused = this.f16613a.f16636e = null;
    }
}
