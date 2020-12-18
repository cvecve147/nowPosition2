package p013b.p018b.p040i.p050h;

import android.support.p007v4.view.C0431I;
import android.support.p007v4.view.C0432J;
import android.view.View;

/* renamed from: b.b.i.h.h */
class C1146h extends C0432J {

    /* renamed from: a */
    private boolean f4191a = false;

    /* renamed from: b */
    private int f4192b = 0;

    /* renamed from: c */
    final /* synthetic */ C1147i f4193c;

    C1146h(C1147i iVar) {
        this.f4193c = iVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5352a() {
        this.f4192b = 0;
        this.f4191a = false;
        this.f4193c.mo5359b();
    }

    /* renamed from: b */
    public void mo1764b(View view) {
        int i = this.f4192b + 1;
        this.f4192b = i;
        if (i == this.f4193c.f4194a.size()) {
            C0431I i2 = this.f4193c.f4197d;
            if (i2 != null) {
                i2.mo1764b((View) null);
            }
            mo5352a();
        }
    }

    /* renamed from: c */
    public void mo1765c(View view) {
        if (!this.f4191a) {
            this.f4191a = true;
            C0431I i = this.f4193c.f4197d;
            if (i != null) {
                i.mo1765c((View) null);
            }
        }
    }
}
