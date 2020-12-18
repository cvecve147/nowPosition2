package p101d.p129g.p152e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: d.g.e.r */
public final class C5734r extends C5737u implements Iterable<C5737u> {

    /* renamed from: a */
    private final List<C5737u> f15853a = new ArrayList();

    /* renamed from: a */
    public void mo15305a(C5737u uVar) {
        if (uVar == null) {
            uVar = C5739w.f15854a;
        }
        this.f15853a.add(uVar);
    }

    /* renamed from: d */
    public String mo15083d() {
        if (this.f15853a.size() == 1) {
            return this.f15853a.get(0).mo15083d();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C5734r) && ((C5734r) obj).f15853a.equals(this.f15853a));
    }

    public int hashCode() {
        return this.f15853a.hashCode();
    }

    public Iterator<C5737u> iterator() {
        return this.f15853a.iterator();
    }
}
