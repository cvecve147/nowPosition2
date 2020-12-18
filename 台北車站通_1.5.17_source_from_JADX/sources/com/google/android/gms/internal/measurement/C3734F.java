package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.util.C2083e;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.measurement.F */
public final class C3734F extends C3802Wa {

    /* renamed from: c */
    private long f11095c;

    /* renamed from: d */
    private String f11096d;

    /* renamed from: e */
    private Boolean f11097e;

    C3734F(C3715Aa aa) {
        super(aa);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2083e mo10382a() {
        return super.mo10382a();
    }

    /* renamed from: a */
    public final boolean mo10450a(Context context) {
        if (this.f11097e == null) {
            this.f11097e = false;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.f11097e = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.f11097e.booleanValue();
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
        Calendar instance = Calendar.getInstance();
        this.f11095c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f11096d = sb.toString();
        return false;
    }

    /* renamed from: y */
    public final long mo10458y() {
        mo10588t();
        return this.f11095c;
    }

    /* renamed from: z */
    public final String mo10459z() {
        mo10588t();
        return this.f11096d;
    }
}
