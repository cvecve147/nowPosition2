package android.support.design.widget;

import android.widget.ImageButton;

/* renamed from: android.support.design.widget.X */
class C0144X extends ImageButton {

    /* renamed from: a */
    private int f815a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo839a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f815a = i;
        }
    }

    /* access modifiers changed from: package-private */
    public final int getUserSetVisibility() {
        return this.f815a;
    }

    public void setVisibility(int i) {
        mo839a(i, true);
    }
}
