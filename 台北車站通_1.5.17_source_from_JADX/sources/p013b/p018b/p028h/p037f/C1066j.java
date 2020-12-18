package p013b.p018b.p028h.p037f;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: b.b.h.f.j */
class C1066j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f4000a;

    /* renamed from: b */
    final /* synthetic */ Callable f4001b;

    /* renamed from: c */
    final /* synthetic */ ReentrantLock f4002c;

    /* renamed from: d */
    final /* synthetic */ AtomicBoolean f4003d;

    /* renamed from: e */
    final /* synthetic */ Condition f4004e;

    /* renamed from: f */
    final /* synthetic */ C1067k f4005f;

    C1066j(C1067k kVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
        this.f4005f = kVar;
        this.f4000a = atomicReference;
        this.f4001b = callable;
        this.f4002c = reentrantLock;
        this.f4003d = atomicBoolean;
        this.f4004e = condition;
    }

    public void run() {
        try {
            this.f4000a.set(this.f4001b.call());
        } catch (Exception unused) {
        }
        this.f4002c.lock();
        try {
            this.f4003d.set(false);
            this.f4004e.signal();
        } finally {
            this.f4002c.unlock();
        }
    }
}
