package com.onesignal;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: com.onesignal.Da */
class C4232Da {

    /* renamed from: a */
    private static final String f12562a = "com.onesignal.Da";

    /* renamed from: b */
    private final C4233a f12563b;

    /* renamed from: com.onesignal.Da$a */
    interface C4233a {
        /* renamed from: a */
        void mo12288a();
    }

    C4232Da(C4233a aVar) {
        this.f12563b = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo12287a() {
        Activity activity = C4342b.f12860f;
        if (activity == null) {
            return false;
        }
        boolean a = C4256Ja.m16904a((WeakReference<Activity>) new WeakReference(activity));
        if (a) {
            C4342b.m17293a(f12562a, this.f12563b);
        }
        return !a;
    }
}
