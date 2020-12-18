package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.fa */
final class C3081fa implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicInteger f9126a;

    /* renamed from: b */
    private final /* synthetic */ int f9127b;

    /* renamed from: c */
    private final /* synthetic */ C3116gg f9128c;

    /* renamed from: d */
    private final /* synthetic */ List f9129d;

    C3081fa(AtomicInteger atomicInteger, int i, C3116gg ggVar, List list) {
        this.f9126a = atomicInteger;
        this.f9127b = i;
        this.f9128c = ggVar;
        this.f9129d = list;
    }

    public final void run() {
        if (this.f9126a.incrementAndGet() >= this.f9127b) {
            try {
                this.f9128c.mo9464b(C2825X.m11531b(this.f9129d));
            } catch (InterruptedException | ExecutionException e) {
                C2227Cf.m9535c("Unable to convert list of futures to a future of list", e);
            }
        }
    }
}
