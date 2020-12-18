package com.onesignal;

import com.onesignal.C4416rb;
import java.util.Set;

/* renamed from: com.onesignal.ma */
class C4397ma extends C4416rb.C4417a {

    /* renamed from: a */
    final /* synthetic */ C4368ga f12956a;

    /* renamed from: b */
    final /* synthetic */ C4406pa f12957b;

    C4397ma(C4406pa paVar, C4368ga gaVar) {
        this.f12957b = paVar;
        this.f12956a = gaVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12377a(int i, String str, Throwable th) {
        C4406pa.m17453b("engagement", i, str);
        this.f12957b.f12989h.remove(this.f12956a.f12898a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12355a(String str) {
        C4406pa.m17454b("engagement", str);
        C4370gb.m17360b(C4370gb.f12909a, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", (Set<String>) this.f12957b.f12989h);
    }
}
