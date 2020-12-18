package com.openlife.checkme.activity.activity;

import com.openlife.checkme.net.model.ActivityData;
import com.openlife.checkme.net.model.ActivityResponse;
import com.openlife.checkme.p097f.C4953c;
import java.util.List;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.activity.f */
class C4526f implements C6242d<ActivityResponse> {

    /* renamed from: a */
    final /* synthetic */ C4528h f13242a;

    C4526f(C4528h hVar) {
        this.f13242a = hVar;
    }

    /* renamed from: a */
    public void accept(ActivityResponse activityResponse) {
        if (this.f13242a.mo13153a((C4953c) activityResponse)) {
            this.f13242a.f13244d.mo12691a((List<ActivityData>) activityResponse.getData());
        }
    }
}
