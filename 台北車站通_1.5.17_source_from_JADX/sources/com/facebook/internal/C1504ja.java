package com.facebook.internal;

import com.facebook.internal.C1506ka;

/* renamed from: com.facebook.internal.ja */
class C1504ja implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1506ka.C1508b f5175a;

    /* renamed from: b */
    final /* synthetic */ C1506ka f5176b;

    C1504ja(C1506ka kaVar, C1506ka.C1508b bVar) {
        this.f5176b = kaVar;
        this.f5175a = bVar;
    }

    public void run() {
        try {
            this.f5175a.mo6236b().run();
        } finally {
            this.f5176b.m7047b(this.f5175a);
        }
    }
}
