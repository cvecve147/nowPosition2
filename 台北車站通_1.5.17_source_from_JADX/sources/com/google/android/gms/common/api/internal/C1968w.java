package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.C1874i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1999B;
import com.google.android.gms.common.internal.C2061y;

/* renamed from: com.google.android.gms.common.api.internal.w */
public final class C1968w implements C1907Q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1908S f6315a;

    /* renamed from: b */
    private boolean f6316b = false;

    public C1968w(C1908S s) {
        this.f6315a = s;
    }

    /* renamed from: a */
    public final <A extends C1850a.C1852b, T extends C1921c<? extends C1874i, A>> T mo7358a(T t) {
        try {
            this.f6315a.f6194n.f6174y.mo7483a(t);
            C1899L l = this.f6315a.f6194n;
            C1850a.C1861f fVar = l.f6165p.get(t.mo7414h());
            C2061y.m9068a(fVar, (Object) "Appropriate Api was not requested.");
            if (fVar.isConnected() || !this.f6315a.f6187g.containsKey(t.mo7414h())) {
                boolean z = fVar instanceof C1999B;
                C1850a.C1852b bVar = fVar;
                if (z) {
                    bVar = ((C1999B) fVar).mo7557D();
                }
                t.mo7410b(bVar);
                return t;
            }
            t.mo7411c(new Status(17));
            return t;
        } catch (DeadObjectException unused) {
            this.f6315a.mo7382a((C1909T) new C1970x(this, this));
        }
    }

    /* renamed from: a */
    public final void mo7359a(ConnectionResult connectionResult, C1850a<?> aVar, boolean z) {
    }

    /* renamed from: a */
    public final boolean mo7360a() {
        if (this.f6316b) {
            return false;
        }
        if (this.f6315a.f6194n.mo7369e()) {
            this.f6316b = true;
            for (C1953oa a : this.f6315a.f6194n.f6173x) {
                a.mo7473a();
            }
            return false;
        }
        this.f6315a.mo7381a((ConnectionResult) null);
        return true;
    }

    /* renamed from: b */
    public final void mo7361b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo7489c() {
        if (this.f6316b) {
            this.f6316b = false;
            this.f6315a.f6194n.f6174y.mo7482a();
            mo7360a();
        }
    }

    public final void connect() {
        if (this.f6316b) {
            this.f6316b = false;
            this.f6315a.mo7382a((C1909T) new C1972y(this, this));
        }
    }

    /* renamed from: f */
    public final void mo7363f(int i) {
        this.f6315a.mo7381a((ConnectionResult) null);
        this.f6315a.f6195o.mo7353a(i, this.f6316b);
    }

    /* renamed from: j */
    public final void mo7364j(Bundle bundle) {
    }
}
