package p299tw.navin.navinmap.map;

import java.util.Comparator;
import p299tw.navin.navinmap.map.C7030F;

/* renamed from: tw.navin.navinmap.map.E */
class C7029E implements Comparator<C7030F.C7037g> {

    /* renamed from: a */
    final /* synthetic */ C7030F.C7031a f19329a;

    C7029E(C7030F.C7031a aVar) {
        this.f19329a = aVar;
    }

    /* renamed from: a */
    public int compare(C7030F.C7037g gVar, C7030F.C7037g gVar2) {
        int i = gVar.f19381b;
        int i2 = gVar2.f19381b;
        if (i > i2) {
            return -1;
        }
        return i < i2 ? 1 : 0;
    }
}
