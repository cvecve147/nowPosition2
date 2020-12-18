package com.openlife.checkme.activity.activity;

import com.openlife.checkme.net.model.ActivityData;
import com.openlife.checkme.p100ui.ActivityItem;

/* renamed from: com.openlife.checkme.activity.activity.a */
class C4521a implements ActivityItem.C5009a {

    /* renamed from: a */
    final /* synthetic */ ActivityData f13240a;

    /* renamed from: b */
    final /* synthetic */ ActivityFragment f13241b;

    C4521a(ActivityFragment activityFragment, ActivityData activityData) {
        this.f13241b = activityFragment;
        this.f13240a = activityData;
    }

    /* renamed from: a */
    public void mo12698a(String str) {
        this.f13241b.m17893b(this.f13240a.getType(), str);
    }
}
