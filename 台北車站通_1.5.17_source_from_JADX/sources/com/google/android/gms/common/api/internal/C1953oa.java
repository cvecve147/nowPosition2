package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.C1872g;
import com.google.android.gms.common.api.C1874i;
import com.google.android.gms.common.api.C1976j;
import com.google.android.gms.common.api.C1977k;
import com.google.android.gms.common.api.C1978l;
import com.google.android.gms.common.api.C1979m;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C2061y;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.oa */
public final class C1953oa<R extends C1874i> extends C1979m<R> implements C1976j<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C1978l<? super R, ? extends C1874i> f6287a;

    /* renamed from: b */
    private C1953oa<? extends C1874i> f6288b;

    /* renamed from: c */
    private volatile C1977k<? super R> f6289c;

    /* renamed from: d */
    private final Object f6290d;

    /* renamed from: e */
    private Status f6291e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final WeakReference<GoogleApiClient> f6292f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1957qa f6293g;

    /* renamed from: a */
    private final void m8629a(Status status) {
        synchronized (this.f6290d) {
            this.f6291e = status;
            m8632b(this.f6291e);
        }
    }

    /* renamed from: b */
    private final void m8632b(Status status) {
        synchronized (this.f6290d) {
            if (this.f6287a != null) {
                Status a = this.f6287a.mo7497a(status);
                C2061y.m9068a(a, (Object) "onFailure must not return null");
                this.f6288b.m8629a(a);
            } else if (m8634b()) {
                this.f6289c.mo7495a(status);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m8633b(C1874i iVar) {
        if (iVar instanceof C1872g) {
            try {
                ((C1872g) iVar).mo7319a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(iVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("TransformedResultImpl", sb.toString(), e);
            }
        }
    }

    /* renamed from: b */
    private final boolean m8634b() {
        return (this.f6289c == null || ((GoogleApiClient) this.f6292f.get()) == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7473a() {
        this.f6289c = null;
    }

    /* renamed from: a */
    public final void mo7474a(R r) {
        synchronized (this.f6290d) {
            if (!r.mo7269a().mo7273e()) {
                m8629a(r.mo7269a());
                m8633b((C1874i) r);
            } else if (this.f6287a != null) {
                C1938ia.m8595a().submit(new C1955pa(this, r));
            } else if (m8634b()) {
                this.f6289c.mo7496b(r);
            }
        }
    }
}
