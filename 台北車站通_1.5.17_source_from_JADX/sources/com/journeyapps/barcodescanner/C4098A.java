package com.journeyapps.barcodescanner;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* renamed from: com.journeyapps.barcodescanner.A */
class C4098A extends OrientationEventListener {

    /* renamed from: a */
    final /* synthetic */ C4099B f12146a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4098A(C4099B b, Context context, int i) {
        super(context, i);
        this.f12146a = b;
    }

    public void onOrientationChanged(int i) {
        int rotation;
        WindowManager a = this.f12146a.f12148b;
        C4157z b = this.f12146a.f12150d;
        if (this.f12146a.f12148b != null && b != null && (rotation = a.getDefaultDisplay().getRotation()) != this.f12146a.f12147a) {
            int unused = this.f12146a.f12147a = rotation;
            b.mo11687a(rotation);
        }
    }
}
