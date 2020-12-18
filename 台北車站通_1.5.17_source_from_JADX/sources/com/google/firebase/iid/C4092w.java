package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* renamed from: com.google.firebase.iid.w */
public final class C4092w extends Binder {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4088s f12133a;

    C4092w(C4088s sVar) {
        this.f12133a = sVar;
    }

    /* renamed from: a */
    public final void mo11532a(C4090u uVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "service received new intent via bind strategy");
            }
            if (this.f12133a.mo11526b(uVar.f12127a)) {
                uVar.mo11530a();
                return;
            }
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "intent being queued for bg execution");
            }
            this.f12133a.f12119a.execute(new C4093x(this, uVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
