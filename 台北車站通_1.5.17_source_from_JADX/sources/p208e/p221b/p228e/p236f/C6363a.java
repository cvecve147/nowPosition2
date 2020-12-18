package p208e.p221b.p228e.p236f;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p208e.p221b.p228e.p231c.C6278i;
import p208e.p221b.p228e.p240j.C6411k;

/* renamed from: e.b.e.f.a */
public final class C6363a<E> extends AtomicReferenceArray<E> implements C6278i<E> {

    /* renamed from: a */
    private static final Integer f17648a = Integer.getInteger("jctools.spsc.max.lookahead.step", SVGParser.ENTITY_WATCH_BUFFER_SIZE);

    /* renamed from: b */
    final int f17649b = (length() - 1);

    /* renamed from: c */
    final AtomicLong f17650c = new AtomicLong();

    /* renamed from: d */
    long f17651d;

    /* renamed from: e */
    final AtomicLong f17652e = new AtomicLong();

    /* renamed from: f */
    final int f17653f;

    public C6363a(int i) {
        super(C6411k.m23961a(i));
        this.f17653f = Math.min(i / 4, f17648a.intValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo16448a(long j) {
        return ((int) j) & this.f17649b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo16449a(long j, int i) {
        return ((int) j) & i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public E mo16450a(int i) {
        return get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16451a(int i, E e) {
        lazySet(i, e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16452b(long j) {
        this.f17652e.lazySet(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo16453c(long j) {
        this.f17650c.lazySet(j);
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return this.f17650c.get() == this.f17652e.get();
    }

    public boolean offer(E e) {
        if (e != null) {
            int i = this.f17649b;
            long j = this.f17650c.get();
            int a = mo16449a(j, i);
            if (j >= this.f17651d) {
                long j2 = ((long) this.f17653f) + j;
                if (mo16450a(mo16449a(j2, i)) == null) {
                    this.f17651d = j2;
                } else if (mo16450a(a) != null) {
                    return false;
                }
            }
            mo16451a(a, e);
            mo16453c(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public E poll() {
        long j = this.f17652e.get();
        int a = mo16448a(j);
        E a2 = mo16450a(a);
        if (a2 == null) {
            return null;
        }
        mo16452b(j + 1);
        mo16451a(a, (Object) null);
        return a2;
    }
}
