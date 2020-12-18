package com.facebook;

import android.content.Intent;
import com.facebook.internal.C1480ba;
import com.facebook.internal.C1484ca;
import p013b.p018b.p028h.p029a.C1020d;

/* renamed from: com.facebook.O */
final class C1359O {

    /* renamed from: a */
    private static volatile C1359O f4839a;

    /* renamed from: b */
    private final C1020d f4840b;

    /* renamed from: c */
    private final C1358N f4841c;

    /* renamed from: d */
    private Profile f4842d;

    C1359O(C1020d dVar, C1358N n) {
        C1484ca.m6976a((Object) dVar, "localBroadcastManager");
        C1484ca.m6976a((Object) n, "profileCache");
        this.f4840b = dVar;
        this.f4841c = n;
    }

    /* renamed from: a */
    private void m6606a(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.f4840b.mo5020a(intent);
    }

    /* renamed from: a */
    private void m6607a(Profile profile, boolean z) {
        Profile profile2 = this.f4842d;
        this.f4842d = profile;
        if (z) {
            if (profile != null) {
                this.f4841c.mo5997a(profile);
            } else {
                this.f4841c.mo5996a();
            }
        }
        if (!C1480ba.m6951a(profile2, profile)) {
            m6606a(profile2, profile);
        }
    }

    /* renamed from: b */
    static C1359O m6608b() {
        if (f4839a == null) {
            synchronized (C1359O.class) {
                if (f4839a == null) {
                    f4839a = new C1359O(C1020d.m5430a(C1601x.m7386b()), new C1358N());
                }
            }
        }
        return f4839a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Profile mo5999a() {
        return this.f4842d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6000a(Profile profile) {
        m6607a(profile, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo6001c() {
        Profile b = this.f4841c.mo5998b();
        if (b == null) {
            return false;
        }
        m6607a(b, false);
        return true;
    }
}
