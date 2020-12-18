package p101d.p129g.p131b.p132a.p134b;

import android.os.Bundle;
import java.util.Iterator;
import p101d.p129g.p131b.p132a.p134b.C5462a;

/* renamed from: d.g.b.a.b.g */
final class C5472g implements C5469e<T> {

    /* renamed from: a */
    private final /* synthetic */ C5462a f15381a;

    C5472g(C5462a aVar) {
        this.f15381a = aVar;
    }

    /* renamed from: a */
    public final void mo14929a(T t) {
        C5467c unused = this.f15381a.f15374a = t;
        Iterator it = this.f15381a.f15376c.iterator();
        while (it.hasNext()) {
            ((C5462a.C5463a) it.next()).mo14927a(this.f15381a.f15374a);
        }
        this.f15381a.f15376c.clear();
        Bundle unused2 = this.f15381a.f15375b = null;
    }
}
