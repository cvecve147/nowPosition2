package p101d.p122f.p123a.p124a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6208m;
import p208e.p209a.p210a.p211a.p212a.p214b.C6080l;
import p208e.p209a.p210a.p211a.p212a.p214b.C6082m;
import p208e.p209a.p210a.p211a.p212a.p220g.C6184s;
import p208e.p209a.p210a.p211a.p212a.p220g.C6188v;

/* renamed from: d.f.a.a.a */
public class C5307a extends C6208m<Boolean> {

    /* renamed from: g */
    C5332y f15030g;

    /* renamed from: a */
    public void mo14674a(C6082m.C6083a aVar) {
        C5332y yVar = this.f15030g;
        if (yVar != null) {
            yVar.mo14730a(aVar.mo16066b(), aVar.mo16065a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Boolean m20496c() {
        try {
            C6188v a = C6184s.m23368b().mo16254a();
            if (a == null) {
                C6199f.m23420f().mo16265b("Answers", "Failed to retrieve settings");
                return false;
            } else if (a.f17258d.f17227d) {
                C6199f.m23420f().mo16269d("Answers", "Analytics collection enabled");
                this.f15030g.mo14729a(a.f17259e, mo14676u());
                return true;
            } else {
                C6199f.m23420f().mo16269d("Answers", "Analytics collection disabled");
                this.f15030g.mo14731b();
                return false;
            }
        } catch (Exception e) {
            C6199f.m23420f().mo16266b("Answers", "Error dealing with settings", e);
            return false;
        }
    }

    /* renamed from: o */
    public String mo14663o() {
        return "com.crashlytics.sdk.android:answers";
    }

    /* renamed from: q */
    public String mo14664q() {
        return "1.3.13.dev";
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    /* renamed from: t */
    public boolean mo14675t() {
        try {
            Context k = mo16305k();
            PackageManager packageManager = k.getPackageManager();
            String packageName = k.getPackageName();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            this.f15030g = C5332y.m20564a(this, k, mo16308n(), Integer.toString(packageInfo.versionCode), packageInfo.versionName == null ? "0.0" : packageInfo.versionName, Build.VERSION.SDK_INT >= 9 ? packageInfo.firstInstallTime : new File(packageManager.getApplicationInfo(packageName, 0).sourceDir).lastModified());
            this.f15030g.mo14732c();
            return true;
        } catch (Exception e) {
            C6199f.m23420f().mo16266b("Answers", "Error retrieving app properties", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public String mo14676u() {
        return C6080l.m23048b(mo16305k(), "com.crashlytics.ApiEndpoint");
    }
}
