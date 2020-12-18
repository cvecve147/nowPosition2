package com.openlife.checkme.activity.account.redemption.detail;

import com.openlife.checkme.activity.account.redemption.detail.C4509i;
import com.openlife.checkme.activity.account.redemption.detail.C4511k;
import com.openlife.checkme.activity.p088a.C4458a;
import com.openlife.checkme.activity.p088a.C4464g;

/* renamed from: com.openlife.checkme.activity.account.redemption.detail.o */
public class C4515o<V extends C4511k, M extends C4509i> extends C4510j {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4511k f13229d;

    /* renamed from: e */
    private C4509i f13230e;

    public C4515o(V v, M m) {
        super(v, m);
        this.f13229d = v;
        this.f13230e = m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12682a(boolean z, int i) {
        this.f13229d.mo12665a(!z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12683b(int i) {
        C4458a a = mo13150a();
        C4509i iVar = this.f13230e;
        C4464g.m17699a(a, iVar.mo12678a(iVar.mo12676a(), i), new C4514n(this), this.f13229d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo12684c(int i) {
        C4458a a = mo13150a();
        C4509i iVar = this.f13230e;
        C4464g.m17699a(a, iVar.mo12677a(iVar.mo12679b(), i), new C4513m(this), this.f13229d);
    }
}
