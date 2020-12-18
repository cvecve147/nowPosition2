package p013b.p018b.p040i.p050h;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: b.b.i.h.b */
public abstract class C1136b {

    /* renamed from: a */
    private Object f4130a;

    /* renamed from: b */
    private boolean f4131b;

    /* renamed from: b.b.i.h.b$a */
    public interface C1137a {
        /* renamed from: a */
        void mo2486a(C1136b bVar);

        /* renamed from: a */
        boolean mo2487a(C1136b bVar, Menu menu);

        /* renamed from: a */
        boolean mo2488a(C1136b bVar, MenuItem menuItem);

        /* renamed from: b */
        boolean mo2489b(C1136b bVar, Menu menu);
    }

    /* renamed from: a */
    public abstract void mo2561a();

    /* renamed from: a */
    public abstract void mo2562a(int i);

    /* renamed from: a */
    public abstract void mo2563a(View view);

    /* renamed from: a */
    public abstract void mo2564a(CharSequence charSequence);

    /* renamed from: a */
    public void mo5314a(Object obj) {
        this.f4130a = obj;
    }

    /* renamed from: a */
    public void mo2565a(boolean z) {
        this.f4131b = z;
    }

    /* renamed from: b */
    public abstract View mo2566b();

    /* renamed from: b */
    public abstract void mo2567b(int i);

    /* renamed from: b */
    public abstract void mo2568b(CharSequence charSequence);

    /* renamed from: c */
    public abstract Menu mo2569c();

    /* renamed from: d */
    public abstract MenuInflater mo2570d();

    /* renamed from: e */
    public abstract CharSequence mo2571e();

    /* renamed from: f */
    public Object mo5315f() {
        return this.f4130a;
    }

    /* renamed from: g */
    public abstract CharSequence mo2572g();

    /* renamed from: h */
    public boolean mo5316h() {
        return this.f4131b;
    }

    /* renamed from: i */
    public abstract void mo2573i();

    /* renamed from: j */
    public abstract boolean mo2574j();
}
