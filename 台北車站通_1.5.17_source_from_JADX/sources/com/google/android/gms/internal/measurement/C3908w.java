package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.p072c.C1989c;
import com.google.android.gms.common.util.C2083e;
import com.google.android.gms.common.util.C2094p;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.measurement.w */
public final class C3908w extends C3798Va {

    /* renamed from: b */
    private C3916y f11688b = C3912x.f11714a;

    /* renamed from: c */
    private Boolean f11689c;

    C3908w(C3715Aa aa) {
        super(aa);
    }

    /* renamed from: u */
    public static long m15759u() {
        return C3758L.f11176J.mo10498a().longValue();
    }

    /* renamed from: v */
    public static long m15760v() {
        return C3758L.f11203j.mo10498a().longValue();
    }

    /* renamed from: x */
    public static boolean m15761x() {
        return C3758L.f11199f.mo10498a().booleanValue();
    }

    /* renamed from: a */
    public final int mo10997a(String str) {
        return mo11000b(str, C3758L.f11214u);
    }

    /* renamed from: a */
    public final long mo10998a(String str, C3762M<Long> m) {
        if (str != null) {
            String a = this.f11688b.mo10984a(str, m.mo10500b());
            if (!TextUtils.isEmpty(a)) {
                try {
                    return m.mo10499a(Long.valueOf(Long.parseLong(a))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return m.mo10498a().longValue();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2083e mo10382a() {
        return super.mo10382a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10999a(C3916y yVar) {
        this.f11688b = yVar;
    }

    /* renamed from: b */
    public final int mo11000b(String str, C3762M<Integer> m) {
        if (str != null) {
            String a = this.f11688b.mo10984a(str, m.mo10500b());
            if (!TextUtils.isEmpty(a)) {
                try {
                    return m.mo10499a(Integer.valueOf(Integer.parseInt(a))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return m.mo10498a().intValue();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C3801W mo10385b() {
        return super.mo10385b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Boolean mo11001b(String str) {
        C2061y.m9076b(str);
        try {
            if (getContext().getPackageManager() == null) {
                mo10385b().mo10585y().mo10592a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = C1989c.m8748b(getContext()).mo7517a(getContext().getPackageName(), 128);
            if (a == null) {
                mo10385b().mo10585y().mo10592a("Failed to load metadata: ApplicationInfo is null");
                return null;
            } else if (a.metaData == null) {
                mo10385b().mo10585y().mo10592a("Failed to load metadata: Metadata bundle is null");
                return null;
            } else if (!a.metaData.containsKey(str)) {
                return null;
            } else {
                return Boolean.valueOf(a.metaData.getBoolean(str));
            }
        } catch (PackageManager.NameNotFoundException e) {
            mo10385b().mo10585y().mo10593a("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* renamed from: c */
    public final double mo11002c(String str, C3762M<Double> m) {
        if (str != null) {
            String a = this.f11688b.mo10984a(str, m.mo10500b());
            if (!TextUtils.isEmpty(a)) {
                try {
                    return m.mo10499a(Double.valueOf(Double.parseDouble(a))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return m.mo10498a().doubleValue();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3909wa mo10386c() {
        return super.mo10386c();
    }

    /* renamed from: c */
    public final boolean mo11003c(String str) {
        return "1".equals(this.f11688b.mo10984a(str, "gaia_collection_enabled"));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo10451d() {
        super.mo10451d();
    }

    /* renamed from: d */
    public final boolean mo11004d(String str) {
        return "1".equals(this.f11688b.mo10984a(str, "measurement.event_sampling_enabled"));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.internal.measurement.M, com.google.android.gms.internal.measurement.M<java.lang.Boolean>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11005d(java.lang.String r3, com.google.android.gms.internal.measurement.C3762M<java.lang.Boolean> r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000d
        L_0x0002:
            java.lang.Object r3 = r4.mo10498a()
        L_0x0006:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        L_0x000d:
            com.google.android.gms.internal.measurement.y r0 = r2.f11688b
            java.lang.String r1 = r4.mo10500b()
            java.lang.String r3 = r0.mo10984a(r3, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x001e
            goto L_0x0002
        L_0x001e:
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r3 = r4.mo10499a(r3)
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3908w.mo11005d(java.lang.String, com.google.android.gms.internal.measurement.M):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo11006e(String str) {
        return mo11005d(str, C3758L.f11185S);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo11007f(String str) {
        return mo11005d(str, C3758L.f11187U);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo11008g(String str) {
        return mo11005d(str, C3758L.f11188V);
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo11009h(String str) {
        return mo11005d(str, C3758L.f11189W);
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C3778Q mo10568i() {
        return super.mo10568i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo11010i(String str) {
        return mo11005d(str, C3758L.f11190X);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C3734F mo10452j() {
        return super.mo10452j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo11011j(String str) {
        return mo11005d(str, C3758L.f11194aa);
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C3793U mo10453n() {
        return super.mo10453n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C3871mc mo10454o() {
        return super.mo10454o();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C3849ha mo10455q() {
        return super.mo10455q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C3908w mo10456r() {
        return super.mo10456r();
    }

    /* renamed from: s */
    public final boolean mo11012s() {
        if (this.f11689c == null) {
            synchronized (this) {
                if (this.f11689c == null) {
                    ApplicationInfo applicationInfo = getContext().getApplicationInfo();
                    String a = C2094p.m9173a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f11689c = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if (this.f11689c == null) {
                        this.f11689c = Boolean.TRUE;
                        mo10385b().mo10585y().mo10592a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f11689c.booleanValue();
    }

    /* renamed from: t */
    public final boolean mo11013t() {
        Boolean b = mo11001b("firebase_analytics_collection_deactivated");
        return b != null && b.booleanValue();
    }

    /* renamed from: w */
    public final String mo11014w() {
        String str;
        C3809Y y;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke((Object) null, new Object[]{"debug.firebase.analytics.app", ""});
        } catch (ClassNotFoundException e) {
            e = e;
            y = mo10385b().mo10585y();
            str = "Could not find SystemProperties class";
            y.mo10593a(str, e);
            return "";
        } catch (NoSuchMethodException e2) {
            e = e2;
            y = mo10385b().mo10585y();
            str = "Could not find SystemProperties.get() method";
            y.mo10593a(str, e);
            return "";
        } catch (IllegalAccessException e3) {
            e = e3;
            y = mo10385b().mo10585y();
            str = "Could not access SystemProperties.get()";
            y.mo10593a(str, e);
            return "";
        } catch (InvocationTargetException e4) {
            e = e4;
            y = mo10385b().mo10585y();
            str = "SystemProperties.get() threw an exception";
            y.mo10593a(str, e);
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final boolean mo11015y() {
        return mo11005d(mo10568i().mo10520z(), C3758L.f11180N);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final String mo11016z() {
        String z = mo10568i().mo10520z();
        C3762M m = C3758L.f11181O;
        return (String) (z == null ? m.mo10498a() : m.mo10499a(this.f11688b.mo10984a(z, m.mo10500b())));
    }
}
