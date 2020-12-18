package android.support.p007v4.widget;

import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: android.support.v4.widget.n */
public final class C0555n {

    /* renamed from: a */
    private static final C0557b f2068a = (Build.VERSION.SDK_INT >= 21 ? new C0556a() : new C0557b());

    /* renamed from: android.support.v4.widget.n$a */
    static class C0556a extends C0557b {
        C0556a() {
        }

        /* renamed from: a */
        public void mo2385a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* renamed from: android.support.v4.widget.n$b */
    static class C0557b {
        C0557b() {
        }

        /* renamed from: a */
        public void mo2385a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f);
        }
    }

    /* renamed from: a */
    public static void m2739a(EdgeEffect edgeEffect, float f, float f2) {
        f2068a.mo2385a(edgeEffect, f, f2);
    }
}
