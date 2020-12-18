package p013b.p018b.p028h.p039h;

/* renamed from: b.b.h.h.o */
public class C1098o<T> implements C1097n<T> {

    /* renamed from: a */
    private final Object[] f4080a;

    /* renamed from: b */
    private int f4081b;

    public C1098o(int i) {
        if (i > 0) {
            this.f4080a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: b */
    private boolean m5682b(T t) {
        for (int i = 0; i < this.f4081b; i++) {
            if (this.f4080a[i] == t) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public T mo5227a() {
        int i = this.f4081b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f4080a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f4081b = i - 1;
        return t;
    }

    /* renamed from: a */
    public boolean mo5228a(T t) {
        if (!m5682b(t)) {
            int i = this.f4081b;
            Object[] objArr = this.f4080a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f4081b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
