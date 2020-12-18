package com.openlife.checkme.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.beaconservice.dialog.ADDialog;
import com.openlife.checkme.net.model.BeaconNotificationData;
import com.openlife.checkme.p091b.C4837a;
import com.openlife.checkme.p094d.C4947j;
import com.openlife.checkme.p097f.C4955e;
import com.openlife.checkme.sdk.C4978b;
import java.util.List;
import java.util.Locale;
import p013b.p018b.p028h.p029a.C1020d;

/* renamed from: com.openlife.checkme.sdk.e */
public class C4995e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f14185a;

    /* renamed from: b */
    private C4978b.C4979a f14186b;

    /* renamed from: c */
    private ADDialog f14187c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4996a f14188d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4947j f14189e = C4947j.m19536a();

    /* renamed from: f */
    private C4955e f14190f = C4955e.m19580a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C4978b f14191g = C4978b.m19617a();

    /* renamed from: h */
    private BroadcastReceiver f14192h = new C4993c(this);

    /* renamed from: com.openlife.checkme.sdk.e$a */
    public interface C4996a {
        /* renamed from: a */
        void mo5562a();
    }

    public C4995e(Context context) {
        this.f14185a = context;
        this.f14190f.mo13604a(this.f14189e.mo13554e().mo13533e());
    }

    /* renamed from: a */
    private String m19681a(int i) {
        return C4837a.m19034a(this.f14189e, i, this.f14185a);
    }

    /* renamed from: a */
    private String m19682a(C4978b.C4979a aVar) {
        return (aVar == C4978b.C4979a.TW ? Locale.CHINESE : Locale.ENGLISH).getLanguage();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public List<BeaconNotificationData> m19684a(List<BeaconNotificationData> list) {
        boolean z;
        List<BeaconNotificationData> d = this.f14189e.mo13555f().mo13515d();
        List<BeaconNotificationData> f = this.f14189e.mo13555f().mo13517f();
        for (int size = list.size() - 1; size >= 0; size--) {
            BeaconNotificationData beaconNotificationData = list.get(size);
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= d.size()) {
                    z = false;
                    break;
                } else if (beaconNotificationData.getId() == d.get(i2).getId()) {
                    list.remove(size);
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                while (true) {
                    if (i >= f.size()) {
                        break;
                    } else if (beaconNotificationData.getId() == f.get(i).getId()) {
                        list.remove(size);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        return list;
    }

    /* renamed from: b */
    private void m19687b(List<BeaconNotificationData> list) {
        this.f14189e.mo13555f().mo13509a(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m19689c(List<BeaconNotificationData> list) {
        ADDialog aDDialog;
        if (this.f14187c == null) {
            if (m19682a(this.f14186b) != null) {
                aDDialog = new ADDialog(this.f14185a, list, m19681a(C4961l.homead_b_dontshow), m19681a(C4961l.homead_b_open), m19681a(C4961l.homead_b_close));
            } else {
                aDDialog = new ADDialog(this.f14185a, list);
            }
            this.f14187c = aDDialog;
            this.f14187c.mo13347a((ADDialog.C4843a) new C4994d(this));
        }
        if (!this.f14187c.isShowing()) {
            m19687b(list);
            this.f14187c.mo13348a(list);
            this.f14187c.show();
        }
    }

    /* renamed from: d */
    private void m19691d() {
        C1020d.m5430a(this.f14185a).mo5019a(this.f14192h, new IntentFilter("SERVICE_EVENT"));
    }

    /* renamed from: e */
    private void m19692e() {
        C1020d.m5430a(this.f14185a).mo5018a(this.f14192h);
    }

    /* renamed from: a */
    public void mo14014a() {
        ADDialog aDDialog = this.f14187c;
        if (aDDialog != null) {
            aDDialog.dismiss();
            this.f14187c = null;
        }
    }

    /* renamed from: a */
    public void mo14015a(C4996a aVar) {
        this.f14188d = aVar;
    }

    /* renamed from: a */
    public boolean mo14016a(Intent intent) {
        return (intent == null || intent.getExtras() == null || !intent.getExtras().containsKey("beaconAD")) ? false : true;
    }

    /* renamed from: b */
    public void mo14017b() {
        m19692e();
    }

    /* renamed from: b */
    public void mo14018b(Intent intent) {
        if (mo14016a(intent)) {
            m19689c((List<BeaconNotificationData>) (List) intent.getExtras().getSerializable("beaconAD"));
        }
    }

    /* renamed from: c */
    public void mo14019c() {
        m19691d();
    }
}
