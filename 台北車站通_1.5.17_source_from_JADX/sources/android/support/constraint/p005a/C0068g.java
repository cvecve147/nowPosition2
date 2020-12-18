package android.support.constraint.p005a;

/* renamed from: android.support.constraint.a.g */
class C0068g<T> implements C0067f<T> {

    /* renamed from: a */
    private final Object[] f379a;

    /* renamed from: b */
    private int f380b;

    C0068g(int i) {
        if (i > 0) {
            this.f379a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public T mo259a() {
        int i = this.f380b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f379a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f380b = i - 1;
        return t;
    }

    /* renamed from: a */
    public void mo260a(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f380b;
            Object[] objArr = this.f379a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f380b = i3 + 1;
            }
        }
    }

    /* renamed from: a */
    public boolean mo261a(T t) {
        int i = this.f380b;
        Object[] objArr = this.f379a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f380b = i + 1;
        return true;
    }
}
