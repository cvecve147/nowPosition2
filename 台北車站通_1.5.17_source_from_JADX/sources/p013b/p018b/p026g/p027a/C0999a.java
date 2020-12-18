package p013b.p018b.p026g.p027a;

import android.app.Fragment;
import android.os.Build;

@Deprecated
/* renamed from: b.b.g.a.a */
public class C0999a {

    /* renamed from: a */
    static final C1004e f3894a;

    /* renamed from: b.b.g.a.a$a */
    static class C1000a extends C1003d {
        C1000a() {
        }

        /* renamed from: a */
        public void mo5000a(Fragment fragment, boolean z) {
            fragment.setUserVisibleHint(z);
        }
    }

    /* renamed from: b.b.g.a.a$b */
    static class C1001b extends C1000a {
        C1001b() {
        }
    }

    /* renamed from: b.b.g.a.a$c */
    static class C1002c extends C1001b {
        C1002c() {
        }

        /* renamed from: a */
        public void mo5000a(Fragment fragment, boolean z) {
            fragment.setUserVisibleHint(z);
        }
    }

    /* renamed from: b.b.g.a.a$d */
    static class C1003d implements C1004e {
        C1003d() {
        }

        /* renamed from: a */
        public void mo5000a(Fragment fragment, boolean z) {
        }
    }

    /* renamed from: b.b.g.a.a$e */
    interface C1004e {
        /* renamed from: a */
        void mo5000a(Fragment fragment, boolean z);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f3894a = i >= 24 ? new C1002c() : i >= 23 ? new C1001b() : i >= 15 ? new C1000a() : new C1003d();
    }

    @Deprecated
    /* renamed from: a */
    public static void m5371a(Fragment fragment, boolean z) {
        fragment.setMenuVisibility(z);
    }

    @Deprecated
    /* renamed from: b */
    public static void m5372b(Fragment fragment, boolean z) {
        f3894a.mo5000a(fragment, z);
    }
}
