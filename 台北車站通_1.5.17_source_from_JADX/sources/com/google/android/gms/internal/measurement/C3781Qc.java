package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.util.Log;
import p013b.p018b.p028h.p029a.C1023e;

/* renamed from: com.google.android.gms.internal.measurement.Qc */
public abstract class C3781Qc<T> {

    /* renamed from: a */
    private static final Object f11281a = new Object();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static Context f11282b = null;

    /* renamed from: c */
    private static boolean f11283c = false;

    /* renamed from: d */
    private static volatile Boolean f11284d = null;

    /* renamed from: e */
    private static volatile Boolean f11285e = null;

    /* renamed from: f */
    private final C3819_c f11286f;

    /* renamed from: g */
    final String f11287g;

    /* renamed from: h */
    private final String f11288h;

    /* renamed from: i */
    private final T f11289i;

    /* renamed from: j */
    private T f11290j;

    /* renamed from: k */
    private volatile C3769Nc f11291k;

    /* renamed from: l */
    private volatile SharedPreferences f11292l;

    private C3781Qc(C3819_c _cVar, String str, T t) {
        this.f11290j = null;
        this.f11291k = null;
        this.f11292l = null;
        if (_cVar.f11372b != null) {
            this.f11286f = _cVar;
            String valueOf = String.valueOf(_cVar.f11373c);
            String valueOf2 = String.valueOf(str);
            this.f11288h = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            String valueOf3 = String.valueOf(_cVar.f11374d);
            String valueOf4 = String.valueOf(str);
            this.f11287g = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
            this.f11289i = t;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* synthetic */ C3781Qc(C3819_c _cVar, String str, Object obj, C3796Uc uc) {
        this(_cVar, str, obj);
    }

    /* renamed from: a */
    private static <V> V m15050a(C3816Zc<V> zc) {
        long clearCallingIdentity;
        try {
            return zc.mo10536a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a = zc.mo10536a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m15051a(Context context) {
        synchronized (f11281a) {
            if (Build.VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
            }
            if (f11282b != context) {
                f11284d = null;
            }
            f11282b = context;
        }
        f11283c = false;
    }

    /* renamed from: a */
    static boolean m15052a(String str, boolean z) {
        try {
            if (m15061e()) {
                return ((Boolean) m15050a(new C3792Tc(str, false))).booleanValue();
            }
            return false;
        } catch (SecurityException e) {
            Log.e("PhenotypeFlag", "Unable to read GServices, returning default value.", e);
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C3781Qc<Double> m15053b(C3819_c _cVar, String str, double d) {
        return new C3808Xc(_cVar, str, Double.valueOf(d));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C3781Qc<Integer> m15054b(C3819_c _cVar, String str, int i) {
        return new C3800Vc(_cVar, str, Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C3781Qc<Long> m15055b(C3819_c _cVar, String str, long j) {
        return new C3796Uc(_cVar, str, Long.valueOf(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C3781Qc<String> m15056b(C3819_c _cVar, String str, String str2) {
        return new C3812Yc(_cVar, str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C3781Qc<Boolean> m15057b(C3819_c _cVar, String str, boolean z) {
        return new C3804Wc(_cVar, str, Boolean.valueOf(z));
    }

    @TargetApi(24)
    /* renamed from: c */
    private final T m15059c() {
        if (m15052a("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            String valueOf = String.valueOf(this.f11287g);
            Log.w("PhenotypeFlag", valueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(valueOf) : new String("Bypass reading Phenotype values for flag: "));
            return null;
        } else if (this.f11286f.f11372b != null) {
            if (this.f11291k == null) {
                this.f11291k = C3769Nc.m14992a(f11282b.getContentResolver(), this.f11286f.f11372b);
            }
            String str = (String) m15050a(new C3784Rc(this, this.f11291k));
            if (str != null) {
                return mo10532a(str);
            }
            return null;
        } else {
            C3819_c _cVar = this.f11286f;
            return null;
        }
    }

    /* renamed from: d */
    private final T m15060d() {
        C3819_c _cVar = this.f11286f;
        if (!m15061e()) {
            return null;
        }
        try {
            String str = (String) m15050a(new C3788Sc(this));
            if (str != null) {
                return mo10532a(str);
            }
            return null;
        } catch (SecurityException e) {
            String valueOf = String.valueOf(this.f11287g);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? "Unable to read GServices for flag: ".concat(valueOf) : new String("Unable to read GServices for flag: "), e);
            return null;
        }
    }

    /* renamed from: e */
    private static boolean m15061e() {
        if (f11284d == null) {
            Context context = f11282b;
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (C1023e.m5436a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                z = true;
            }
            f11284d = Boolean.valueOf(z);
        }
        return f11284d.booleanValue();
    }

    /* renamed from: a */
    public final T mo10531a() {
        if (f11282b != null) {
            C3819_c _cVar = this.f11286f;
            T c = m15059c();
            if (c != null) {
                return c;
            }
            T d = m15060d();
            return d != null ? d : this.f11289i;
        }
        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo10532a(String str);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ String mo10533b() {
        return C3761Lc.m14961a(f11282b.getContentResolver(), this.f11288h, (String) null);
    }
}
