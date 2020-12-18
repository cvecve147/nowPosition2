package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.p071b.C1985a;
import com.google.android.gms.common.p072c.C1988b;
import com.google.android.gms.common.p072c.C1989c;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.na */
public final class C3873na {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3715Aa f11562a;

    /* renamed from: b */
    volatile C3749Ic f11563b;

    /* renamed from: c */
    private ServiceConnection f11564c;

    C3873na(C3715Aa aa) {
        this.f11562a = aa;
    }

    /* renamed from: c */
    private final boolean m15600c() {
        try {
            C1988b b = C1989c.m8748b(this.f11562a.getContext());
            if (b != null) {
                return b.mo7521b("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f11562a.mo10385b().mo10578D().mo10592a("Failed to retrieve Package Manager to check Play Store compatibility");
            return false;
        } catch (Exception e) {
            this.f11562a.mo10385b().mo10578D().mo10593a("Failed to retrieve Play Store version", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10809a() {
        this.f11562a.mo10388e();
        if (!m15600c()) {
            this.f11562a.mo10385b().mo10578D().mo10592a("Install Referrer Reporter is not available");
            this.f11564c = null;
            return;
        }
        this.f11564c = new C3881pa(this);
        this.f11562a.mo10385b().mo10578D().mo10592a("Install Referrer Reporter is initializing");
        this.f11562a.mo10388e();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f11562a.getContext().getPackageManager();
        if (packageManager == null) {
            this.f11562a.mo10385b().mo10576B().mo10592a("Failed to obtain Package Manager to verify binding conditions");
            return;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.f11562a.mo10385b().mo10578D().mo10592a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ResolveInfo resolveInfo = queryIntentServices.get(0);
        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
        if (serviceInfo != null) {
            String str = serviceInfo.packageName;
            if (resolveInfo.serviceInfo.name == null || this.f11564c == null || !"com.android.vending".equals(str) || !m15600c()) {
                this.f11562a.mo10385b().mo10578D().mo10592a("Play Store missing or incompatible. Version 8.3.73 or later required");
                return;
            }
            try {
                this.f11562a.mo10385b().mo10578D().mo10593a("Install Referrer Service is", C1985a.m8731a().mo7509a(this.f11562a.getContext(), new Intent(intent), this.f11564c, 1) ? "available" : "not available");
            } catch (Exception e) {
                this.f11562a.mo10385b().mo10585y().mo10593a("Exception occurred while binding to Install Referrer Service", e.getMessage());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10810a(Bundle bundle) {
        C3809Y y;
        String str;
        this.f11562a.mo10388e();
        if (bundle != null) {
            long j = bundle.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                y = this.f11562a.mo10385b().mo10585y();
                str = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = bundle.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    y = this.f11562a.mo10385b().mo10585y();
                    str = "No referrer defined in install referrer response";
                } else {
                    this.f11562a.mo10385b().mo10580F().mo10593a("InstallReferrer API result", string);
                    C3871mc h = this.f11562a.mo10392h();
                    String valueOf = String.valueOf(string);
                    Bundle a = h.mo10777a(Uri.parse(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")));
                    if (a == null) {
                        y = this.f11562a.mo10385b().mo10585y();
                        str = "No campaign params defined in install referrer result";
                    } else {
                        String string2 = a.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                y = this.f11562a.mo10385b().mo10585y();
                                str = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                a.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == this.f11562a.mo10393i().f11478l.mo10763a()) {
                            y = this.f11562a.mo10385b().mo10580F();
                            str = "Campaign has already been logged";
                        } else {
                            a.putString("_cis", "referrer API");
                            this.f11562a.mo10393i().f11478l.mo10764a(j);
                            this.f11562a.mo10397v().mo10623b("auto", "_cmp", a);
                            if (this.f11564c != null) {
                                C1985a.m8731a().mo7511b(this.f11562a.getContext(), this.f11564c);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            y.mo10592a(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Bundle mo10811b() {
        this.f11562a.mo10388e();
        if (this.f11563b == null) {
            this.f11562a.mo10385b().mo10576B().mo10592a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.f11562a.getContext().getPackageName());
        try {
            Bundle i = this.f11563b.mo10484i(bundle);
            if (i != null) {
                return i;
            }
            this.f11562a.mo10385b().mo10585y().mo10592a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.f11562a.mo10385b().mo10585y().mo10593a("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }
}
