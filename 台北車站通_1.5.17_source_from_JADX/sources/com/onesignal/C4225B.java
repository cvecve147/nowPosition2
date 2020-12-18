package com.onesignal;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.onesignal.C4384jc;
import com.onesignal.C4408q;

/* renamed from: com.onesignal.B */
class C4225B implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RelativeLayout.LayoutParams f12551a;

    /* renamed from: b */
    final /* synthetic */ LinearLayout.LayoutParams f12552b;

    /* renamed from: c */
    final /* synthetic */ C4408q.C4410b f12553c;

    /* renamed from: d */
    final /* synthetic */ WindowManager.LayoutParams f12554d;

    /* renamed from: e */
    final /* synthetic */ C4384jc.C4387c f12555e;

    /* renamed from: f */
    final /* synthetic */ C4250I f12556f;

    C4225B(C4250I i, RelativeLayout.LayoutParams layoutParams, LinearLayout.LayoutParams layoutParams2, C4408q.C4410b bVar, WindowManager.LayoutParams layoutParams3, C4384jc.C4387c cVar) {
        this.f12556f = i;
        this.f12551a = layoutParams;
        this.f12552b = layoutParams2;
        this.f12553c = bVar;
        this.f12554d = layoutParams3;
        this.f12555e = cVar;
    }

    public void run() {
        if (this.f12556f.f12616l != null) {
            this.f12556f.f12616l.setLayoutParams(this.f12551a);
            Context applicationContext = this.f12556f.f12608d.getApplicationContext();
            this.f12556f.m16820a(applicationContext, this.f12552b, this.f12553c);
            this.f12556f.m16835b(applicationContext);
            WindowManager windowManager = this.f12556f.f12608d.getWindowManager();
            if (!(windowManager == null || this.f12556f.f12617m == null)) {
                windowManager.addView(this.f12556f.f12617m, this.f12554d);
            }
            if (this.f12556f.f12619o != null) {
                C4250I i = this.f12556f;
                i.m16830a(this.f12555e, (View) i.f12618n, (View) this.f12556f.f12617m);
                this.f12556f.f12619o.mo12312b();
            }
            this.f12556f.m16847e();
        }
    }
}
