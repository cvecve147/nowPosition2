package com.onesignal;

import android.view.ViewGroup;
import com.onesignal.C4306Xa;

/* renamed from: com.onesignal.A */
class C4222A implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f12542a;

    /* renamed from: b */
    final /* synthetic */ C4250I f12543b;

    C4222A(C4250I i, int i2) {
        this.f12543b = i;
        this.f12542a = i2;
    }

    public void run() {
        if (this.f12543b.f12616l == null) {
            C4306Xa.m17154b(C4306Xa.C4316j.WARN, "WebView height update skipped, new height will be used once it is displayed.");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f12543b.f12616l.getLayoutParams();
        layoutParams.height = this.f12542a;
        this.f12543b.f12616l.setLayoutParams(layoutParams);
        if (this.f12543b.f12618n != null) {
            C4408q b = this.f12543b.f12618n;
            C4250I i = this.f12543b;
            b.mo12533a(i.m16817a(this.f12542a, i.f12615k));
        }
    }
}
