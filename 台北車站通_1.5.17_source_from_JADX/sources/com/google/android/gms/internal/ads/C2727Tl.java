package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Tl */
final class C2727Tl extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f8347a;

    public C2727Tl(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, (ReferenceQueue) null);
        if (th != null) {
            this.f8347a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C2727Tl.class) {
            if (this == obj) {
                return true;
            }
            C2727Tl tl = (C2727Tl) obj;
            return this.f8347a == tl.f8347a && get() == tl.get();
        }
    }

    public final int hashCode() {
        return this.f8347a;
    }
}
