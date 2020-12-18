package com.askey.taipeinavi.notification;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.askey.taipeinavi.home.HomeActivity;
import com.onesignal.C4226Ba;
import com.onesignal.C4306Xa;
import com.onesignal.C4432ua;

/* renamed from: com.askey.taipeinavi.notification.a */
public class C1264a {

    /* renamed from: a */
    private static C1264a f4508a;

    /* renamed from: b */
    private boolean f4509b = false;

    /* renamed from: com.askey.taipeinavi.notification.a$a */
    private class C1265a implements C4306Xa.C4317k {

        /* renamed from: a */
        private Application f4510a;

        public C1265a(Application application) {
            this.f4510a = application;
        }

        /* renamed from: a */
        public void mo5610a(C4432ua uaVar) {
            String str = uaVar.f13061a.f13020d.f13070e;
            int s = HomeActivity.m6097s();
            if (s != 0) {
                if (s != 1) {
                    if (s == 2) {
                        Intent intent = new Intent(this.f4510a, HomeActivity.class);
                        intent.putExtra("BUNDLE_EMERGENCY_MESSAGE", str);
                        intent.setFlags(4194304);
                        this.f4510a.startActivity(intent);
                    } else {
                        return;
                    }
                }
                HomeActivity.m6092e(str);
                return;
            }
            Intent intent2 = new Intent(this.f4510a, HomeActivity.class);
            intent2.putExtra("BUNDLE_EMERGENCY_MESSAGE", str);
            this.f4510a.startActivity(intent2);
        }
    }

    private C1264a() {
    }

    /* renamed from: a */
    public static C1264a m6260a() {
        if (f4508a == null) {
            f4508a = new C1264a();
        }
        return f4508a;
    }

    /* renamed from: a */
    public void mo5609a(Application application, C4226Ba ba) {
        if (!this.f4509b) {
            C4306Xa.C4307a g = C4306Xa.m17179g((Context) application);
            g.mo12428b(true);
            g.mo12426a(false);
            g.mo12425a((C4306Xa.C4317k) new C1265a(application));
            g.mo12427a();
            C4306Xa.m17137a(C4306Xa.C4319m.Notification);
            C4306Xa.m17133a(ba);
            this.f4509b = true;
        }
    }
}
