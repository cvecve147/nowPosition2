package com.openlife.checkme.activity.scanner;

import com.openlife.checkme.C4961l;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.scanner.a */
class C4759a implements C6242d<Boolean> {

    /* renamed from: a */
    final /* synthetic */ ScannerFragment f13734a;

    C4759a(ScannerFragment scannerFragment) {
        this.f13734a = scannerFragment;
    }

    /* renamed from: a */
    public void accept(Boolean bool) {
        if (bool.booleanValue()) {
            this.f13734a.m18758u();
        } else {
            this.f13734a.mo13170h(C4961l.g_camera_permission_requestion);
        }
    }
}
