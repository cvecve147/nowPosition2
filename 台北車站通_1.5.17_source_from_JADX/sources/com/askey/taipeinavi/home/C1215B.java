package com.askey.taipeinavi.home;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsmedia.ibeaconshakingproject.shakingDetect.ServiceDetectShaking;
import p101d.p206l.p207a.C6058d;

/* renamed from: com.askey.taipeinavi.home.B */
class C1215B implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1217D f4408a;

    C1215B(C1217D d) {
        this.f4408a = d;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (!C6058d.f16968b) {
            HomeFragment.this.f4380a.startService(new Intent(HomeFragment.this.f4380a, ServiceDetectShaking.class));
            C6058d.m22970b();
        }
    }
}
