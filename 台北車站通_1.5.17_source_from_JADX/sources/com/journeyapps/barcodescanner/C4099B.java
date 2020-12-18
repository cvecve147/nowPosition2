package com.journeyapps.barcodescanner;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* renamed from: com.journeyapps.barcodescanner.B */
public class C4099B {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f12147a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public WindowManager f12148b;

    /* renamed from: c */
    private OrientationEventListener f12149c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4157z f12150d;

    /* renamed from: a */
    public void mo11553a() {
        OrientationEventListener orientationEventListener = this.f12149c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f12149c = null;
        this.f12148b = null;
        this.f12150d = null;
    }

    /* renamed from: a */
    public void mo11554a(Context context, C4157z zVar) {
        mo11553a();
        Context applicationContext = context.getApplicationContext();
        this.f12150d = zVar;
        this.f12148b = (WindowManager) applicationContext.getSystemService("window");
        this.f12149c = new C4098A(this, applicationContext, 3);
        this.f12149c.enable();
        this.f12147a = this.f12148b.getDefaultDisplay().getRotation();
    }
}
