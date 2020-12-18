package com.sto.stolibrary.customActivities;

import android.util.Log;
import p101d.p119e.p120a.C5288s;
import p101d.p119e.p120a.C5295x;
import p101d.p191i.p192a.C6024f;
import p101d.p191i.p192a.p200e.C6023g;

/* renamed from: com.sto.stolibrary.customActivities.v */
class C5088v implements C5288s.C5289a {

    /* renamed from: a */
    final /* synthetic */ HelpPopActivity f14423a;

    C5088v(HelpPopActivity helpPopActivity) {
        this.f14423a = helpPopActivity;
    }

    /* renamed from: a */
    public void mo14131a(C5295x xVar) {
        Log.e(HelpPopActivity.f14374a, "網路連線錯誤，無法發送求救訊息。");
        C6023g.m22858a(this.f14423a.f14379f, this.f14423a.getString(C6024f.network_failed));
    }
}
