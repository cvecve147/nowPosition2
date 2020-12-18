package com.askey.taipeinavi;

import com.askey.taipeinavi.home.HomeActivity;
import com.askey.taipeinavi.notification.C1264a;
import com.askey.taipeinavi.p058d.C1213g;
import com.onesignal.C4226Ba;
import com.onesignal.C4229Ca;
import com.openlife.checkme.C4452a;
import com.openlife.checkme.sdk.C4978b;

public class TaipeiNaviApplication extends C4452a implements C4226Ba {
    public void onCreate() {
        super.onCreate();
        C1264a.m6260a().mo5609a(this, this);
        C4978b.m19617a().mo13990a(this, "TAIPEINAVI", "96ce0662d39f420c485eb89e4d5c663154937e399c7e", "74241", HomeActivity.class);
        C4978b.m19617a().mo13989a(R.mipmap.icon_notify_large, R.mipmap.icon_notify_small, R.string.app_name);
    }

    public void onOSSubscriptionChanged(C4229Ca ca) {
        String e;
        if (!ca.mo12282a().mo12372d() && ca.mo12283b().mo12372d() && (e = ca.mo12283b().mo12373e()) != null && !e.isEmpty()) {
            C1213g.m6058e(getApplicationContext(), e);
        }
    }
}
