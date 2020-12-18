package android.support.p011v7.widget;

import android.support.p007v4.view.C0432J;
import android.view.View;

/* renamed from: android.support.v7.widget.kb */
class C0853kb extends C0432J {

    /* renamed from: a */
    private boolean f3508a = false;

    /* renamed from: b */
    final /* synthetic */ int f3509b;

    /* renamed from: c */
    final /* synthetic */ C0857lb f3510c;

    C0853kb(C0857lb lbVar, int i) {
        this.f3510c = lbVar;
        this.f3509b = i;
    }

    /* renamed from: a */
    public void mo1763a(View view) {
        this.f3508a = true;
    }

    /* renamed from: b */
    public void mo1764b(View view) {
        if (!this.f3508a) {
            this.f3510c.f3517a.setVisibility(this.f3509b);
        }
    }

    /* renamed from: c */
    public void mo1765c(View view) {
        this.f3510c.f3517a.setVisibility(0);
    }
}
