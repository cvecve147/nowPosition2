package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C3114ge;
import com.google.android.gms.internal.ads.zzjj;
import java.lang.ref.WeakReference;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.M */
public final class C1687M {

    /* renamed from: a */
    private final C1689O f5535a;

    /* renamed from: b */
    private final Runnable f5536b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public zzjj f5537c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f5538d;

    /* renamed from: e */
    private boolean f5539e;

    /* renamed from: f */
    private long f5540f;

    public C1687M(C1700a aVar) {
        this(aVar, new C1689O(C3114ge.f9351a));
    }

    private C1687M(C1700a aVar, C1689O o) {
        this.f5538d = false;
        this.f5539e = false;
        this.f5540f = 0;
        this.f5535a = o;
        this.f5536b = new C1688N(this, new WeakReference(aVar));
    }

    /* renamed from: a */
    public final void mo6781a() {
        this.f5538d = false;
        this.f5535a.mo6790a(this.f5536b);
    }

    /* renamed from: a */
    public final void mo6782a(zzjj zzjj) {
        this.f5537c = zzjj;
    }

    /* renamed from: a */
    public final void mo6783a(zzjj zzjj, long j) {
        if (this.f5538d) {
            C2227Cf.m9536d("An ad refresh is already scheduled.");
            return;
        }
        this.f5537c = zzjj;
        this.f5538d = true;
        this.f5540f = j;
        if (!this.f5539e) {
            StringBuilder sb = new StringBuilder(65);
            sb.append("Scheduling ad refresh ");
            sb.append(j);
            sb.append(" milliseconds from now.");
            C2227Cf.m9534c(sb.toString());
            this.f5535a.mo6791a(this.f5536b, j);
        }
    }

    /* renamed from: b */
    public final void mo6784b() {
        this.f5539e = true;
        if (this.f5538d) {
            this.f5535a.mo6790a(this.f5536b);
        }
    }

    /* renamed from: b */
    public final void mo6785b(zzjj zzjj) {
        mo6783a(zzjj, 60000);
    }

    /* renamed from: c */
    public final void mo6786c() {
        this.f5539e = false;
        if (this.f5538d) {
            this.f5538d = false;
            mo6783a(this.f5537c, this.f5540f);
        }
    }

    /* renamed from: d */
    public final void mo6787d() {
        Bundle bundle;
        this.f5539e = false;
        this.f5538d = false;
        zzjj zzjj = this.f5537c;
        if (!(zzjj == null || (bundle = zzjj.f10877c) == null)) {
            bundle.remove("_ad");
        }
        mo6783a(this.f5537c, 0);
    }

    /* renamed from: e */
    public final boolean mo6788e() {
        return this.f5538d;
    }
}
