package p101d.p129g.p159f.p176g.p177a;

/* renamed from: d.g.f.g.a.b */
public class C5840b {

    /* renamed from: a */
    private final int f16151a;

    /* renamed from: b */
    private final int f16152b;

    public C5840b(int i, int i2) {
        this.f16151a = i;
        this.f16152b = i2;
    }

    /* renamed from: a */
    public final int mo15539a() {
        return this.f16152b;
    }

    /* renamed from: b */
    public final int mo15540b() {
        return this.f16151a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5840b)) {
            return false;
        }
        C5840b bVar = (C5840b) obj;
        return this.f16151a == bVar.f16151a && this.f16152b == bVar.f16152b;
    }

    public final int hashCode() {
        return this.f16151a ^ this.f16152b;
    }

    public final String toString() {
        return this.f16151a + "(" + this.f16152b + ')';
    }
}
