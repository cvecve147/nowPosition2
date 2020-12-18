package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.p073a.C2077b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p013b.p018b.p028h.p029a.C1024f;

/* renamed from: com.google.firebase.iid.s */
public abstract class C4088s extends Service {

    /* renamed from: a */
    final ExecutorService f12119a;

    /* renamed from: b */
    private Binder f12120b;

    /* renamed from: c */
    private final Object f12121c;

    /* renamed from: d */
    private int f12122d;

    /* renamed from: e */
    private int f12123e;

    public C4088s() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        this.f12119a = Executors.newSingleThreadExecutor(new C2077b(valueOf.length() != 0 ? "Firebase-".concat(valueOf) : new String("Firebase-")));
        this.f12121c = new Object();
        this.f12123e = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m16352d(Intent intent) {
        if (intent != null) {
            C1024f.m5439a(intent);
        }
        synchronized (this.f12121c) {
            this.f12123e--;
            if (this.f12123e == 0) {
                stopSelfResult(this.f12122d);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Intent mo11478a(Intent intent) {
        return intent;
    }

    /* renamed from: b */
    public boolean mo11526b(Intent intent) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo11480c(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f12120b == null) {
            this.f12120b = new C4092w(this);
        }
        return this.f12120b;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f12121c) {
            this.f12122d = i2;
            this.f12123e++;
        }
        Intent a = mo11478a(intent);
        if (a == null) {
            m16352d(intent);
            return 2;
        } else if (mo11526b(a)) {
            m16352d(intent);
            return 2;
        } else {
            this.f12119a.execute(new C4089t(this, a, intent));
            return 3;
        }
    }
}
