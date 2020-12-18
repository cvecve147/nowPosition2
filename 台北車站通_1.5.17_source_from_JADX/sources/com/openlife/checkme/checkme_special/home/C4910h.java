package com.openlife.checkme.checkme_special.home;

import android.content.Intent;
import p101d.p108c.p109a.C5188c;
import p101d.p108c.p109a.C5197l;

/* renamed from: com.openlife.checkme.checkme_special.home.h */
class C4910h implements C5197l.C5207j {

    /* renamed from: a */
    final /* synthetic */ SpMainFragment f14062a;

    C4910h(SpMainFragment spMainFragment) {
        this.f14062a = spMainFragment;
    }

    /* renamed from: a */
    public void mo12584a(C5197l lVar, C5188c cVar) {
        this.f14062a.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }
}
