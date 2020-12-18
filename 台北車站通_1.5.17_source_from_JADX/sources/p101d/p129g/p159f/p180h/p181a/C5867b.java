package p101d.p129g.p159f.p180h.p181a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p101d.p129g.p159f.p180h.C5862a;

/* renamed from: d.g.f.h.a.b */
final class C5867b {

    /* renamed from: a */
    private final Map<Integer, Integer> f16230a = new HashMap();

    C5867b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15594a(int i) {
        Integer num = this.f16230a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f16230a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] mo15595a() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry next : this.f16230a.entrySet()) {
            if (((Integer) next.getValue()).intValue() > i) {
                i = ((Integer) next.getValue()).intValue();
                arrayList.clear();
            } else if (((Integer) next.getValue()).intValue() != i) {
            }
            arrayList.add(next.getKey());
        }
        return C5862a.m22164a((Collection<Integer>) arrayList);
    }
}
