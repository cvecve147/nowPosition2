package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import p101d.p129g.p149d.C5574a;
import p101d.p129g.p149d.C5579b;

/* renamed from: com.onesignal.Bb */
class C4227Bb extends C4224Ab {

    /* renamed from: f */
    private C5574a f12557f;

    C4227Bb() {
    }

    /* renamed from: a */
    static void m16780a(Context context) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, FirebaseInstanceIdService.class), C4252Ia.m16864a(context, "gcm_defaultSenderId", (String) null) == null ? 2 : 1, 1);
        } catch (IllegalArgumentException | NoClassDefFoundError unused) {
        }
    }

    /* renamed from: b */
    private void m16781b(String str) {
        if (this.f12557f == null) {
            C5579b.C5580a aVar = new C5579b.C5580a();
            aVar.mo15081c(str);
            aVar.mo15080b("OMIT_ID");
            aVar.mo15078a("OMIT_KEY");
            this.f12557f = C5574a.m21202a(C4306Xa.f12759e, aVar.mo15079a(), "ONESIGNAL_SDK_FCM_APP_NAME");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo12276a(String str) {
        m16781b(str);
        return FirebaseInstanceId.getInstance(this.f12557f).mo11465a(str, "FCM");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo12278c() {
        return "FCM";
    }
}
