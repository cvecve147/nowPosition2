package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C2011d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.hb */
public final class C3139hb extends C2996cb implements C2011d.C2012a, C2011d.C2013b {

    /* renamed from: d */
    private Context f9407d;

    /* renamed from: e */
    private zzang f9408e;

    /* renamed from: f */
    private C3172ig<zzaef> f9409f;

    /* renamed from: g */
    private final C2939ab f9410g;

    /* renamed from: h */
    private final Object f9411h = new Object();

    /* renamed from: i */
    private C3167ib f9412i;

    public C3139hb(Context context, zzang zzang, C3172ig<zzaef> igVar, C2939ab abVar) {
        super(igVar, abVar);
        this.f9407d = context;
        this.f9408e = zzang;
        this.f9409f = igVar;
        this.f9410g = abVar;
        this.f9412i = new C3167ib(context, ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7848Z)).booleanValue() ? C1697X.m7713t().mo9309b() : context.getMainLooper(), this, this);
        this.f9412i.mo7630m();
    }

    /* renamed from: a */
    public final void mo7572a(ConnectionResult connectionResult) {
        C2227Cf.m9532b("Cannot connect to remote service, fallback to local instance.");
        new C3111gb(this.f9407d, this.f9409f, this.f9410g).mo8107a();
        Bundle bundle = new Bundle();
        bundle.putString("action", "gms_connection_failed_fallback_to_local");
        C1697X.m7698e().mo9455b(this.f9407d, this.f9408e.f10855a, "gmob-apps", bundle, true);
    }

    /* renamed from: b */
    public final void mo9273b() {
        synchronized (this.f9411h) {
            if (this.f9412i.isConnected() || this.f9412i.mo7621d()) {
                this.f9412i.mo7608a();
            }
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: c */
    public final C3343ob mo9274c() {
        C3343ob D;
        synchronized (this.f9411h) {
            try {
                D = this.f9412i.mo7557D();
            } catch (DeadObjectException | IllegalStateException unused) {
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return D;
    }

    /* renamed from: f */
    public final void mo7570f(int i) {
        C2227Cf.m9532b("Disconnected from remote ad request service.");
    }

    /* renamed from: j */
    public final void mo7571j(Bundle bundle) {
        mo8107a();
    }
}
