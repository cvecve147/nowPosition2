package p299tw.navin.navinmap.map;

import android.app.Activity;
import p299tw.navin.navinmap.map.C7076Z;
import p299tw.navin.navinmap.util.C7157a;

/* renamed from: tw.navin.navinmap.map.U */
class C7071U implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f19503a;

    /* renamed from: b */
    final /* synthetic */ C7076Z f19504b;

    C7071U(C7076Z z, boolean z2) {
        this.f19504b = z;
        this.f19503a = z2;
    }

    public void run() {
        try {
            if (!this.f19503a) {
                if (this.f19504b.f19513H.getVisibility() != 0) {
                    if (!this.f19504b.f19512G.f19703ua) {
                        this.f19504b.f19512G.mo21223a((Activity) this.f19504b.getContext(), C7133o.m26846a(this.f19504b.getContext()), new C7076Z.C7078b(this.f19504b, (C7071U) null));
                        this.f19504b.f19512G.f19703ua = true;
                    }
                    this.f19504b.f19513H.setVisibility(0);
                    this.f19504b.f19476a.setVisibility(4);
                    return;
                }
            }
            if (this.f19504b.f19513H.getVisibility() == 0) {
                this.f19504b.f19513H.setVisibility(8);
                this.f19504b.f19476a.setVisibility(0);
                this.f19504b.f19512G.mo21256d();
            }
        } catch (NullPointerException unused) {
            C7157a.m26966b("toggleMap null");
        }
    }
}
