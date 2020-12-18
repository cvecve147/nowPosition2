package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.Sl */
final class C2697Sl {

    /* renamed from: a */
    private final ConcurrentHashMap<C2727Tl, List<Throwable>> f8278a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f8279b = new ReferenceQueue<>();

    C2697Sl() {
    }

    /* renamed from: a */
    public final List<Throwable> mo8831a(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> poll = this.f8279b.poll();
            if (poll != null) {
                this.f8278a.remove(poll);
            } else {
                return this.f8278a.get(new C2727Tl(th, (ReferenceQueue<Throwable>) null));
            }
        }
    }
}
