package com.openlife.checkme.activity.exploration;

import com.google.android.gms.maps.C3978c;
import com.google.android.gms.maps.model.C3990c;
import com.openlife.checkme.net.model.MapData;

/* renamed from: com.openlife.checkme.activity.exploration.m */
class C4563m implements C3978c.C3979a {

    /* renamed from: a */
    final /* synthetic */ ExplorationFragment f13320a;

    C4563m(ExplorationFragment explorationFragment) {
        this.f13320a = explorationFragment;
    }

    /* renamed from: a */
    public boolean mo11247a(C3990c cVar) {
        if (this.f13320a.f13294i.get(cVar) == null) {
            return false;
        }
        ExplorationFragment explorationFragment = this.f13320a;
        MapData unused = explorationFragment.f13298m = (MapData) explorationFragment.f13294i.get(cVar);
        this.f13320a.f13295j.mo12781b(this.f13320a.f13298m);
        return false;
    }
}
