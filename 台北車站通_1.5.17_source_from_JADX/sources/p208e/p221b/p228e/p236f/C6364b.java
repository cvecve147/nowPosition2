package p208e.p221b.p228e.p236f;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p208e.p221b.p228e.p231c.C6278i;
import p208e.p221b.p228e.p240j.C6411k;

/* renamed from: e.b.e.f.b */
public final class C6364b<T> implements C6278i<T> {

    /* renamed from: a */
    static final int f17654a = Integer.getInteger("jctools.spsc.max.lookahead.step", SVGParser.ENTITY_WATCH_BUFFER_SIZE).intValue();

    /* renamed from: b */
    private static final Object f17655b = new Object();

    /* renamed from: c */
    final AtomicLong f17656c = new AtomicLong();

    /* renamed from: d */
    int f17657d;

    /* renamed from: e */
    long f17658e;

    /* renamed from: f */
    final int f17659f;

    /* renamed from: g */
    AtomicReferenceArray<Object> f17660g;

    /* renamed from: h */
    final int f17661h;

    /* renamed from: i */
    AtomicReferenceArray<Object> f17662i;

    /* renamed from: j */
    final AtomicLong f17663j = new AtomicLong();

    public C6364b(int i) {
        int a = C6411k.m23961a(Math.max(8, i));
        int i2 = a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a + 1);
        this.f17660g = atomicReferenceArray;
        this.f17659f = i2;
        m23839a(a);
        this.f17662i = atomicReferenceArray;
        this.f17661h = i2;
        this.f17658e = (long) (i2 - 1);
        m23847b(0);
    }

    /* renamed from: a */
    private static int m23834a(long j, int i) {
        int i2 = ((int) j) & i;
        m23845b(i2);
        return i2;
    }

    /* renamed from: a */
    private long m23835a() {
        return this.f17663j.get();
    }

    /* renamed from: a */
    private static <E> Object m23836a(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: a */
    private T m23837a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f17662i = atomicReferenceArray;
        int a = m23834a(j, i);
        T a2 = m23836a(atomicReferenceArray, a);
        if (a2 != null) {
            m23841a(atomicReferenceArray, a, (Object) null);
            m23840a(j + 1);
        }
        return a2;
    }

    /* renamed from: a */
    private AtomicReferenceArray<Object> m23838a(AtomicReferenceArray<Object> atomicReferenceArray) {
        int length = atomicReferenceArray.length() - 1;
        m23845b(length);
        return (AtomicReferenceArray) m23836a(atomicReferenceArray, length);
    }

    /* renamed from: a */
    private void m23839a(int i) {
        this.f17657d = Math.min(i / 4, f17654a);
    }

    /* renamed from: a */
    private void m23840a(long j) {
        this.f17663j.lazySet(j);
    }

    /* renamed from: a */
    private static void m23841a(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: a */
    private void m23842a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f17660g = atomicReferenceArray2;
        this.f17658e = (j2 + j) - 1;
        m23841a(atomicReferenceArray2, i, (Object) t);
        m23843a(atomicReferenceArray, atomicReferenceArray2);
        m23841a(atomicReferenceArray, i, f17655b);
        m23847b(j + 1);
    }

    /* renamed from: a */
    private void m23843a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        int length = atomicReferenceArray.length() - 1;
        m23845b(length);
        m23841a(atomicReferenceArray, length, (Object) atomicReferenceArray2);
    }

    /* renamed from: a */
    private boolean m23844a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m23841a(atomicReferenceArray, i, (Object) t);
        m23847b(j + 1);
        return true;
    }

    /* renamed from: b */
    private static int m23845b(int i) {
        return i;
    }

    /* renamed from: b */
    private long m23846b() {
        return this.f17656c.get();
    }

    /* renamed from: b */
    private void m23847b(long j) {
        this.f17656c.lazySet(j);
    }

    /* renamed from: c */
    private long m23848c() {
        return this.f17663j.get();
    }

    /* renamed from: d */
    private long m23849d() {
        return this.f17656c.get();
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return m23849d() == m23848c();
    }

    public boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f17660g;
            long b = m23846b();
            int i = this.f17659f;
            int a = m23834a(b, i);
            if (b < this.f17658e) {
                return m23844a(atomicReferenceArray, t, b, a);
            }
            long j = ((long) this.f17657d) + b;
            if (m23836a(atomicReferenceArray, m23834a(j, i)) == null) {
                this.f17658e = j - 1;
                return m23844a(atomicReferenceArray, t, b, a);
            } else if (m23836a(atomicReferenceArray, m23834a(1 + b, i)) == null) {
                return m23844a(atomicReferenceArray, t, b, a);
            } else {
                m23842a(atomicReferenceArray, b, a, t, (long) i);
                return true;
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f17662i;
        long a = m23835a();
        int i = this.f17661h;
        int a2 = m23834a(a, i);
        T a3 = m23836a(atomicReferenceArray, a2);
        boolean z = a3 == f17655b;
        if (a3 != null && !z) {
            m23841a(atomicReferenceArray, a2, (Object) null);
            m23840a(a + 1);
            return a3;
        } else if (z) {
            return m23837a(m23838a(atomicReferenceArray), a, i);
        } else {
            return null;
        }
    }
}
