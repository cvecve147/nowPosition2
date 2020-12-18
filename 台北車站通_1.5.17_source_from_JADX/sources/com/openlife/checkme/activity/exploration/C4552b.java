package com.openlife.checkme.activity.exploration;

import android.content.Intent;
import p101d.p108c.p109a.C5188c;
import p101d.p108c.p109a.C5197l;

/* renamed from: com.openlife.checkme.activity.exploration.b */
class C4552b implements C5197l.C5207j {

    /* renamed from: a */
    final /* synthetic */ ExplorationFragment f13307a;

    C4552b(ExplorationFragment explorationFragment) {
        this.f13307a = explorationFragment;
    }

    /* renamed from: a */
    public void mo12584a(C5197l lVar, C5188c cVar) {
        this.f13307a.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }
}
