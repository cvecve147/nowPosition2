package com.onesignal;

import com.onesignal.C4416rb;
import java.util.Set;

/* renamed from: com.onesignal.ja */
class C4382ja extends C4416rb.C4417a {

    /* renamed from: a */
    final /* synthetic */ C4364fa f12923a;

    /* renamed from: b */
    final /* synthetic */ C4406pa f12924b;

    C4382ja(C4406pa paVar, C4364fa faVar) {
        this.f12924b = paVar;
        this.f12923a = faVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12377a(int i, String str, Throwable th) {
        C4406pa.m17453b("impression", i, str);
        this.f12924b.f12988g.remove(this.f12923a.f12888a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12355a(String str) {
        C4406pa.m17454b("impression", str);
        C4370gb.m17360b(C4370gb.f12909a, "PREFS_OS_IMPRESSIONED_IAMS", (Set<String>) this.f12924b.f12988g);
    }
}
