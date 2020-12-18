package p101d.p119e.p120a.p121a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import java.io.File;
import p101d.p119e.p120a.C5286r;

/* renamed from: d.e.a.a.n */
public class C5266n {
    /* renamed from: a */
    public static C5286r m20389a(Context context) {
        return m20390a(context, (C5259h) null);
    }

    /* renamed from: a */
    public static C5286r m20390a(Context context, C5259h hVar) {
        return m20391a(context, hVar, -1);
    }

    /* renamed from: a */
    public static C5286r m20391a(Context context, C5259h hVar, int i) {
        String str;
        File file = new File(context.getCacheDir(), "volley");
        try {
            String packageName = context.getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            str = packageName + "/" + packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "volley/0";
        }
        if (hVar == null) {
            hVar = Build.VERSION.SDK_INT >= 9 ? new C5260i() : new C5256f(AndroidHttpClient.newInstance(str));
        }
        C5249a aVar = new C5249a(hVar);
        C5286r rVar = i <= -1 ? new C5286r(new C5253e(file), aVar) : new C5286r(new C5253e(file, i), aVar);
        rVar.mo14652b();
        return rVar;
    }
}
