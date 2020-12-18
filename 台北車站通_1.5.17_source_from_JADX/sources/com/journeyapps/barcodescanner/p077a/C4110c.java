package com.journeyapps.barcodescanner.p077a;

import android.hardware.Camera;

/* renamed from: com.journeyapps.barcodescanner.a.c */
class C4110c implements Camera.AutoFocusCallback {

    /* renamed from: a */
    final /* synthetic */ C4111d f12193a;

    C4110c(C4111d dVar) {
        this.f12193a = dVar;
    }

    public void onAutoFocus(boolean z, Camera camera) {
        this.f12193a.f12200g.post(new C4109b(this));
    }
}
