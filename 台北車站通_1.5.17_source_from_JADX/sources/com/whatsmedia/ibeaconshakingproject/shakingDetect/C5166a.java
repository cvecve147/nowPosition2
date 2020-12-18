package com.whatsmedia.ibeaconshakingproject.shakingDetect;

import p101d.p206l.p207a.C6058d;

/* renamed from: com.whatsmedia.ibeaconshakingproject.shakingDetect.a */
class C5166a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C5169d f14512a;

    C5166a(C5169d dVar) {
        this.f14512a = dVar;
    }

    public void run() {
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (this.f14512a.f14526l) {
            this.f14512a.mo14327b("");
            C6058d.m22971e().mo16020a((String) null);
        }
    }
}
