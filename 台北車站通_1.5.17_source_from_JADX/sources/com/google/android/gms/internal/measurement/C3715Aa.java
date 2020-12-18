package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.C1933g;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.p072c.C1989c;
import com.google.android.gms.common.util.C2083e;
import com.google.android.gms.common.util.C2086h;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.Aa */
public class C3715Aa extends C3839ec implements C3806Xa {

    /* renamed from: v */
    private static volatile C3715Aa f10985v;

    /* renamed from: A */
    private final C3909wa f10986A;

    /* renamed from: B */
    private final C3799Vb f10987B;

    /* renamed from: C */
    private final AppMeasurement f10988C;

    /* renamed from: D */
    private final FirebaseAnalytics f10989D;

    /* renamed from: E */
    private final C3871mc f10990E;

    /* renamed from: F */
    private final C3793U f10991F;

    /* renamed from: G */
    private final C2083e f10992G;

    /* renamed from: H */
    private final C3898tb f10993H;

    /* renamed from: I */
    private final C3814Za f10994I;

    /* renamed from: J */
    private final C3872n f10995J;

    /* renamed from: K */
    private C3785S f10996K;

    /* renamed from: L */
    private C3910wb f10997L;

    /* renamed from: M */
    private C3734F f10998M;

    /* renamed from: N */
    private C3778Q f10999N;

    /* renamed from: O */
    private C3873na f11000O;

    /* renamed from: P */
    private boolean f11001P = false;

    /* renamed from: Q */
    private Boolean f11002Q;

    /* renamed from: R */
    private long f11003R;

    /* renamed from: S */
    private int f11004S;

    /* renamed from: T */
    private int f11005T;

    /* renamed from: U */
    private final long f11006U;

    /* renamed from: w */
    private final Context f11007w;

    /* renamed from: x */
    private final C3908w f11008x;

    /* renamed from: y */
    private final C3849ha f11009y;

    /* renamed from: z */
    private final C3801W f11010z;

    private C3715Aa(C3810Ya ya) {
        String str;
        C3809Y y;
        C2061y.m9067a(ya);
        mo10694a(this);
        this.f11007w = ya.f11355a;
        C3781Qc.m15051a(this.f11007w);
        this.f11445u = -1;
        this.f10992G = C2086h.m9144d();
        this.f11006U = this.f10992G.mo7725a();
        this.f11008x = new C3908w(this);
        C3849ha haVar = new C3849ha(this);
        haVar.mo10590x();
        this.f11009y = haVar;
        C3801W w = new C3801W(this);
        w.mo10590x();
        this.f11010z = w;
        C3871mc mcVar = new C3871mc(this);
        mcVar.mo10590x();
        this.f10990E = mcVar;
        C3793U u = new C3793U(this);
        u.mo10590x();
        this.f10991F = u;
        this.f10995J = new C3872n(this);
        C3898tb tbVar = new C3898tb(this);
        tbVar.mo10590x();
        this.f10993H = tbVar;
        C3814Za za = new C3814Za(this);
        za.mo10590x();
        this.f10994I = za;
        this.f10988C = new AppMeasurement(this);
        this.f10989D = new FirebaseAnalytics(this);
        C3799Vb vb = new C3799Vb(this);
        vb.mo10590x();
        this.f10987B = vb;
        C3909wa waVar = new C3909wa(this);
        waVar.mo10590x();
        this.f10986A = waVar;
        if (this.f11007w.getApplicationContext() instanceof Application) {
            C3814Za v = mo10397v();
            if (v.getContext().getApplicationContext() instanceof Application) {
                Application application = (Application) v.getContext().getApplicationContext();
                if (v.f11359c == null) {
                    v.f11359c = new C3890rb(v, (C3817_a) null);
                }
                application.unregisterActivityLifecycleCallbacks(v.f11359c);
                application.registerActivityLifecycleCallbacks(v.f11359c);
                y = v.mo10385b().mo10580F();
                str = "Registered activity lifecycle callback";
            }
            C3821aa aaVar = new C3821aa(this);
            aaVar.mo10686x();
            this.f11426b = aaVar;
            C3905va vaVar = new C3905va(this);
            vaVar.mo10686x();
            this.f11425a = vaVar;
            this.f10986A.mo11020a((Runnable) new C3719Ba(this, ya));
        }
        y = mo10385b().mo10576B();
        str = "Application context is not an Application";
        y.mo10592a(str);
        C3821aa aaVar2 = new C3821aa(this);
        aaVar2.mo10686x();
        this.f11426b = aaVar2;
        C3905va vaVar2 = new C3905va(this);
        vaVar2.mo10686x();
        this.f11425a = vaVar2;
        this.f10986A.mo11020a((Runnable) new C3719Ba(this, ya));
    }

    /* renamed from: J */
    private final void m14844J() {
        if (!this.f11001P) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    /* renamed from: a */
    public static C3715Aa m14845a(Context context) {
        C2061y.m9067a(context);
        C2061y.m9067a(context.getApplicationContext());
        if (f10985v == null) {
            synchronized (C3715Aa.class) {
                if (f10985v == null) {
                    f10985v = new C3715Aa(new C3810Ya(context));
                }
            }
        }
        return f10985v;
    }

    /* renamed from: a */
    private static void m14846a(C3798Va va) {
        if (va == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: b */
    private static void m14847b(C3802Wa wa) {
        if (wa == null) {
            throw new IllegalStateException("Component not created");
        } else if (!wa.mo10587s()) {
            String valueOf = String.valueOf(wa.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: t */
    static void m14848t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: A */
    public final C3799Vb mo10373A() {
        m14847b(this.f10987B);
        return this.f10987B;
    }

    /* renamed from: B */
    public final C3801W mo10374B() {
        C3801W w = this.f11010z;
        if (w == null || !w.mo10587s()) {
            return null;
        }
        return this.f11010z;
    }

    /* renamed from: C */
    public final C3873na mo10375C() {
        return this.f11000O;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final C3909wa mo10376D() {
        return this.f10986A;
    }

    /* renamed from: E */
    public final AppMeasurement mo10377E() {
        return this.f10988C;
    }

    /* renamed from: F */
    public final FirebaseAnalytics mo10378F() {
        return this.f10989D;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final long mo10379G() {
        Long valueOf = Long.valueOf(mo10393i().f11477k.mo10763a());
        return valueOf.longValue() == 0 ? this.f11006U : Math.min(this.f11006U, valueOf.longValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final void mo10380H() {
        this.f11005T++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final boolean mo10381I() {
        m14844J();
        mo10388e();
        Boolean bool = this.f11002Q;
        if (bool == null || this.f11003R == 0 || (bool != null && !bool.booleanValue() && Math.abs(mo10382a().mo7726b() - this.f11003R) > 1000)) {
            this.f11003R = mo10382a().mo7726b();
            boolean z = false;
            if (mo10392h().mo10803k("android.permission.INTERNET") && mo10392h().mo10803k("android.permission.ACCESS_NETWORK_STATE") && (C1989c.m8748b(getContext()).mo7518a() || (C3889ra.m15667a(getContext()) && C3780Qb.m15034a(getContext(), false)))) {
                z = true;
            }
            this.f11002Q = Boolean.valueOf(z);
            if (this.f11002Q.booleanValue()) {
                this.f11002Q = Boolean.valueOf(mo10392h().mo10801f(mo10398w().mo10519y()));
            }
        }
        return this.f11002Q.booleanValue();
    }

    /* renamed from: a */
    public final C2083e mo10382a() {
        return this.f10992G;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10383a(C3802Wa wa) {
        this.f11004S++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10384a(C3810Ya ya) {
        C3809Y y;
        String str;
        mo10388e();
        C3734F f = new C3734F(this);
        f.mo10590x();
        this.f10998M = f;
        C3778Q q = new C3778Q(this);
        q.mo10590x();
        this.f10999N = q;
        C3785S s = new C3785S(this);
        s.mo10590x();
        this.f10996K = s;
        C3910wb wbVar = new C3910wb(this);
        wbVar.mo10590x();
        this.f10997L = wbVar;
        this.f10990E.mo10589w();
        this.f11009y.mo10589w();
        this.f11000O = new C3873na(this);
        this.f10999N.mo10589w();
        mo10385b().mo10578D().mo10593a("App measurement is starting up, version", 12451L);
        mo10385b().mo10578D().mo10592a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String z = q.mo10520z();
        if (mo10392h().mo10802h(z)) {
            y = mo10385b().mo10578D();
            str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
        } else {
            y = mo10385b().mo10578D();
            String valueOf = String.valueOf(z);
            str = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
        }
        y.mo10592a(str);
        mo10385b().mo10579E().mo10592a("Debug-level message logging enabled");
        if (this.f11004S != this.f11005T) {
            mo10385b().mo10585y().mo10594a("Not all components initialized", Integer.valueOf(this.f11004S), Integer.valueOf(this.f11005T));
        }
        super.mo10696a((C3859jc) ya);
        this.f11001P = true;
    }

    /* renamed from: b */
    public final C3801W mo10385b() {
        m14847b(this.f11010z);
        return this.f11010z;
    }

    /* renamed from: c */
    public final C3909wa mo10386c() {
        m14847b(this.f10986A);
        return this.f10986A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo10387d() {
        mo10388e();
        if (mo10393i().f11472f.mo10763a() == 0) {
            mo10393i().f11472f.mo10764a(mo10382a().mo7725a());
        }
        if (Long.valueOf(mo10393i().f11477k.mo10763a()).longValue() == 0) {
            mo10385b().mo10580F().mo10593a("Persisting first open", Long.valueOf(this.f11006U));
            mo10393i().f11477k.mo10764a(this.f11006U);
        }
        if (mo10381I()) {
            if (!TextUtils.isEmpty(mo10398w().mo10519y())) {
                String y = mo10393i().mo10752y();
                if (y == null) {
                    mo10393i().mo10748c(mo10398w().mo10519y());
                } else if (!y.equals(mo10398w().mo10519y())) {
                    mo10385b().mo10578D().mo10592a("Rechecking which service to use due to a GMP App Id change");
                    mo10393i().mo10740B();
                    this.f10997L.mo11039y();
                    this.f10997L.mo11025B();
                    mo10393i().mo10748c(mo10398w().mo10519y());
                    mo10393i().f11477k.mo10764a(this.f11006U);
                    mo10393i().f11479m.mo10774a((String) null);
                }
            }
            mo10397v().mo10611a(mo10393i().f11479m.mo10773a());
            if (!TextUtils.isEmpty(mo10398w().mo10519y())) {
                boolean s = mo10395s();
                if (!mo10393i().mo10743E() && !mo10394j().mo11013t()) {
                    mo10393i().mo10751d(!s);
                }
                if (!mo10394j().mo11010i(mo10398w().mo10520z()) || s) {
                    mo10397v().mo10603G();
                }
                mo10399x().mo11035a((AtomicReference<String>) new AtomicReference());
            }
        } else if (mo10395s()) {
            if (!mo10392h().mo10803k("android.permission.INTERNET")) {
                mo10385b().mo10585y().mo10592a("App is missing INTERNET permission");
            }
            if (!mo10392h().mo10803k("android.permission.ACCESS_NETWORK_STATE")) {
                mo10385b().mo10585y().mo10592a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C1989c.m8748b(getContext()).mo7518a()) {
                if (!C3889ra.m15667a(getContext())) {
                    mo10385b().mo10585y().mo10592a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C3780Qb.m15034a(getContext(), false)) {
                    mo10385b().mo10585y().mo10592a("AppMeasurementService not registered/enabled");
                }
            }
            mo10385b().mo10585y().mo10592a("Uploading is not possible. App measurement disabled");
        }
        super.mo10387d();
    }

    /* renamed from: e */
    public final void mo10388e() {
        mo10386c().mo10451d();
    }

    /* renamed from: f */
    public final C3734F mo10389f() {
        m14847b(this.f10998M);
        return this.f10998M;
    }

    /* renamed from: g */
    public final C3793U mo10390g() {
        m14846a((C3798Va) this.f10991F);
        return this.f10991F;
    }

    public final Context getContext() {
        return this.f11007w;
    }

    /* renamed from: h */
    public final C3871mc mo10392h() {
        m14846a((C3798Va) this.f10990E);
        return this.f10990E;
    }

    /* renamed from: i */
    public final C3849ha mo10393i() {
        m14846a((C3798Va) this.f11009y);
        return this.f11009y;
    }

    /* renamed from: j */
    public final C3908w mo10394j() {
        return this.f11008x;
    }

    /* renamed from: s */
    public final boolean mo10395s() {
        mo10388e();
        m14844J();
        boolean z = false;
        if (mo10394j().mo11013t()) {
            return false;
        }
        Boolean b = mo10394j().mo11001b("firebase_analytics_collection_enabled");
        if (b != null) {
            z = b.booleanValue();
        } else if (!C1933g.m8593b()) {
            z = true;
        }
        return mo10393i().mo10749c(z);
    }

    /* renamed from: u */
    public final C3872n mo10396u() {
        m14846a((C3798Va) this.f10995J);
        return this.f10995J;
    }

    /* renamed from: v */
    public final C3814Za mo10397v() {
        m14847b(this.f10994I);
        return this.f10994I;
    }

    /* renamed from: w */
    public final C3778Q mo10398w() {
        m14847b(this.f10999N);
        return this.f10999N;
    }

    /* renamed from: x */
    public final C3910wb mo10399x() {
        m14847b(this.f10997L);
        return this.f10997L;
    }

    /* renamed from: y */
    public final C3898tb mo10400y() {
        m14847b(this.f10993H);
        return this.f10993H;
    }

    /* renamed from: z */
    public final C3785S mo10401z() {
        m14847b(this.f10996K);
        return this.f10996K;
    }
}
