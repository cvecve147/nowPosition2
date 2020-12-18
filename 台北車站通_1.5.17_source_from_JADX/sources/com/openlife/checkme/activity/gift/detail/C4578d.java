package com.openlife.checkme.activity.gift.detail;

import com.openlife.checkme.activity.account.redemption.detail.RedemptionDetailActivity;
import p101d.p108c.p109a.C5188c;
import p101d.p108c.p109a.C5197l;

/* renamed from: com.openlife.checkme.activity.gift.detail.d */
class C4578d implements C5197l.C5207j {

    /* renamed from: a */
    final /* synthetic */ int f13346a;

    /* renamed from: b */
    final /* synthetic */ GiftDetailFragment f13347b;

    C4578d(GiftDetailFragment giftDetailFragment, int i) {
        this.f13347b = giftDetailFragment;
        this.f13346a = i;
    }

    /* renamed from: a */
    public void mo12584a(C5197l lVar, C5188c cVar) {
        RedemptionDetailActivity.m17834a(this.f13347b.getActivity(), this.f13346a, true);
    }
}
