package p208e.p209a.p210a.p211a.p212a.p215c;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import p208e.p209a.p210a.p211a.p212a.p215c.C6118h;
import p208e.p209a.p210a.p211a.p212a.p215c.C6127p;
import p208e.p209a.p210a.p211a.p212a.p215c.C6131s;

/* renamed from: e.a.a.a.a.c.i */
public class C6119i<E extends C6118h & C6131s & C6127p> extends PriorityBlockingQueue<E> {

    /* renamed from: a */
    final Queue<E> f17105a = new LinkedList();

    /* renamed from: b */
    private final ReentrantLock f17106b = new ReentrantLock();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public E mo16118a(int i, Long l, TimeUnit timeUnit) {
        E b;
        while (true) {
            b = mo16123b(i, l, timeUnit);
            if (b == null || mo16121a(b)) {
                return b;
            }
            mo16120a(i, b);
        }
        return b;
    }

    /* renamed from: a */
    public void mo16119a() {
        try {
            this.f17106b.lock();
            Iterator it = this.f17105a.iterator();
            while (it.hasNext()) {
                C6118h hVar = (C6118h) it.next();
                if (mo16121a(hVar)) {
                    super.offer(hVar);
                    it.remove();
                }
            }
        } finally {
            this.f17106b.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo16120a(int i, E e) {
        try {
            this.f17106b.lock();
            if (i == 1) {
                super.remove(e);
            }
            return this.f17105a.offer(e);
        } finally {
            this.f17106b.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo16121a(E e) {
        return e.mo16116b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <T> T[] mo16122a(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + length2);
        System.arraycopy(tArr, 0, tArr3, 0, length);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public E mo16123b(int i, Long l, TimeUnit timeUnit) {
        E e;
        if (i == 0) {
            e = super.take();
        } else if (i == 1) {
            e = super.peek();
        } else if (i == 2) {
            e = super.poll();
        } else if (i != 3) {
            return null;
        } else {
            e = super.poll(l.longValue(), timeUnit);
        }
        return (C6118h) e;
    }

    public void clear() {
        try {
            this.f17106b.lock();
            this.f17105a.clear();
            super.clear();
        } finally {
            this.f17106b.unlock();
        }
    }

    public boolean contains(Object obj) {
        try {
            this.f17106b.lock();
            return super.contains(obj) || this.f17105a.contains(obj);
        } finally {
            this.f17106b.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection) {
        try {
            this.f17106b.lock();
            int drainTo = super.drainTo(collection) + this.f17105a.size();
            while (!this.f17105a.isEmpty()) {
                collection.add(this.f17105a.poll());
            }
            return drainTo;
        } finally {
            this.f17106b.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection, int i) {
        try {
            this.f17106b.lock();
            int drainTo = super.drainTo(collection, i);
            while (!this.f17105a.isEmpty() && drainTo <= i) {
                collection.add(this.f17105a.poll());
                drainTo++;
            }
            return drainTo;
        } finally {
            this.f17106b.unlock();
        }
    }

    public E peek() {
        try {
            return mo16118a(1, (Long) null, (TimeUnit) null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public E poll() {
        try {
            return mo16118a(2, (Long) null, (TimeUnit) null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public E poll(long j, TimeUnit timeUnit) {
        return mo16118a(3, Long.valueOf(j), timeUnit);
    }

    public boolean remove(Object obj) {
        try {
            this.f17106b.lock();
            return super.remove(obj) || this.f17105a.remove(obj);
        } finally {
            this.f17106b.unlock();
        }
    }

    public boolean removeAll(Collection<?> collection) {
        try {
            this.f17106b.lock();
            return this.f17105a.removeAll(collection) | super.removeAll(collection);
        } finally {
            this.f17106b.unlock();
        }
    }

    public int size() {
        try {
            this.f17106b.lock();
            return this.f17105a.size() + super.size();
        } finally {
            this.f17106b.unlock();
        }
    }

    public E take() {
        return mo16118a(0, (Long) null, (TimeUnit) null);
    }

    public Object[] toArray() {
        try {
            this.f17106b.lock();
            return mo16122a((T[]) super.toArray(), (T[]) this.f17105a.toArray());
        } finally {
            this.f17106b.unlock();
        }
    }

    public <T> T[] toArray(T[] tArr) {
        try {
            this.f17106b.lock();
            return mo16122a((T[]) super.toArray(tArr), (T[]) this.f17105a.toArray(tArr));
        } finally {
            this.f17106b.unlock();
        }
    }
}
