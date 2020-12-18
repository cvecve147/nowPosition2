package com.google.android.gms.common.p072c;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.C2092n;

/* renamed from: com.google.android.gms.common.c.b */
public class C1988b {

    /* renamed from: a */
    private final Context f6362a;

    public C1988b(Context context) {
        this.f6362a = context;
    }

    /* renamed from: a */
    public int mo7515a(String str) {
        return this.f6362a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: a */
    public int mo7516a(String str, String str2) {
        return this.f6362a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: a */
    public ApplicationInfo mo7517a(String str, int i) {
        return this.f6362a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: a */
    public boolean mo7518a() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C1987a.m8739a(this.f6362a);
        }
        if (!C2092n.m9171l() || (nameForUid = this.f6362a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f6362a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    /* renamed from: a */
    public boolean mo7519a(int i, String str) {
        if (C2092n.m9166g()) {
            try {
                ((AppOpsManager) this.f6362a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f6362a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public String[] mo7520a(int i) {
        return this.f6362a.getPackageManager().getPackagesForUid(i);
    }

    /* renamed from: b */
    public PackageInfo mo7521b(String str, int i) {
        return this.f6362a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: b */
    public CharSequence mo7522b(String str) {
        return this.f6362a.getPackageManager().getApplicationLabel(this.f6362a.getPackageManager().getApplicationInfo(str, 0));
    }
}
