package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.C2181Ap;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2558Nu;
import com.google.android.gms.internal.ads.C3057ee;
import com.google.android.gms.internal.ads.C3390pt;
import com.google.android.gms.internal.ads.C3432rf;
import com.google.android.gms.internal.ads.C3614xp;
import com.google.android.gms.internal.ads.zzang;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.h */
public final class C1753h implements C3614xp, Runnable {

    /* renamed from: a */
    private final List<Object[]> f5739a;

    /* renamed from: b */
    private final AtomicReference<C3614xp> f5740b;

    /* renamed from: c */
    private Context f5741c;

    /* renamed from: d */
    private zzang f5742d;

    /* renamed from: e */
    private CountDownLatch f5743e;

    private C1753h(Context context, zzang zzang) {
        this.f5739a = new Vector();
        this.f5740b = new AtomicReference<>();
        this.f5743e = new CountDownLatch(1);
        this.f5741c = context;
        this.f5742d = zzang;
        C3390pt.m13453a();
        if (C3432rf.m13608b()) {
            C3057ee.m12269a((Runnable) this);
        } else {
            run();
        }
    }

    public C1753h(C1698Y y) {
        this(y.f5616c, y.f5618e);
    }

    /* renamed from: a */
    private final boolean m7889a() {
        try {
            this.f5743e.await();
            return true;
        } catch (InterruptedException e) {
            C2227Cf.m9535c("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    /* renamed from: b */
    private static Context m7890b(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* renamed from: b */
    private final void m7891b() {
        if (!this.f5739a.isEmpty()) {
            for (Object[] next : this.f5739a) {
                if (next.length == 1) {
                    this.f5740b.get().mo6947a((MotionEvent) next[0]);
                } else if (next.length == 3) {
                    this.f5740b.get().mo6946a(((Integer) next[0]).intValue(), ((Integer) next[1]).intValue(), ((Integer) next[2]).intValue());
                }
            }
            this.f5739a.clear();
        }
    }

    /* renamed from: a */
    public final String mo6943a(Context context) {
        C3614xp xpVar;
        if (!m7889a() || (xpVar = this.f5740b.get()) == null) {
            return "";
        }
        m7891b();
        return xpVar.mo6943a(m7890b(context));
    }

    /* renamed from: a */
    public final String mo6944a(Context context, String str, View view) {
        return mo6945a(context, str, view, (Activity) null);
    }

    /* renamed from: a */
    public final String mo6945a(Context context, String str, View view, Activity activity) {
        C3614xp xpVar;
        if (!m7889a() || (xpVar = this.f5740b.get()) == null) {
            return "";
        }
        m7891b();
        return xpVar.mo6945a(m7890b(context), str, view, activity);
    }

    /* renamed from: a */
    public final void mo6946a(int i, int i2, int i3) {
        C3614xp xpVar = this.f5740b.get();
        if (xpVar != null) {
            m7891b();
            xpVar.mo6946a(i, i2, i3);
            return;
        }
        this.f5739a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* renamed from: a */
    public final void mo6947a(MotionEvent motionEvent) {
        C3614xp xpVar = this.f5740b.get();
        if (xpVar != null) {
            m7891b();
            xpVar.mo6947a(motionEvent);
            return;
        }
        this.f5739a.add(new Object[]{motionEvent});
    }

    /* renamed from: a */
    public final void mo6948a(View view) {
        C3614xp xpVar = this.f5740b.get();
        if (xpVar != null) {
            xpVar.mo6948a(view);
        }
    }

    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.f5742d.f10858d;
            if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7919kb)).booleanValue() && z2) {
                z = true;
            }
            this.f5740b.set(C2181Ap.m9394a(this.f5742d.f10855a, m7890b(this.f5741c), z));
        } finally {
            this.f5743e.countDown();
            this.f5741c = null;
            this.f5742d = null;
        }
    }
}
