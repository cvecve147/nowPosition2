package com.onesignal;

import android.content.Context;
import com.onesignal.C4306Xa;
import com.onesignal.C4441wb;
import java.io.IOException;

/* renamed from: com.onesignal.Ab */
abstract class C4224Ab implements C4441wb {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static int f12546a = 5;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static int f12547b = 10000;

    /* renamed from: c */
    private C4441wb.C4442a f12548c;

    /* renamed from: d */
    private Thread f12549d;

    /* renamed from: e */
    private boolean f12550e;

    C4224Ab() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m16772a(String str, int i) {
        try {
            String a = mo12276a(str);
            C4306Xa.C4316j jVar = C4306Xa.C4316j.INFO;
            C4306Xa.m17135a(jVar, "Device registered, push token = " + a);
            this.f12548c.mo12409a(a, 1);
            return true;
        } catch (IOException e) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage())) {
                C4306Xa.C4316j jVar2 = C4306Xa.C4316j.ERROR;
                C4306Xa.m17136a(jVar2, "Error Getting " + mo12278c() + " Token", (Throwable) e);
                if (!this.f12550e) {
                    this.f12548c.mo12409a((String) null, -11);
                }
                return true;
            } else if (i >= f12546a - 1) {
                C4306Xa.C4316j jVar3 = C4306Xa.C4316j.ERROR;
                C4306Xa.m17136a(jVar3, "Retry count of " + f12546a + " exceed! Could not get a " + mo12278c() + " Token.", (Throwable) e);
                return false;
            } else {
                C4306Xa.C4316j jVar4 = C4306Xa.C4316j.INFO;
                C4306Xa.m17136a(jVar4, "'Google Play services' returned SERVICE_NOT_AVAILABLE error. Current retry count: " + i, (Throwable) e);
                if (i != 2) {
                    return false;
                }
                this.f12548c.mo12409a((String) null, -9);
                this.f12550e = true;
                return true;
            }
        } catch (Throwable th) {
            C4306Xa.C4316j jVar5 = C4306Xa.C4316j.ERROR;
            C4306Xa.m17136a(jVar5, "Unknown error getting " + mo12278c() + " Token", th);
            this.f12548c.mo12409a((String) null, -12);
            return true;
        }
    }

    /* renamed from: a */
    private boolean m16773a(String str, C4441wb.C4442a aVar) {
        boolean z;
        try {
            Float.parseFloat(str);
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        if (z) {
            return true;
        }
        C4306Xa.m17135a(C4306Xa.C4316j.ERROR, "Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.");
        aVar.mo12409a((String) null, -6);
        return false;
    }

    /* renamed from: b */
    private void m16775b(String str) {
        try {
            if (C4449z.m17651b()) {
                m16776c(str);
                return;
            }
            C4449z.m17648a();
            C4306Xa.m17135a(C4306Xa.C4316j.ERROR, "'Google Play services' app not installed or disabled on the device.");
            this.f12548c.mo12409a((String) null, -7);
        } catch (Throwable th) {
            C4306Xa.C4316j jVar = C4306Xa.C4316j.ERROR;
            C4306Xa.m17136a(jVar, "Could not register with " + mo12278c() + " due to an issue with your AndroidManifest.xml or with 'Google Play services'.", th);
            this.f12548c.mo12409a((String) null, -8);
        }
    }

    /* renamed from: c */
    private synchronized void m16776c(String str) {
        if (this.f12549d == null || !this.f12549d.isAlive()) {
            this.f12549d = new Thread(new C4451zb(this, str));
            this.f12549d.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract String mo12276a(String str);

    /* renamed from: a */
    public void mo12277a(Context context, String str, C4441wb.C4442a aVar) {
        this.f12548c = aVar;
        if (m16773a(str, aVar)) {
            m16775b(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract String mo12278c();
}
