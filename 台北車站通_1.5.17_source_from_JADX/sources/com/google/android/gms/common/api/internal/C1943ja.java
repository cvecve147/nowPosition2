package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C2025f;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.C4002b;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.Set;
import p101d.p129g.p131b.p132a.p143f.C5522a;
import p101d.p129g.p131b.p132a.p143f.C5524b;
import p101d.p129g.p131b.p132a.p143f.C5525c;

/* renamed from: com.google.android.gms.common.api.internal.ja */
public final class C1943ja extends C4002b implements GoogleApiClient.C1848b, GoogleApiClient.C1849c {

    /* renamed from: a */
    private static C1850a.C1851a<? extends C5524b, C5525c> f6274a = C5522a.f15427c;

    /* renamed from: b */
    private final Context f6275b;

    /* renamed from: c */
    private final Handler f6276c;

    /* renamed from: d */
    private final C1850a.C1851a<? extends C5524b, C5525c> f6277d;

    /* renamed from: e */
    private Set<Scope> f6278e;

    /* renamed from: f */
    private C2025f f6279f;

    /* renamed from: g */
    private C5524b f6280g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C1951na f6281h;

    public C1943ja(Context context, Handler handler, C2025f fVar) {
        this(context, handler, fVar, f6274a);
    }

    public C1943ja(Context context, Handler handler, C2025f fVar, C1850a.C1851a<? extends C5524b, C5525c> aVar) {
        this.f6275b = context;
        this.f6276c = handler;
        C2061y.m9068a(fVar, (Object) "ClientSettings must not be null");
        this.f6279f = fVar;
        this.f6278e = fVar.mo7667h();
        this.f6277d = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m8604b(SignInResponse signInResponse) {
        ConnectionResult b = signInResponse.mo11351b();
        if (b.mo7218f()) {
            ResolveAccountResponse c = signInResponse.mo11352c();
            b = c.mo7601c();
            if (!b.mo7218f()) {
                String valueOf = String.valueOf(b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
            } else {
                this.f6281h.mo7445a(c.mo7600b(), this.f6278e);
                this.f6280g.mo7288a();
            }
        }
        this.f6281h.mo7446b(b);
        this.f6280g.mo7288a();
    }

    /* renamed from: Xa */
    public final C5524b mo7460Xa() {
        return this.f6280g;
    }

    /* renamed from: Ya */
    public final void mo7461Ya() {
        C5524b bVar = this.f6280g;
        if (bVar != null) {
            bVar.mo7288a();
        }
    }

    /* renamed from: a */
    public final void mo7263a(ConnectionResult connectionResult) {
        this.f6281h.mo7446b(connectionResult);
    }

    /* renamed from: a */
    public final void mo7462a(C1951na naVar) {
        C5524b bVar = this.f6280g;
        if (bVar != null) {
            bVar.mo7288a();
        }
        this.f6279f.mo7660a(Integer.valueOf(System.identityHashCode(this)));
        C1850a.C1851a<? extends C5524b, C5525c> aVar = this.f6277d;
        Context context = this.f6275b;
        Looper looper = this.f6276c.getLooper();
        C2025f fVar = this.f6279f;
        this.f6280g = (C5524b) aVar.mo7283a(context, looper, fVar, fVar.mo7668i(), this, this);
        this.f6281h = naVar;
        Set<Scope> set = this.f6278e;
        if (set == null || set.isEmpty()) {
            this.f6276c.post(new C1945ka(this));
        } else {
            this.f6280g.connect();
        }
    }

    /* renamed from: a */
    public final void mo7352a(SignInResponse signInResponse) {
        this.f6276c.post(new C1949ma(this, signInResponse));
    }

    /* renamed from: f */
    public final void mo7261f(int i) {
        this.f6280g.mo7288a();
    }

    /* renamed from: j */
    public final void mo7262j(Bundle bundle) {
        this.f6280g.mo11364a(this);
    }
}
