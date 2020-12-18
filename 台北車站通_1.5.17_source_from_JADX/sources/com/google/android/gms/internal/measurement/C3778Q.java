package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.common.util.C2083e;
import com.google.firebase.iid.FirebaseInstanceId;
import java.math.BigInteger;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.Q */
public final class C3778Q extends C3802Wa {

    /* renamed from: c */
    private String f11268c;

    /* renamed from: d */
    private String f11269d;

    /* renamed from: e */
    private int f11270e;

    /* renamed from: f */
    private String f11271f;

    /* renamed from: g */
    private String f11272g;

    /* renamed from: h */
    private long f11273h;

    /* renamed from: i */
    private long f11274i;

    /* renamed from: j */
    private int f11275j;

    /* renamed from: k */
    private String f11276k;

    C3778Q(C3715Aa aa) {
        super(aa);
    }

    /* renamed from: D */
    private final String m15015D() {
        mo10451d();
        if (mo10456r().mo11009h(this.f11268c) && !this.f11325a.mo10395s()) {
            return null;
        }
        try {
            return FirebaseInstanceId.m16247b().mo11464a();
        } catch (IllegalStateException unused) {
            mo10385b().mo10576B().mo10592a("Failed to retrieve Firebase Instance Id");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final String mo10514A() {
        byte[] bArr = new byte[16];
        mo10454o().mo10805z().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final int mo10515B() {
        mo10588t();
        return this.f11270e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final int mo10516C() {
        mo10588t();
        return this.f11275j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2083e mo10382a() {
        return super.mo10382a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzdz mo10517a(String str) {
        mo10451d();
        String z = mo10520z();
        String y = mo10519y();
        mo10588t();
        String str2 = this.f11269d;
        long B = (long) mo10515B();
        mo10588t();
        String str3 = this.f11271f;
        mo10588t();
        mo10451d();
        if (this.f11273h == 0) {
            this.f11273h = this.f11325a.mo10392h().mo10794b(getContext(), getContext().getPackageName());
        }
        long j = this.f11273h;
        boolean s = this.f11325a.mo10395s();
        boolean z2 = true;
        boolean z3 = !mo10455q().f11491y;
        String D = m15015D();
        mo10588t();
        long G = this.f11325a.mo10379G();
        int C = mo10516C();
        Boolean b = mo10456r().mo11001b("google_analytics_adid_collection_enabled");
        boolean booleanValue = Boolean.valueOf(b == null || b.booleanValue()).booleanValue();
        Boolean b2 = mo10456r().mo11001b("google_analytics_ssaid_collection_enabled");
        if (b2 != null && !b2.booleanValue()) {
            z2 = false;
        }
        return new zzdz(z, y, str2, B, str3, 12451, j, str, s, z3, D, 0, G, C, booleanValue, Boolean.valueOf(z2).booleanValue(), mo10455q().mo10742D());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C3801W mo10385b() {
        return super.mo10385b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3909wa mo10386c() {
        return super.mo10386c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo10451d() {
        super.mo10451d();
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C3734F mo10452j() {
        return super.mo10452j();
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

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo10457u() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0145 A[Catch:{ IllegalStateException -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014a A[Catch:{ IllegalStateException -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x017f  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10518v() {
        /*
            r12 = this;
            android.content.Context r0 = r12.getContext()
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r1 = r12.getContext()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r5 = "unknown"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L_0x002f
            com.google.android.gms.internal.measurement.W r1 = r12.mo10385b()
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10585y()
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r0)
            java.lang.String r8 = "PackageManager is null, app identity information might be inaccurate. appId"
            r1.mo10593a(r8, r7)
        L_0x002c:
            r1 = r2
            goto L_0x0091
        L_0x002f:
            java.lang.String r5 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0034 }
            goto L_0x0045
        L_0x0034:
            com.google.android.gms.internal.measurement.W r7 = r12.mo10385b()
            com.google.android.gms.internal.measurement.Y r7 = r7.mo10585y()
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.mo10593a(r9, r8)
        L_0x0045:
            if (r5 != 0) goto L_0x004a
            java.lang.String r5 = "manual_install"
            goto L_0x0053
        L_0x004a:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x0053
            r5 = r3
        L_0x0053:
            android.content.Context r7 = r12.getContext()     // Catch:{ NameNotFoundException -> 0x007c }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x007c }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x007c }
            if (r7 == 0) goto L_0x002c
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x007c }
            java.lang.CharSequence r1 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x007c }
            boolean r8 = android.text.TextUtils.isEmpty(r1)     // Catch:{ NameNotFoundException -> 0x007c }
            if (r8 != 0) goto L_0x0072
            java.lang.String r1 = r1.toString()     // Catch:{ NameNotFoundException -> 0x007c }
            goto L_0x0073
        L_0x0072:
            r1 = r2
        L_0x0073:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0078 }
            int r6 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0078 }
            goto L_0x0091
        L_0x0078:
            r11 = r2
            r2 = r1
            r1 = r11
            goto L_0x007d
        L_0x007c:
            r1 = r2
        L_0x007d:
            com.google.android.gms.internal.measurement.W r7 = r12.mo10385b()
            com.google.android.gms.internal.measurement.Y r7 = r7.mo10585y()
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r0)
            java.lang.String r9 = "Error retrieving package info. appId, appName"
            r7.mo10594a(r9, r8, r2)
            r11 = r2
            r2 = r1
            r1 = r11
        L_0x0091:
            r12.f11268c = r0
            r12.f11271f = r5
            r12.f11269d = r2
            r12.f11270e = r6
            r12.f11272g = r1
            r1 = 0
            r12.f11273h = r1
            android.content.Context r5 = r12.getContext()
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.internal.C1933g.m8590a((android.content.Context) r5)
            r6 = 1
            if (r5 == 0) goto L_0x00b2
            boolean r7 = r5.mo7273e()
            if (r7 == 0) goto L_0x00b2
            r7 = r6
            goto L_0x00b3
        L_0x00b2:
            r7 = r4
        L_0x00b3:
            if (r7 != 0) goto L_0x00de
            if (r5 != 0) goto L_0x00c5
            com.google.android.gms.internal.measurement.W r5 = r12.mo10385b()
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10585y()
            java.lang.String r8 = "GoogleService failed to initialize (no status)"
            r5.mo10592a(r8)
            goto L_0x00de
        L_0x00c5:
            com.google.android.gms.internal.measurement.W r8 = r12.mo10385b()
            com.google.android.gms.internal.measurement.Y r8 = r8.mo10585y()
            int r9 = r5.mo7270b()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r5 = r5.mo7271c()
            java.lang.String r10 = "GoogleService failed to initialize, status"
            r8.mo10594a(r10, r9, r5)
        L_0x00de:
            if (r7 == 0) goto L_0x0136
            com.google.android.gms.internal.measurement.w r5 = r12.mo10456r()
            java.lang.String r7 = "firebase_analytics_collection_enabled"
            java.lang.Boolean r5 = r5.mo11001b(r7)
            com.google.android.gms.internal.measurement.w r7 = r12.mo10456r()
            boolean r7 = r7.mo11013t()
            if (r7 == 0) goto L_0x0102
            com.google.android.gms.internal.measurement.W r5 = r12.mo10385b()
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10578D()
            java.lang.String r6 = "Collection disabled with firebase_analytics_collection_deactivated=1"
        L_0x00fe:
            r5.mo10592a(r6)
            goto L_0x0136
        L_0x0102:
            if (r5 == 0) goto L_0x0115
            boolean r7 = r5.booleanValue()
            if (r7 != 0) goto L_0x0115
            com.google.android.gms.internal.measurement.W r5 = r12.mo10385b()
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10578D()
            java.lang.String r6 = "Collection disabled with firebase_analytics_collection_enabled=0"
            goto L_0x00fe
        L_0x0115:
            if (r5 != 0) goto L_0x0128
            boolean r5 = com.google.android.gms.common.api.internal.C1933g.m8593b()
            if (r5 == 0) goto L_0x0128
            com.google.android.gms.internal.measurement.W r5 = r12.mo10385b()
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10578D()
            java.lang.String r6 = "Collection disabled with google_app_measurement_enable=0"
            goto L_0x00fe
        L_0x0128:
            com.google.android.gms.internal.measurement.W r5 = r12.mo10385b()
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10580F()
            java.lang.String r7 = "Collection enabled"
            r5.mo10592a(r7)
            goto L_0x0137
        L_0x0136:
            r6 = r4
        L_0x0137:
            r12.f11276k = r3
            r12.f11274i = r1
            java.lang.String r1 = com.google.android.gms.common.api.internal.C1933g.m8592a()     // Catch:{ IllegalStateException -> 0x015c }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IllegalStateException -> 0x015c }
            if (r2 == 0) goto L_0x0146
            r1 = r3
        L_0x0146:
            r12.f11276k = r1     // Catch:{ IllegalStateException -> 0x015c }
            if (r6 == 0) goto L_0x016e
            com.google.android.gms.internal.measurement.W r1 = r12.mo10385b()     // Catch:{ IllegalStateException -> 0x015c }
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10580F()     // Catch:{ IllegalStateException -> 0x015c }
            java.lang.String r2 = "App package, google app id"
            java.lang.String r3 = r12.f11268c     // Catch:{ IllegalStateException -> 0x015c }
            java.lang.String r5 = r12.f11276k     // Catch:{ IllegalStateException -> 0x015c }
            r1.mo10594a(r2, r3, r5)     // Catch:{ IllegalStateException -> 0x015c }
            goto L_0x016e
        L_0x015c:
            r1 = move-exception
            com.google.android.gms.internal.measurement.W r2 = r12.mo10385b()
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10585y()
            java.lang.Object r0 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r0)
            java.lang.String r3 = "getGoogleAppId or isMeasurementEnabled failed with exception. appId"
            r2.mo10594a(r3, r0, r1)
        L_0x016e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x017f
            android.content.Context r0 = r12.getContext()
            boolean r0 = com.google.android.gms.common.p072c.C1987a.m8739a(r0)
            r12.f11275j = r0
            return
        L_0x017f:
            r12.f11275j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3778Q.mo10518v():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final String mo10519y() {
        mo10588t();
        return this.f11276k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final String mo10520z() {
        mo10588t();
        return this.f11268c;
    }
}
