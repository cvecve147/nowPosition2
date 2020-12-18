package p013b.p018b.p028h.p039h;

/* renamed from: b.b.h.h.m */
public class C1096m<F, S> {

    /* renamed from: a */
    public final F f4078a;

    /* renamed from: b */
    public final S f4079b;

    /* renamed from: a */
    private static boolean m5679a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1096m)) {
            return false;
        }
        C1096m mVar = (C1096m) obj;
        return m5679a(mVar.f4078a, this.f4078a) && m5679a(mVar.f4079b, this.f4079b);
    }

    public int hashCode() {
        F f = this.f4078a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f4079b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f4078a) + " " + String.valueOf(this.f4079b) + "}";
    }
}
