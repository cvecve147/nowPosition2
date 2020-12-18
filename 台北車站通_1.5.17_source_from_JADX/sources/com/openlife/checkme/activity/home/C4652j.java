package com.openlife.checkme.activity.home;

import android.content.Intent;
import p101d.p108c.p109a.C5188c;
import p101d.p108c.p109a.C5197l;

/* renamed from: com.openlife.checkme.activity.home.j */
class C4652j implements C5197l.C5207j {

    /* renamed from: a */
    final /* synthetic */ MainFragment f13510a;

    C4652j(MainFragment mainFragment) {
        this.f13510a = mainFragment;
    }

    /* renamed from: a */
    public void mo12584a(C5197l lVar, C5188c cVar) {
        this.f13510a.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }
}
