package p101d.p129g.p159f.p176g.p177a.p178a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: d.g.f.g.a.a.c */
final class C5838c {

    /* renamed from: a */
    private final List<C5837b> f16138a;

    /* renamed from: b */
    private final int f16139b;

    /* renamed from: c */
    private final boolean f16140c;

    C5838c(List<C5837b> list, int i, boolean z) {
        this.f16138a = new ArrayList(list);
        this.f16139b = i;
        this.f16140c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C5837b> mo15530a() {
        return this.f16138a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo15531a(List<C5837b> list) {
        return this.f16138a.equals(list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo15532b() {
        return this.f16139b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5838c)) {
            return false;
        }
        C5838c cVar = (C5838c) obj;
        return this.f16138a.equals(cVar.mo15530a()) && this.f16140c == cVar.f16140c;
    }

    public int hashCode() {
        return this.f16138a.hashCode() ^ Boolean.valueOf(this.f16140c).hashCode();
    }

    public String toString() {
        return "{ " + this.f16138a + " }";
    }
}
