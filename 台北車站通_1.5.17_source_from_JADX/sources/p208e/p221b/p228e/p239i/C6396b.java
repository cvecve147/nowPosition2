package p208e.p221b.p228e.p239i;

import p208e.p221b.p228e.p231c.C6276g;
import p250g.p262c.C6584b;
import p250g.p262c.C6585c;

/* renamed from: e.b.e.i.b */
public enum C6396b implements C6276g<Object> {
    INSTANCE;

    /* renamed from: a */
    public static void m23924a(Throwable th, C6584b<?> bVar) {
        bVar.mo13388a((C6585c) INSTANCE);
        bVar.mo13390a(th);
    }

    /* renamed from: a */
    public int mo16357a(int i) {
        return i & 2;
    }

    public void cancel() {
    }

    public void clear() {
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public Object poll() {
        return null;
    }

    public void request(long j) {
        C6397c.m23928a(j);
    }

    public String toString() {
        return "EmptySubscription";
    }
}
