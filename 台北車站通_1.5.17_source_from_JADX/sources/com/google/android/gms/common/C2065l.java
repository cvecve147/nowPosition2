package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.C1994g;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.p072c.C1989c;

/* renamed from: com.google.android.gms.common.l */
public class C2065l {

    /* renamed from: a */
    private static C2065l f6524a;

    /* renamed from: b */
    private final Context f6525b;

    private C2065l(Context context) {
        this.f6525b = context.getApplicationContext();
    }

    /* renamed from: a */
    private static C1994g.C1995a m9081a(PackageInfo packageInfo, C1994g.C1995a... aVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C2069p pVar = new C2069p(signatureArr[0].toByteArray());
        for (int i = 0; i < aVarArr.length; i++) {
            if (aVarArr[i].equals(pVar)) {
                return aVarArr[i];
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C2065l m9082a(Context context) {
        C2061y.m9067a(context);
        synchronized (C2065l.class) {
            if (f6524a == null) {
                C1994g.m8790a(context);
                f6524a = new C2065l(context);
            }
        }
        return f6524a;
    }

    /* renamed from: a */
    private final C2074u m9083a(String str) {
        try {
            return m9085b(C1989c.m8748b(this.f6525b).mo7521b(str, 64));
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(str);
            return C2074u.m9097a(valueOf.length() != 0 ? "no pkg ".concat(valueOf) : new String("no pkg "));
        }
    }

    /* renamed from: b */
    private final C2074u m9084b(int i) {
        String[] a = C1989c.m8748b(this.f6525b).mo7520a(i);
        if (a == null || a.length == 0) {
            return C2074u.m9097a("no pkgs");
        }
        C2074u uVar = null;
        for (String a2 : a) {
            uVar = m9083a(a2);
            if (uVar.f6534b) {
                return uVar;
            }
        }
        return uVar;
    }

    /* renamed from: b */
    private final C2074u m9085b(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        String str;
        boolean honorsDebugCertificates = C2064k.honorsDebugCertificates(this.f6525b);
        if (packageInfo == null) {
            str = "null pkg";
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr.length != 1) {
                str = "single cert required";
            } else {
                C2069p pVar = new C2069p(signatureArr[0].toByteArray());
                String str2 = packageInfo.packageName;
                C2074u a = C1994g.m8788a(str2, pVar, honorsDebugCertificates);
                if (!a.f6534b || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || (honorsDebugCertificates && !C1994g.m8788a(str2, pVar, false).f6534b)) {
                    return a;
                }
                str = "debuggable release cert app rejected";
            }
        }
        return C2074u.m9097a(str);
    }

    /* renamed from: a */
    public boolean mo7715a(int i) {
        C2074u b = m9084b(i);
        b.mo7720c();
        return b.f6534b;
    }

    /* renamed from: a */
    public boolean mo7716a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (mo7717a(packageInfo, false)) {
            return true;
        }
        if (mo7717a(packageInfo, true)) {
            if (C2064k.honorsDebugCertificates(this.f6525b)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo7717a(PackageInfo packageInfo, boolean z) {
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (m9081a(packageInfo, z ? C2071r.f6532a : new C1994g.C1995a[]{C2071r.f6532a[0]}) != null) {
                return true;
            }
        }
        return false;
    }
}
