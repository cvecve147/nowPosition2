package p101d.p111d.p112a.p114b;

import android.os.Build;
import android.view.View;

/* renamed from: d.d.a.b.a */
public abstract class C5227a implements Runnable {

    /* renamed from: a */
    private final View f14749a;

    /* renamed from: b */
    private final C5232c f14750b;

    public C5227a(View view) {
        this.f14749a = view;
        this.f14750b = C5233d.m20213a() ? new C5232c() : null;
    }

    /* renamed from: c */
    private void m20178c() {
        this.f14749a.removeCallbacks(this);
        if (Build.VERSION.SDK_INT < 16) {
            this.f14749a.postDelayed(this, 10);
        } else {
            this.f14749a.postOnAnimationDelayed(this, 10);
        }
    }

    /* renamed from: a */
    public abstract boolean mo14461a();

    /* renamed from: b */
    public void mo14471b() {
        C5232c cVar = this.f14750b;
        if (cVar != null) {
            cVar.mo14489a();
        }
        m20178c();
    }

    public final void run() {
        boolean a = mo14461a();
        C5232c cVar = this.f14750b;
        if (cVar != null) {
            cVar.mo14490b();
            if (!a) {
                this.f14750b.mo14491c();
            }
        }
        if (a) {
            m20178c();
        }
    }
}
