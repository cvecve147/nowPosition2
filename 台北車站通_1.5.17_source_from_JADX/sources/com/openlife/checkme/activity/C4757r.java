package com.openlife.checkme.activity;

import android.app.Activity;
import com.openlife.checkme.activity.C4703m;
import com.openlife.checkme.activity.C4835t;
import com.openlife.checkme.activity.login.LoginActivity;
import com.openlife.checkme.activity.p088a.C4458a;
import com.openlife.checkme.net.model.AccountData;
import com.openlife.checkme.net.model.LoginMigrateResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.C6433l;
import p208e.p221b.p222a.p224b.C6216b;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p227d.C6239a;
import p208e.p221b.p227d.C6242d;
import p208e.p221b.p243h.C6418a;

/* renamed from: com.openlife.checkme.activity.r */
public abstract class C4757r<M extends C4703m, V extends C4835t> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public M f13710a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public V f13711b;

    /* renamed from: c */
    private C4458a f13712c = new C4458a();

    public C4757r(V v, M m) {
        this.f13711b = v;
        this.f13710a = m;
    }

    /* renamed from: a */
    private boolean m18709a(C4953c cVar, boolean z) {
        int error = cVar.getError();
        if (error == 401) {
            m18716g(cVar);
        } else if (error == 5002) {
            m18715f(cVar);
        } else if (error == 5103) {
            m18713d(cVar);
        } else if (error == 5107) {
            m18712b(cVar, z);
        } else if (error == 5121) {
            m18714e(cVar);
        } else if (cVar.isShowMessage()) {
            if (z) {
                this.f13711b.mo12962d(cVar.getMessage());
            } else {
                this.f13711b.mo12965f(cVar.getMessage());
            }
        }
        return cVar.getError() == 0;
    }

    /* renamed from: b */
    private C6433l<LoginMigrateResponse> mo12683b(int i) {
        if (i == 0) {
            M m = this.f13710a;
            return m.mo12974a(m.mo12978c());
        } else if (i == 1 || i == 2 || i == 3) {
            M m2 = this.f13710a;
            return m2.mo12973a(m2.mo12983f());
        } else {
            M m3 = this.f13710a;
            return m3.mo12974a(m3.mo12978c());
        }
    }

    /* renamed from: b */
    private void m18712b(C4953c cVar, boolean z) {
        if (!z) {
            if (cVar.isShowMessage()) {
                this.f13711b.mo12956a(cVar.getMessage(), ((AccountData) cVar.getData()).getPoint());
            } else {
                this.f13711b.mo12958b(((AccountData) cVar.getData()).getPoint());
            }
        }
    }

    /* renamed from: d */
    private void m18713d(C4953c cVar) {
        if (cVar.isShowMessage()) {
            this.f13711b.mo12964e(cVar.getMessage());
        }
    }

    /* renamed from: e */
    private void m18714e(C4953c cVar) {
        if (cVar.isShowMessage()) {
            this.f13711b.mo12957a(cVar.getMessage(), ((AccountData) cVar.getData()).getInviteCode());
        }
    }

    /* renamed from: f */
    private void m18715f(C4953c cVar) {
        if (cVar.isShowMessage()) {
            this.f13711b.mo12960c(cVar.getMessage());
        }
    }

    /* renamed from: g */
    private void m18716g(C4953c cVar) {
        if (cVar.isShowMessage()) {
            this.f13711b.mo12959b(cVar.getMessage());
        }
    }

    /* renamed from: a */
    public C4458a mo13150a() {
        return this.f13712c;
    }

    /* renamed from: a */
    public void mo13151a(int i) {
        this.f13712c.mo12586a(mo12683b(i).mo16545b(C6418a.m23996b()).mo16533a((C6242d<? super C6223b>) new C4756q(this)).mo16544b((C6239a) new C4755p(this)).mo16540a(C6216b.m23500a()).mo16526a(new C4736n(this), (C6242d<? super Throwable>) new C4737o(this)));
    }

    /* renamed from: a */
    public void mo13152a(Activity activity) {
        int j = this.f13710a.mo12986j();
        if (j == 0) {
            LoginActivity.m18422a(activity);
        } else if (j == 1) {
            activity.setResult(10000);
            activity.finish();
        }
    }

    /* renamed from: a */
    public boolean mo13153a(C4953c cVar) {
        return m18709a(cVar, false);
    }

    /* renamed from: b */
    public void mo13154b() {
        this.f13712c.mo12585a();
    }

    /* renamed from: b */
    public boolean mo13155b(C4953c cVar) {
        return m18709a(cVar, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo13156c(C4953c cVar) {
        if (cVar.getError() == 0) {
            return true;
        }
        return mo13153a(cVar);
    }
}
