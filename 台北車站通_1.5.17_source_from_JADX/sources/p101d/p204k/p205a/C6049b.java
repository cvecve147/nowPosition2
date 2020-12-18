package p101d.p204k.p205a;

import java.util.Iterator;
import java.util.List;
import p208e.p221b.C6433l;
import p208e.p221b.C6436o;
import p208e.p221b.p227d.C6244f;

/* renamed from: d.k.a.b */
class C6049b implements C6244f<List<C6048a>, C6436o<Boolean>> {

    /* renamed from: a */
    final /* synthetic */ C6050c f16954a;

    C6049b(C6050c cVar) {
        this.f16954a = cVar;
    }

    /* renamed from: a */
    public C6436o<Boolean> apply(List<C6048a> list) {
        boolean z;
        if (list.isEmpty()) {
            return C6433l.m24026b();
        }
        Iterator<C6048a> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!it.next().f16952b) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        return C6433l.m24028b(Boolean.valueOf(z));
    }
}
