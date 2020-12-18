package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C2061y;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.internal.measurement.ya */
final class C3917ya<V> extends FutureTask<V> implements Comparable<C3917ya> {

    /* renamed from: a */
    private final long f11721a = C3909wa.f11690c.getAndIncrement();

    /* renamed from: b */
    final boolean f11722b;

    /* renamed from: c */
    private final String f11723c;

    /* renamed from: d */
    private final /* synthetic */ C3909wa f11724d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3917ya(C3909wa waVar, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f11724d = waVar;
        C2061y.m9067a(str);
        this.f11723c = str;
        this.f11722b = false;
        if (this.f11721a == Long.MAX_VALUE) {
            waVar.mo10385b().mo10585y().mo10592a("Tasks index overflow");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3917ya(C3909wa waVar, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.f11724d = waVar;
        C2061y.m9067a(str);
        this.f11723c = str;
        this.f11722b = z;
        if (this.f11721a == Long.MAX_VALUE) {
            waVar.mo10385b().mo10585y().mo10592a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C3917ya yaVar = (C3917ya) obj;
        boolean z = this.f11722b;
        if (z != yaVar.f11722b) {
            return z ? -1 : 1;
        }
        long j = this.f11721a;
        long j2 = yaVar.f11721a;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.f11724d.mo10385b().mo10586z().mo10593a("Two tasks share the same index. index", Long.valueOf(this.f11721a));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f11724d.mo10385b().mo10585y().mo10593a(this.f11723c, th);
        super.setException(th);
    }
}
