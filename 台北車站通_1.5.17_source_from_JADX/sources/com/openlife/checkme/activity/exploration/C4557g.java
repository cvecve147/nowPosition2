package com.openlife.checkme.activity.exploration;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.openlife.checkme.C4961l;
import p013b.p018b.p028h.p029a.C1006a;
import p101d.p204k.p205a.C6048a;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.exploration.g */
class C4557g implements C6242d<C6048a> {

    /* renamed from: a */
    final /* synthetic */ String f13313a;

    /* renamed from: b */
    final /* synthetic */ ExplorationFragment f13314b;

    C4557g(ExplorationFragment explorationFragment, String str) {
        this.f13314b = explorationFragment;
        this.f13313a = str;
    }

    /* renamed from: a */
    public void accept(C6048a aVar) {
        if (aVar.f16952b) {
            Intent intent = new Intent("android.intent.action.CALL");
            intent.setData(Uri.parse("tel:" + this.f13313a));
            if (C1006a.m5387a((Context) this.f13314b.getActivity(), "android.permission.CALL_PHONE") == 0) {
                this.f13314b.getActivity().startActivity(intent);
            }
        } else if (aVar.f16953c) {
            ExplorationFragment explorationFragment = this.f13314b;
            explorationFragment.mo12752b(explorationFragment.getString(C4961l.g_call_phone_permission_requestion), this.f13313a);
        } else {
            boolean unused = this.f13314b.f13289d = true;
            this.f13314b.f13295j.mo12779a(this.f13314b.f13286a, this.f13314b.f13296k);
        }
    }
}
