package com.openlife.checkme.activity.scanner;

import com.openlife.checkme.activity.scanner.p089a.C4766e;

/* renamed from: com.openlife.checkme.activity.scanner.e */
class C4770e implements C4766e {

    /* renamed from: a */
    final /* synthetic */ int f13765a;

    /* renamed from: b */
    final /* synthetic */ ScannerFragment f13766b;

    C4770e(ScannerFragment scannerFragment, int i) {
        this.f13766b = scannerFragment;
        this.f13765a = i;
    }

    /* renamed from: a */
    public void mo13206a(String str) {
        this.f13766b.getActivity().runOnUiThread(new C4769d(this, str));
    }
}
