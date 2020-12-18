package p013b.p018b.p028h.p029a;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import android.support.p007v4.app.C0319c;

/* renamed from: b.b.h.a.e */
public final class C1023e {
    /* renamed from: a */
    public static int m5436a(Context context, String str) {
        return m5437a(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    /* renamed from: a */
    public static int m5437a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String a = C0319c.m1418a(str);
        if (a == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return C0319c.m1417a(context, a, str2) != 0 ? -2 : 0;
    }

    /* renamed from: b */
    public static int m5438b(Context context, String str) {
        return m5437a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
