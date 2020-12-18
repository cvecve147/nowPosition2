package com.sto.stolibrary.customActivities;

import android.content.Context;
import android.util.Log;
import p101d.p119e.p120a.C5288s;
import p101d.p191i.p192a.C6024f;
import p101d.p191i.p192a.p200e.C6023g;

/* renamed from: com.sto.stolibrary.customActivities.u */
class C5087u implements C5288s.C5290b<String> {

    /* renamed from: a */
    final /* synthetic */ HelpPopActivity f14422a;

    C5087u(HelpPopActivity helpPopActivity) {
        this.f14422a = helpPopActivity;
    }

    /* renamed from: a */
    public void mo14126a(String str) {
        Context context;
        int i;
        HelpPopActivity helpPopActivity;
        if (str.compareTo("true") == 0) {
            Log.d(HelpPopActivity.f14374a, "已發送求救訊息至管理室。");
            context = this.f14422a.f14379f;
            helpPopActivity = this.f14422a;
            i = C6024f.sos_success;
        } else {
            Log.e(HelpPopActivity.f14374a, "伺服器異常，請稍候發送。");
            context = this.f14422a.f14379f;
            helpPopActivity = this.f14422a;
            i = C6024f.sos_failed;
        }
        C6023g.m22858a(context, helpPopActivity.getString(i));
    }
}
