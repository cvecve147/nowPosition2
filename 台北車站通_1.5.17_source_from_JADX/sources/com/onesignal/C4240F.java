package com.onesignal;

import android.view.View;
import com.onesignal.C4384jc;

/* renamed from: com.onesignal.F */
class C4240F implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4384jc.C4386b f12588a;

    /* renamed from: b */
    final /* synthetic */ C4250I f12589b;

    C4240F(C4250I i, C4384jc.C4386b bVar) {
        this.f12589b = i;
        this.f12588a = bVar;
    }

    public void run() {
        if (!this.f12589b.f12613i || this.f12589b.f12617m == null) {
            this.f12589b.m16842c(this.f12588a);
            return;
        }
        C4250I i = this.f12589b;
        i.m16823a((View) i.f12617m, this.f12588a);
    }
}
