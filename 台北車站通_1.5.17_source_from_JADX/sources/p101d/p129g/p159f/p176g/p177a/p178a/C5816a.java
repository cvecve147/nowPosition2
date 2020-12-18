package p101d.p129g.p159f.p176g.p177a.p178a;

import java.util.List;
import p101d.p129g.p159f.p167c.C5772a;

/* renamed from: d.g.f.g.a.a.a */
final class C5816a {
    /* renamed from: a */
    static C5772a m21973a(List<C5837b> list) {
        int size = (list.size() * 2) - 1;
        if (list.get(list.size() - 1).mo15525c() == null) {
            size--;
        }
        C5772a aVar = new C5772a(size * 12);
        int b = list.get(0).mo15525c().mo15540b();
        int i = 0;
        for (int i2 = 11; i2 >= 0; i2--) {
            if (((1 << i2) & b) != 0) {
                aVar.mo15375d(i);
            }
            i++;
        }
        for (int i3 = 1; i3 < list.size(); i3++) {
            C5837b bVar = list.get(i3);
            int b2 = bVar.mo15524b().mo15540b();
            int i4 = i;
            for (int i5 = 11; i5 >= 0; i5--) {
                if (((1 << i5) & b2) != 0) {
                    aVar.mo15375d(i4);
                }
                i4++;
            }
            if (bVar.mo15525c() != null) {
                int b3 = bVar.mo15525c().mo15540b();
                for (int i6 = 11; i6 >= 0; i6--) {
                    if (((1 << i6) & b3) != 0) {
                        aVar.mo15375d(i4);
                    }
                    i4++;
                }
            }
            i = i4;
        }
        return aVar;
    }
}
