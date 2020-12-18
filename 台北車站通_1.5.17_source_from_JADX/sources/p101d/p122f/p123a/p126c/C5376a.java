package p101d.p122f.p123a.p126c;

import android.content.Context;
import android.content.pm.PackageInfo;
import p208e.p209a.p210a.p211a.p212a.p214b.C6091u;

/* renamed from: d.f.a.c.a */
class C5376a {

    /* renamed from: a */
    public final String f15174a;

    /* renamed from: b */
    public final String f15175b;

    /* renamed from: c */
    public final String f15176c;

    /* renamed from: d */
    public final String f15177d;

    /* renamed from: e */
    public final String f15178e;

    /* renamed from: f */
    public final String f15179f;

    C5376a(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f15174a = str;
        this.f15175b = str2;
        this.f15176c = str3;
        this.f15177d = str4;
        this.f15178e = str5;
        this.f15179f = str6;
    }

    /* renamed from: a */
    public static C5376a m20685a(Context context, C6091u uVar, String str, String str2) {
        String packageName = context.getPackageName();
        String i = uVar.mo16078i();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C5376a(str, str2, i, packageName, num, str3);
    }
}
