package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ul */
final class C2754Ul extends C2670Rl {

    /* renamed from: b */
    private final C2697Sl f8389b = new C2697Sl();

    C2754Ul() {
    }

    /* renamed from: a */
    public final void mo8746a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> a = this.f8389b.mo8831a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable printStackTrace : a) {
                    printWriter.print("Suppressed: ");
                    printStackTrace.printStackTrace(printWriter);
                }
            }
        }
    }
}
