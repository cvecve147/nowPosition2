package p101d.p129g.p131b.p132a.p137e.p140c;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: d.g.b.a.e.c.e */
final class C5506e {

    /* renamed from: a */
    private final ConcurrentHashMap<C5507f, List<Throwable>> f15415a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f15416b = new ReferenceQueue<>();

    C5506e() {
    }

    /* renamed from: a */
    public final List<Throwable> mo14952a(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> poll = this.f15416b.poll();
            if (poll == null) {
                break;
            }
            this.f15415a.remove(poll);
        }
        List<Throwable> list = this.f15415a.get(new C5507f(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f15415a.putIfAbsent(new C5507f(th, this.f15416b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
