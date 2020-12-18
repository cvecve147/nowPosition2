package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.C1850a.C1852b;
import com.google.android.gms.common.api.C1874i;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1999B;
import com.google.android.gms.common.internal.C2061y;

/* renamed from: com.google.android.gms.common.api.internal.c */
public abstract class C1921c<R extends C1874i, A extends C1850a.C1852b> extends BasePendingResult<R> implements C1923d<R> {

    /* renamed from: q */
    private final C1850a.C1853c<A> f6211q;

    /* renamed from: r */
    private final C1850a<?> f6212r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C1921c(C1850a<?> aVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        C2061y.m9068a(googleApiClient, (Object) "GoogleApiClient must not be null");
        C2061y.m9068a(aVar, (Object) "Api must not be null");
        this.f6211q = aVar.mo7279a();
        this.f6212r = aVar;
    }

    /* renamed from: a */
    private void m8496a(RemoteException remoteException) {
        mo7411c(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7408a(A a);

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo7409a(Object obj) {
        super.mo7329a((C1874i) obj);
    }

    /* renamed from: b */
    public final void mo7410b(A a) {
        if (a instanceof C1999B) {
            a = ((C1999B) a).mo7557D();
        }
        try {
            mo7408a(a);
        } catch (DeadObjectException e) {
            m8496a((RemoteException) e);
            throw e;
        } catch (RemoteException e2) {
            m8496a(e2);
        }
    }

    /* renamed from: c */
    public final void mo7411c(Status status) {
        C2061y.m9074a(!status.mo7273e(), (Object) "Failed result must not be success");
        mo7326a(status);
        mo7329a(status);
        mo7412c(status);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7412c(R r) {
    }

    /* renamed from: g */
    public final C1850a<?> mo7413g() {
        return this.f6212r;
    }

    /* renamed from: h */
    public final C1850a.C1853c<A> mo7414h() {
        return this.f6211q;
    }
}
