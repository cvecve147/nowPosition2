package p101d.p129g.p152e;

import java.util.Map;
import java.util.Set;
import p101d.p129g.p152e.p154b.C5705x;

/* renamed from: d.g.e.x */
public final class C5740x extends C5737u {

    /* renamed from: a */
    private final C5705x<String, C5737u> f15855a = new C5705x<>();

    /* renamed from: a */
    public C5737u mo15320a(String str) {
        return this.f15855a.get(str);
    }

    /* renamed from: a */
    public void mo15321a(String str, C5737u uVar) {
        if (uVar == null) {
            uVar = C5739w.f15854a;
        }
        this.f15855a.put(str, uVar);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C5740x) && ((C5740x) obj).f15855a.equals(this.f15855a));
    }

    public int hashCode() {
        return this.f15855a.hashCode();
    }

    /* renamed from: i */
    public Set<Map.Entry<String, C5737u>> mo15324i() {
        return this.f15855a.entrySet();
    }
}
