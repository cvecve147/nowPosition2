package com.openlife.checkme.sdk;

import android.app.Activity;
import com.openlife.checkme.activity.splash.p090a.C4789a;
import com.openlife.checkme.beaconservice.dialog.ADDialog;
import com.openlife.checkme.net.model.BeaconNotificationData;
import com.openlife.checkme.p093c.C4881k;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p094d.C4947j;
import java.util.List;

/* renamed from: com.openlife.checkme.sdk.d */
class C4994d implements ADDialog.C4843a {

    /* renamed from: a */
    final /* synthetic */ C4995e f14184a;

    C4994d(C4995e eVar) {
        this.f14184a = eVar;
    }

    /* renamed from: a */
    public void mo13353a(String str) {
        if (this.f14184a.f14189e.mo13553d().mo13494j().isEmpty()) {
            if (this.f14184a.f14188d != null) {
                this.f14184a.f14188d.mo5562a();
            }
        } else if (this.f14184a.f14189e.mo13553d().mo13496k()) {
            C4883m.m19240c(this.f14184a.f14185a, str);
        } else {
            C4881k.f13969a = C4883m.m19241d(this.f14184a.f14185a, str);
            C4789a aVar = new C4789a();
            aVar.mo13235a(C4947j.m19536a().mo13553d().mo13494j());
            this.f14184a.f14191g.mo13992a((Activity) this.f14184a.f14185a, aVar);
        }
    }

    /* renamed from: a */
    public void mo13354a(List<BeaconNotificationData> list) {
        this.f14184a.f14189e.mo13555f().mo13512b(list);
    }
}
