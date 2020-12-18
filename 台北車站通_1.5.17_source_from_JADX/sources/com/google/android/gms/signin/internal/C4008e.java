package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.p069a.C1844a;
import com.google.android.gms.common.C2064k;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.C2011d;
import com.google.android.gms.common.internal.C2025f;
import com.google.android.gms.common.internal.C2032k;
import com.google.android.gms.common.internal.C2040q;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.C4005d;
import p101d.p129g.p131b.p132a.p143f.C5524b;
import p101d.p129g.p131b.p132a.p143f.C5525c;

/* renamed from: com.google.android.gms.signin.internal.e */
public class C4008e extends C2032k<C4005d> implements C5524b {

    /* renamed from: G */
    private final boolean f11921G;

    /* renamed from: H */
    private final C2025f f11922H;

    /* renamed from: I */
    private final Bundle f11923I;

    /* renamed from: J */
    private Integer f11924J;

    public C4008e(Context context, Looper looper, boolean z, C2025f fVar, Bundle bundle, GoogleApiClient.C1848b bVar, GoogleApiClient.C1849c cVar) {
        super(context, looper, 44, fVar, bVar, cVar);
        this.f11921G = z;
        this.f11922H = fVar;
        this.f11923I = bundle;
        this.f11924J = fVar.mo7663d();
    }

    public C4008e(Context context, Looper looper, boolean z, C2025f fVar, C5525c cVar, GoogleApiClient.C1848b bVar, GoogleApiClient.C1849c cVar2) {
        this(context, looper, z, fVar, m16163a(fVar), bVar, cVar2);
    }

    /* renamed from: a */
    public static Bundle m16163a(C2025f fVar) {
        C5525c i = fVar.mo7668i();
        Integer d = fVar.mo7663d();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", fVar.mo7659a());
        if (d != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", d.intValue());
        }
        if (i != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", i.mo14978g());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", i.mo14977f());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", i.mo14975d());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", i.mo14976e());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", i.mo14973b());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", i.mo14979h());
            if (i.mo14972a() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", i.mo14972a().longValue());
            }
            if (i.mo14974c() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", i.mo14974c().longValue());
            }
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public String mo7556A() {
        return "com.google.android.gms.signin.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4005d m16166a(IBinder iBinder) {
        return C4005d.C4006a.asInterface(iBinder);
    }

    /* renamed from: a */
    public void mo11363a(C2040q qVar, boolean z) {
        try {
            ((C4005d) mo7641x()).mo11360a(qVar, this.f11924J.intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    /* renamed from: a */
    public void mo11364a(C4003c cVar) {
        C2061y.m9068a(cVar, (Object) "Expecting a valid ISignInCallbacks");
        try {
            Account b = this.f11922H.mo7661b();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(b.name)) {
                googleSignInAccount = C1844a.m8231a(mo7635r()).mo7211a();
            }
            ((C4005d) mo7641x()).mo11361a(new SignInRequest(new ResolveAccountRequest(b, this.f11924J.intValue(), googleSignInAccount)), cVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                cVar.mo7352a(new SignInResponse(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* renamed from: c */
    public void mo11365c() {
        try {
            ((C4005d) mo7641x()).mo11362e(this.f11924J.intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public void connect() {
        mo7614a((C2011d.C2015d) new C2011d.C2018g());
    }

    /* renamed from: g */
    public int mo7297g() {
        return C2064k.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* renamed from: j */
    public boolean mo7627j() {
        return this.f11921G;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public Bundle mo7636s() {
        if (!mo7635r().getPackageName().equals(this.f11922H.mo7666g())) {
            this.f11923I.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f11922H.mo7666g());
        }
        return this.f11923I;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public String mo7560z() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }
}
