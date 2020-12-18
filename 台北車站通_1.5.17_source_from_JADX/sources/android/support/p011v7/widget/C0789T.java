package android.support.p011v7.widget;

import android.support.p011v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.T */
class C0789T {

    /* renamed from: a */
    final C0791b f3262a;

    /* renamed from: b */
    final C0790a f3263b = new C0790a();

    /* renamed from: c */
    final List<View> f3264c = new ArrayList();

    /* renamed from: android.support.v7.widget.T$a */
    static class C0790a {

        /* renamed from: a */
        long f3265a = 0;

        /* renamed from: b */
        C0790a f3266b;

        C0790a() {
        }

        /* renamed from: b */
        private void m4603b() {
            if (this.f3266b == null) {
                this.f3266b = new C0790a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4260a() {
            this.f3265a = 0;
            C0790a aVar = this.f3266b;
            if (aVar != null) {
                aVar.mo4260a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4261a(int i) {
            if (i >= 64) {
                C0790a aVar = this.f3266b;
                if (aVar != null) {
                    aVar.mo4261a(i - 64);
                    return;
                }
                return;
            }
            this.f3265a &= ~(1 << i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4262a(int i, boolean z) {
            if (i >= 64) {
                m4603b();
                this.f3266b.mo4262a(i - 64, z);
                return;
            }
            boolean z2 = (this.f3265a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.f3265a;
            this.f3265a = ((j2 & (~j)) << 1) | (j2 & j);
            if (z) {
                mo4266e(i);
            } else {
                mo4261a(i);
            }
            if (z2 || this.f3266b != null) {
                m4603b();
                this.f3266b.mo4262a(0, z2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo4263b(int i) {
            C0790a aVar = this.f3266b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.f3265a) : Long.bitCount(this.f3265a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f3265a & ((1 << i) - 1)) : aVar.mo4263b(i - 64) + Long.bitCount(this.f3265a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo4264c(int i) {
            if (i < 64) {
                return (this.f3265a & (1 << i)) != 0;
            }
            m4603b();
            return this.f3266b.mo4264c(i - 64);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo4265d(int i) {
            if (i >= 64) {
                m4603b();
                return this.f3266b.mo4265d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f3265a & j) != 0;
            this.f3265a &= ~j;
            long j2 = j - 1;
            long j3 = this.f3265a;
            this.f3265a = Long.rotateRight(j3 & (~j2), 1) | (j3 & j2);
            C0790a aVar = this.f3266b;
            if (aVar != null) {
                if (aVar.mo4264c(0)) {
                    mo4266e(63);
                }
                this.f3266b.mo4265d(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4266e(int i) {
            if (i >= 64) {
                m4603b();
                this.f3266b.mo4266e(i - 64);
                return;
            }
            this.f3265a |= 1 << i;
        }

        public String toString() {
            if (this.f3266b == null) {
                return Long.toBinaryString(this.f3265a);
            }
            return this.f3266b.toString() + "xx" + Long.toBinaryString(this.f3265a);
        }
    }

    /* renamed from: android.support.v7.widget.T$b */
    interface C0791b {
        /* renamed from: a */
        int mo3326a();

        /* renamed from: a */
        View mo3327a(int i);

        /* renamed from: a */
        void mo3328a(View view);

        /* renamed from: a */
        void mo3329a(View view, int i);

        /* renamed from: a */
        void mo3330a(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: b */
        int mo3331b(View view);

        /* renamed from: b */
        void mo3332b();

        /* renamed from: b */
        void mo3333b(int i);

        /* renamed from: c */
        RecyclerView.C0778w mo3334c(View view);

        /* renamed from: c */
        void mo3335c(int i);

        /* renamed from: d */
        void mo3336d(View view);
    }

    C0789T(C0791b bVar) {
        this.f3262a = bVar;
    }

    /* renamed from: f */
    private int m4583f(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.f3262a.mo3326a();
        int i2 = i;
        while (i2 < a) {
            int b = i - (i2 - this.f3263b.mo4263b(i2));
            if (b == 0) {
                while (this.f3263b.mo4264c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: g */
    private void m4584g(View view) {
        this.f3264c.add(view);
        this.f3262a.mo3328a(view);
    }

    /* renamed from: h */
    private boolean m4585h(View view) {
        if (!this.f3264c.remove(view)) {
            return false;
        }
        this.f3262a.mo3336d(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo4242a() {
        return this.f3262a.mo3326a() - this.f3264c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4243a(int i) {
        int f = m4583f(i);
        this.f3263b.mo4265d(f);
        this.f3262a.mo3333b(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4244a(View view) {
        int b = this.f3262a.mo3331b(view);
        if (b >= 0) {
            this.f3263b.mo4266e(b);
            m4584g(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4245a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int a = i < 0 ? this.f3262a.mo3326a() : m4583f(i);
        this.f3263b.mo4262a(a, z);
        if (z) {
            m4584g(view);
        }
        this.f3262a.mo3330a(view, a, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4246a(View view, int i, boolean z) {
        int a = i < 0 ? this.f3262a.mo3326a() : m4583f(i);
        this.f3263b.mo4262a(a, z);
        if (z) {
            m4584g(view);
        }
        this.f3262a.mo3329a(view, a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4247a(View view, boolean z) {
        mo4246a(view, -1, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo4248b() {
        return this.f3262a.mo3326a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo4249b(View view) {
        int b = this.f3262a.mo3331b(view);
        if (b != -1 && !this.f3263b.mo4264c(b)) {
            return b - this.f3263b.mo4263b(b);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo4250b(int i) {
        int size = this.f3264c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f3264c.get(i2);
            RecyclerView.C0778w c = this.f3262a.mo3334c(view);
            if (c.mo4041h() == i && !c.mo4046m() && !c.mo4048o()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo4251c(int i) {
        return this.f3262a.mo3327a(m4583f(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4252c() {
        this.f3263b.mo4260a();
        for (int size = this.f3264c.size() - 1; size >= 0; size--) {
            this.f3262a.mo3336d(this.f3264c.get(size));
            this.f3264c.remove(size);
        }
        this.f3262a.mo3332b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4253c(View view) {
        return this.f3264c.contains(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public View mo4254d(int i) {
        return this.f3262a.mo3327a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4255d(View view) {
        int b = this.f3262a.mo3331b(view);
        if (b >= 0) {
            if (this.f3263b.mo4265d(b)) {
                m4585h(view);
            }
            this.f3262a.mo3335c(b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4256e(int i) {
        int f = m4583f(i);
        View a = this.f3262a.mo3327a(f);
        if (a != null) {
            if (this.f3263b.mo4265d(f)) {
                m4585h(a);
            }
            this.f3262a.mo3335c(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo4257e(View view) {
        int b = this.f3262a.mo3331b(view);
        if (b == -1) {
            m4585h(view);
            return true;
        } else if (!this.f3263b.mo4264c(b)) {
            return false;
        } else {
            this.f3263b.mo4265d(b);
            m4585h(view);
            this.f3262a.mo3335c(b);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4258f(View view) {
        int b = this.f3262a.mo3331b(view);
        if (b < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f3263b.mo4264c(b)) {
            this.f3263b.mo4261a(b);
            m4585h(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f3263b.toString() + ", hidden list:" + this.f3264c.size();
    }
}
